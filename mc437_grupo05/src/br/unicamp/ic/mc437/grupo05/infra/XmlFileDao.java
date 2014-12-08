package br.unicamp.ic.mc437.grupo05.infra;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.unicamp.ic.mc437.grupo05.modelo.XmlFile;

@Component
public class XmlFileDao {

	private Session session;

	public XmlFileDao(Session session) {
		this.session = session;
	}

	public Long saveOrUpdate(XmlFile xmlFile) {
		Transaction transaction = session.beginTransaction();
		Long id = (Long) session.save(xmlFile);
		transaction.commit();
		return id;
	}

	public XmlFile getById(Long id) {
		Criteria query = session.createCriteria(XmlFile.class).add(
				Restrictions.eq("id", id));
		return (XmlFile) query.uniqueResult();
	}

	public List<Long> getAllIds() {
		Criteria query = session.createCriteria(XmlFile.class).setProjection(
				Projections.property("id"));
		return query.list();
	}
}
