package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.Conecta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try {

			Controller ctrl = new Controller();
			ctrl.processamento();
			

		}finally {
			
			System.out.println("FINALIZADO");
		}
	}

}
