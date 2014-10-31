package br.unicamp.ic.mc437.grupo05.infra;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.unicamp.ic.mc437.grupo05.modelo.Usuario;

@Component
public class UsuarioDao {
	
	
	private Session session;

	public UsuarioDao(Session session) {
		this.session = session;
	}
	
	public void salva(Usuario usuario){
		Transaction transaction = session.beginTransaction();
		session.save(usuario);
		transaction.commit();
	}
	
	public boolean existeUsuario(Usuario usuario) {
		Usuario encontrado = (Usuario) session.createCriteria(Usuario.class)
				.add(Restrictions.eq("login", usuario.getLogin()))
				.uniqueResult();
		return encontrado != null;
	}

	public Usuario carrega(Usuario usuario) {
		return (Usuario) session.createCriteria(Usuario.class)
		.add(Restrictions.eq("login", usuario.getLogin()))
		.add(Restrictions.eq("senha", usuario.getSenha()))
		.uniqueResult();
		}
}
