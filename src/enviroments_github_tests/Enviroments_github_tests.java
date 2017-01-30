package enviroments_github_tests;

public class Enviroments_github_tests {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		char ast = '*';
		while (n1 < 5) {
			n1++;
			while (n2 < 4) {
				n2++;
				System.out.print(ast + " ");
			}
			System.out.println(ast);
			n2 = 0;
		}
	}
}