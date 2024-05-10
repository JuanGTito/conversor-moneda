package com.conversormoneda.historial;

import java.time.LocalDate;
import java.util.ArrayList;

public class Historial{
    private LocalDate fecha;
    private ArrayList<String> historialMoneda;

    public Historial(){
        this.historialMoneda = new ArrayList<>();
    }

    public ArrayList<String> getHistorialMoneda() {
        return historialMoneda;
    }

    public void setHistorialMoneda(String nomMoneda, String nomMoneda2, double montValor) {
        String registrarConsulta =fecha.now() + " --- Moneda 1: " + nomMoneda + ", Moneda 2: " + nomMoneda2 + ", Valor: " + montValor;
        historialMoneda.add(registrarConsulta);
    }
}
