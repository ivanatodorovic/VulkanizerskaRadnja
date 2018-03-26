package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;
import gume.radnja.VulkanizerskaRadnja;

public class VulkanizerskaRadnjaTest {
	VulkanizerskaRadnja v;
	AutoGuma a;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	v = new VulkanizerskaRadnja();
	a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
	v = null;
	a = null;
	}

	@Test
	public void testDodajGumu() {
		a.setMarkaModel("Altenzo 245/45");
		a.setPrecnik(20);
		a.setSirina(189);
		a.setVisina(60);
		v.dodajGumu(a);	
	assertEquals(a, v.getGume().getFirst());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuNull() {
	a = null;
	v.dodajGumu(a);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuPostoji() {
		a.setMarkaModel("Altenzo 245/45");
		a.setPrecnik(20);
		a.setSirina(189);
		a.setVisina(60);
		v.dodajGumu(a);	
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Altenzo 245/45");
		a2.setPrecnik(20);
		a2.setSirina(189);
		a2.setVisina(60);
		v.dodajGumu(a2);	
	}
	
	
	@Test
	public void testPronadjiGumuNull() {
		assertEquals(null, v.pronadjiGumu(null));
	}

	@Test
	public void testPronadjiGumuNePostoji() {
		assertEquals(0, v.pronadjiGumu("Altenzo 245/45").size());
	}

	@Test
	public void testPronadjiGumuJedna() {
		a.setMarkaModel("Altenzo 245/45");
		a.setPrecnik(20);
		a.setSirina(189);
		a.setVisina(60);
		v.dodajGumu(a);	
		
		assertEquals(1, v.pronadjiGumu("Altenzo 245/45").size());
	}

	@Test
	public void testPronadjiGumuVise() {
		a.setMarkaModel("Altenzo 245/45");
		a.setPrecnik(20);
		a.setSirina(189);
		a.setVisina(60);
		v.dodajGumu(a);
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Altenzo 245/45");
		a2.setPrecnik(22);
		a2.setSirina(335);
		a2.setVisina(65);
		v.dodajGumu(a2);
		AutoGuma a3 = new AutoGuma();
		a3.setMarkaModel("Altenzo 245/45");
		a3.setPrecnik(19);
		a3.setSirina(200);
		a3.setVisina(61);
		v.dodajGumu(a3);
	
		
		assertEquals(3, v.pronadjiGumu("Altenzo 245/45").size());
	}

	
	
	
	
	
	
	
}