package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.StatisticUtil;

public class StatisticUtilTest {

	@Test
	public void testAverage() {
		assertEquals(3, StatisticUtil.average(new int[] {1,2,3,4,5}),0);
	}

	@Test
	public void testMode() {
		assertEquals(3, StatisticUtil.mode(new int[] {1,2,3,3}));
		assertEquals(3, StatisticUtil.mode(new int[] {1,2,3,3,3}));
	}
	
	@Test
	public void testMedian() {
		assertEquals(3, StatisticUtil.median(new int[] {1,2,3,4,5}),0);
		assertEquals(3, StatisticUtil.median(new int[] {3,6,4,2,5,1}),0);
	}
	
}
