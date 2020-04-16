/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bigg;

import java.io.Serializable;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Michael
 */
public class SendM implements Serializable {
    public void sendMessage(String namex,String emailx,String questionx) throws AddressException,MessagingException{
     /*  Properties props= System.getProperties();
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.port","587");
        
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.port","587");
        props.put("mail.smtp.socketFactory.fallback","false");*/
       Properties p= System.getProperties();
        p.put("mail.smtp.auth","true");
        p.put("mail.smtp.starttls.enable","true");
       // p.put("mail.smtp.user","olay");
      //  p.put("mail.smtp.password","godw");
        p.put("mail.smtp.host","smtp.gmail.com");
        p.put("mail.smtp.port","587");
        
        Session mailSession= Session.getDefaultInstance(p,null);
        mailSession.setDebug(true);
        
       Message mailMessage= new MimeMessage(mailSession);
                mailMessage.setFrom(new InternetAddress("askacnutri@gmail.com"));
                //mailMessage.setSender(new InternetAddress("askacnutri@gmail.com"));
                mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress("askacnutri@gmail.com"));
                mailMessage.setSubject(namex);
                mailMessage.setText(emailx);
                mailMessage.setContent(questionx,"text/html");  
                
          
                Transport transport=mailSession.getTransport("smtp");
                transport.connect("smtp.gmail.com","askacnutri@gmail.com","luminary700");
                transport.sendMessage(mailMessage, mailMessage.getAllRecipients());
                
        
        
    }
    
    
    
}
