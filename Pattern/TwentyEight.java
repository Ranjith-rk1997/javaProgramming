package Pattern;

public class TwentyEight {

	public static void main(String[] args) {
		int row=5;
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=row-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=2*i-1; j++) {
				System.out.print(j%2);
			}
			System.out.println();
		}
	}
	

	}


