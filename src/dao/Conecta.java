package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conecta {

	/*public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conexao = ObterConexao();
		
        Statement statement = conexao.createStatement();
        String query = "SELECT sysdate FROM dual";
        ResultSet resultSet = statement.executeQuery(query);
        if (resultSet.next()) {
                 System.out.println(resultSet.getDate("sysdate"));
        }		
	}*/

	public static Connection ObterConexao() {
		// TODO Auto-generated method stub
        Connection conexao = null;
        String sDb   = "";
        String sConn = "";
        String sUser = "";
        String sPwd  = "";
        
        try {
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                 
                 //D1
                 //sDb   = "D1";sConn = "jdbc:oracle:thin:@172.17.5.10:1521:GRIDDBD1";sUser = "vale";sPwd  = "vale_d1";
                 sDb   = "D1";sConn = "jdbc:oracle:thin:@172.17.4.22:14260:GRIDDBDM";sUser = "vale";sPwd  = "vale_d1";
                 
                 //DEV
                 //sDb   = "DEV";sConn = "jdbc:oracle:thin:@10.30.104.11:14260:GRIDDB";sUser = "vale";sPwd  = "vale_dev";
                 
                 //HML
                 //sDb   = "HML";sConn = "jdbc:oracle:thin:@10.30.103.11:14260:GRIDDB";sUser = "vale";sPwd  = "vale_hml";
                 
                 

                 conexao = DriverManager.getConnection(sConn,sUser,sPwd);

                 System.out.println("Conectado com sucesso em " + sDb);
                 
                 return conexao;
                 
        } catch (ClassNotFoundException e) {
                 e.printStackTrace();
                 
                 return null;
        } catch (SQLException e) {
                 e.printStackTrace();
                 
                 return null;
        }
        



	}

	
    



}
