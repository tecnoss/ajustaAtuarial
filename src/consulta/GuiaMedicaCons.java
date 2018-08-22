package consulta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.Conecta;

import java.sql.DriverManager;

public class GuiaMedicaCons {

	private Connection conexao;
	private Statement statement;
	
	public GuiaMedicaCons(Connection conexao, Statement statement) {
	
		this.conexao = conexao;
		this.statement = statement;
	}
	
	public void getDadosMatriculasCortadas(String ccnumguia, GuiaMedica gm) {
		
		try {
		
		    String query = 	"SELECT \r\n" + 
				    		"  GM.CCNUMGUIA,\r\n" + 
				    		"  LPAD(GM.CCMATBEN, 8, ' ') AS PESPMATR_08,\r\n" + 
				    		"  LPAD(NVL(BX.CCMATORIGEM, '0') ,8 ,' ') AS PESPMATO_65,\r\n" + 
				    		"  RPAD(NVL(SUBSTR(TRIM(DG.CCCODDENTEREGIAO),1,5), LPAD(' ', 5)),5) AS EXTRA_01\r\n" + 
				    		"FROM\r\n" + 
				    		"  GUIAMEDICA GM \r\n" + 
				    		"JOIN  \r\n" + 
				    		"  DETALHEGUIA DG ON (DG.CVCODLOTE =  GM.CVCODLOTE AND\r\n" + 
				    		"                     DG.CCNUMGUIA =  GM.CCNUMGUIA AND\r\n" + 
				    		"                     DG.CVCODTIPOGUIA =  GM.CVCODTIPOGUIA)\r\n" + 
				    		"JOIN\r\n" + 
				    		"  BENEFEXTRAS BX ON (BX.CVCODBEN = GM.CVCODBEN)\r\n" + 
				    		"\r\n" + 
				    		"WHERE \r\n" + 
				    		"  GM.CCNUMGUIA = '"+ ccnumguia +"'  \r\n";
		    
		    ResultSet resultSet = statement.executeQuery(query);
		    
		    
		    if (resultSet.next()) {
		    	
		    	while (resultSet.next()){

					if (!gm.getPespmatr_08().trim().equals("")) {
						
						gm.setPespmatr_08(resultSet.getString("PESPMATR_08"));
					}
					
					if (!gm.getPespmato_65().trim().equals("")) {
						
						gm.setPespmato_65(resultSet.getString("PESPMATO_65"));
					}

					gm.setExtra_01(resultSet.getString("EXTRA_01"));					
		    	}
		    }	  			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
				
	}
}
