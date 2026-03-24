package org.example;

public class Department {

    private int id;
    private String name;

    private int enroll;

    private String date;

    public Department() {}

    public Department(int id, String name, int enroll, String date) {
        this.id = id;
        this.name = name;
        this.enroll = enroll;
        this.date = date;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getEnroll(){
        return enroll;
    }

    public void setEnroll(int enroll){
        this.enroll = enroll;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}