package donttouch;


import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Admin;
import Student;
import mytry.Parent;
import mytry.caseStudy;
import mytry.ccaCoordinator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class caseStudyTest {
//	private Student s1;//test 3<=
//	private Student s2;//test4>=
//	private ccaCoordinator cc1;//test ccaadmin
//	private Admin a1;//tets ssystem admin
	
	ArrayList<Admin> adminList = new ArrayList<Admin>();
	ArrayList<Student> studentList = new ArrayList<Student>();
	ArrayList<ccaCoordinator> CordinatorList = new ArrayList<ccaCoordinator>();
	ArrayList<Parent> ParentList= new ArrayList<Parent>();
	Parent p1;
	public caseStudyTest() {
		p1= new Parent(21001234, "Pearlyn", 3, "E65H", "ohn", "ohn@gmail.com",87654321);
		Student s1 = new Student("Amy", 210001234, 3, "E65H", "");
		Admin a1 = new Admin("admin","admin");
		ccaCoordinator c1 = new ccaCoordinator("annie","football","annie");
		adminList.add(a1);
		ParentList.add(p1);
		studentList.add(s1);
		CordinatorList.add(c1);
		
	} 
	@Test
	public void testListNotEmpty() {
		assertTrue(!adminList.isEmpty());
		assertTrue(!CordinatorList.isEmpty());
		assertTrue(!studentList.isEmpty());
		assertTrue(!ParentList.isEmpty());
	}
	
	
	@Test
	public void testLogin() {
		//---------- Test Failure Login --------------------- //
		assertFalse(caseStudy.loginAdmin(adminList, "asd", "asd"));
		assertFalse(caseStudy.loginCCAcoord(CordinatorList, "asd", "asd"));
		assertFalse(caseStudy.loginStudent(studentList, "iuui", 0));
		;
		//-----------------Test Success Login----------------------//
		assertTrue(caseStudy.loginAdmin(adminList, "admin", "admin"));
		assertTrue(caseStudy.loginCCAcoord(CordinatorList, "annie", "annie"));
		assertTrue(caseStudy.loginParent(ParentList, p1.getRandomGenerate(), p1.getStudentID()));
		assertTrue(caseStudy.loginStudent(studentList,"Amy",210001234));
		
	
		
	}

	

}
