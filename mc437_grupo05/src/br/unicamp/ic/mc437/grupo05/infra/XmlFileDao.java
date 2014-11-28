package br.unicamp.ic.mc437.grupo05.infra;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.unicamp.ic.mc437.grupo05.modelo.XmlFile;

@Component
public class XmlFileDao {

	private Session session;

	public XmlFileDao(Session session) {
		this.session = session;
	}

	public void salva(XmlFile xmlFile) {
		Transaction transaction = session.beginTransaction();
		session.save(xmlFile);
		transaction.commit();
	}
}
