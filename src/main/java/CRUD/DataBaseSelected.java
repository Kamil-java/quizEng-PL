package CRUD;

import Entities.Words;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Set;

public class DataBaseSelected implements Crud {


    public void create(SessionFactory sessionFactory, Set<Words> words) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        for (Words word : words) {
            session.persist(word);
        }
        transaction.commit();
        session.close();

    }

    public String read(SessionFactory sessionFactory, int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query<String> query = session.createQuery("SELECT m.polishWorld FROM Words m WHERE m.id = :setID ", String.class);
        query.setParameter("setID",id);
        List<String> resultList = query.getResultList();
        transaction.commit();
        for (String s : resultList) {
           return s;
        }
        return null;
    }

    public void update() {

    }

    public void delete(SessionFactory sessionFactory, int id) {
        Session session = sessionFactory.openSession();
        Words words = session.get(Words.class, id);
        Transaction transaction = session.beginTransaction();
        session.delete(words);
        transaction.commit();
        session.close();

    }

}
