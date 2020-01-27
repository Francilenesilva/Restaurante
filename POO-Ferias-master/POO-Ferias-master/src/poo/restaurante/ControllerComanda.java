package poo.restaurante;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControllerComanda  {


    @FXML
    private TableView tabelaComanda = new TableView<>();

    @FXML
    private TableColumn colunaGarcom = new TableColumn<>("Garcom");

    @FXML
    private TableColumn colunaValor = new TableColumn<>("Valor");

    @FXML
    private TableColumn colunaPedido = new TableColumn<>("Pedido");






    @FXML
    private TextField textFieldDesconto;



    @FXML
    private Button botaoFinalizarPedido;

    @FXML
    private TextField textFieldTotal;

    @FXML
    private Button botaoAplicarDesconto;

    @FXML
    private Button botaoLiberarMesa;


    // Variável para fazer uma coerção no objeto recebido do observer.
    Mesa mesa = new Mesa(0);



    @FXML
    public void initialize() {
        ControllerPrincipal.addMudaTela(new ControllerPrincipal.ObsMudaTela() {
            @Override
            public void mudaTela(Object objetoQualquer) {
                mesa = ((Mesa) objetoQualquer);
            }
        });

        List pessoas = Arrays.asList(
                new FachadaComanda(mesa.getComanda().pedidos[0].garcom.getNome(), mesa.getComanda().pedidos[0].prato.getNome(), mesa.getComanda().pedidos[0].prato.getValor())
        );

        colunaGarcom.setCellValueFactory(new PropertyValueFactory<>("garcom"));
        colunaPedido.setCellValueFactory(new PropertyValueFactory<>("pedido"));
        colunaValor.setCellValueFactory(new PropertyValueFactory<>("valor"));



        tabelaComanda.setItems(FXCollections.observableArrayList(pessoas));
    }



}
