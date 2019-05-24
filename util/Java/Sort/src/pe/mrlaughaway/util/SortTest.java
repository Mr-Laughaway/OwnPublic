package pe.mrlaughaway.util;

public class SortTest {

	public static void main(String[] args) {
		
		int[] array = new int[20];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 20) + 1;
		}
		
		for( int n : array ) {
			System.out.printf("%d ", n);
		}
		System.out.println();
		
		Sort.QuickSort(array, 0, array.length-1);
		
		for( int n : array ) {
			System.out.printf("%d ", n);
		}
		System.out.println();
		
		
		

	}

}
