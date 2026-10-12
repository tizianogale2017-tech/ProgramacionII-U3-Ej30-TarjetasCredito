package Ejercicio30_tarjetasCredito;

public class TarjetaCredito {
    private String numero;
    private String titular;
    protected double limiteCredito;
    protected double saldoUtilizado;

    public TarjetaCredito(String numero, String titular, double limiteCredito) {
        if (limiteCredito <= 0) {
            throw new IllegalArgumentException("El límite de crédito debe ser mayor a cero.");
        }
        this.numero = numero;
        this.titular = titular;
        this.limiteCredito = limiteCredito;
        this.saldoUtilizado = 0;
    }

    protected boolean validarCompra(double monto) {
        return monto > 0 && saldoUtilizado + monto <= limiteCredito;
    }

    public boolean comprar(double monto) {
        if (!validarCompra(monto)) {
            return false;
        }
        saldoUtilizado += monto;
        return true;
    }

    public void mostrarEstadoCuenta() {
        System.out.println(getClass().getSimpleName() + " " + numero + " - " + titular
                + " | usado: " + saldoUtilizado + " de " + limiteCredito);
    }
}
