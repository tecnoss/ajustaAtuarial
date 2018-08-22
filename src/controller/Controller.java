package controller;

import java.awt.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dao.Conecta;
import processamento.ListaArquivos;
import processamento.CompactaArquivos;
import processamento.EscreveArquivo;



public class Controller {

	private static ArrayList base;
	
	public static int processamento() {	
			
		try {
			
			Connection conexao = Conecta.ObterConexao();			
			Statement statement = conexao.createStatement();
			
			System.out.println("Listando arquivos...");
			System.out.println("****************************");
			ListaArquivos listagem = new ListaArquivos();
			base = listagem.localizaArquivo("C:\\AAA\\PROCE-1757\\ENTRADA\\","*");
			System.out.println("****************************");
			
			System.out.println("Gerando arquivos...");
			System.out.println("****************************");
			EscreveArquivo geracao = new EscreveArquivo(conexao, statement);
			geracao.geraArquivos(base);
			System.out.println("****************************");
			
		
		}
		catch (Exception e) {

			e.printStackTrace();
		}
		return 0;

	}
	
	

}
