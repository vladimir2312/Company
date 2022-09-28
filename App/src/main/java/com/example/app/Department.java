package com.example.app;

public class Department {
    private String NameOfDepartment;//Название отдела
    private int  QuantityWorkers;//Колличество сотрудников

    public void setNameOfDepartment(String NameOfDepartment) {
        this.NameOfDepartment = NameOfDepartment;
    }
    public String getNameOfDepartment(){
        return NameOfDepartment;
    }

    public void setQuantityWorkers(int QuantityWorkers){
        this.QuantityWorkers = QuantityWorkers;
    }
    public int getQuantityWorkers() {
        return QuantityWorkers;
    }

}
