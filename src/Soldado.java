/**
 * Clase Soldado que representa a un soldado, si está vivo o no, si puede disparar (mediante el número de balas).
 * @author Víctor Saludes.
 */
public class Soldado {

              private boolean estaMuerto;

              private int numeroBalas;

/**
 * Obtiene el estado del soldado.
 * 
 * @return El estado del soldado (true si está muerto, false si está vivo).
 */             

              public boolean isEstaMuerto() {
				return estaMuerto;
			}

/**
 * Establece el estado del soldado.
 * @param estaMuerto El estado del soldado (true si está muerto, false si está vivo).
 */

			public void setEstaMuerto(boolean estaMuerto) {
				this.estaMuerto = estaMuerto;
			}

/**
 * Obtiene el número de balas que tiene el soldado.
 * 
 * @return El número de balas del soldado.
 */

			public int getNumeroBalas() {
				return numeroBalas;
			}

/**
 * Establece el número de balas que tiene el soldado.
 * 
 * @param numeroBalas El número de balas del soldado.
 */
			public void setNumeroBalas(int numeroBalas) {
				this.numeroBalas = numeroBalas;
			}

/**
 * Comprueba si el soldado puede disparar.
 * @return true si el soldado tiene balas, false si no tiene balas.
		     */

			public boolean puedeDisparar() {

                            if(this.numeroBalas > 0) {

                                          return true;

                            }                          

                            return false;

              }

/**
 * El soldado dispara a otro soldado.
 * @param sol El soldado al que se va a disparar.
 */

              public void disparar(Soldado sol) {

                            this.numeroBalas--;

                            sol.estaMuerto = true;

              }

}