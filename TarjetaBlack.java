package Ejercicio30_tarjetasCredito;

public class TarjetaBlack extends TarjetaCredito {
    private double millas;
    private boolean seguroDeViaje = true;

    public TarjetaBlack(String numero, String titular, double limiteCredito) {
        super(numero, titular, limiteCredito);
    }

    @Override
    protected boolean validarCompra(double monto) {
        return monto > 0 && saldoUtilizado + monto <= limiteCredito * 1.25;
    }

    @Override
    public boolean comprar(double monto) {
        boolean aprobada = super.comprar(monto);
        if (aprobada) {
            millas += monto * 0.03;
        }
        return aprobada;
    }

    @Override
    public void mostrarEstadoCuenta() {
        super.mostrarEstadoCuenta();
        System.out.println("  Millas acumuladas: " + millas + " | Seguro de viaje: " + (seguroDeViaje ? "incluido" : "no"));
    }
}
