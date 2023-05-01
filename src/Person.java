
public class Person implements Comparable<Person>{
	private String nombre;
	private String apellido;
	private int edad;
	public Person(String nombre, String apellido , int edad) {
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
    //Setter & Getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String toString() {
		return " [" + nombre + " ]" +" ["+ apellido + "]" +" [" + edad +"]";
	}
	public int compareTo(Person a) {
		int estado = -1;
		if (this.edad == a.getEdad())
			estado = 0;
		else if (this.edad >a.getEdad()){
			estado = 1;
		}
		return estado;
	}
}

