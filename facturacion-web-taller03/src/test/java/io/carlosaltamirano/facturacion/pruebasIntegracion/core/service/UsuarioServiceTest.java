package io.carlosaltamirano.facturacion.pruebasIntegracion.core.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.carlosaltamirano.facturacion.core.model.Usuario;
import io.carlosaltamirano.facturacion.core.service.UsuarioService;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UsuarioServiceTest {

	@Autowired
	UsuarioService usuarioService;
	
	private Usuario usuario;
	
	@Before
	public void setUp() {
		usuario = new Usuario("zapata", "juan", "juan.zapata@miempresa.com");
	}
	
	@After
	public void destroy() {
		
		try {
			
			usuarioService.eliminar(usuario);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void a_creacionEmpresaConDatosValidos() {
		
		//TODO: Implementar el caso de prueba para que no salga fallido
		Assert.fail();
		
	}
	
	
	
}
