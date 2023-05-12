/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nema.firewebservice;

import java.io.Serializable;

/**
 *
 * @author Zac
 */
public class Firetruck implements Serializable{
    
    private static final long serialVersionUID = 6529685098267757690L;
    
    private int id;
    private String name;
    private int fireID;

    public Firetruck(int id, String name, int fireID) {
        this.id = id;
        this.name = name;
        this.fireID = fireID;
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

    public int getFireID() {
        return fireID;
    }

    public void setFireID(int fireID) {
        this.fireID = fireID;
    }

    @Override
    public String toString() {
        return "Firetruck{" + "id=" + id + 
                ", name=" + name + ", fireID=" + fireID + '}';
    }
    
}
