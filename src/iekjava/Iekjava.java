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
   static public int  age;
   static public char gender;
   static public double salary;
   static public boolean Adult;
   static public boolean  female;
   
   public static void main(String[] args) {
        
                   
         Employers emp1=new Employers("kostas","M",30,600); 
         
         
        Scanner console=new Scanner(System.in);
        System.out.println("enter name:");
        name=console.nextLine();
        System.out.println("enter age:");
        age=console.nextInt();
        System.out.println("enter gender:");
        gender=console.next().charAt(0);
        System.out.println("enter salary");
        salary=console.nextDouble();
       

       printstat();
       getAge(); 
       getSalary(); 
       getGender(); 
       isAdult();
       isFemale();
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
         System.out.println("is adult");
    }
    else{
        Adult=false;
        System.out.println("is not adult");
    }
    return Adult;
    }
  
        
      
   
  static char getGender(){
      return gender;
  }
  static boolean isFemale(){
      if(getGender()=='F'){
          female=false;
           System.out.println("is famele");
      }
      else{
          female=true;
          System.out.println("is male");
      }
      return  female;
    }
     
static void setSalary(double x){
        salary=x;
}

static void setAge(int y){
    age=y;
}
    static void setName(String k){
    name=k;
}  
    static void setGender(char p){
    gender=p;
}  
}    