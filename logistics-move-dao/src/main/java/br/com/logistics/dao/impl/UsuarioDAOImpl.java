package br.com.logistics.dao.impl;

import br.com.logistics.bean.User;
import br.com.logistics.dao.UsuarioDAO;

public class UsuarioDAOImpl extends BaseDAOHibernate  implements UsuarioDAO {

	public void save(User user) {
		this.saveOrUpdate(user);
	}

	public void delete(Object object) {
		// TODO Auto-generated method stub
		
	}
	

}
