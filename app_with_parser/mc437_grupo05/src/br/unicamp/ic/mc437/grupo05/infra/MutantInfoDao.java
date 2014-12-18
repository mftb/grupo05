package br.unicamp.ic.mc437.grupo05.infra;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.unicamp.ic.mc437.grupo05.modelo.MutantInfo;

@Component
public class MutantInfoDao {

	private Session session;

	public MutantInfoDao(Session session) {
		this.session = session;
	}

	public Long saveOrUpdate(MutantInfo mutantInfo) {
		Transaction transaction = session.beginTransaction();
		Long id = (Long) session.save(mutantInfo);
		transaction.commit();
		return id;
	}

	public List<MutantInfo> getById(String id) {
		Criteria query = session.createCriteria(MutantInfo.class).add(
				Restrictions.eq("testId", id));
		return (List<MutantInfo>) query.list();
	}

}
