package br.com.siswebjee2.util

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = Config.DbPath;
	private String usuario = Config.Dblogin;
	private String senha = Config.Dbpass;
	private Connection conexao;
	
	public Conexao(String driver, String url, String usuario, String senha){
		this.driver = driver;
		this.url= url;
		this.usuario= usuario;
		this.senha=senha;
		
		this.conectar();
	}
	
	public boolean conectar(){
		try{
			Class.forName(driver);
			this.conexao=DriverManager.getConnection(url,usuario,senha);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Connection obterConexao() {
		return this.conexao
	}
	
	public void desconectar() {
		try{
			if(this.conexao != null){
				this.conexao.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}