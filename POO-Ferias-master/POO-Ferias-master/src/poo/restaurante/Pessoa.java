package poo.restaurante;

public class Pessoa {
    private String nome;
    private Integer identificacao;
    private Integer idade;
    private String contato;

    public Pessoa(String nome, Integer idade, String contato) {
        this.nome = nome;
        this.idade = idade;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(Integer identificacao) {
        this.identificacao = identificacao;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
