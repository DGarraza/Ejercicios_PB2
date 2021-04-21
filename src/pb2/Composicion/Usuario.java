package pb2.Composicion;

public class Usuario {

	private String id;
	private String password;
	private Persona persona;
	

	public Usuario(String id, String password) {

		this.id = id;
		this.password = password;
	}

	public Usuario(String id, String password, Integer dni, String nombre) {

		this.id = id;
		this.password = password;
		this.persona=new Persona(dni,nombre);
	}

	public Boolean verificarLongitudMayorOigualAOcho() {

		return this.password.length() >= 8;
	}

	public Boolean verificarContraseniaContengaAlmenosUnaMayuscula() {

		for (int i = 0; i < this.password.length(); i++) {
			if (Character.isUpperCase(this.password.charAt(i)))
				return true;

		}
		return false;

	}

	public Boolean verificarContraseniaContengaAlmenosUnaMinuscula() {

		for (int i = 0; i < this.password.length(); i++) {
			if (Character.isLowerCase(this.password.charAt(i)))
				return true;

		}
		return false;
	}

	public Boolean verificarContraseniaEsFuerte() {

		return this.verificarLongitudMayorOigualAOcho() 
				&& this.verificarContraseniaContengaAlmenosUnaMayuscula()
				&& this.verificarContraseniaContengaAlmenosUnaMinuscula();
	}

	public void asignarPersona(Persona persona) {
		this.persona=persona;
		
	}

	public Persona getPersona() {
		
		return this.persona;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}

