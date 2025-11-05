package in.co.rays.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.dto.RoleDTO;
import in.co.rays.exception.ApplicationException;
import in.co.rays.exception.DuplicateRecordException;
import in.co.rays.model.RoleModelHibImp;
import in.co.rays.model.RoleModelInt;

public class TestRoleModel {
	public static RoleModelInt model = new RoleModelHibImp();

	// public static RoleModelInt model=new RoleModelJDBCImpl;
	public static void main(String[] args) throws Exception {
		// addTest();
		// deleteTest();
		// updateTest();
		// findByPkTest();
		// findByNameTest();
		// searchTest();
		 listTest();
	}

	public static void listTest() throws ApplicationException {
		List list = model.list(0, 0);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			RoleDTO dto = (RoleDTO) it.next();
			System.out.println(dto.getId() + "\t" + dto.getName() + "\t" + dto.getDescription());
		}

	}

	public static void searchTest() throws ApplicationException {
		// TODO Auto-generated method stub
		RoleDTO dto1 =new RoleDTO();
		//dto1.setId(1L);
		dto1.setName("admin");
		List<RoleDTO> a=(List<RoleDTO>) model.search(dto1, 0, 0);
		for(RoleDTO dto: a){
			System.out.println(dto.getId()+"\t"+dto.getName()+"\t"+dto.getDescription());
		}
	}

	public static void findByNameTest() throws ApplicationException {
		RoleDTO dto = model.findByName("Admin");
		System.out.println(dto.getId() + "\t" + dto.getName() + "\t" + dto.getDescription());
	}

	public static void updateTest() throws ApplicationException, DuplicateRecordException {
		RoleDTO dto = new RoleDTO();
		dto.setId(6L);
		dto.setName("admin");
		dto.setDescription("Admsdfgdinistrator");
		dto.setCreatedBy("admin");
		dto.setModifiedBy("admin");
		dto.setCreatedDatetime(new Timestamp(new Date().getTime()));
		dto.setModifiedDatetime(new Timestamp(new Date().getTime()));
		System.out.println("Record Updated");
		model.update(dto);
	}

	public static void findByPkTest() throws ApplicationException {
		// TODO Auto-generated method stub
		RoleDTO dto = model.findByPK(6);
		System.out.println(dto.getId() + "\t" + dto.getName() + "\t" + dto.getDescription());
	}

	public static void deleteTest() throws ApplicationException {
		// TODO Auto-generated method stub
		RoleDTO dto = new RoleDTO();
		dto.setId(7L);
		model.delete(dto);
	}

	public static void addTest() throws Exception {
		// TODO Auto-generated method stub
		RoleDTO dto = new RoleDTO();

		dto.setName("reception");
		dto.setDescription("Student panel");
		dto.setCreatedBy("admin@gmail.com");
		dto.setModifiedBy("admin@gmail.com");
		dto.setCreatedDatetime(new Timestamp(new Date().getTime()));
		dto.setModifiedDatetime(new Timestamp(new Date().getTime()));
		System.out.println("Role Add");

		model.add(dto);
	}
}
