package Vista;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class VentanaPrincipalController implements Initializable {

    private  Main ProgramaPrincipal;
    private VentanaDosController ventana2;
    @FXML
    private Button nuevo;
    private boolean blNuevo;
    @FXML
    private Button editar;
    private boolean blEditar;
    @FXML
    private Button borrar;
    private boolean blBorrar;
	@FXML
	private ListView<String> nombres = new ListView<String>();
	@FXML
	private ListView<String> apellidos = new ListView<String>();
	@FXML
	private ListView<String> telefonos = new ListView<String>();
	


    public void setProgramaPrincipal(Main ProgramaPrincipal) {
        this.ProgramaPrincipal = ProgramaPrincipal;
    }
    public ListView<String> getNombres() {
		return nombres;
	}

	public void setNombres(ListView<String> nombres) {
		this.nombres = nombres;
	}

	public ListView<String> getApellidos() {
		return apellidos;
	}

	public void setApellidos(ListView<String> apellidos) {
		this.apellidos = apellidos;
	}

	public ListView<String> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ListView<String> telefonos) {
		this.telefonos = telefonos;
	}

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /* Cuando se pulsa el botón tendrá que abrir ventana nueva
     * para eso llama al método del main */
    @FXML
   private void nuevaVentana() {
       	this.ProgramaPrincipal.mostrarVentanaSecundaria();
       	blNuevo = true;
    }
    
    	
    @FXML
    public void editar() {
    	this.ProgramaPrincipal.mostrarVentanaSecundaria();
    	blEditar = true;
    }
    public boolean isBlNuevo() {
		return blNuevo;
	}
	public void setBlNuevo(boolean blNuevo) {
		this.blNuevo = blNuevo;
	}
	public boolean isBlEditar() {
		return blEditar;
	}
	public void setBlEditar(boolean blEditar) {
		this.blEditar = blEditar;
	}
	public boolean isBlBorrar() {
		return blBorrar;
	}
	public void setBlBorrar(boolean blBorrar) {
		this.blBorrar = blBorrar;
	}
	@FXML
    public void borrar() {
    	this.ProgramaPrincipal.mostrarVentanaSecundaria();
    	blBorrar = true;
    }
    

	
    
}