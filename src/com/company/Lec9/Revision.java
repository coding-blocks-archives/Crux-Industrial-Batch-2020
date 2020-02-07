package com.company.Lec9;

import java.util.ArrayList;

public class Revision {


    public static void main(String[] args) {

        maze(3,3,"");
    }

    public static ArrayList maze(int row, int col, String processed){

        if(row==1 && col==1){

            ArrayList list = new ArrayList();
            list.add(processed);
            return list;
        }

        ArrayList list= new ArrayList();

        int cnt=0;

        if(row>1){
            list.addAll(maze(row-1,col,processed+"V"));

        }

        if(col>1){
          list.addAll(maze(row,col-1,processed+"H"));
        }


        return list;
    }
}
