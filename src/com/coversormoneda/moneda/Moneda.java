package com.coversormoneda.moneda;

import com.google.gson.annotations.SerializedName;

public class Moneda {

    private String moneda;
    private double valCambio;
    private double valor;
    private String moneda2;
    private Double total;

    public Moneda(String moneda, double valor, String moneda2) {
        this.moneda = moneda;
        this.moneda2 = moneda2;
        this.valor = valor;
    }

    public Moneda(MonedaOmdb consulMonedaOmdb) {
        this.moneda = consulMonedaOmdb.base_code();
        this.valCambio = consulMonedaOmdb.conversion_rate();
        this.moneda2 = consulMonedaOmdb.target_code();
        this.total = consulMonedaOmdb.conversion_result();
    }

    public String getMoneda() {
        return moneda;
    }

    public double getValor() {
        return valor;
    }

    public String getMoneda2() {
        return moneda2;
    }

    public Double getTotal() {
        return total;
    }

    public double getValCambio() {
        return valCambio;
    }

    @Override
    public String toString() {
        return  moneda + " es igual a " +
                total + " " + moneda2;
    }
}
