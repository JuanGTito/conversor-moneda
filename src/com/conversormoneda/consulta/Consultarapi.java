package com.conversormoneda.consulta;

import com.conversormoneda.moneda.Moneda;
import com.conversormoneda.moneda.MonedaOmdb;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consultarapi extends Moneda {

    private String direccion = "https://v6.exchangerate-api.com/v6/6e37e199e7b7f44d2002ef08/pair/"+getMoneda()+"/"+getMoneda2()+"/"+getValor();

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(direccion))
            .build();

    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    private String json = response.body();

    Gson gson = new Gson();
    //Moneda moneda = gson.fromJson(json, Moneda.class);
    MonedaOmdb monedaOmdb = gson.fromJson(json, MonedaOmdb.class);
    Moneda moneda = new Moneda(monedaOmdb);
    Moneda prueba = moneda;

    public Consultarapi(String moneda, double valor, String moneda2) throws IOException, InterruptedException {
        super(moneda, valor, moneda2);
    }

    public String getDireccion() {
        return direccion;
    }

    public String getJson() {
        return json;
    }

    public Moneda getPrueba() {
        return prueba;
    }
}
