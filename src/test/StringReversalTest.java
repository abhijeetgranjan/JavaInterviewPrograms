package test;

import com.java.interviewprog.StringReversal;
import junit.framework.TestCase;

public class StringReversalTest extends TestCase {

    public void testReverse(){
        String hii = StringReversal.reverseString("hii");
        assertEquals("iih", hii);
    }
}
