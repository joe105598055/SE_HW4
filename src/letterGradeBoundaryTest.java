import static org.junit.Assert.*;

import org.junit.Test;

public class letterGradeBoundaryTest {
	letterGrade letterGrade = new letterGrade();
	@Test
	public void Score_Equal_A1() {
		assertEquals(letterGrade.letterGrade(91),'A');
	}
	@Test
	public void Score_Equal_A2() {
		assertEquals(letterGrade.letterGrade(90),'A');
	}
	@Test
	public void Score_Equal_B1() {
		assertEquals(letterGrade.letterGrade(89),'B');
	}
	@Test
	public void Score_Equal_B2() {
		assertEquals(letterGrade.letterGrade(81),'B');
	}
	@Test
	public void Score_Equal_B3() {
		assertEquals(letterGrade.letterGrade(80),'B');
	}
	@Test
	public void Score_Equal_C1() {
		assertEquals(letterGrade.letterGrade(79),'C');
	}
	@Test
	public void Score_Equal_C2() {
		assertEquals(letterGrade.letterGrade(71),'C');
	}
	@Test
	public void Score_Equal_C3() {
		assertEquals(letterGrade.letterGrade(70),'C');
	}
	@Test
	public void Score_Equal_D1() {
		assertEquals(letterGrade.letterGrade(69),'D');
	}
	@Test
	public void Score_Equal_D2_with_BelowMin() {
		assertEquals(letterGrade.letterGrade(61),'D');
	}
	@Test
	public void Score_Equal_D3_with_OverMax() {
		assertEquals(letterGrade.letterGrade(60),'D');
	}
	@Test
	public void Score_Equal_F1() {
		assertEquals(letterGrade.letterGrade(59),'F');
	}
	@Test
	public void Score_Equal_F2() {
		assertEquals(letterGrade.letterGrade(1),'F');
	}
	@Test
	public void Score_Equal_F3() {
		assertEquals(letterGrade.letterGrade(0),'F');
	}
	@Test
	public void Score_Equal_X_with_UnderMin() {
		assertEquals(letterGrade.letterGrade(-1),'X');
	}
	@Test
	public void Score_Equal_A3() {
		assertEquals(letterGrade.letterGrade(99),'A');
	}
	@Test
	public void Score_Equal_A4() {
		assertEquals(letterGrade.letterGrade(100),'A');
	}
	
	@Test
	public void Score_Equal_X_with_OverMax() {
		assertEquals(letterGrade.letterGrade(101),'X');
	}

}
