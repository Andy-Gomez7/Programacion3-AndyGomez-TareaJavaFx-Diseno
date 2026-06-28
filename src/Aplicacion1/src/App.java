import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage PrimerStage) throws Exception {
        VBox root = new VBox();
        HBox RadButn = new HBox();
        HBox Btn = new HBox();

        Scene escena = new Scene(root, 500, 600);
        Font fuente = new Font(15);

        PrimerStage.setTitle("Registro de visitantes");

        Label titulo = new Label("Registrar");
        titulo.setFont(new Font(30));

        Label nombre = new Label("Nombre");
        nombre.setFont(fuente);
        TextField textNombre = new TextField();
        textNombre.setMaxWidth(150);

        Label cedula = new Label("Cedula");
        cedula.setFont(fuente);
        TextField textCedula = new TextField();
        textCedula.setMaxWidth(150);

        Label Telefono = new Label("Telefono");
        Telefono.setFont(fuente);
        TextField textTelefono = new TextField();
        textTelefono.setMaxWidth(150);

        Label MotvVist = new Label("Motivo de visita");
        MotvVist.setFont(fuente);
        TextField textMotvVist = new TextField();
        textMotvVist.setMaxWidth(150);

        Label PersVist = new Label("Persona a visitar");
        PersVist.setFont(fuente);
        TextField textPersVist = new TextField();
        textPersVist.setMaxWidth(150);

        Label fecha = new Label("Fecha");
        fecha.setFont(fuente);
        TextField textFecha = new TextField();
        textFecha.setMaxWidth(150);

        ComboBox<String> TipoVisisante = new ComboBox<>();
        TipoVisisante.getItems().addAll("Estudiante", "Padre/Madre", "Suplidor", "Invitado");
        TipoVisisante.setValue("Seleccione");
        TipoVisisante.setCursor(Cursor.HAND);

        ToggleGroup documento = new ToggleGroup();

        RadioButton RadBtnEstd = new RadioButton("Estudiante");
        RadBtnEstd.setToggleGroup(documento);
        RadBtnEstd.setCursor(Cursor.HAND);

        RadioButton RadBtnPasaprt = new RadioButton("Pasaporte");
        RadBtnPasaprt.setToggleGroup(documento);
        RadBtnPasaprt.setCursor(Cursor.HAND);

        RadioButton RadBtnCarnet = new RadioButton("Carnet");
        RadBtnCarnet.setToggleGroup(documento);
        RadBtnCarnet.setCursor(Cursor.HAND);

        Button btnRegistrar = new Button("Registrar");
        btnRegistrar.setCursor(Cursor.HAND);

        Button btnLimpiar = new Button("Limpiar");
        btnLimpiar.setCursor(Cursor.HAND);

        Button btnCancelar = new Button("Cancelar");
        btnCancelar.setCursor(Cursor.HAND);

        VBox.setMargin(nombre, new Insets(10,0,0,0));
        VBox.setMargin(cedula, new Insets(10,0,0,0));
        VBox.setMargin(Telefono, new Insets(10,0,0,0));
        VBox.setMargin(MotvVist, new Insets(10,0,0,0));
        VBox.setMargin(PersVist, new Insets(10,0,0,0));
        VBox.setMargin(fecha, new Insets(10,0,0,0));
        VBox.setMargin(TipoVisisante, new Insets(10,0,0,0));
        VBox.setMargin(RadButn, new Insets(20,0,0,0));
        VBox.setMargin(Btn, new Insets(60,15,0,0));

        HBox.setMargin(RadBtnEstd, new Insets(0,15,0,15));

        HBox.setMargin(btnCancelar, new Insets(0,0,0,10));
        HBox.setMargin(btnLimpiar, new Insets(0,0,0,10));

        RadButn.getChildren().addAll(RadBtnCarnet, RadBtnEstd, RadBtnPasaprt);
        RadButn.setAlignment(Pos.BOTTOM_CENTER);

        Btn.getChildren().addAll(btnRegistrar, btnLimpiar, btnCancelar);
        Btn.setAlignment(Pos.BOTTOM_RIGHT);

        VBox.setMargin(root, new Insets(5,5,5,5));

        root.setAlignment(Pos.CENTER);
        root.setBackground(new Background(new BackgroundFill(Color.SKYBLUE, CornerRadii.EMPTY, new Insets(5,5,5,5))));

        root.getChildren().addAll(titulo, nombre, textNombre, cedula, textCedula, Telefono, textTelefono, MotvVist, textMotvVist, PersVist, textPersVist, fecha, textFecha, TipoVisisante, RadButn, Btn);

        PrimerStage.setScene(escena);
        PrimerStage.show();
    }
}
