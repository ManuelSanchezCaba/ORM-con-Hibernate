/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import entity.Address;
import entity.Employee;
import entity.Phone;
import entity.Proyecto;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableColumnModel;
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
    
    public static void insert(Employee e) {
        session = (Session) NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(e);
        tx.commit();
        session.close();
    }
    
    public static void insert(Phone e) {
        session = (Session) NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(e);
        tx.commit();
        session.close();
    }
    
    public static void insert(Proyecto e) {
        session = (Session) NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(e);
        tx.commit();
        session.close();
    }
    
    public static void delete(Address e) {
        session = (Session) NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(e);
        tx.commit();
        session.close();
    }
    
    public static void delete(Employee e) {
        session = (Session) NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(e);
        tx.commit();
        session.close();
    }
    
    public static void delete(Phone e) {
        session = (Session) NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(e);
        tx.commit();
        session.close();
    }
    
    public static void delete(Proyecto e) {
        session = (Session) NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(e);
        tx.commit();
        session.close();
    }
    
    public static void main(String[] args) {
          MenuView i = new MenuView();
          i.setVisible(true);
    }
    
}
