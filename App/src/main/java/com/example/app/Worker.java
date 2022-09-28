package com.example.app;

public class Worker  extends  Department{
    private String Name;
    private String Surname;
    private String MiddleName;
    private int Wages;
    private int Age;
    private int id;

    public String getMiddleName() {
        return MiddleName;
    }
    public void setMiddleName(String  MiddleName) {
        this.MiddleName = MiddleName;
    }

    public String getSurname() {
        return Surname;
    }
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        this.Age = Age;
    }

    public int getWages() {
        return Wages;
    }
    public void setWages(int Wages) {
        this.Wages = Wages;
    }


    public void setName(String Name) {
        Name = Name;
    }
    public String getName() {
        return Name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public Worker(){}
    public  Worker(int id,String Name,String Surname,String MiddleName ,int Wages,int Age) {
        this.id = id;
        this.Surname = Surname;//Фамилия работника
        this.Name = Name;//Имя работника
        this.MiddleName = MiddleName;//Отчество работника
        this.Wages = Wages;//Заработная плата работника
        this.Age = Age;//Возраст
    }

}

