package com.neotric.student.service;

public class StudentMap {
    String name ;
    int rollno;

    public StudentMap(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }




    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }
}
