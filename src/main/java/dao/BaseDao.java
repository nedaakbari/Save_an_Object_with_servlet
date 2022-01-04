package dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class BaseDao {
    protected static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
}
