package in.co.rays.model;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.co.rays.dto.RoleDTO;
import in.co.rays.util.HibDataSource;

public class RoleModelHibImpl implements RoleModelInt {

	public long add(RoleDTO dto) {

		Session session = null;
		Transaction tx = null;
		long pk = 0;

		session = HibDataSource.getSession();
		try {

			tx = session.beginTransaction();
			session.save(dto);
			pk = dto.getId();
			tx.commit();

		} catch (HibernateException e) {
			
			e.printStackTrace();

		}
		return pk;

	}

	public void update(RoleDTO dto) {
		// TODO Auto-generated method stub

	}

	public void delete(RoleDTO dto) {
		// TODO Auto-generated method stub

	}

	public List list(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public List list() {
		// TODO Auto-generated method stub
		return null;
	}

	public List search(RoleDTO dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public List search(RoleDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public RoleDTO findByPk(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public RoleDTO findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
