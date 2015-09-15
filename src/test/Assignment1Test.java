package test;

import com.chessboard.Assignment1;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by jamesonstone on 9/6/15.
 */
public class Assignment1Test extends TestCase {

    //create the field for all tests
    Assignment1 ObjectUnderTest;

    @Before
    public void setUp() {
        ObjectUnderTest = new Assignment1();
    }
    @After
    public void tearDown() {}

    public void testArrayIsCorrectSize() {
        assertEquals(7, ObjectUnderTest.chessboard.length);
    }

    public void testGameStartsRunning() {
        assertTrue(ObjectUnderTest.running);
    }

    public void testCheckPlayerOneStarts() {
        assertEquals(1, ObjectUnderTest.turn);
    }

    public void testCheckPlayersTakeTurnsPlayer1() {
        ObjectUnderTest.turn = 3;
        ObjectUnderTest.checkPlayerTurn();
        assertEquals("Player1: ", ObjectUnderTest.player);

    }

    public void testCheckPlayersTakeTurnsPlayer2() {
        ObjectUnderTest.turn = 2;
        ObjectUnderTest.checkPlayerTurn();
        assertEquals("Player2: ", ObjectUnderTest.player);
    }

    public void testFindAndCheckCoordinates() {
        //how to test command line operations
//        int x = 0;
//        int y = 1;
//        String p = "R";
//        ObjectUnderTest.findAndCheckCoordinates(p);
//        System.out.println("0");
//        System.out.println("1");
//        assertNotNull(ObjectUnderTest.chessboard[0][1]);
    }

}