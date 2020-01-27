package poo.restaurante;

public class Mesa {
    public Integer numeroMesa;
    private Integer numOcupantes;
    private StatusMesa status;
    private Comanda comanda = new Comanda();
    private Integer capacidade;

    public Mesa (Integer numero) {
        this.numeroMesa = numero;
    }

    public void ocuparMesa(int numOcupantes) {
        if (numOcupantes<=this.capacidade && status==StatusMesa.LIVRE) {
            this.numOcupantes = numOcupantes;
            this.status = StatusMesa.OCUPADA;
            this.comanda = new Comanda();
        }
        else {
            return;
        }
    }

    public void desocuparMesa(double valorPago) {
        Double total = comanda.calculaPreco();
        if (valorPago>=total) {
            this.numOcupantes = 0;
            this.status = StatusMesa.LIVRE;
            this.comanda = null;
        }
    }

    @Override
    public String toString() {
        return this.numeroMesa.toString();
    }

    public Integer getNumOcupantes() {
        return numOcupantes;
    }

    public void setNumOcupantes(Integer numOcupantes) {
        this.numOcupantes = numOcupantes;
    }

    public boolean isEstaLivre() {
        return status==StatusMesa.LIVRE;
    }

    public void setEstaLivre(boolean estaLivre) {
        this.status = StatusMesa.LIVRE;
    }

    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Integer getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(Integer numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public StatusMesa getStatus() {
        return status;
    }
}
