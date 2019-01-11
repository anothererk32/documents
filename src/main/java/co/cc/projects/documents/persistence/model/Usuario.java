package co.cc.projects.documents.persistence.model;

import java.util.Date;

/**
 * Usuarios del sistema.
 * @author Cristian
 *
 */
public class Usuario {

	private DocumentoIdentidad documentoIdentidad;
	private String nombres;
	private String apellidos;
	private String email;
	private boolean activo;
	private Date fechaExpiracion;
	
	// Constructores
	
	public Usuario() {
		this.activo = Boolean.TRUE;
	}
	
	public Usuario(DocumentoIdentidad documentoIdentidad, String nombres, String apellidos) {
		this.documentoIdentidad = documentoIdentidad;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.activo = true;
	}
	
	public Usuario(UsuarioBuilder builder) {
		this.documentoIdentidad = builder.documentoIdentidad;
		this.nombres = builder.nombres;
		this.apellidos = builder.apellidos;
		this.email = builder.email;
		this.activo = builder.activo;
		this.fechaExpiracion = builder.fechaExpiracion;
	}
	
	// Getters y setters

	public DocumentoIdentidad getDocumentoIdentidad() {
		return documentoIdentidad;
	}

	public void setDocumentoIdentidad(DocumentoIdentidad documentoIdentidad) {
		this.documentoIdentidad = documentoIdentidad;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public static class UsuarioBuilder {
		private DocumentoIdentidad documentoIdentidad;
		private String nombres;
		private String apellidos;
		private String email;
		private boolean activo;
		private Date fechaExpiracion;
		
		public UsuarioBuilder(DocumentoIdentidad documentoIdentidad, String nombres, String apellidos) {
			this.documentoIdentidad = documentoIdentidad;
			this.nombres = nombres;
			this.apellidos = apellidos;
			this.activo = Boolean.TRUE;
		}

		public UsuarioBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		public UsuarioBuilder activo(boolean activo) {
			this.activo = activo;
			return this;
		}
		
		public UsuarioBuilder fechaExpiracion(Date fechaExpiracion) {
			this.fechaExpiracion = fechaExpiracion;
			return this;
		}
		
		public Usuario build() {
			return new Usuario(this);
		}
		
	}
	
}
