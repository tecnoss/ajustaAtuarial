package processamento;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import consulta.GuiaMedica;
import consulta.GuiaMedicaCons;
import layout.Atuarial_Layout;
import layout.Importar_MDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EscreveArquivo {

	private Connection conexao;
	private Statement statement;
	
	public EscreveArquivo(Connection conexao, Statement statement) {
		
		this.conexao = conexao;
		this.statement = statement;
	}
	
	public void geraArquivos(ArrayList listadeArquivos)  {
		
		//String PESPMATR_08  = "??????**";
		//String PESPMATO_65  = "??????**";
		//String EXTRA_01		= "?????";
		
		Integer ilinha = 0;
		
		GuiaMedica gm =  new GuiaMedica();
		Atuarial_Layout arqAtuarial = new Atuarial_Layout(conexao, statement, gm);
		Importar_MDB imp = new Importar_MDB(conexao, statement, gm);
		
		for (int i = 0; i < listadeArquivos.size(); i++) {
		
			
			try {
				
				String lnhOutput = "";
				String nomeArquivoSai = listadeArquivos.get(i).toString().replace("ENTRADA", "SAIDA");
				System.out.println(i + " - " + nomeArquivoSai);
				
				//FileWriter fw  = new FileWriter(nomeArquivoSai);
				//BufferedWriter bw = new BufferedWriter(fw,"ISO-8859-1");
				
				OutputStreamWriter bw = new OutputStreamWriter(new FileOutputStream(nomeArquivoSai),"ISO-8859-1");
				
				//FileReader fr  = new FileReader(listadeArquivos.get(i).toString());
				//BufferedReader br = new BufferedReader(fr);
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(listadeArquivos.get(i).toString()), "ISO-8859-1"));

				while(br.ready()){ 
					String linha = br.readLine();					

					/*
					gm.setPespmatr_08(linha.substring(22, 28));
					gm.setPespmato_65(linha.substring(375, 381));
					gm.setExtra_01("");
					
					GuiaMedicaCons consGuia = new GuiaMedicaCons(conexao, statement);
					consGuia.getDadosMatriculasCortadas(linha.substring(466, 474), gm);
					
					lnhOutput = linha.substring(  0,  22)  +  
							 	gm.getPespmatr_08()		+
							 	linha.substring( 28,  375) + 
							 	gm.getPespmato_65()		+
							 	linha.substring(381, 844)  +
							 	gm.getExtra_01();
					*/
					
					//lnhOutput = arqAtuarial.linha_atuarial_estatistico(linha);
					lnhOutput = imp.linha_importar_atuarial_mdb(linha);
					
					bw.write(lnhOutput +
							 "\n");
					
					bw.flush();	
					
					
					//System.out.println(String.valueOf(++ilinha)); 
				} 
				br.close();
				bw.close(); 				
				
			} catch (IOException e) {
			    e.printStackTrace();
			}			
		}	
		
	
	}
}
