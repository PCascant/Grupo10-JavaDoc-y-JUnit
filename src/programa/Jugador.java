package programa;

/**
 * Esa clase representa a un jugador que tiene tres atributos; dorsal, numeroTarjetasAmarillas y numeroTarjetasRojas.
 * 
 * @author Grupo10 - Jose
 * @version 1.0
 *
 */
public class Jugador {
	/**
	 * Dorsal que llevará el jugador
	 */
    private int dorsal;
    
    /**
     * El número de tarjetas amarillas del jugador
     */
    private int numeroTarjetasAmarillas;
    
    /**
     * El número de tarjetas rojas del jugador
     */
    private int numeroTarjetasRojas;

               	
	/**
	 * Método para poner el dorsal del jugador que debe estar comprendido entre 1 y 30
	 * Si el dorsal está fuera del rango anterior, devolverá -1.
	 * 
	 * @param dorsal representa el dorsal del jugador que queramos establecer
	 */
    public void ponerDorsal(int dorsal) {
    	
    	if(dorsal >= 1 && dorsal <= 30) {
      	  this.dorsal = dorsal;                               

        }else {
      	  this.dorsal = -1;                                

        }

                  

    }

   
    /**
     * Método para saber si un jugador debe estar expulsado.
     * 
     * @return True en el caso de que un jugador tenga dos amarillas o una roja.
     * Devolverá false si no se cumple ninguna de las dos condiciones anteriores.
     */
	public boolean estaExpulsado() {
		boolean expulsado = false;
		
		    if(numeroTarjetasAmarillas == 2) {
		    	expulsado = true;
		 }                          

            if(numeroTarjetasRojas == 1) {
            	expulsado = true;

         }  
            
            return expulsado;

    }            
	


    public int getDorsal() {
		return dorsal;
	}



	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}



	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}



	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}



	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}



	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

}