package br.com.logistics.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.logistics.bean.User;
import br.com.logistics.dao.UsuarioDAO;
import br.com.logistics.service.UsuarioService;

@Service("UsuarioService")
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	public void save(User user) {
		
		this.usuarioDAO.save(user);
		
	}
	
	
}
