package Ejercicio30_tarjetasCredito;

public class TarjetaGold extends TarjetaCredito {
    private double millas;

    public TarjetaGold(String numero, String titular, double limiteCredito) {
        super(numero, titular, limiteCredito);
    }

    @Override
    protected boolean validarCompra(double monto) {
        return monto > 0 && saldoUtilizado + monto <= limiteCredito * 1.10;
    }

    @Override
    public boolean comprar(double monto) {
        boolean aprobada = super.comprar(monto);
        if (aprobada) {
            millas += monto * 0.01;
        }
        return aprobada;
    }

    @Override
    public void mostrarEstadoCuenta() {
        super.mostrarEstadoCuenta();
        System.out.println("  Millas acumuladas: " + millas);
    }
}
