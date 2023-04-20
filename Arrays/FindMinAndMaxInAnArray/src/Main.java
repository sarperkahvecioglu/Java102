
public class Main {

	public static void main(String[] args) {
		
		int[] list = {56, 34, 1, 8, 101, -2, -33};
		
		int min = list[0];
		int max = list[0];
		
		for(int i = 1; i < list.length; i++) {
			if(list[i] < min)
				min = list[i];
			else if(list[i] > max)
				max = list[i];
		}
		
		System.out.println("Minimum value of this array: " + min);
		System.out.println("Maximum value of this array: " + max);
		
	}
}
