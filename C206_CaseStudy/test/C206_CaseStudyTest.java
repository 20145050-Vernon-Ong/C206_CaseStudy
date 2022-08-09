import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import donttouch.Admin;
import donttouch.Student;
import mytry.Parent;
import mytry.caseStudy;
import mytry.ccaCoordinator;

public class C206_CaseStudyTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	ArrayList<Admin> adminList = new ArrayList<Admin>();
	ArrayList<Student> studentList = new ArrayList<Student>();
	ArrayList<ccaCoordinator> CordinatorList = new ArrayList<ccaCoordinator>();
	ArrayList<parents> parentList= new ArrayList<parents>();
	Parent p1;
	public void caseStudyTest() {
		p1= new Parent(21001234, "Pearlyn", 3, "E65H", "ohn", "ohn@gmail.com",87654321);
		Student s1 = new Student("Amy", 210001234, 3, "E65H", "Miss Chan", "SOH Club", 0);
		Admin a1 = new Admin("admin","admin");
		ccaCoordinator c1 = new ccaCoordinator("annie","football","annie");
		adminList.add(a1);
		parentList.add(p1);
		studentList.add(s1);
		CordinatorList.add(c1);
		
	} 
	@Test
	public void testListNotEmpty() {
		assertTrue(!adminList.isEmpty());
		assertTrue(!CordinatorList.isEmpty());
		assertTrue(!studentList.isEmpty());
		assertTrue(!parentList.isEmpty());
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
		assertTrue(caseStudy.loginParent(parentList, p1.getRandomGenerate(), p1.getStudentID()));
		assertTrue(caseStudy.loginStudent(studentList,"Amy",210001234));
		
	
		
	}
	
	@Test
	public void testregCCA() {
		assertTrue(C206_CaseStudy.deleteParent(parentList));
	}

}
