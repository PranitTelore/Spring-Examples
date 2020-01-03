package com.test;

import java.util.Date;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		Session session =HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		
		User user = new User();
		user.setUserID(1);
		user.setUserName("pranit");
		user.setCreateBy("flipcart");
		user.setCreateByDate(new Date());
		
		session.save(user);
		session.getTransaction().commit();
		
	}

}
