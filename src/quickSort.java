
public class quickSort {

	public static void sort(int[] array, int start, int end) {
		
		
		if(start >= end) {
			return;
		}
		
		
		if(start <= end) {
		
			int pibot = array[(start + end) /2];
			int s = start;
			int e = end;
			
			while(s < e) {
				while (array[s] < pibot) {
					s ++;
				}
				while(array[e] > pibot) {
					e --;
				}
				if(s <= e) {
					int tmp = array[s];
					array[s] = array[e];
					array[e] = tmp;
					s ++;
					e --;
				}
			}
		
			quickSort.sort(array, start, e);
			quickSort.sort(array, s, end);
		
		}
	}
	
	public static void main(String[] args) {
		int[] test = {
				10, 75, 32, 26, 95, 65, 88, 
				34, 60, 25, 54, 62, 12
		};
		
		quickSort.sort(test, 0, test.length-1);
		
		for(int i = 0; i < test.length; i++) {
			System.out.println( (i+1) + ":" + test[i] );
		}
		
	}
	
	
	
	
	
}
