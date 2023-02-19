package programa;

/**
 * Esta clase representa un soldado con dos atributos, estaMuerto y numeroBalas
 * 
 * @author Grupo10 - Jose
 * @version 1.0
 *
 */
public class Soldado {

	/**
	 * Saber si el soldado está muerto.
	 * True significará que está muerto.
	 * False en el caso de que siga con vida.
	 */	
    private boolean estaMuerto;
    
    /**
     * Conocer el número de balas que tiene el soldado en su arma
     */    
    private int numeroBalas;

   
	/**
	 * Método para conocer si el soldado tiene balas para poder disparar
	 * 
	 * @return True si el soldado tiene una o mas balas.
	 * En el caso de que esté a 0 o negativo devolverá false.
	 */
	public boolean puedeDisparar() {
    	if(this.numeroBalas > 0) {
    		return true;
    	}
    		return false;

    }

   
    public void disparar(Soldado sol) {
    	this.numeroBalas--;
    	sol.estaMuerto = true;

                              

    }
    

    
    public boolean isEstaMuerto() {
		return estaMuerto;
	}



	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}



	public int getNumeroBalas() {
		return numeroBalas;
	}



	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

}