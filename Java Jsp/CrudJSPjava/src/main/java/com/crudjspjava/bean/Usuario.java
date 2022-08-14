package com.crudjspjava.bean;

public class Usuario {

	private int id;
	private String nome, email, sexo, password, pais;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//método Get: Esse método sempre retornará um valor, seja ele String, int ,double etc.
	public String getNome() {
		return nome;
	}
	/*método Set: utilizado para alterarmos, modificarmos os valores de um atributo da classe. 
		Esse método não terá um retorno, pois o atributo será somente modificado, criando um método de tipo VOID, sem retorno. 
		Porém ele deve receber algum argumento para que possa ocorrer a devida alteração. */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
}
