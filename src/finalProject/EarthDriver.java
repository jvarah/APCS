package finalProject;

import java.util.ArrayList;
import java.util.Scanner;

public class EarthDriver {
	public static void main(String[] args) {
		// #17 Use of Scanner
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number of organisms on a given planet (in billions)");
		int length = in.nextInt();
		in.close();
		// #12 Use of Array and traversal
		Organism[] organismArr = new Organism[length];
		for (int i = 0; i < organismArr.length; i++) {
			organismArr[i] = new Organism();
		}
		ArrayList<Organism> organisms = new ArrayList<Organism>();
		for (Organism e : organismArr) {
			organisms.add(e);
		}
		// Use of zero arg
		Earth earth = new Earth();
		// #20 Calls method from another class
		earth.thanosSnapOutput();
		Earth terra = new Earth(organisms);
		System.out.println("\n\n\n\n\n\n\n" + "Earth with " + length + " organisms: \n");
		terra.thanosSnapOutput();
	}
}