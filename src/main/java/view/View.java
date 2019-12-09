package view;

import java.io.IOException;

import controller.ReadFiles;

public class View {

	public static void main(String[] args) throws IOException {
		
		ReadFiles rf = new ReadFiles();
		
		//ReadFiles rf =  new ReadFiles();
		
		//Arquivo no ambiente linux
		
		/* 
		String homePlayer = "/home/alanoliveira/Ã�rea de Trabalho/analyse/basketball/home";
		String awayPlayer = "/home/alanoliveira/Ã�rea de Trabalho/analyse/basketball/away";
		*/
		String homePlayer = "C:\\Users\\alan_\\OneDrive\\Área de Trabalho\\basquete\\home.txt" ;
		String awayPlayer = "C:\\Users\\alan_\\OneDrive\\Área de Trabalho\\basquete\\away.txt" ;
		//String filePlanilha = "C:\\Users\\alan_\\OneDrive\\Área de Trabalho\\basquete\\planilha_base_analise.xls";
		rf.readPlayers(homePlayer,awayPlayer);
		//rf.savePlanilha(filePlanilha);
		
	}

}