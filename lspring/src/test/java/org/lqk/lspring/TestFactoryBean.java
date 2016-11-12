package org.lqk.lspring;

import org.junit.Test;
import org.lqk.lspring.bean.*;
import org.lqk.lspring.factory.FacadeBeanFactory;

public class TestFactoryBean {
	@Test
	public void testFactoryBean() throws Exception {
		System.out
				.println("====confirm the out put is this junit======14301097========>");
		FacadeBeanFactory factory = new FacadeBeanFactory();
		Car car = (Car) factory.getBean("Car");
		System.out.println(car.tostring());
		Office office = (Office) factory.getBean("Office");
		System.out.println(office.tostring());
		Boss boss = (Boss) factory.getBean("Boss");
		System.out.println(
				"This Boss has a red car with 001, now he is in Office 824.");
		System.out.println(boss.tostring());
	}
}
