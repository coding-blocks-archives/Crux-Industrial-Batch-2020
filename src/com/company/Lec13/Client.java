package com.company.Lec13;

public class Client {

    public static void main(String[] args) {

        Engine engine =new PetrolEngine();
        System.out.println(engine.speed);
//        PetrolEngine engine = new PetrolEngine();
//        engine.start();
//        engine.stop();
//        engine.speed();

//        int ar[]={1,2,3,4,5};
        sum(1,2,3,4,5,6,7,8,9);

    }

    public static void sum(int ...ar){

        int sum=0;

        for (int i = 0; i <ar.length ; i++) {
            sum=sum+ar[i];
        }

        System.out.println(sum);
    }

}
