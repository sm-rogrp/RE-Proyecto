import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import registradorcitas.AbogadoJefe;
import registradorcitas.Administrador;
import registradorcitas.Recepcionista;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/gui/view/View1.fxml"));
        primaryStage.setTitle("Organizador de Citas - LegalFirm");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception{

//        Administrador.addAbogadoJefe(new AbogadoJefe("Roger", 123, 665, "Abogado Jefe", "llik"));
//        Administrador.addRecepcionista(new Recepcionista("Say", 123, 149, "Recepcionista", "pwd"));

        launch(args);
    }
}
