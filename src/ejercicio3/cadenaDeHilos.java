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
public class cadenaDeHilos extends Thread {

    Thread hilo;

    public void run() {
        System.out.println("\nPadre " + getName());// obtenemos el nombre del hilo padre
        hilo = new Thread(this, "Juan");
        for (int i = 0; i < 10; i++) {
            System.out.println("Hijo " + hilo.getName() + (i+1) + "/10");
            try {
                int siesta = (int) (Math.random() * (601 - 101)) + 100;
                hilo.sleep(siesta);
                System.out.println("dormido durante" + siesta + "ms");
            } catch (InterruptedException ex) {
                System.out.println("Hilo Interrumpido");
            }
        }

    }
}
