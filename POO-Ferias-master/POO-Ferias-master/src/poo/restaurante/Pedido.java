package poo.restaurante;

public class Pedido {
    public Funcionario garcom = new Funcionario("Zé",32,"88888808");
    public Prato prato =  new Prato();
    public Integer quantidade;

    public Pedido() {
        garcom.setNome("Zé");
        prato.setNome("Macarronada");
        prato.setValorPrato(10.0);
    }

    public Double calculaPreco() {
        return this.prato.getValor() * this.quantidade;
    }
}
