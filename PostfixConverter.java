public class PostfixConverter {
	private String postfixEx;
	private int stackCapacity;

	public PostfixConverter(String expression) {
		postfixEx = expression;
		stackCapacity = 10;
	}

	public int evaluateExpression() {
		Reader reader = new Reader(postfixEx);
		Stack<Integer> s = new ArrayStack<Integer>(stackCapacity);

		while(reader.hasMoreTokens()) {
			Token token = reader.nextToken();
			if (token.isInteger()) {
				s.push(token.iValue());
			} else {
				int i1 = s.pop();
				int i2 = s.pop();

				s.push(computeExpression(i2, i1, token));
			}
		}

		return s.pop();
	}

	private int computeExpression(int i1, int i2, Token op) {
		if (op.sValue().equals("+")) {
			return i1 + i2;
		} else if (op.sValue().equals("-")) {
			return i1 - i2;
		} else if (op.sValue().equals("*")) {
			return i1 * i2;
		} else if (op.sValue().equals("/")) {
			return i1 / i2;
		}

		return 0;
	}
}