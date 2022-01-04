package dao;

import model.Programmer;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class ProgrammerDao extends BaseDao {
    public int save(Programmer programmer) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(programmer);
        transaction.commit();
        session.close();
        return 1;
    }
}
