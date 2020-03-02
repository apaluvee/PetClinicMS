package ee.sda.dao;

import ee.sda.db.DatabaseUtil;
import ee.sda.entities.Veterinarian;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.persistence.criteria.CriteriaQuery;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @param <T>  Entity
 * @param <K>  Returned key
 */

public abstract class AbstractDAO <T, K> {

    private Class<T> entityClazz;

    public AbstractDAO(Class<T> entityClazz) {
        this.entityClazz = entityClazz;
    }

    public T save(T object) {
        Transaction transaction = null;

        try {
            Session session = DatabaseUtil.getSessionFactory().openSession();
            transaction = session.getTransaction();
            transaction.begin();

            K id = (K) session.save(object);

            transaction.commit();

            return find(id);
        } catch (HibernateException e) {
            e.printStackTrace();
            transaction.rollback();
            return null;
        }

    }

    public void update(T object) {
        Transaction transaction = null;

        try {
            Session session = DatabaseUtil.getSessionFactory().openSession();
            transaction = session.getTransaction();
            transaction.begin();

            session.update(object);

            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        }

    }

    public void delete(T object) {
        Transaction transaction = null;

        try {
            Session session = DatabaseUtil.getSessionFactory().openSession();
            transaction = session.getTransaction();

            transaction.begin();

            session.delete(object);

            transaction.commit();
            session.close();
            System.out.println("Deleted successfully!");
        } catch (HibernateException e) {
            transaction.rollback();
        }

    }

    public T find(K id) {
        Session session = DatabaseUtil.getSessionFactory().openSession();
        T object = session.find(entityClazz, id);
        session.close();
        return object;
    }

    // public ArrayList<SpecificCLASS> findAll()
    public ArrayList<T> findAll() {
        Session session = DatabaseUtil.getSessionFactory().openSession();
        return (ArrayList<T>) session.createCriteria(entityClazz).list();
        // return session.createCriteria(Job.class).list()
    }
}