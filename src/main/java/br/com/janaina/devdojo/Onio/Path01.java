package br.com.janaina.devdojo.Onio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path01 {
	
	//Path: interface
	//Paths: classe
	
	public static void main(String[] args) {
		
		//pegando um arquivo
		Path path = Paths.get("arquivo.txt");
		System.out.println(path.getFileName());
		
		//o path também monta caminhos pra gente
		Path path2 = Paths.get("C:", "Users", "Janaina", "arquivo.txt");
		path2.getFileName();
	}

}