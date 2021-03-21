/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Garrett York
 */
public class Lab_6{
    private String Name;
    private int idNumber;
    private String Department;
    private String Position;

    public Lab_6(){
        Name="";
        idNumber=0;
        Department="";
        Position="";
    }
    
    public Lab_6(String Name, int idNumber, String Department, String Position) {
        this.Name = Name;
        this.idNumber = idNumber;
        this.Department = Department;
        this.Position = Position;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }
    



}
