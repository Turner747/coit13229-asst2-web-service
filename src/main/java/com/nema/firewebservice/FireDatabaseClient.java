/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nema.firewebservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joshturner
 */
public class FireDatabaseClient {
    
    private static final String DATABASE = "ibdms_server";
    private static final String USER = "root";
    private static final String PSWRD = "password";
    private static final String HOST = "localhost";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    private Connection conn;
    
    public FireDatabaseClient(){
        final String URL = "jdbc:mysql://" + HOST + "/" + DATABASE;
		
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PSWRD);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FireDatabaseClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FireDatabaseClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<FireDetails> getFires(){
        ArrayList<FireDetails> fires = null;
        
        String sql = "SELECT * FROM fire;";
        
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                FireDetails fire = new FireDetails(
                    rs.getInt("id"),
                    rs.getInt("xpos"),
                    rs.getInt("ypos"),
                    0,
                    rs.getInt("intensity"),
                    rs.getDouble("burningAreaRadius"),
                    rs.getInt("isActive") == 1);
                
                fires.add(fire);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FireDatabaseClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return fires;
    }
    
    public void addFireTruck(Firetruck truck){
        
        String sql = "INSERT INTO firetrucks (id, name, designatedFireId) values (?,?,?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, truck.getId());
            ps.setString(2,truck.getName());
            ps.setInt(3, truck.getFireID());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(FireDatabaseClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void close(){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(FireDatabaseClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
