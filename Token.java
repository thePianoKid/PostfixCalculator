public class Token {
	private static final int INTEGER = 0;
	private static final int SYMBOL = 1;
	int type;
	int iValue;
	String sValue;

	public Token(int iValue) {
		this.iValue = iValue;
		type = INTEGER;
	}

	public Token(String sValue) {
		this.sValue = sValue;
		type = SYMBOL;
	}

	public boolean isSymbol() {
		return type == SYMBOL;
	}

	public boolean isInteger() {
		return type == INTEGER;
	}

	public int iValue() {
		return iValue;
	}

	public String sValue() {
		return sValue;
	}

	public String toString() {
		if (type == SYMBOL) {
			return "SYMBOL: " + sValue;
		} 

		return "INTEGER: " + iValue;
	}
}