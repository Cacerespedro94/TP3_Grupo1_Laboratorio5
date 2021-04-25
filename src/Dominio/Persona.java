package Dominio;

import java.text.Collator;
import java.util.Locale;

public class Persona{
	
	private String Nombre;
	private String Apellido;
	private int DNI;
	
	public Persona() {
		Nombre = "Sin Nombre";
		Apellido = "Sin Apellido";
		DNI = 11111111;
	}
	
	public Persona(String Nombre, String Apellido, int DNI)
	{
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.DNI = DNI;
	}	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}

	@Override
	public String toString() {
		return "La Persona se llama " + Nombre + ", Apellido=" + Apellido + ", con DNI=" + DNI;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Apellido == null) ? 0 : Apellido.hashCode());
		result = prime * result + DNI;
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
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
		if (Apellido == null) {
			if (other.Apellido != null)
				return false;
		} else if (!Apellido.equals(other.Apellido))
			return false;
		if (DNI != other.DNI)
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		return true;
	}



	
}