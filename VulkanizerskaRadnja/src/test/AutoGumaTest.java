package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class AutoGumaTest {
	AutoGuma a;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
	a = null;
	}

	@Test
	public void testSetMarkaModel() {
	a.setMarkaModel("Altenzo 245/45");
	assertEquals("Altenzo 245/45", a.getMarkaModel());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrazanString() {
		a.setMarkaModel("Ma");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}
	
	
	@Test
	public void testSetPrecnik() {
		a.setPrecnik(15);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManji() {
		a.setPrecnik(5);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeci() {
		a.setPrecnik(50);
	}	
	
	@Test
	public void testSetSirina() {
		a.setSirina(150);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManja() {
		a.setSirina(50);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaVeca() {
		a.setSirina(450);
	}
	
	@Test
	public void testSetVisina() {
		a.setVisina(50);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaManja() {
		a.setVisina(5);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVeca() {
		a.setVisina(100);
	}
	@Test
	public void testToString() {
		a.setMarkaModel("Altenzo 245/45");
		a.setPrecnik(20);
		a.setSirina(189);
		a.setVisina(60);
		assertEquals("AutoGuma marke:Altenzo 245/45, precnika: 20, sirine: 189, visine:60", a.toString());
	}

	@Test
	public void testEqualsObject() {
		a.setMarkaModel("Altenzo 245/45");
		a.setPrecnik(20);
		a.setSirina(189);
		a.setVisina(60);
	
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Altenzo 245/45");
		a2.setPrecnik(20);
		a2.setSirina(189);
		a2.setVisina(60);
		
	assertTrue(a.equals(a2));	
	}

	
	@Test 
	public void testEqualsObjectFalse() {
		a.setMarkaModel("Altenzo 245/45");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(60);
	
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Altenzo 245/45");
		a2.setPrecnik(20);
		a2.setSirina(200);
		a2.setVisina(59);
		
	assertFalse(a.equals(a2));
	}
	
	
	
	
	
	
	
	
	
	
}
