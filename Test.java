public class Test {
	public static void main(String[] args) {
		PostfixConverter p = new PostfixConverter("9 8 6 - + 89 *");

		System.out.println(p.evaluateExpression());
	}
}
