package in.co.rays.model;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.co.rays.dto.UserDTO;
import in.co.rays.exception.ApplicationException;
import in.co.rays.util.HibDataSource;

public class UserModelHibImpl {
	Session session = null;
	Transaction tx = null;

	public void add(UserDTO dto) throws ApplicationException {

		session = HibDataSource.getSession();
		tx = session.beginTransaction();
		long pk = 0;

		try {
			tx = session.beginTransaction();
			session.save(dto);
			pk = dto.getId();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			throw new ApplicationException("Exception in Add User:" + e.getMessage());
		} finally {
			tx.rollback();
		}

	}

}
