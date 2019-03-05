/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import entity.Address;
import java.math.BigDecimal;
import org.hibernate.Session;
import org.hibernate.Transaction;
import views.AddressView;
import views.EmployeeView;
import views.MenuView;
import views.PhoneView;
import views.ProjectView;

/**
 *
 * @author mfsan
 */
public class JPA {

    static Session session = null;
    
    public static void insert(Address e) {
        session = (Session) NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(e);
        tx.commit();
        session.close();
    }
    
    public static void main(String[] args) {
          MenuView i = new MenuView();
          i.setVisible(true);
    }
    
}
