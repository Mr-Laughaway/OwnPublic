package pe.mrlaughaway.util;

public class Sort {

	public static boolean QuickSort(int[] array, int nLow, int nHigh)	{
		int lo = nLow;
		int hi = nHigh;
		int pivot = (lo + hi) / 2;
		int tmp;
	 
		while(true){
			
			while( lo < pivot ) {
				if( array[pivot] < array[lo] )
					break;
				else
					lo++;
			}
	 
			while( hi > pivot ) {
				if( array[hi] < array[pivot] )
					break;
				else
					hi--;
			}
	 
			if( lo == pivot && hi == pivot) {
				if( nLow < pivot-1  )
					QuickSort(array, nLow, pivot-1);
	   
				if( pivot+1 < nHigh)
					QuickSort(array, pivot+1, nHigh);
	 
				break;
			}
			else {
				tmp = array[lo];
				array[lo] = array[hi];
				array[hi] = tmp;
			 
				if(lo != pivot && hi != pivot) {
					lo++;
					hi--;
				}
				else if (lo == pivot) {
					pivot = hi;
					lo++;
				}
				else { // hi == pivot
					pivot = lo;
					hi--;
				}
			}
		}
	 
		return true;
	}
	
}