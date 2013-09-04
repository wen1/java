/*
 * 3.4 In the classic problem of the Towers of Hanoi, you have 3 towers 
 * and N disks of different sizes which can slide onto any tower. 
 * The puzzle starts with disks sorted in ascending order of size from 
 * top to bottom (i.e., each disk sits on top of an even larger one). 
 * You have the following constraints: 
 * (1) Only one disk can be moved at a time. 
 * (2) A disk is slid off the top of one tower onto the next tower.
 * (3) A disk can only be placed on top of a larger disk. 
 * Write a program to move the disks from the first tower to the last 
 * using stacks.
 * 
 */

import java.util.Vector;

public class Hanoi {
	public class Move {
		public int disk,start,end;
		public Move(int _disk, int _start, int _end) {
			disk = _disk;
			start = _start;
			end = _end;
		}
		public String toString(){
			return disk + " from " + start + " to " + end;
		}
	}

	private final int numOfDisks;
	private final Stack[] towers;
	private Vector<Move> solution;;
	
	public Hanoi(int _numOfDisks) {
		numOfDisks = _numOfDisks;
		towers = new Stack[3];
		for (int i = 0; i<3; i++){
			towers[i] = new Stack();
		}
		solution = new Vector<Move>();
		for (int i=numOfDisks-1; i>=0; i--){
			towers[0].push(new Integer(i));
		}
	}

	private void move(int num, int from, int to){
		if(num < 1) {
			System.out.println("error input");
		}else if(num == 1) {
			Object disk = towers[from].pop();
			towers[to].push(disk);
			int diskNum = ((Integer)disk).intValue();
			solution.add(new Move(diskNum,from,to));
		} else {
			int temp = 3-from-to;
			move(num-1,from,temp);
			move(1,from,to);
			move(num-1,temp,to);
		}
	}
	
	public Vector<Move> getSolution(){
		move(numOfDisks,0,2);
		return solution;
	}
	
	// for tests
	public void runMove(Move m){
		int diskNum = ((Integer)towers[m.start].peek()).intValue();
		if (diskNum == m.disk){
			Object dsk = towers[m.start].pop();
			towers[m.end].push(dsk);
			//System.out.println(m.disk + " from " + m.start + " to " + m.end);
		} else {
			System.out.println(m.disk + " is not on the top");
		}
	}
	
	public Stack[] getTowers(){
		return towers;
	}
}
