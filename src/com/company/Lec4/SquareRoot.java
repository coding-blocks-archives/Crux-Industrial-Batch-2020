package com.company.Lec4;

public class SquareRoot {

    public static void main(String[] args) {

        int n=10;
       float ans=squareroot(n);

       float t=0.1f;

       int precision=5;

        for (int i = 0; i <precision ; i++) {

            while( ans*ans< n){
                ans=ans+t;
            }
            ans=ans-t;
            t=t/10;
        }

        System.out.printf("%."+precision+"f",ans);
    }
    public static int squareroot(int n){

        int start=0;
        int end= n;
        int ans=0;

        while(start<=end){

            int mid= (start+end)/2;

            if(mid*mid==n){
                return mid;
            }

            else if(mid*mid>n){
                end= mid-1;
            }

            else{
               ans= mid;
               start=mid+1;
            }
        }
        return ans;
    }
}

