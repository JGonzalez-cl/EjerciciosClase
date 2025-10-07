package AccesoDatos.EjercicioHerencia;

public class Test {
    public static void main(String[] args) {
        ProductoFresco fresco = new ProductoFresco("2025-09-25", "A01", "2025-05-01", "España");
        ProductoRefrigerado refrigerado = new ProductoRefrigerado("2025-09-25", "B01", "00001");
        CongeladoAire aire = new CongeladoAire("2025-09-25", "001", -20.0, 78.0, 21.0, 0.03, 0.97);
        CongeladoAgua agua = new CongeladoAgua("2025-09-25", "002", -18.0, 3.5);
        CongeladoNitrogeno nitrogeno = new CongeladoNitrogeno("2025-09-25", "003", -25.0, "Inmersion", 120);

        System.out.println("PRODUCTOS CREADOS: ");
        System.out.println(fresco.mostrarInfo());
        System.out.println(refrigerado.mostrarInfo());
        System.out.println(aire.mostrarInfo());
        System.out.println(agua.mostrarInfo());
        System.out.println(nitrogeno.mostrarInfo());
    }
}
