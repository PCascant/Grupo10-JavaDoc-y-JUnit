/**
 * Clase TestingSoldado para hacer el test con JUnit para la clase Soldado.
 * @author Víctor Saludes.
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestingSoldado {
	
	private Soldado s1;
	private Soldado s2;
	
	@BeforeEach
	void setUp() throws Exception {
		//Creamos dos objetos soldado nuevos para cada test.
		s1 = new Soldado();
		s2 = new Soldado();
	}
	//Testeamos el método puedeDisparar
	//Probamos estableciendo el número de balas a 0.
	@Test
	public void testPuedeDispararSinBalas() {
		s1.setNumeroBalas(0);
		assertFalse(s1.puedeDisparar());
	}
	//Probando con número de balas 5 y 20.
	@Test
    public void testPuedeDispararConBalas() {
        s1.setNumeroBalas(5);
        assertTrue(s1.puedeDisparar());
        s1.setNumeroBalas(20);
        assertTrue(s1.puedeDisparar());
    }
	//Test método disparar.
	  @Test
	    public void testDisparar() {
		    //Damos una bala al soldado1.
	        s1.setNumeroBalas(1);
	        //soldado 1 dispara a soldado 2
	        s1.disparar(s2);
	        //establece el estado del soldado objetivo a "muerto"
	        assertTrue(s2.isEstaMuerto());
	        //se verifica que el método disparar reduce el número de balas del soldado que dispara
	        assertEquals(0, s1.getNumeroBalas());
	    }
}
