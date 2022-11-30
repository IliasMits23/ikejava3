/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iekjava;

/**
 *
 * @author User
 */
public class Employers {
   private final  String name;
   private final int  age;
   private final String gender;
   private final double salary;
  public Employers(String x,String y,int z,double p){
      name=x;
      gender=y;
      age=z;
      salary=p;
  }
  public void employersInfo(Employers x,Employers y,Employers z,Employers p){
      System.out.println("to onoma tou einai"+x.name+"to filo tou einai"+y.gender+"h ilikia tou employer einai"+z.age+"o misthos tou employer einai"+p.salary);
  }
  
}
