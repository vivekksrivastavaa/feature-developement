package my;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		
		Address address=new Address("Haryana", "gurgaon", "122001");
		
		
		
        Student student=new Student("vivek", address);
        Student student2=new Student("vivek1",address);
		 session.save(student);
		 session.save(student2);
		 session.getTransaction().commit();
		 System.out.println("successfully saved.................");
		 session.close();

	}

}
