package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.CitaOrdinaria;
import model.ListaPersistente;

public class CtrlRegisCitaOrd {
    public TextField tfNombreCl;
    public TextField tfDNICl;
    public TextField tfCelCl;
    public TextField tfAbogAsis;
    public Button btnRegistrar;
    public Button btnCancelar;
    public DatePicker dpFecha;

    public void clickBtnCancelar(ActionEvent actionEvent) {
        CtrlInterfUser.stageRegisCita.close();
    }

    public void clickBtnRegistrar(ActionEvent actionEvent) throws Exception {
        ListaPersistente<CitaOrdinaria> listaCitaOrdinaria = new ListaPersistente<>(ListaPersistente.CIT_ORD);
        listaCitaOrdinaria.add(new CitaOrdinaria(tfNombreCl.getText(), Integer.parseInt(tfDNICl.getText()), tfCelCl.getText(), java.sql.Date.valueOf(dpFecha.getValue()), tfAbogAsis.getText()));
    }
}
