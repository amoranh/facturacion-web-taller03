package io.carlosaltamirano.facturacion.pruebasIntegracion.core.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.carlosaltamirano.facturacion.core.exception.FacturacionWebException;
import io.carlosaltamirano.facturacion.core.model.Usuario;

import io.carlosaltamirano.facturacion.core.service.UsuarioService;
import io.carlosaltamirano.facturacion.test.categoria.PruebaIntegracion;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Category(PruebaIntegracion.class)

public class UsuarioServiceTest {

	@Autowired
	UsuarioService usuarioService;
	
	private Usuario usuario;
	
	@Before
	public void setUp() {
		usuario = new Usuario("zapata", "juan", "juan.zapata@miempresa.com");
		usuario.setApellidos("Zapata");
		usuario.setNombres("juan");
		usuario.setEmail("juan.zapata@miempresa.com");
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
		
	try {
				
		usuario = usuarioService.crear(usuario);
				
				Assert.assertNotNull(usuario.getId());
				
				Assert.assertTrue(usuario.getId() > 0);
				
			} catch (FacturacionWebException e) {
				e.printStackTrace();
				Assert.fail();
			}
			
		}
	
	
	
}
