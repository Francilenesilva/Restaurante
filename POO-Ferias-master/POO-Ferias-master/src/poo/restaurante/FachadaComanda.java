package poo.restaurante;

public class

FachadaComanda {
    private String garcom;
    private String pedido;
    private Double valor;

    public FachadaComanda(String garcom, String pedido, Double valor) {
        this.garcom = garcom;
        this.pedido = pedido;
        this.valor = valor;
    }

    public String getGarcom() {
        return garcom;
    }

    public void setGarcom(String garcom) {
        this.garcom = garcom;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
