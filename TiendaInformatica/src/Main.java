package src;

public class Main {
    public static void main(String[] args) {
        trabajador c1 = new trabajador("Álvaro", "Jinamar", "Mañana");
        System.out.println(c1.toString());
        c1.ConfirmarPedido("43243234S");
        c1.RecibirPedido("Paco", "Las Palmas");
        c1.mandarPedidoReparto("Carla", "43257903T");
        c1.confirmarArtículo("Guillermo", "54326312H");
    }
}
