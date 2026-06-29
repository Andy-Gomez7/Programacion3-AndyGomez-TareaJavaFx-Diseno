import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage PrimerStage) throws Exception {
        GridPane root = new GridPane();
        VBox vb = new VBox();
        StackPane stPane = new StackPane();
        Circle circulo = new Circle(40);
        circulo.setFill(Color.GRAY);

        Scene escena = new Scene(root, 900, 600);
        Font fuente = new Font(15);

        PrimerStage.setTitle("Perfil de estudiante");

        Label titulo = new Label("Registrar Estudiante");
        titulo.setFont(new Font(30));

        Label nombre = new Label("Nombre");
        nombre.setFont(fuente);
        TextField textNombre = new TextField();
        textNombre.setMaxWidth(150);

        Label Matricula = new Label("Matricula");
        Matricula.setFont(fuente);
        TextField textMatricula = new TextField();
        textMatricula.setMaxWidth(150);

        Label Carrera = new Label("Carrera");
        Carrera.setFont(fuente);
        TextField textCarrera = new TextField();
        textCarrera.setMaxWidth(150);

        Label Correo = new Label("Correo");
        Correo.setFont(fuente);
        TextField textCorreo = new TextField();
        textCorreo.setMaxWidth(150);

        Label Telefono = new Label("Telefono");
        Telefono.setFont(fuente);
        TextField textTelefono = new TextField();
        textTelefono.setMaxWidth(150);

        Label Direccion = new Label("Direccion");
        Direccion.setFont(fuente);
        TextField textDireccion = new TextField();
        textDireccion.setMaxWidth(150);

        ListView<String> materias = new ListView<>();
        materias.getItems().addAll("Calculo integral", "Programacion 3", "Programacion Aplicada");

        Label Observacion = new Label("Observaciones");
        Direccion.setFont(fuente);
        TextArea textAObservacion = new TextArea();
        textAObservacion.setMaxWidth(150);

        ComboBox<String> Semestre = new ComboBox<>();
        Semestre.getItems().addAll("Semestre enero-abril", "Semestre mayo-agosto", "Semestre septiembre-diciembre");
        Semestre.setValue("Seleccione");
        Semestre.setMaxWidth(150);

        VBox.setMargin(vb, new Insets(5,5,5,5));

        root.setAlignment(Pos.CENTER);
        root.setBackground(new Background(new BackgroundFill(Color.AQUAMARINE, CornerRadii.EMPTY, new Insets(5,5,5,5))));

        vb.getChildren().addAll(nombre, textNombre, Carrera, textCarrera, Correo, textCorreo, Telefono, textTelefono, Direccion, textDireccion, Semestre, Observacion,textAObservacion);

        root.getChildren().add(titulo);
        root.add(vb, 0, 1);
        root.add(materias, 2,1);
        root.add(circulo,0,3);
        
        vb.setSpacing(8);
        vb.setPadding(new Insets(10));
        titulo.setAlignment(Pos.TOP_CENTER);
        root.setMargin(titulo, new Insets(0,0,20,130));
        vb.setMargin(Semestre, new Insets(10,0,0,0));

        PrimerStage.setScene(escena);
        PrimerStage.show();
    }
}
