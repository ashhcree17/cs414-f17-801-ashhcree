package com.spring.controllerTest;
//package globoGymMS;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.time.Duration;
//import java.util.ArrayList;
//
//public class CustomerTest {
//	@Test
//	public final void getStreet1() {
//		Address a = new Address(200, "123 Main St", "Apt 123", 
//				"Town", "CO", 12345);
//		ArrayList<Routine> rs = new ArrayList<Routine>();
//		ArrayList<Exercise> es = new ArrayList<Exercise>();
//
//		Exercise e = new Exercise(001, "E1", Duration.ofSeconds(120));
//		es.add(e);
//		
//		Routine r = new Routine(00, "R1", es);
//		rs.add(r);
//		
//		Customer c = new Customer(200, "Joe", "Blow", a, 1234567890, 
//				"joe@email.com", "Aetna", MembershipStatus.ACTIVE, rs);
//		Assert.assertEquals(MembershipStatus.ACTIVE, c.getMembership());
//	}
//}