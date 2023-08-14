package br.com.alura.buscaCep.Principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.printf("Projeto Busca CEP via API da ViaCEP!");
        Scanner leitura = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
    }
}

