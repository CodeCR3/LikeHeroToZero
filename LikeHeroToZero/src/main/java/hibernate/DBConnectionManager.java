package hibernate;

import java.util.Collection;
import java.util.Collections;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import country.Country;

public class DBConnectionManager {
	
	public Collection<Country> getAllCountries() {
		//Create Session Factory
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Country.class);
		
		try (SessionFactory sessionFactory = config.buildSessionFactory()){
			Session session = sessionFactory.openSession();
			
			session.beginTransaction();
			
			Collection<Country> countries = session.createQuery("from Country", Country.class).list();
			session.getTransaction().commit();
			
			System.out.println("RETURN ");
			return countries;
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return Collections.emptyList();
		}
	}

}
