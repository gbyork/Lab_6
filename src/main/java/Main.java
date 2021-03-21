/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Garrett York
 */
public class Main {
    public static void main(String[] args) {
Lab_6 Employee1 = new Lab_6("Susan Meyers",47899,"Accounting","Vice President");
Lab_6 Employee2 = new Lab_6("Mark Jones",39119,"IT","Programmer");
Lab_6 Employee3 = new Lab_6("Joy Rogers",81774,"Manufacturing","Engineer");


System.out.print(Employee1.getName()+ "\t" + Employee1.getIdNumber() + "\t" + Employee1.getDepartment() + "\t" + Employee1.getPosition() + "\n");

System.out.print(Employee2.getName()+ "\t" + Employee2.getIdNumber() + "\t" + Employee2.getDepartment() + "\t" + "\t" + Employee2.getPosition() + "\n");

System.out.print(Employee3.getName()+ "\t" + Employee3.getIdNumber() + "\t" + Employee3.getDepartment() + "\t" + Employee3.getPosition() + "\n");




    
    }
}
