/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bigg;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

/**
 *
 * @author Michael
 */

@Named
@RequestScoped
public class AnsD implements Serializable  {
     String response;
    String namex;
    String emailaddx;
    String rex;
    String prof;
     private static final String USERNAME    = "root";
    private static final String PASSWORD    = "";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/askan?zeroDateTimeBehavior=convertToNull";
    
    public String getNamex(){
        return namex;
    }
    public void setNamex(String namep){
        namex=namep;
    }
    public String getResponse(){
        return response;
    }
    public void setResponse(String quesx){
        response=quesx;
    }
     public String getEmailaddx(){
        return emailaddx;
    }
    public void setEmailaddx(String questx){
        emailaddx=questx;
    }
     public String getRex(){
        //String i=(Double.toString((double) height));
        return rex;
    }
  
    public void setRex(String rr1){
        rex=rr1;
    }
     public String getProf(){
        //String i=(Double.toString((double) height));
        return prof;
    }
  
    public void setProf(String prof){
        this.prof=prof;
    }
    
    
    public String  sendmailx() {
       /*  try {
            SendM mike= new SendM();
            mike.sendMessage(name, emailadd, question);
     re="Message sent";
}       catch (MessagingException ex) {
           Logger.getLogger(AskD.class.getName()).log(Level.SEVERE, null, ex);
           re="Message not sent";
            
        }
        return null;
    }*/
       Connection conn=null;

                  try {
                      conn =(Connection) DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
                     // databas.setText("Connected");
                      Statement ad=(Statement) conn.createStatement();
                      String p_name= namex;
                      String emi=emailaddx;
                      String questions=response;
                      String infop=prof;
                      String insert= "INSERT INTO askan.expert_info(Name,Email,Resp,Profession) VALUES('"+p_name+"','"+emi+"',+'"+questions+"','"+infop+"')";
                      ad.executeUpdate(insert);
                      rex= "Successfully Save Save into database ";
                  } catch (SQLException ex) {
                      Logger.getLogger(AnsD.class.getName()).log(Level.SEVERE, null, ex);
                      //databas.setText("Not connected");
                      rex= "Not Save, try again Save into database";
                  }
         return null;
    }

     public void clear(AjaxBehaviorEvent event)
            throws AbortProcessingException {
        namex = "";
        emailaddx = "";
        response = "";
        
    }

}
