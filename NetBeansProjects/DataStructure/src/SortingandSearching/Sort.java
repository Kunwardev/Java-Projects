import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class CountComparisons {
	private static int DefaultSize = 10000;
	
	private static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	
	private static int partition(int[] array, int start, int end) {
		int pivot = array[start];
		int i = start + 1, j = start + 1;
		while(j <= end) {
			if(array[j] < pivot) {
				swap(array, i++, j);
			}
			j++;
		}
		swap(array, start, i - 1);
		return i - 1;
	}
	
	private static int partition2(int[] array, int start, int end) {
		swap(array, start, end);
		return partition(array, start, end);
	}
	
	private static void medianOfThree(int[] array, int start, int end) {
		int length = end - start + 1;
		if(length < 3) return;
		int mid = start + (end - start) / 2;
		int max = Math.max(array[start], Math.max(array[mid], array[end]));
		int min = Math.min(array[start], Math.min(array[mid], array[end]));
		if(array[mid] > min && array[mid] < max)
			swap(array, mid, start);
		else if(array[end] > min && array[end] < max)
			swap(array, end, start);
	}
	
	private static int partition3(int[] array, int start, int end) {
		medianOfThree(array, start, end);
		return partition(array, start, end);
	}

	private static long quickSort(int[] array, int start, int end) {
		if(end <= start) return 0;
		// Question 1
		//int p = partition(array, start, end);
		// Question 2
		//int p = partition2(array, start, end);
		// Question 3
		int p = partition3(array, start, end);
		long comparisons = end - start;
		comparisons += quickSort(array, start, p - 1);
		comparisons += quickSort(array, p + 1, end);
		return comparisons;
	}
	
	private static long quickSort(int[] array) {
		return quickSort(array, 0, array.length - 1);
	}

	private static int[] input(String path) {
		int[] array = new int[DefaultSize];
		int index = 0;
		try {
			File file = new File(path);
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt())
				array[index++] = sc.nextInt();
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return array;
	}
	
	public static void main(String[] args) {
		int array[] = new int[10000];
                Scanner sc = new Scanner(System.in);
                for(int i=0;i<10000;i++)
                    array[i] = sc.nextInt();
		long comp = quickSort(array);
		System.out.println(Arrays.toString(array));
		
		System.out.println(comp);
	}
}