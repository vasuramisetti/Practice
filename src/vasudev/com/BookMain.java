package vasudev.com;

import java.util.List;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BookMain {


		public static void main(String[] args) {
			
			ApplicationContext Context = new ClassPathXmlApplicationContext("DdDetails.xml");;
			
			BookDAO bookDAO = Context.getBean( BookDAO.class);
			
			
			Book bk = new Book();
			int rand = new Random().nextInt(1000);
			bk.setBookid(rand);
			bk.setTitle("Hello Java world");
			bk.setAuthor("vasudev ramisetti");
			bk.setStatus("Available");
			bookDAO.save(bk);
			
			
		
			List<Book> bkList = bookDAO.getAll();
			System.out.println(bkList);
			
			((AbstractApplicationContext) Context).close();
			
			System.out.println("DONE");
		}

		
		
	}
	

