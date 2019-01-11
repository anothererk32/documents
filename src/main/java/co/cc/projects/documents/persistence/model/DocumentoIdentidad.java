package co.cc.projects.documents.persistence.model;

/**
 * Documento de identificacion de los usuarios
 * @author Cristian
 *
 */
public class DocumentoIdentidad {

	private String numeroIdentificacion;
	private String tipoIdentificacion;
	
	// Constructores
	
	public DocumentoIdentidad() {
		super();
	}
	
	public DocumentoIdentidad(String numeroIdentificacion, String tipoIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
		this.tipoIdentificacion = tipoIdentificacion;
	}
	
	// Getters y setters

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	
}
