package br.com.univille.poo.jdbc;

import java.sql.Connection;

/**
 * 
 * @author leandersonandre
 *
 */
public abstract class BasicoDAO {
	
	
	public Connection getConnection() {
		return FabricaDeConexoes.getInstance().getConnection();
	}

}
