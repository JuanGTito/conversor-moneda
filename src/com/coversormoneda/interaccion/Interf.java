package com.coversormoneda.interaccion;

import com.coversormoneda.moneda.Moneda;

public class Interf {
    private String inicio = """
            -------------------------------------------------------
            Bienvenido A Conversor de Moneda SoulCash
            1. Convertir Moneda
            2. Ver Historial
            3. Salir
            -------------------------------------------------------
            Presione un numero para continuar:
            -------------------------------------------------------
            """;
    private String opcionOne = """
            -------------------------------------------------------
            ESCRIBA EN SUS ACRONIMOS DE LAS MONEDAS QUE DESEA CONSULTAR:
            EJM: USD, EUR.
            -------------------------------------------------------
            """;
    private String preguntaOne = "Escriba su moneda actual que desea convertir:";
    private String preguntaTwo = "Escriba su moneda destino que desea convertir:";
    private String preguntaThree = "Escriba el monto que desea convertir:";
    private String espacio = "-------------------------------------------------------";
    private String siNo = """
            Desea continuar con mas consultas:
            1. Si
            2. No
            """;

    public String getSiNo() {
        return siNo;
    }

    public String getOpcionOne() {
        return opcionOne;
    }

    public String getPreguntaOne() {
        return preguntaOne;
    }

    public String getPreguntaTwo() {
        return preguntaTwo;
    }

    public String getPreguntaThree() {
        return preguntaThree;
    }

    public String getEspacio() {
        return espacio;
    }

    public String getInicio() {
        return inicio;
    }
}
