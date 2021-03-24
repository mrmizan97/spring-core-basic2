package com.springcore.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import com.springcore.annotation.Notice;
import com.springcore.annotation.NoticesDAO;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans/config.xml");

		NoticesDAO noticesDAO = context.getBean("noticesDAO", NoticesDAO.class);
		try {
//			noticesDAO.delete(2);
			Notice newNotice = new Notice("Rubel", "rubel@gmail.com", "How do you do?");
//			noticesDAO.create(newNotice);
			List<Notice> notices = noticesDAO.getNotices();
			for (Notice notice : notices) {
				System.out.println("Notice: " + notice);
			}
			Notice notice = (Notice) noticesDAO.getNotice(1);
//			System.out.println("By id: " + notice);
		} catch (CannotGetJdbcConnectionException e) {
			// TODO: handle exception
			System.out.println("Could not jdbc connection");
		} catch (DataAccessException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}

		((ClassPathXmlApplicationContext) context).close();
	}
}
