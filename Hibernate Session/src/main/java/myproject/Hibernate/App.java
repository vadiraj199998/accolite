package myproject.Hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Student>studentList= new ArrayList<Student>();
        System.out.println( "Hello World!" );
        //new Configuration().configure().buildSessionFactory();
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        session.beginTransaction();
		
		 session.beginTransaction(); Student obj=new Student(); obj.setStudentId(1);
		 obj.setStudentAge(22); obj.setStudentName("vadiraj"); session.save(obj);
		 session.getTransaction().commit(); Student obj1=new Student();
		 obj1.setStudentId(2); obj1.setStudentAge(22); obj1.setStudentName("Akshath");
		 session.save(obj1); session.getTransaction().commit(); Integer
		 id=(Integer)session.save(obj);
		 
		 System.out.println(id);
		 
        Criteria cr = session.createCriteria(Student.class); 
		 
		  cr.add(Restrictions.gt("studentAge", 22));
		  studentList= cr.list();
		  System.out.println(studentList.size());
		
		 cr.add(Restrictions.eq("vad", 12)); studentList= cr.list();
		 System.out.println(studentList.size());
		 cr.add(Restrictions.eq("studentId",1)); studentList= cr.list();
		  System.out.println(studentList.get(0).getStudentName()); Course c=new
		  Course(); c.setCourseName("hibernate"); c.setStudentId(2); session.save(c);
		//  Integer id=(Integer)session.save(c); session.getTransaction().commit();
		 
	        System.out.println(id);
	       for(Student student: studentList) {
	  		  System.out.println( student.getStudentName()+"|" 
	  		 +student.getStudentAge()+"|"
	  		 +student.getStudentId()+"|"
	  		 +(!student.getCourses().isEmpty()?student.getCourses().get(0).getCourseName()
	  		  :"") ); }
    }
}
