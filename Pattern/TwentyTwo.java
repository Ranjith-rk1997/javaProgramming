package Pattern;

public class TwentyTwo {

	public static void main(String[] args) {
	int row=5;
	for (int i = 1; i <=row; i++) {
		for (int j = 1; j <=i-1; j++) {
			System.out.print(" ");
		}
		for (int j = i; j <=row; j++) {
			System.out.print(j);
		}
		System.out.println();
	}

	}

}
