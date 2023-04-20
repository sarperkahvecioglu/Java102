
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list = {3,7,8,4,2,7,3,1,3,4,5,7,4,6,4,6,8};
		int[] duplicate = new int[list.length];
		int index = 0;
		
		
		for(int i = 0; i < list.length - 1; i++) {
			for(int j = i + 1; j < list.length; j++) {
				if(list[i] == list[j] && list[i] % 2 == 0) {
					duplicate[index] = list[i];
					index++;
					
				}else
					continue;
			}
		}
		
		
		for(int number : duplicate) {
			if(number != 0)
				System.out.println(number + " is duplicate!");
		}
		
	}

}
