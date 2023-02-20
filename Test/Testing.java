/**
 * Clase Testing para hacer el test con JUnit para la clase Jugador.
 * @author Víctor Saludes.
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;	
	
	class Testing {
	   
		private Jugador j1;
	      	
	    @BeforeEach
	    void setUp() throws Exception {
	    //Creamos un objeto jugador nuevo para cada test.
	    		j1 = new Jugador();
	    		
	    	}
	 
	    //Comprobamos la asignación del dorsal al jugador.
	    @Test
	    public void testGetDorsal() {
	        j1.setDorsal(10);
	        assertEquals(10, j1.getDorsal());
	    }
	    
	    //Comprobamos si añade las tarjetas amarillas al jugador 1.
	    @Test
	    public void testGetNumeroTarjetasAmarillas() {
	        j1.setNumeroTarjetasAmarillas(1);
	        assertEquals(1, j1.getNumeroTarjetasAmarillas());
	    }
	  
	    //Comprobamos si añade la tarjeta roja al jugador 1.
	    @Test
	    public void testGetNumeroTarjetasRojas() {
	        j1.setNumeroTarjetasRojas(1);
	        assertEquals(1, j1.getNumeroTarjetasRojas());
	    }
	    
	    //Comprobación del correcto funcionamiento del método ponerDorsal, usando un dorsal considerado válido (entre 1 y 30)
	    @Test
	    public void testPonerDorsalValido() {
	        j1.ponerDorsal(10);
	        assertEquals(10, j1.getDorsal());
	    }

	    //Comprobación del correcto funcionamiento del método ponerDorsal, usando un dorsal considerado inválido 
	    //(no está comprendido entre 1 y 30)
	    //El resultado ha de ser -1.
	    @Test
	    public void testPonerDorsalInvalido() {
	        j1.ponerDorsal(40);
	        assertEquals(-1, j1.getDorsal());
	    }

	  //Comprobación del correcto funcionamiento del método estaExpulsado.
	    
	    //Sin tarjetas.
	    @Test
	    public void testEstaExpulsadoSinTarjetas() {
	        assertEquals(false, j1.estaExpulsado());
	    }
	    
	    //Con dos amarillas debe ser expulsado.
	    @Test
	    public void testEstaExpulsadoDosAmarillas() {
	        j1.setNumeroTarjetasAmarillas(2);
	        assertEquals(true, j1.estaExpulsado());
	    }
	    
	    //Con tarjeta roja debe ser expulsado.
	    @Test
	    public void testEstaExpulsadoUnaRoja() {
	        j1.setNumeroTarjetasRojas(1);
	        assertEquals(true, j1.estaExpulsado());
	    }
	}
