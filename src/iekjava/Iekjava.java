/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iekjava;


import java.util.Scanner;

/**
 *
 * @author User
 */
public class Iekjava {
   
    static public String name;
   static public char age;
   static public char gender;
   static public double salary;
   static public boolean Adult;
   static public boolean  female;
   public static void main(String[] args) {
        int x=20;
        int y=18;
        if (20>18){
            System.out.println("20 is greater of 18");
                   
                    }
         String name;
         int age;
         char gander;
         double salary;
         char genre;   

        Scanner console=new Scanner(System.in);
        System.out.println("enter name:");
        name=console.nextLine();
        System.out.println("enter age:");
        age=console.nextInt();
        System.out.println("enter gander:");
        gander=console.next().charAt(0);
        System.out.println("enter salary");
        salary=console.nextDouble();
       

       printstat();
       getAge(); 
       getSalary(); 
          
        
    }
   static public  void printstat(){
        
       System.out.println("name:"+name+"age:"+age+"gender:"+gender+"salary"+salary);
   }

    
   static public int getAge(){
       
        return age;
   }
   static public double getSalary(){
       
       return salary;
   }
   static boolean isAdult(){
    if(age>10){
        Adult=true;
    }
    else{
        Adult=false;
    }
    return Adult;
    }
  
        
      
   
  static char getGender(){
      return gender;
  }
  static boolean isFemale(){
      if(getGender()=='F'){
          female=false;
      }
      else{
          female=true;
      }
      return  female;
    }
  }
      
      



