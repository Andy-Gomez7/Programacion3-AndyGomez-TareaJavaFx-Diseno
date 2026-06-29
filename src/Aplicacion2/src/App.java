import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
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
        BorderPane root = new BorderPane(); 
        VBox vb = new VBox();
        HBox Btn = new HBox();

        Scene escena = new Scene(root, 900, 600);
        Font fuente = new Font(15);

        PrimerStage.setTitle("Sistema de inventario");

        Label titulo = new Label("Registrar producto");
        titulo.setFont(new Font(30));

        Label CodProd = new Label("Codigo del producto");
        CodProd.setFont(fuente);
        TextField textCodProd = new TextField();
        textCodProd.setMaxWidth(150);

        Label nombre = new Label("Nombre del producot");
        nombre.setFont(fuente);
        TextField textNombre = new TextField();
        textNombre.setMaxWidth(150);

        Label Categoria = new Label("Categoria");
        Categoria.setFont(fuente);
        TextField textCategoria = new TextField();
        textCategoria.setMaxWidth(150);

        Label Precio = new Label("Precio");
        Precio.setFont(fuente);
        TextField textPrecio = new TextField();
        textPrecio.setMaxWidth(150);

        Label Cantidad = new Label("Cantidad");
        Cantidad.setFont(fuente);
        TextField textCantidad = new TextField();
        textCantidad.setMaxWidth(150);

        Label Proveedor = new Label("Proveedor");
        Proveedor.setFont(fuente);
        TextField textProveedor = new TextField();
        textProveedor.setMaxWidth(150);

        ComboBox<String> Estado = new ComboBox<>();
        Estado.getItems().addAll("Disponible", "Agotado", "Bajo inventario");
        Estado.setValue("Seleccione");

        Button btnGuardar = new Button("Guardar");
        Button btnBuscar = new Button("Buscar");
        Button btnEliminar = new Button("ELiminar");
        Button btnEditar = new Button("Editar");

        CheckBox CkPrdPerecedero = new CheckBox("Producto perecedero");
        CheckBox CkReqRefrg = new CheckBox("Requiere refrigeración");
        CheckBox CkProdImport = new CheckBox("Producto importado");

        TableView<String> tabla = new TableView<>();
        tabla.setPrefSize(400, 300);
        TableColumn<String, String> ColmnCodigo = new TableColumn<>("Codigo");
        TableColumn<String, String> ColmnProducto = new TableColumn<>("Producto");
        TableColumn<String, String> ColmnCategoria = new TableColumn<>("Categoria");
        TableColumn<String, String> ColmnPrecio = new TableColumn<>("Precio");
        TableColumn<String, String> ColmnCantidad = new TableColumn<>("Cantidad");
        TableColumn<String, String> ColmnEstado = new TableColumn<>("Estado");

        tabla.getColumns().addAll(ColmnCodigo, ColmnProducto, ColmnCategoria, ColmnPrecio, ColmnCantidad, ColmnEstado);

        vb.setSpacing(8);
        vb.setPadding(new Insets(10));
        
        Btn.setSpacing(10);
        
        BorderPane.setMargin(vb, new Insets(10,10,10,10));
        BorderPane.setMargin(tabla, new Insets(10,10,10,10));
        
        Btn.getChildren().addAll(btnBuscar, btnEditar, btnEliminar, btnGuardar);

        VBox.setMargin(root, new Insets(5,5,5,5));
        
        root.setBackground(new Background(new BackgroundFill(Color.DARKCYAN, CornerRadii.EMPTY, new Insets(5,5,5,5))));

        vb.getChildren().addAll(titulo, CodProd, textCodProd, nombre, textNombre, Categoria, textCategoria, Precio, textPrecio, Cantidad, textCantidad, Proveedor, textProveedor, Estado, CkPrdPerecedero, CkReqRefrg, CkProdImport, Btn);

        root.setLeft(vb);
        root.setRight(tabla);

        PrimerStage.setScene(escena);
        PrimerStage.show();
    }
}