package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testExample1() {
        Assert.assertEquals(4, s.solution(new int[]{2, 3, 1, 5}));
    }

    @Test
    public void testZero() {
        Assert.assertEquals(1, s.solution(new int[]{}));
    }

    @Test
    public void testMax() {
        int[] maxArr = IntStream.rangeClosed(2, 100000).toArray();
        Assert.assertEquals(1, s.solution(maxArr));
    }

    @Test
    public void testMax2() {
        int removed = 10001;
        int[] maxArr = IntStream.rangeClosed(1, 100000).filter(n -> n != removed).toArray();
        Assert.assertEquals(removed, s.solution(maxArr));
    }

    @Test
    public void testMax3() {
        int removed = 1;
        int[] maxArr = IntStream.rangeClosed(1, 100001).filter(n -> n != removed).toArray();
        Assert.assertEquals(removed, s.solution(maxArr));
    }

    @Test
    public void testMax3_2() {
        int removed = 1;
        int[] maxArr = IntStream.rangeClosed(1, 100001).filter(n -> n != removed).toArray();
        Assert.assertEquals(removed, s.solution2(maxArr));
    }

    @Test
    public void testMax3_3() {
        int removed = 1;
        int[] maxArr = IntStream.rangeClosed(1, 99999).filter(n -> n != removed).toArray();
        Assert.assertEquals(removed, s.solution2(maxArr));
    }

//    @Test
//    public void testMax3_4() {
//        int max = 100001;
//
//        for (int i = 1; i <= max; i++) {
//            final int removed = i;
//            int[] maxArr = IntStream.rangeClosed(1, max).filter(n -> n != removed).toArray();
//            Assert.assertEquals(removed, s.solution2(maxArr));
//        }
//    }

    @Test
    public void testMax4() {
        int removed = 10001;
        int[] maxArr = IntStream.rangeClosed(1, 1000010).filter(n -> n != removed).toArray();
        Assert.assertEquals(removed, s.solution(maxArr));
    }
}
