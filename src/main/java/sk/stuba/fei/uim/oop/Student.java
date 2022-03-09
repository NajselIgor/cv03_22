package sk.stuba.fei.uim.oop;

public class Student {
    private int id;
    private String name;
    private String surName;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    Student(int id, String name, String surName, int age){
        this.age = age;
        this.surName = surName;
        this.id = id;
        this.name = name;
    }

    public void printStudent() {
        System.out.println("Meno: " + this.name);
        System.out.println("Priezvisko: " + this.surName);
        System.out.println("ID: " + this.id);
        System.out.println("Vek: " + this.age);
        System.out.println("\n");

    }


}
