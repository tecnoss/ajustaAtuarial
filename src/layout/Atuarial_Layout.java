package layout;

import java.sql.Connection;
import java.sql.Statement;

import consulta.GuiaMedica;
import consulta.GuiaMedicaCons;

public class Atuarial_Layout {

	private Connection conexao;
	private Statement statement;
	private GuiaMedica gm;
	
	public Atuarial_Layout(Connection conexao, Statement statement, GuiaMedica gm) {
		
		this.conexao = conexao;
		this.statement = statement;
		this.gm	= gm;
	}	
	
	
	public String linha_atuarial_estatistico(String lnh_input) {
		
		String lnhOutput = "";
		
		gm.setPespmatr_08(lnh_input.substring(22, 28));
		gm.setPespmato_65(lnh_input.substring(375, 381));
		gm.setExtra_01("");
		
		GuiaMedicaCons consGuia = new GuiaMedicaCons(conexao, statement);
		consGuia.getDadosMatriculasCortadas(lnh_input.substring(466, 474), gm);
		
		lnhOutput = lnh_input.substring(  0,  22)  +  
				 	gm.getPespmatr_08()		+
				 	lnh_input.substring( 28,  375) + 
				 	gm.getPespmato_65()		+
				 	lnh_input.substring(381, 844)  +
				 	gm.getExtra_01();		
		
		
		return lnhOutput;
	}
}
