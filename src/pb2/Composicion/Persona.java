package pb2.Composicion;

public class Persona {

	private Integer dni;
	private String nombre;
	

	public Persona(Integer dni, String nombre) {
		
		this.dni=dni;
		this.nombre=nombre;
	}


	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}


	public Integer getDni() {
		// TODO Auto-generated method stub
		return this.dni;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
	

}
