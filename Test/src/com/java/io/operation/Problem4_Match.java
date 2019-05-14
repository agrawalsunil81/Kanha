package com.java.io.operation;

import java.util.HashSet;
import java.util.Set;

public class Problem4_Match {

	public static void main(String[] args) {
		Problem4_Match problem4_Match = new Problem4_Match();
		Problem4_Person p1 = new Problem4_Person("test1", (byte) 12, "Deer Vailey", "Phoneix", "AZ", (short) 85027);
		Problem4_Person p2 = new Problem4_Person("test2", (byte) 12, "Deer Vailey", "Phoneix", "AZ", (short) 85027);
		System.out.println("Result::" + problem4_Match.doTheyMatch(p1, p2));
	}

	public boolean doTheyMatch(Problem4_Person p1, Problem4_Person p2) {
		// Are they equal? ---NO
		// If I add both to a Set does it enforce uniqueness?
		// If both conditions above are true, then return true, else false;
		Set<Problem4_Person> setPerson = new HashSet<Problem4_Person>();
		setPerson.add(p1);
		boolean value = setPerson.add(p2);
		if (!value && p1.equals(p2))
			return true;
		return false;
	}

}
