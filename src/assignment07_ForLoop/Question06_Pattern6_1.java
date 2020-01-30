public static void main(String[] args)

	{

		for (int i = 1; i <= 5; i++) {

			System.out.print(i + " ");
			int a = i;
			for (int j = 1; j < i; j++) {
				a = a + (5 - j);
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}
}
