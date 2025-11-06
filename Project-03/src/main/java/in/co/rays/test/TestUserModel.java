package in.co.rays.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import in.co.rays.dto.UserDTO;
import in.co.rays.exception.ApplicationException;
import in.co.rays.exception.DuplicateRecordException;
import in.co.rays.model.UserModelHibImpl;
import in.co.rays.model.UserModelInt;

public class TestUserModel {

	public static UserModelInt model = new UserModelHibImpl();

	public static void main(String[] args) throws ParseException, ApplicationException, DuplicateRecordException {
		testAdd();

	}

	private static void testAdd() throws ParseException, ApplicationException, DuplicateRecordException {

		UserDTO dto = new UserDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		dto.setFirstName("Aditya");
		dto.setLastName("Sharma");
		dto.setDob(sdf.parse("26-07-2002"));
		dto.setConfirmPassword("adi@12345");
		dto.setPassword("adi@12345");
		dto.setLogin("aditya@gmail.com");
		dto.setGender("male");
		dto.setUnSuccessfullLogin(2);

		dto.setCreatedBy("admin");
		dto.setModifiedBy("admin");
		dto.setRoleId(1);
		dto.setMobileNo("9406653787");
		dto.setRegisteredIP("aditya@gmail.com");
		dto.setLoginIP("aditya@gmail.com");
		dto.setLastLogin(new Timestamp(new Date().getTime()));
		dto.setCreatedDatetime(new Timestamp(new Date().getTime()));
		dto.setModifiedDatetime(new Timestamp(new Date().getTime()));
		System.out.println("add");
		long pk = model.add(dto);
		System.out.println(pk + "data successfully insert");
	}
}
