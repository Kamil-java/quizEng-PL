package Mechanic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class CheckAnswer {

    public boolean check(SessionFactory sessionFactory, String checkingText, String textToCheck){
        Session session = sessionFactory.openSession();
        Query<String> query = session.createQuery("SELECT m.englishWorld FROM Words m WHERE m.polishWorld = :checking", String.class);
        query.setParameter("checking", checkingText);
        String singleResult = query.getSingleResult();
        return singleResult.equals(textToCheck);
    }
}
