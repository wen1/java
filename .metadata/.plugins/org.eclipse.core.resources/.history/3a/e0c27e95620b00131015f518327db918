import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class HanoiTest {
	@Test
	public void test() {
		System.out.println("********run test()********");
		int numOfDisk = 3;
		Hanoi hanoi = new Hanoi(numOfDisk);
		Vector<Hanoi.Move> result = hanoi.getSolution();
		for (int i=0; i<result.size(); i++){
			System.out.println(result.get(i));
		}
		
		Stack[] t = hanoi.getTowers();
		assertEquals(true,t[0].isEmpty());
		assertEquals(true,t[1].isEmpty());
		for(int i=0; i< numOfDisk-1; i++){
			assertEquals(numOfDisk-1-i,t[2].get(i));
		}
		System.out.println("********end test()********\n");
	}
	@Test
	public void runMoveTest(){
		System.out.println("********run runMoveTest()********");
		int numOfDisk = 6;
		Hanoi hanoi = new Hanoi(numOfDisk);
		Vector<Hanoi.Move> solution = hanoi.getSolution();
		Hanoi hanoiMock = new Hanoi(numOfDisk);
		for (int i = 0; i<solution.size(); i++){
			hanoiMock.runMove(solution.get(i));
		}
		Stack[] t1 = hanoiMock.getTowers();
		assertEquals(true,t1[0].isEmpty());
		assertEquals(true,t1[1].isEmpty());
		for(int i=0; i< numOfDisk-1; i++){
			assertEquals(numOfDisk-1-i,t1[2].get(i));
		}
		System.out.println("********end runMoveTest()********\n");
	}

}
