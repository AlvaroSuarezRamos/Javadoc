package src;

/**
 * @author Álvaro Suárez
 */
public class trabajador {
    private String Nombre;
    private String DNI;
    private String turnoDeTrabajo;

    /**
     *
     * @param Nombre
     * @param DNI
     * @param turnoDeTrabajo
     */

    public trabajador(String Nombre, String DNI, String turnoDeTrabajo) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.turnoDeTrabajo = turnoDeTrabajo;
    }

    /**
     *
     * @param DNI
     * @return
     */

    public String ConfirmarPedido(String DNI) {
        return this.DNI;
    }

    /**
     *
     * @param Nombre
     * @param DNI
     * @return
     */

    public String RecibirPedido(String Nombre, String DNI) {
        System.out.println("Pedido recibido correctamente");
        return this.DNI;
    }

    /**
     *
     * @param Nombre
     * @param DNI
     * @return
     */

    public String mandarPedidoReparto(String Nombre, String DNI) {
        System.out.println("Pedido mandado correctamente");
        return this.DNI + this.turnoDeTrabajo;
    }

    /**
     *
     * @param Nombre
     * @param DNI
     * @return
     */

    public String confirmarArtículo(String Nombre, String DNI) {
        System.out.println("El artículo está listo para ser enviado");
        return this.DNI + this.turnoDeTrabajo;
    }

    /**
     *
     * @return
     */


    public String toString() {
        return "Nombre: " + this.Nombre + "\nDNI: " + this.DNI + "\nturnoDeTrabajo: " + this.turnoDeTrabajo + "\n";
    }
}
