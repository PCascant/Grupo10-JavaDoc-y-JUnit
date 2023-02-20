/**
 * La clase Jugador representa a un jugador de fútbol con su dorsal y el estado en el partido a través de las amonestaciones.
 * @author Víctor Saludes
 *
 */
public class Jugador {

              private int dorsal;

              private int numeroTarjetasAmarillas;

              private int numeroTarjetasRojas;

                           
/**
 * Devuelve el número de dorsal del jugador.
 *
 * @return el número de dorsal del jugador
 */
          	public int getDorsal() {
				return dorsal;
			}


/**
 * Establece el número de dorsal del jugador.
 *
 * @param dorsal el número de dorsal a establecer
 */
			public void setDorsal(int dorsal) {
				this.dorsal = dorsal;
			}

/**
 * Devuelve el número de tarjetas amarillas que ha recibido el jugador.
 *
 * @return el número de tarjetas amarillas del jugador
 */
			public int getNumeroTarjetasAmarillas() {
				return numeroTarjetasAmarillas;
			}


/**
 * Establece el número de tarjetas amarillas que ha recibido el jugador.
 *
 * @param numeroTarjetasAmarillas el número de tarjetas amarillas a establecer
 */
			public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
				this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
			}


/**
 * Devuelve el número de tarjetas rojas que ha recibido el jugador.
 *
 * @return el número de tarjetas rojas del jugador
 */
			public int getNumeroTarjetasRojas() {
				return numeroTarjetasRojas;
			}


/**
 * Establece el número de tarjetas rojas que ha recibido el jugador.
 *
 * @param numeroTarjetasRojas el número de tarjetas rojas a establecer
 */
			public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
				this.numeroTarjetasRojas = numeroTarjetasRojas;
			}            


/**
 * Establece el número de dorsal del jugador siempre y cuando éste esté comprendido entre 1 y 30, ambos incluidos.
 * En caso contrario devolverá se establecerá en -1.
 *
 * @param dorsal el número de dorsal a establecer
 */
              public void ponerDorsal(int dorsal) {

                            if(dorsal >= 1 && dorsal <= 30) {

                                          this.dorsal = dorsal;

                            }else {

                                          this.dorsal = -1;

                            }

              }

             
/**
 * Indica si el jugador está expulsado del partido.
 * Un jugador está expulsado si ha recibido dos tarjetas amarillas o una tarjeta roja.
 *
 * @return true si el jugador está expulsado, false en caso contrario
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
              
}