package com.theslizard.sand.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.theslizard.sand.persistence.Journal;

/*
@Repository
public class JournalDAO {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	    public void saveJournalEntry(Journal journal) {
	        Transaction transaction = null;
	        try (Session session = sessionFactory.openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.save(journal);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }
	    public List < Journal > getJournalItems() {
	        try (Session session = sessionFactory.openSession()) {
	            return session.createQuery("from Student", Journal.class).list();
	        }
	    }
	
	
}
*/