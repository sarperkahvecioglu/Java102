
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(int i = 2; i < 100; i++) {
			int divisionNumber = 0;
			for(int j = 1; j <= i; j ++) {
				if(i % j == 0)
					divisionNumber++;
				if(i == j && divisionNumber == 2)
					System.out.println(i);
			}
		}

	}

}
