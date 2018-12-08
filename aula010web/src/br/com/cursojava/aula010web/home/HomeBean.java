package br.com.cursojava.aula010web.home;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped //um novo objeto em todas as requisições
public class HomeBean {
	private final String titulo = "Bem vindo ao JSF";
	
	public String getTitulo(){
		return titulo;
	}
}
