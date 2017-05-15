package com.speed.mixer;

import com.speed.mixer.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory factory = configuration.buildSessionFactory(builder.build());
        Session session = factory.openSession();
        Employee employee = new Employee();
        employee.setEmpName("Sambit");;
        employee.setBranch("Pune");
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
    }
}
