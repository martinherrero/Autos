package ar.utn.dds;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Auto.Auto;
import Auto.CombustibleException;


public class AutosTest {

	@Test (expected = CombustibleException.class)
	public void testEncendidoOk() throws Exception {
		Auto  a1= new Auto();
		a1.SetCombustible(14.0);
		a1.encender();
		
	 Assert.assertEquals(70,a1.getTemp());
	 Assert.assertEquals(13.986,a1.getCombustible(),0);
	 Assert.assertTrue(a1.getEstado());
	}
	
	@Test
	public void testSinCombustible() {
	
	}
}
