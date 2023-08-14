package br.com.alura.buscaCep.modelos;

public class Endereco {
    private String cep;         //cep: "01001-000",
    private String logradouro;  //"logradouro": "Praça da Sé",
    private String complemento; // "complemento": "lado ímpar",
    private String bairro;      //"bairro": "Sé",
    private String localidade;  // "localidade": "São Paulo",
    private String uf;          //"uf": "SP",
    private String ibge;        //"ibge": "3550308",
    private String gia;         //"gia": "1004",
    private String ddd;         // "ddd": "11",
    private String siafi;       //"siafi": "7107"

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    public String getIbge() {
        return ibge;
    }

    public String getGia() {
        return gia;
    }

    public String getDdd() {
        return ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    public Endereco(EnderecoViaCep viaCep){
        this.cep            = viaCep.cep();
        this.logradouro     = viaCep.logradouro();
        this.complemento    = viaCep.logradouro();
        this.bairro         = viaCep.bairro();
        this.localidade     = viaCep.localidade();
        this.uf             = viaCep.uf();
        this.ibge           = viaCep.ibge();
        this.gia            = viaCep.gia();
        this.ddd            = viaCep.ddd();
        this.siafi          = viaCep.siafi();
    }

    @Override
    public String toString() {
        return  "Cep:"+this.cep + "\n" +
                "Logradouro:"+this.logradouro + "\n" +
                "Complemento:"+this.complemento + "\n" +
                "Bairro:"+this.bairro + "\n" +
                "Cidade:"+this.localidade + "\n" +
                "Estado:"+this.uf + "\n" +
                "DDD:"+this.ddd;
    }
}
