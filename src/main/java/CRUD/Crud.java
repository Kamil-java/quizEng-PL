package CRUD;

import Entities.Words;
import org.hibernate.SessionFactory;

import java.util.Set;

public interface Crud {

    void create(SessionFactory sessionFactory, Set<Words> words);

    String read(SessionFactory sessionFactory, int id);

    void update();

    void delete(SessionFactory sessionFactory, int id);
}
