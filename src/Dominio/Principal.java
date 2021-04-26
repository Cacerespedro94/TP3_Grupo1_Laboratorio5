package Dominio;

import java.util.TreeSet;

public class Principal {

	@SuppressWarnings("null")
	public static void main(String[] args) {
	
		Archivo archivo= new Archivo();
		Archivo nuevoArchivo = new Archivo();
		TreeSet<Persona>lista=new TreeSet<Persona>();
		archivo.setRUTA("PersonasEmpresa.txt");
		lista=archivo.Leer();
		nuevoArchivo.setRUTA("Resultados.txt");
		nuevoArchivo.CrearArchivo();
		nuevoArchivo.Escribir(lista);
	}
}
