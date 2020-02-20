package com.company.Lec11;

public class Human {

   String name;

   int salary;

   public Human(int salary){

       this.salary=salary;

   }

   public Human(Human old){

       this.salary=old.salary;

   }

//
//   public Human(String name){
//       this.name=name;
//   }

//   public Human(int salary){
//       this.salary=salary;
//   }
   public void loan(){

       int bonus= salary/10;
       salary=salary-bonus;

       System.out.println("ab me gareeb ho gya"+salary);

       fest();
   }

   public static void fest(){
       System.out.println("hurra hurra");
   }

   public void eat(){

       if(salary<700000){
           System.out.println("nikal");
           return;
       }
       salary=salary-2000;
       System.out.println("pet bhar gya");
   }

}
