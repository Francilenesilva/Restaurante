package poo.restaurante;

public class Comanda {
    public Pedido[] pedidos;

    public Comanda(){
        pedidos = new Pedido[20];
        pedidos[0] = new Pedido();
    }

    public Double calculaPreco() {
        Double total = Double.valueOf(0);

        for (int i=0; i<pedidos.length; i++) {
            Pedido um = pedidos[i];
            total +=  um.calculaPreco();
        }

        return total;
    }
}
