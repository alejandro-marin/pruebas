package occ_web;

import java.sql.SQLException;


public class Pruebas_java {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		PruebaConnOracle conecta = new PruebaConnOracle();
		conecta.getConexion();
		conecta.banner(); 
	}

}
