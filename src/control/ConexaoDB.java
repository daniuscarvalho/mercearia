package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoDB{
	
	Connection conexao=null;
	Statement stmt=null;
	
	public ConexaoDB(){
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		this.criaConexao();
		this.criaStatement();
	}
	
	/*
	public void novaConexao(){
		this.getConexao();
	}
	*/
	
	private void criaConexao(){
		try {
			this.conexao = DriverManager.getConnection("jdbc:mysql://localhost/Mercearia","root","danius1987");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConexao(){
		return this.conexao;
	}
	//Statement normal
	 
	/*public void novaStatement(){
		this.getStatement();
	}
	*/ 
	private void criaStatement(){
		try {
			this.stmt= conexao.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Statement getStatement(){
		return this.stmt;
	}

	public void executarSQL(String sql){
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public void fechaConexao(){
		try {
			conexao.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
		
	/*{

    try {  
    	Connection connection = null;
        // Load the JDBC driver  
        String driverName = "org.gjt.mm.mysql.Driver"; // MySQL MM JDBC driver  
        Class.forName(driverName);  
      
        // Create a connection to the database  
        String serverName = "localhost";  
        String mydatabase = "mercearia";  
        String url = "jdbc:mysql://" + serverName +  "/" + mydatabase; // a JDBC url  
        String username = "root";  
        String password = "danius1987";  
        connection = DriverManager.getConnection(url, username, password);  
    } catch (ClassNotFoundException ex) {  
        // Could not find the database driver  
    } catch (SQLException e) {  
        // Could not connect to the database  
    } 
}*/
	
	
	/*

	public void novaPreparedStatement(String sql){
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void setPreparedStatement(PreparedStatement stmt,ArrayList[] list){
		/*stmt.0setInt(1,list[1]);
		stmt.setString(2,list[2]);
		stmt.executeUpdate;
		stmt.close();
		*/

}
