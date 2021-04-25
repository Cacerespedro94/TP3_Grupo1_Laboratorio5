package Dominio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Archivo {

	private String RUTA;
	
	public boolean Existe() {
		
		File archivo= new File(RUTA);
		if(archivo.exists())
			return true;
		return false;
	}
	
	public boolean CrearArchivo() {
		FileWriter escritura;
		try {
			escritura= new FileWriter(RUTA,true);
			escritura.write("");
			escritura.close();
			return true;
		}
		
		catch(IOException e){
			
			e.printStackTrace();
			
		}
		return false;
	}

	public String getRUTA() {
		return RUTA;
	}

	public void setRUTA(String rUTA) {
		RUTA = rUTA;
	}

}
