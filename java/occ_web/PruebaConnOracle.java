package occ_web;

import java.sql.SQLException;
import cl_occ.Oracle_conn;

public class PruebaConnOracle extends Oracle_conn {
		
		public PruebaConnOracle() {
			super();
		}
		
		public void getConexion() throws SQLException {
			// Establece la conexion con la base de datos. 
			this.conectar("srvbkwfnew", "1521", "WF", "usuario", "contraseña");
		}
}