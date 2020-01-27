package poo.restaurante;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ControllerPrincipal {


    @FXML
    private ComboBox<Mesa> comboBoxOcupadas;

    @FXML
    private ComboBox<String> comboBoxGarcom;


    @FXML
    private ListView<Mesa> listViewOcupadas;

    @FXML
    private ListView<Mesa> listViewReservadas;

    @FXML
    private ListView<Mesa> listViewLivres;


    private ObservableList<Mesa> listMesasOcupadas;


    private ObservableList<Mesa> obsMesasLivre;
    private ObservableList<Mesa> obsMesasOcupadas;
    private ObservableList<Mesa> obsMesasReservada;



    private FachadaMesas mesas = new FachadaMesas();



    @FXML
    private Button botaoDesocuparMesa;

    @FXML
    private Button botaoAbrirMesa;

    @FXML
    private Button botaoReservarMesa;

    @FXML
    private ComboBox<?> comboBoxPedidos;


    private static ArrayList<ObsMudaTela> ouvintes = new ArrayList<ObsMudaTela>();



    public static interface ObsMudaTela {
        void mudaTela(Object objetoQualquer);
    }

    public static void addMudaTela(ObsMudaTela novoOuvinte) {
        ouvintes.add(novoOuvinte);
    }

    public static void notificaOuvintes(Object dado) {
        for (ObsMudaTela o : ouvintes) {
            o.mudaTela(dado);
        }
    }






    @FXML
    public void initialize() {
        carregandoMesas();
        listViewLivres.setItems(obsMesasLivre);
        carregandoMesas();

    }

    public void carregandoMesas() {
        Mesa[] mesas = { new Mesa(1), new Mesa(2),
                new Mesa(3),
                new Mesa(4),
                new Mesa(5)
        };

        obsMesasLivre = FXCollections.observableArrayList(mesas);
        obsMesasOcupadas = FXCollections.observableArrayList(new ArrayList<>());
        obsMesasReservada = FXCollections.observableArrayList(new ArrayList<>());

//        System.out.println("TESTES -> "+mesa1.getComanda().pedidos[0].garcom.getNome());



    }
    @FXML
    void imprime(ActionEvent event) {

      // System.out.println("teste");
     // Mesa objMesa = listViewLivres.getSelectionModel().getSelectedItem();
    // listViewLivres.getSelectionModel().clearSelection();

     // mesas.remove(objMesa);

       //System.out.println(mesasOcupadas.isEmpty());
        // mesasOcupadas.add(objMesa);


      // obsMesas = FXCollections.observableArrayList(mesas);
      //obsMesasOcupadas = FXCollections.observableArrayList(mesas);
      //        listViewLivres.setItems(obsMesas);
      // listViewOcupadas.setItems(obsMesasOcupadas);


    }

    @FXML
    public void abrirMesa(ActionEvent event) throws IOException {
//        Stage stage1 = (Stage) botaoAbrirMesa.getScene().getWindow();
//        stage1.close();


        FXMLLoader load = new FXMLLoader(this.getClass().getResource("view/Comanda.fxml"));
        Parent root = load.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        System.out.println(listViewLivres.getSelectionModel().getSelectedItem());

        notificaOuvintes(listViewLivres.getSelectionModel().getSelectedItem());
        stage.show();
    }


}
