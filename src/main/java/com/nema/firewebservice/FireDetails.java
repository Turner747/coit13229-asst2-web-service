package com.nema.firewebservice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;

/**
 *
 * @author diamo
 */
public class FireDetails  implements Serializable {
    
    // Set serialVersion so classes are the same
    private static final long serialVersionUID = 6529685098267757690L;
    
    // Values in this object
    private int id;
    private int x_pos;
    private int y_pos;
    private int droneId;
    private int severity;
    private double burningAreaRadius;
    private boolean isActive;
    
    // Constructor
    
    public FireDetails (int id, int x_pos, int y_pos, int droneId, int severity, double burningAreaRadius, boolean isActive) {
        this.id = id;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.droneId = droneId;
        this.severity = severity;
        this.burningAreaRadius = burningAreaRadius;
        this.isActive = isActive;
    }
    
    // Accessors / Getters
    
    public int getId() {
        return id;
    }
    
    public int getX_pos() {
        return x_pos;
    }
    
    public int getY_pos() {
        return y_pos;
    }
    
    public int getDroneId() {
        return droneId;
    }
    
    public int getSeverity() {
        return severity;
    }

    public double getBurningAreaRadius() {
        return burningAreaRadius;
    }

    public boolean isIsActive() {
        return isActive;
    }
    
    // Mutators / Setters
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setX_pos(int x_pos) {
        this.x_pos = x_pos;
    }
    
    public void setY_pos(int y_pos) {
        this.y_pos = y_pos;
    }
    
    public void setDroneId(int droneId) {
        this.droneId = droneId;
    }
    
    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public void setBurningAreaRadius(double burningAreaRadius) {
        this.burningAreaRadius = burningAreaRadius;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    public String toCSV() {
        int active;
        if (isActive)
            active = 1;
        else
            active = 0;
        
        return
                id + "," +
                x_pos + "," +
                y_pos + "," +
                droneId + "," +
                severity + "," +
                burningAreaRadius + "," +
                active;
    }
    
    // toString() Method
    @Override
    public String toString() {
        return 
               "Fire ID: " + id + "\n" +
               "X Position: " + x_pos + "\n" +
               "Y Position: " + y_pos + "\n" +
               "Drone Reporting: " + droneId + "\n" +
               "Severity: " + severity + "\n"+
               "Burning Area Radius: " + burningAreaRadius + "\n" +
               "Is Active: " + isActive + "\n";
    }
}
