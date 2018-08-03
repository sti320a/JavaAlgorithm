import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quickSort {
	
	public static List<Integer> sort(List<Integer> array) {

		List<Integer> left = new ArrayList<>();
		List<Integer> right = new ArrayList<>();
		
		
		if(array.size() < 1) {
			return array;
		}
		
		Integer pivot = array.get(0);
		System.out.println(pivot);
		
		
		for(int i=1; i < array.size(); i++) {
			if(array.get(i) <= pivot) {
				left.add(array.get(i));
			} else {
				right.add(array.get(i));
			}
			System.out.println("left");
			System.out.println(left);
			System.out.println("right");
			System.out.println(right);
			
		}
		
		
		left = quickSort.sort(left);
		right = quickSort.sort(right);
		
		left.add(pivot);
		left.addAll(right);
				
		return left;
			
	}
	

	public static void main(String[] args) {
		List<Integer> test = new ArrayList<>();
		test.addAll(Arrays.asList(5, 3, 2, 1, 4));

		quickSort.sort(test);

		for (int i = 0; i < test.size(); i++) {
			System.out.println((i + 1) + ":" + test.get(i));
		}

	}

}
