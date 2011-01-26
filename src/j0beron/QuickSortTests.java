package j0beron;

import java.io.File;
import java.util.Arrays;
import java.util.Random;

public class QuickSortTests {

	private static final String QUICKSORT = "src/quicksort.oberon0";
	private final Random rand;
	private final int runs;
	private final int inputLength;
	private final AbstractOberon0 oberon0;

	
	public static void main(String[] args) {
		int runs = 1000;
		int length = 100;
		quickSortTest(new j0beron.visitor.parser.Oberon0(), runs, length);
		quickSortTest(new j0beron.interpreter.parser.Oberon0(), runs, length);
	}
	
	private static void quickSortTest(AbstractOberon0 oberon0, int runs, int inputLength) {
		QuickSortTests qs = new QuickSortTests(new j0beron.visitor.parser.Oberon0(), runs, inputLength);
		long duration = timedRun(qs);
		double seconds = duration / 1000.0;
		System.out.println(runs + " of quicksorting " + inputLength + " elements (" 
				+ oberon0.getName() + "): " 
				+ seconds + " (avg = " + seconds / runs + ")");
	}
	
	private static long timedRun(QuickSortTests qs) {
		long start = System.currentTimeMillis();
		qs.run();
		return System.currentTimeMillis() - start;
	}
	
	public QuickSortTests(AbstractOberon0 oberon0, int runs, int inputLength) {
		this.oberon0 = oberon0;
		this.runs = runs;
		this.inputLength = inputLength;
		this.rand = new Random();
	}
	
	
	public void run() {
		File qs = new File(QUICKSORT);
		int array[] = new int[inputLength];
		
//		firstLog();
		for (int i = 0; i < runs; i++) {
//			nextLog(i);			
			populate(array);
			
			String input = toIOString(array);
			String output = oberon0.runIntoString(qs, input);
			
			Arrays.sort(array);
			String expected = toIOString(array);

			if (!output.equals(expected)) {
				throw new RuntimeException("test failed: sorting of '" +
						input + "' not equal to expected '" + expected +
						" (got '" + output + "')");
			}
			
		}
//		System.out.println();
		
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
