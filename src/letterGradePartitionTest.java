import static org.junit.Assert.*;


import org.junit.Test;
 
public class letterGradePartitionTest {
	letterGrade letterGrade = new letterGrade();
	@Test
	public void Score_Equal_A() {
		assertEquals(letterGrade.letterGrade(95),'A');
	}
	@Test
	public void Score_Equal_B() {
		assertEquals(letterGrade.letterGrade(85),'B');
	}
	@Test
	public void Score_Equal_C() {
		assertEquals(letterGrade.letterGrade(75),'C');
	}
	@Test
	public void Score_Equal_D() {
		assertEquals(letterGrade.letterGrade(65),'D');
	}
	@Test
	public void Score_Equal_F() {
		assertEquals(letterGrade.letterGrade(55),'F');
	}
	@Test
	public void Score_Equal_X_with_BelowMin() {
		assertEquals(letterGrade.letterGrade(-1),'X');
	}
	@Test
	public void Score_Equal_X_with_OverMax() {
		assertEquals(letterGrade.letterGrade(101),'X');
	}

}
