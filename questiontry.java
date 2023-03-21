public class questiontry {
	public static void main(String args[]) {
		int a = 5;
		outside: for (int i = 1; i < 3; i++) {
			inside: for (int j = 1; j < 3; j++) {
				System.out.print(j);
				if (a++ > 6)
					continue inside;
			    break outside;
			}
		}
	}
}