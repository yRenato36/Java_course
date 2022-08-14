package com.crudjspjava.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.crudjspjava.bean.Usuario;
import com.mysql.jdbc.PreparedStatement;

public class UsuarioDao {

	public static Connection getConnection() {
		Connection con = null;
		
		try { //tenta criar uma conexão com o banco de dados
			Class.forName("com.mysql.jdbx.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudjspjava", "root", "");
		}catch (Exception e) { //caso não consiga, ele apresenta o erro
			// TODO: handle exception
			System.out.println(e);
		}
		return con;
	}
	
	public static List<Usuario> getAllUsuarios() { //pega todos os usuarios
		List<Usuario> list = new ArrayList<Usuario>();
		
		try {	
			Connection con = getConnection(); //chama a string de conexão
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("SELECT * FROM usuario"); //utiliza a string de conexão + um select do BD
			ResultSet rs = ps.executeQuery(); //executa o comando SQL
			
			while(rs.next()) { //passa por todos os valores do comando SQL
				Usuario usuario = new Usuario();
				//chamando cada campo da table usuario
				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setPassword(rs.getString("Password"));
				usuario.setSexo(rs.getString("sexo"));
				usuario.setPais(rs.getString("pais"));
				list.add(usuario);
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return list; //após passar por todos os usuário, ele retorna uma list(contém os usuarios) ao nosso método
	}
	
}
