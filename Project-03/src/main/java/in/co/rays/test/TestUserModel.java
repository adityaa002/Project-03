package in.co.rays.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import in.co.rays.dto.UserDTO;
import in.co.rays.model.UserModelHibImpl;
import in.co.rays.model.UserModelInt;

public class TestUserModel {

 
	public static void main(String[] args) {
		testAdd();

	}

	private static void testAdd() {

		UserDTO dto = new UserDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		dto.setFirstName("Yash");
		dto.setLastName("Kanoongo");
		dto.setDob(sdf.parse("13-05-1999"));
		dto.setConfirmPassword("Yash@12345");
		dto.setPassword("Yash@12345");
		dto.setLogin("yashkanoongo493@gmail.com");
		dto.setGender("male");
		dto.setUnSuccessfullLogin(2);

		dto.setCreatedBy("admin");
		dto.setModifiedBy("admin");
		dto.setRoleId(1);
		dto.setMobileNo("9406653787");
		dto.setRegisteredIP("yashkanoongo493@gmail.com");
		dto.setLoginIP("yashkanoongo493@gmail.com");
		dto.setLastLogin(new Timestamp(new Date().getTime()));
		dto.setCreatedDatetime(new Timestamp(new Date().getTime()));
		dto.setModifiedDatetime(new Timestamp(new Date().getTime()));
		System.out.println("add");
		long pk = model.add(dto);
		System.out.println(pk + "data successfully insert");
	}
}
