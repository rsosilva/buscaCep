package br.com.alura.buscaCep.modelos;

public record EnderecoViaCep(String cep, String logradouro, String complemento, String bairro, String localidade, String uf, String ibge, String gia, String ddd,String siafi) {
}
