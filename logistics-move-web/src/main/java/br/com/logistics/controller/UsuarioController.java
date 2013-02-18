package br.com.logistics.controller;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import br.com.logistics.bean.User;
import br.com.logistics.service.UsuarioService;

@ManagedBean
public class UsuarioController {
	
	private User user;
	
	@Autowired
	@Qualifier("usuarioService")
	private UsuarioService usuarioService;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	
	public String save(){
		
		this.usuarioService.save(this.user);
		this.user=null;
		this.user = new User();
		return "success";
		
	}
	
}
