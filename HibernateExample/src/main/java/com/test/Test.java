package com.test;

import java.util.Date;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		Session session =HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		
		User user = new User();
		user.setUserId(2);
		user.setUserName("Pranit");
		user.setCreateBy("Amazon");
		user.setCreateByDate(new Date());
		
		session.save(user);
		session.getTransaction().commit();
		
	}

}
