import java.util.ArrayList;

// P11 Assignment
// Author: Joras Oliveira
// Date:   Apr, 14 2018
// Class:  CS163
// Email:  j0r4s@ramss.colostate.edu

public class P11 implements IP11 {
	
	@Override
	public void printPattern(int n) {
		// TODO Auto-generated method stub
		if(n <= 0 ) {
			return;
		}
		else {
			printPattern(n, n);
		}
	}
	
	public void printPattern(int n, int line) {
		printPattern(n-line, line, 0);
		if(line > 0) {
			printPattern(n, line-1);
		}
	}
	
	private void printPattern(int stars, int stripes, int n) {
		if(stars > 0) {
			System.out.print("*");
			printPattern(stars - 1, stripes, 0);
		}
		else if(stripes > 0) {
			System.out.print("-");
			printPattern(stars, stripes-1, 0);
		}
		else {
			System.out.println();
		}
	}

	@Override
	public int convertNum(int[] num) {
		// TODO Auto-generated method stub
		int result = 0;
		if(num.length <= 0) {
			return 0;
		}
		else {
			return convertNum(num, 0, num.length, result);
		}
	}
	
	private int convertNum(int[] num, int atindex, int lastindex, int result) {
		if(atindex < lastindex) {
			result *= 10;
			result += num[atindex];
			return convertNum(num, atindex+1, lastindex, result);
		}
		else {
			return result;
		}
	}

	@Override
	public ArrayList<String> intersection(ArrayList<String> AL1, ArrayList<String> AL2) {
		// TODO Auto-generated method stub
		ArrayList<String> result = new ArrayList<String>();
		if(AL1.size() == 0 && AL2.size() == 0) {
			return null;
		}
		else {
			return intersection(AL1, AL2, 0, 0, result);
		}
	}
	
	public ArrayList<String> intersection(ArrayList<String> AL1, ArrayList<String> AL2, int index1, int index2, ArrayList<String> result) {
		if(index1 < AL1.size()) {
			if(index2 < AL2.size()) {
				if(AL2.get(index2).equals(AL1.get(index1))) {
					result.add(AL2.get(index2));
				}
				return intersection(AL1, AL2, index1, index2+1, result);
			}
			else {
				return intersection(AL1, AL2, index1+1, 0, result);
			}
		}
		else {
			return result;
		}
	}
	
}
