package ee.sda.dao;

import ee.sda.db.DatabaseUtil;
import ee.sda.entities.Vaccine;
import ee.sda.entities.Veterinarian;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
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
        } catch (HibernateException e) {
            transaction.rollback();
        }
    }

    public T find(K id) {
        Session session = DatabaseUtil.getSessionFactory().openSession();
        T object = session.find(entityClazz, id);
        return object;
    }

    // public List<SpecificCLASS> findAll()
    public List<T> findAll() {
        Session session = DatabaseUtil.getSessionFactory().openSession();
        /*CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
        CriteriaQuery<Vaccine> criteriaBuilderQuery=criteriaBuilder.createQuery(Vaccine.class);
        Root<Vaccine> root=criteriaBuilderQuery.from(Vaccine.class);
        criteriaBuilderQuery.select(root);

        return findAll();

         */
        return session.createCriteria(entityClazz).list();
        // return session.createCriteria(Job.class).list()
    }
}
