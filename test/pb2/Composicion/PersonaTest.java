package pb2.Composicion;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PersonaTest {
	
	
	@Test
	public void queSePuedaCrearUnaPersona() {
		Integer dni=222222;
		String nombre="ruben";
		
		Persona persona = new Persona (dni,nombre);
		assertNotNull(persona);
	}
	

}
