package com.conversormoneda;

import com.conversormoneda.consulta.Consultarapi;
import com.conversormoneda.historial.Historial;
import com.conversormoneda.interaccion.Interf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        Historial historialDeConsultas = new Historial();

        int opcion;
        do {
        //Interfaz del usuario
        Interf interfaz = new Interf();
        System.out.println(interfaz.getInicio());
        opcion = teclado.nextInt();

        switch (opcion){
            case 1:
                int siNo = 1;
                while (siNo == 1){
                    //Consultas hacia el ususario:
                    System.out.println(interfaz.getOpcionOne());
                    System.out.println(interfaz.getPreguntaOne());
                    String nomMoneda = teclado.next();
                    System.out.println(interfaz.getPreguntaTwo());
                    String nomMoneda2 = teclado.next();
                    System.out.println(interfaz.getPreguntaThree());
                    double montValor = teclado.nextDouble();
                    System.out.println(interfaz.getEspacio());

                    historialDeConsultas.setHistorialMoneda(nomMoneda, nomMoneda2, montValor);

                    Consultarapi consulApi = new Consultarapi(nomMoneda, montValor, nomMoneda2);
                    System.out.println(montValor + ": " + consulApi.getPrueba());

                    System.out.println(interfaz.getSiNo());
                    siNo = teclado.nextInt();
                }
            case 2:
                System.out.println("Buscando informacion");
                ArrayList<String> historialMoneda = historialDeConsultas.getHistorialMoneda();
                System.out.println("Historial");
                for (String historialMD : historialMoneda){
                    System.out.println(historialMD);
                }

                break;
            case 3:
                System.out.println("Saliendo del Sistema");
                break;
        }
        }while(opcion != 3);

        //Moneda moneda = new Moneda(nomMoneda, montValor, nomMoneda2);

    }
}