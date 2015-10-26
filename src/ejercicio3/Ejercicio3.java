/**
 * Realizar un programa que cree un hilo, que a su vez cree otro hilo, y así
 * consecutivamente, hasta un total de cinco hilos. Cada hilo debe presentar su
 * nombre indicando que ha comenzado, crear su hilo hijo y presentar su nombre
 * 10 veces indicando que se está procesando, esperando un tiempo aleatorio
 * entre 100 y 600 milisegundos entre cada presentación. Cada hilo deberá
 * esperar a que su hijo termine antes de presentar su último mensaje indicando
 * su nombre y que ha terminado.
 */
package ejercicio3;

/**
 *
 * @author Fran Abril Alvarez
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // se crea cinco veces una nueva clase llamada cadenaDeHilos
        for (int i = 0; i < 5; i++) {
            cadenaDeHilos nueva = new cadenaDeHilos();
            nueva.setName("Manolo "+(i+1));
            nueva.start();
            nueva.join();
        }
    }
}
