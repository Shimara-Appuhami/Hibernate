package lk.ijse.gdse.config;

import lk.ijse.gdse.entity.Batch;
import lk.ijse.gdse.entity.Student;
import lk.ijse.gdse.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private static SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration=new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Batch.class)
                .addAnnotatedClass(Teacher.class);

        sessionFactory=configuration.buildSessionFactory();
    }
    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration==null)?
                factoryConfiguration=new FactoryConfiguration():factoryConfiguration;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }

}
