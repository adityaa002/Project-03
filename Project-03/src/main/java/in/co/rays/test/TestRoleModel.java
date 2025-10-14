package in.co.rays.test;

import java.sql.Timestamp;
import java.util.Date;

import in.co.rays.dto.RoleDTO;
import in.co.rays.model.RoleModelHibImpl;
import in.co.rays.model.RoleModelInt;

public class TestRoleModel {

	public static RoleModelInt model = new RoleModelHibImpl();

	public static void TestAdd() {

		RoleDTO dto = new RoleDTO();
		dto.setName("Rays");
		dto.setDescription("Student panel");
		dto.setCreatedBy("aditya@gmail.com");
		dto.setModifiedBy("aditya@gmail.com");
		dto.setCreatedDatetime(new Timestamp(new Date().getTime()));
		dto.setModifiedDatetime(new Timestamp(new Date().getTime()));
		model.add(dto);

	}

	public static void TestUpdate() {
		RoleDTO dto = new RoleDTO();
		dto.setName("Department");
		dto.setId(6L);
		model.update(dto);

	}

	public static void main(String[] args) {
		//TestAdd();
		TestUpdate();
	}

}
