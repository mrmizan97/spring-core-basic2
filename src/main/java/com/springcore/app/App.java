package com.springcore.app;

import java.util.ArrayList;
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

			Notice newNotice = new Notice(4,"Rubel", "rubel3@gmail.com", "How do you do3?");
			Notice newNotice1 = new Notice(2,"Rubel2", "rubel3@gmail.com", "How do you do3?");
			Notice newNotice2 = new Notice(5,"Rubel3", "rubel3@gmail.com", "How do you do3?");
			List<Notice> noticelistList = new ArrayList<Notice>();

			noticelistList.add(newNotice);
			noticelistList.add(newNotice1);
			noticelistList.add(newNotice2);
			noticesDAO.create(noticelistList);
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
