package pb2.Composicion;
import static org.junit.Assert.*;

import org.junit.Test;
public class UsuarioTest {

	@Test
	public void queSePuedaCrearUnUsuario() {
	
		Usuario usuario=new Usuario ("Andres","An123456");
		assertNotNull(usuario);
		
	}
	@Test
	public void queVerifiqueQueLaLongitudContraseniaSeaMayorOIgualaOcho() {
	
		Usuario usuario=new Usuario ("Andres","An123456");
		Boolean verificacionOk=usuario.verificarLongitudMayorOigualAOcho();
		assertTrue(verificacionOk);
		
	}
	@Test
	public void queVerifiqueQueUnaContraseñaContengaAlMenosUnaMayuscula() {

		Usuario usuario=new Usuario ("Andres","An123456");
		Boolean verificacionOk=usuario.verificarContraseniaContengaAlmenosUnaMayuscula();
		assertTrue(verificacionOk);
		
	}
	
	@Test
	public void queVerifiqueQueUnaContraseñaContengaUnaMinuscula() {
	
		Usuario usuario=new Usuario ("Andres","An123456");
		Boolean verificacionOk=usuario.verificarContraseniaContengaAlmenosUnaMinuscula();
		assertTrue(verificacionOk);
	}
	
	@Test
	public void queVerifiqueQueSeaFuerte() {
	

		Usuario usuario=new Usuario ("Andres","An123456");
		Boolean verificacionOk=usuario.verificarContraseniaEsFuerte();
		assertTrue(verificacionOk);
	}
	
	
	@Test
	public void queSeAsigneUnaPersonaAunUsuario() {
		Usuario usuario=new Usuario ("JuanElGrande","An123456");
		Persona persona=new Persona(22, "Juan");
		
		Persona personaEsperada=new Persona(22, "luis");
		usuario.asignarPersona(persona);
		System.out.println(usuario.getPersona().getNombre());
		
//		assertEquals(usuario.getPersona().getNombre(),personaEsperada.getNombre());
//		assertEquals(usuario.getPersona().getDni(),personaEsperada.getDni());
		assertEquals(usuario.getPersona(), personaEsperada);
	}
	@Test
	public void x() {
		Usuario usuario=new Usuario ("JuanElGrande","An123456",22, "Juan");
	}
	
	
	
}
