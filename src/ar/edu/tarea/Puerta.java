package ar.edu.tarea;

public class Puerta {

	private Cerradura cerradura1;
	private Cerradura cerradura2;
	private Cerradura cerradura3;
	private Boolean estadoPuerta;

	public Puerta(Integer codigo1, Integer codigo2, Integer codigo3) {
		Cerradura cerradura1 = new Cerradura(codigo1);
		Cerradura cerradura2 = new Cerradura(codigo2);
		Cerradura cerradura3 = new Cerradura(codigo3);
	}

	
}
