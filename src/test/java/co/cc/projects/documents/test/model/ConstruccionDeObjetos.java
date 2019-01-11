package co.cc.projects.documents.test.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.cc.projects.documents.persistence.model.DocumentoIdentidad;
import co.cc.projects.documents.persistence.model.Usuario;
import static co.cc.projects.documents.persistence.model.Usuario.*;

public class ConstruccionDeObjetos {

	@Test
	public void crearUsuarioConMuchosParametros() {
		String numeroDocumento = "1234567";
		String tipoDocumento = "CC";
		String nombres = "ALEBERTO";
		String apellidos = "GARCIA";
		String email = "some-email@email.com";
		boolean estaActivo = false;
		
		Usuario usuario = new UsuarioBuilder(new DocumentoIdentidad(numeroDocumento, tipoDocumento), nombres, apellidos)
											.activo(estaActivo)
											.email(email)
											.build();
		assertEquals(usuario.getDocumentoIdentidad().getTipoIdentificacion(), tipoDocumento);
		assertEquals(usuario.getEmail(), email);
		assertEquals(usuario.isActivo(), estaActivo);
	}
	
}
