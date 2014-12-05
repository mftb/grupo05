package br.unicamp.ic.mc437.grupo05.infra;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.unicamp.ic.mc437.grupo05.modelo.XmlFile;

@Component
public class XmlFileDao {

	private Session session;

	public XmlFileDao(Session session) {
		this.session = session;
	}

	public void saveOrUpdate(XmlFile xmlFile) {
		Transaction transaction = session.beginTransaction();
		session.save(xmlFile);
		transaction.commit();
	}

	public XmlFile getById(Long id) {
		Criteria query = session.createCriteria(XmlFile.class).add(
				Restrictions.eq("id", id));
		return (XmlFile) query.uniqueResult();
	}
}
