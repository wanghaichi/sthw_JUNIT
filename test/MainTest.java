import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hardy on 17-3-10.
 */
public class MainTest {
    private int a, b, c;
    @Before
    public void setUp(){

    }
//    public void randomABC(){
//        long l = System.currentTimeMillis();
//        a = (int)( l % 100 );
//        l = System.currentTimeMillis();
//        b = (int)( l % 100 );
//        l = System.currentTimeMillis();
//        c = (int)( l % 100 );
//    }
    @Test
    public void testTriangle() throws Exception {
        a = 1;
        b = 2;
        c = 3;
        assertEquals("illegal input", Main.testTriangle(a, b, c));
        a = 2;
        b = 5;
        c = 5;
        assertEquals("isosceles", Main.testTriangle(a, b, c));
        a = 5;
        b = 5;
        c = 5;
        assertEquals("equilateral", Main.testTriangle(a, b, c));
        a = 5;
        b = 6;
        c = 7;
        assertEquals("scalene", Main.testTriangle(a, b, c));
    }

}