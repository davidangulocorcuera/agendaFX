package Vista;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VentanaDosController {

	@FXML
	private Button buttonclose;
	 @FXML
	private TextField nombre;
	 @FXML
	private TextField apellido;
	 @FXML
	private TextField telefono;
	private Stage ventana;
	private ObservableList<String> dataNombres = FXCollections.observableArrayList();
	private ObservableList<String> dataApellidos = FXCollections.observableArrayList();
	private ObservableList<String> dataTelefonos = FXCollections.observableArrayList();
	private VentanaPrincipalController ventana1;

	public VentanaDosController(Button buttonclose, TextField nombre, TextField apellido, TextField telefono,
			Stage ventana, ObservableList<String> dataNombres, ObservableList<String> dataApellidos,
			ObservableList<String> dataTelefonos) {
		super();
		this.buttonclose = buttonclose;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.ventana = ventana;
		this.dataNombres = dataNombres;
		this.dataApellidos = dataApellidos;
		this.dataTelefonos = dataTelefonos;
	}

	public ObservableList<String> getDataNombres() {
		return dataNombres;
	}

	public void setDataNombres(ObservableList<String> dataNombres) {
		this.dataNombres = dataNombres;
	}

	public ObservableList<String> getDataApellidos() {
		return dataApellidos;
	}

	public void setDataApellidos(ObservableList<String> dataApellidos) {
		this.dataApellidos = dataApellidos;
	}

	public ObservableList<String> getDataTelefonos() {
		return dataTelefonos;
	}

	public void setDataTelefonos(ObservableList<String> dataTelefonos) {
		this.dataTelefonos = dataTelefonos;
	}

	public void setStagePrincipal(Stage ventana) {
		// TODO Auto-generated method stub
		this.ventana = ventana;
	}

	public void closeWindow() {
		if (ventana1.isBlNuevo()) {
			if (nombre != null) {
				dataNombres.add(nombre.getText());
				ventana1.getNombres().setItems(dataNombres);
			}
			if (apellido != null) {
				dataTelefonos.add(telefono.getText());
				ventana1.getTelefonos().setItems(dataTelefonos);
			}
			if (telefono != null) {
				dataApellidos.add(apellido.getText());
				ventana1.getApellidos().setItems(dataApellidos);
			}
			ventana1.setBlNuevo(false);
		}
	
		

		this.ventana.close();
	}

	public void cancelar() {
		this.ventana.close();
	}

}
