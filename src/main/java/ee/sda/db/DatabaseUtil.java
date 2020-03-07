package ee.sda.db;

import ee.sda.entities.Consultation;
import ee.sda.entities.Pet;
import ee.sda.entities.Vaccine;
import ee.sda.entities.Veterinarian;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class DatabaseUtil {

    private static SessionFactory sessionFactory;

    public static void init() {
        if (sessionFactory == null) {

            Configuration configuration = new Configuration();
            Properties properties = new Properties();
            properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
            properties.put(Environment.URL, "jdbc:mysql://saeed.chcsf7pbopuv.eu-west-2.rds.amazonaws.com/petclinicMS");
            properties.put(Environment.USER, "sekbodb");
            properties.put(Environment.PASS, "sekbo2018");
            properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
            //properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
            properties.put(Environment.HBM2DDL_AUTO, "none");
            properties.put(Environment.SHOW_SQL, true);
            properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "jta");
            configuration.addAnnotatedClass(Veterinarian.class);
            configuration.addAnnotatedClass(Pet.class);
            configuration.addAnnotatedClass(Vaccine.class);
            configuration.addAnnotatedClass(Consultation.class);
            configuration.setProperties(properties);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
    }

    public static SessionFactory getSessionFactory() {
            if (sessionFactory == null){
                init();
            }

        return sessionFactory;

    }

    public static void shutdown() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

}
