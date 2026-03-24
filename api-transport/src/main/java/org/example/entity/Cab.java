package org.example.entity;

import jakarta.persistence.*;

@Entity
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String cabNumber;

    private String trip;

    private int capacity;

    public int getId() {
        return id;
    }

    public String getCabNumber() {
        return cabNumber;
    }

    public String getTrip(){
        return trip;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCabNumber(String cabNumber) {
        this.cabNumber = cabNumber;
    }

    public void setTrip(String trip){
        this.trip = trip;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
}