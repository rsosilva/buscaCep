package br.com.alura.buscaCep.principal;

import br.com.alura.buscaCep.modelos.ConsultaCep;
import br.com.alura.buscaCep.modelos.Endereco;
import br.com.alura.buscaCep.modelos.GeradorDeArquivo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Projeto Busca CEP via API da ViaCEP!");
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o cep para busca: ");
        String cep = leitura.nextLine();
        try {
            Endereco novoEndereco =  consultaCep.buscaCep(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }

}

