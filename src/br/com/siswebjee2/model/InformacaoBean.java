package br.com.siswebjee2.model;

import java.sql,Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import br.com.siswebjee2.util.Conexao;

public class InformacaoBean {
		private int codigo;
		private String nome;
		private Connection conexao;
		
		public InformacaoBean() {
		}
		
		public void setCodigo (int codigo){
			this.codigo = codigo;
		}
		
		public void setNome(String nome) {
			this.nome=nome;
		}
		
		public int getCodigo(){
			return codigo;
		}
		
		public String getNome(){
			return nome;
		}
		
		public void setConexao(Connection conexao) {
			this.conexao;
		}
		
		public boolean gravarInformacao(String tabela){
			String sql = "INSERT INTO " + tabela + " (nome) VALUES (?)";
			try {
				PreparedStatement instrucaoP=conexao.prepareStatement(sql);
				instrucaoP.setString(1, this.getNome());
				instrucaoP.execute();
				instrucaoP.close();
				return true;
			} catch(SQLException e){
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean excluirInformacao(String tabela){
			String sql = "DELETE FROM " + tabela + " WHERE codigo=?";
			try {
				PreparedStatement instrucaoP=conexao.prepareStatement(sql);
				instrucaoP.setInt(1, this.getCodigo());
				instrucaoP.execute();
				instrucaoP.close();
				return true;
			} catch(SQLException e){
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean atualizarInformacao(String tabela){
			String sql = "UPDATE FROM " + tabela + " SET nome=? WHERE codigo=?";
			try {
				PreparedStatement instrucaoP=conexao.prepareStatement(sql);
				instrucaoP.setString(1, this.getNome());
				instrucaoP.setInt(2, this.getCodigo());
				instrucaoP.executeUpdate();
				instrucaoP.close();
				return true;
			} catch(SQLException e){
				e.printStackTrace();
				return false;
			}
		}
		
		public InformacaoBean buscarInformacao(String tabela, int codigo){
			String sql = "SELECT * from " + tabela + " WHERE codigo=?";
			InformacaoBean info = new InformacaoBean();
			try {
				PreparedStatement instrucaoP = conexao.prepareStatement(sql);
				instrucaoP.setInt(1,codigo);
				ResultSet resultado = instrucaoP.executeQuery();
				if(resultado.next()) {
					info.setCodigo(resultado.getInt("codigo");
					info.setNome(resultado.getString("nome");
				}else{
					info=null;
				}
				resultado.close();
				instrucaoP.close();
				return info;
			}catch(SQLException e){
				e.printStackTrace();
				return null;
			}
		}
		
		public ArrayList<InformacaoBean> listarInformacoes(String tabela, String ordem){
			ArrayList<InformacaoBean> listaInfo = new ArrayList<InformacaoBean>();
			String sql = "SELECT * from " + tabela + " ORDER BY " + ordem;
			try {
				PreparedStatement instrucaoP = conexao.prepareStatement(sql);
				ResultSet resultado = instrucaoP.executeQuery();
				while(resultado.next()) {
					InformacaoBean info= new InformacaoBean();
					info.setCodigo(resultado.getInt("codigo");
					info.setNome(resultado.getString("nome");
					listaInfo.add(info);
				}
				resultado.close();
				instrucaoP.close();
				return listaInfo;
			}catch(SQLException e){
				e.printStackTrace();
				return null;
			}
		}
}

				
		
		