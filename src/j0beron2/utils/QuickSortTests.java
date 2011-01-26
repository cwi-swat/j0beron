package j0beron2.utils;

import j0beron2.parser.Oberon0;

import java.io.File;
import java.util.Arrays;
import java.util.Random;

public class QuickSortTests {

	private static final String QUICKSORT = "src/quicksort.oberon0";
	private final Random rand;
	private final int runs;
	private final int inputLength;

	public QuickSortTests(int runs, int inputLength) {
		this.runs = runs;
		this.inputLength = inputLength;
		this.rand = new Random();
	}
	
	
	public void run() {
		File qs = new File(QUICKSORT);
		Oberon0 ob0 = new Oberon0();
		
		int array[] = new int[inputLength];
		
		firstLog();
		for (int i = 0; i < runs; i++) {
			nextLog(i);			
			populate(array);
			
			String input = toIOString(array);
			String output = ob0.runIntoString(qs, input);
			
			Arrays.sort(array);
			String expected = toIOString(array);

			if (!output.equals(expected)) {
				throw new RuntimeException("test failed: sorting of '" +
						input + "' not equal to expected '" + expected +
						" (got '" + output + "')");
			}
			
		}
		System.out.println();
		
	}
	
	private void populate(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt();
		}
	}

	private String toIOString(int array[]) {
		String str = "";
		for (int i = 0; i < array.length; i++) {
			str += array[i] + "\n";
		}
		return str;
	}

	private void firstLog() {
		System.out.print("random testing " + 0);
	}

	private void nextLog(int i) {
		for (int k = 0; k < ("" + i).length(); k++) {
			System.out.print('\b');
		}
		System.out.print(i + 1);
	}


}
