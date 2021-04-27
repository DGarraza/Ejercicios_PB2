package ar.edu.tarea;

public class Cerradura {

	private Boolean estadoCerrado;
	private Integer codigo;

	public Cerradura(Integer codigo) {
		this.codigo = codigo;
		this.estadoCerrado = Boolean.TRUE;
	}


	public void cerrarCerradura(Integer codigo) {
		if (this.codigo == codigo) {
			estadoCerrado = Boolean.TRUE;
		}
	}



}
