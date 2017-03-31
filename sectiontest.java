package section;

import static org.junit.Assert.*;

import org.junit.Test;

public class sectiontest {
	

	@Test
	public void isSameSchedule() {
		section s1=new section(Subject.CS010, teacher.teacher1, Hours.AM830to10, Days.TueFri);
		section s2=new section(Subject.CS010, teacher.teacher1, Hours.AM830to10, Days.TueFri);
		assertEquals(s1.getSubject(),s2.getSubject());
		
		
	}
	@Test
	public void isSameSchedule2() {
		section s1=new section(Subject.CS010, teacher.teacher1, Hours.AM830to10, Days.TueFri);
		section s2=new section(Subject.CS010, teacher.teacher1, Hours.AM830to10, Days.TueFri);
		comparison com =new comparison(s1,s2);
		com.compare();
		com.result();
		String expected1 = "no";
		String result1="no";
		assertEquals(expected1, result1);
		
		
	}
	@Test
	public void isNotSameSchedule2() {
		section s1=new section(Subject.CS010, teacher.teacher1, Hours.AM830to10, Days.TueFri);
		section s2=new section(Subject.CS010, teacher.teacher1, Hours.PM1130to1, Days.TueFri);
		comparison com =new comparison(s1,s2);
		com.compare();
		com.result();
		String expected1 = "yes";
		String result1="yes";
		assertEquals(expected1, result1);
		
		
	}

}
