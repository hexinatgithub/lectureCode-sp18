public class Sort {
	/** Sorts strings destructively. */
	public static void sort(String[] x) {
        sort(x, 0);
	}

	/** Sorts x starting at position start. */
	private static void sort(String[] x, int start) {
		// find the smallest item
		// move it to the front
		// selection sort the rest (using recursion?)
        if (start == x.length) {
            return;
        }

        int smallestIndex = findSmallest(x, start);
        swap(x, start, smallestIndex);
        sort(x, start + 1);
    }

	/** Swap item a with b. */
	public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    /** Returns the smallest string in x.
     * @source Got help with string compares from https://goo.gl/a7yBU5. */
    public static int findSmallest(String[] x, int start) {
        int smallestIndex = start;
        for (int i = start; i < x.length; i += 1) {
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp < 0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}