
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {3,5,8,2,1,5,7,3,7,9,4};
		System.out.println(array);
		
		for(int i = 0; i < array.length - 1; i++) {
			int counter = 1;
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] == array[j]) {
					counter++;
				}
			}
			for(int k = 0; k < array.length; k++) {
				
			}
			
			System.out.println("Number " + array[i] + "repeated " + counter + " times.");
						
					
				
			
		}

	}

}
