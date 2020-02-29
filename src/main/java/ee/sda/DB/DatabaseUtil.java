package ee.sda.DB;

import ee.sda.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class DatabaseUtil {

    private static SessionFactory sessionFactory;


    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {


            Configuration configuration = new Configuration();

            Properties properties = new Properties();
            properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");

            properties.put(Environment.URL, "jdbc:mysql://localhost:3306/petclinicMS");

            properties.put(Environment.USER, "root");
            properties.put(Environment.PASS, "13ddonjee");

            properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");

            properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

            properties.put(Environment.HBM2DDL_AUTO, "none");

            properties.put(Environment.SHOW_SQL, true);

            configuration.addAnnotatedClass(Veterinarian.class);
            configuration.addAnnotatedClass(Pet.class);
            configuration.addAnnotatedClass(Vaccine.class);
            configuration.addAnnotatedClass(Consultation.class);
            configuration.addAnnotatedClass(Pet_Vaccine.class);
            configuration.setProperties(properties);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);


        }
        return sessionFactory;

    }

    static void shutdown() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

}
