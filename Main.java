package Ejercicio30_tarjetasCredito;

public class Main {
    public static void main(String[] args) {
        TarjetaCredito comun = new TarjetaCredito("4000-1111", "Nora Gil", 100000.0);
        TarjetaGold gold = new TarjetaGold("5000-2222", "Hugo Paz", 100000.0);
        TarjetaBlack black = new TarjetaBlack("6000-3333", "Ana Díaz", 100000.0);

        TarjetaCredito[] tarjetas = {comun, gold, black};
        for (TarjetaCredito t : tarjetas) {
            System.out.println("Compra de 80000: " + (t.comprar(80000.0) ? "APROBADA" : "RECHAZADA"));
            System.out.println("Compra de 40000: " + (t.comprar(40000.0) ? "APROBADA" : "RECHAZADA"));
            t.mostrarEstadoCuenta();
            System.out.println();
        }
    }
}
