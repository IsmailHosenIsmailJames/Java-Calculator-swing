import java.util.ArrayList;
import java.util.Stack;

public class CalculateInfix {

	static int prec(char c) {
		if (c == '^')
			return 3;
		else if (c == '/' || c == '*')
			return 2;
		else if (c == '+' || c == '-')
			return 1;
		else
			return -1;
	}

	static char associativity(char c) {
		if (c == '^')
			return 'R';
		return 'L';
	}

	static ArrayList<String> infixToPostfix(String s) {
		ArrayList<String> result = new ArrayList<String>();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if ((c >= '0' && c <= '9')) {
				String temString = "";
				for (int x = i; x < s.length(); x++) {
					if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')))
						break;
					c = s.charAt(i);
					if (c == '+' || c == '-' || c == '/' || c == '*' || c == '(' || c == ')')
						break;
					temString += c;
					i++;
				}
				i--;
				result.add(temString);
			} else if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					result.add("" + (stack.pop()));
				}
				stack.pop();
			}

			else {
				while (!stack.isEmpty() && (prec(s.charAt(i)) < prec(stack.peek()) ||
						prec(s.charAt(i)) == prec(stack.peek()) &&
								associativity(s.charAt(i)) == 'L')) {
					result.add("" + stack.pop());
				}
				stack.push(c);
			}
		}
		while (!stack.isEmpty()) {
			result.add("" + stack.pop());
		}
		return result;
	}

	static double calculateInfix(String infixString) throws Exception {

		ArrayList<String> postfix = infixToPostfix(infixString);
		CalculatePostfix calculatePostfix = new CalculatePostfix();
		return calculatePostfix.calculate(postfix);

	}
}

class CalculatePostfix {
	double calculate(ArrayList<String> postfix) throws Exception {
		ArrayList<String> tem = singleCalculation(postfix);
		return Double.parseDouble(tem.get(0));
	}

	private ArrayList<String> singleCalculation(ArrayList<String> postfix) throws Exception {
		if (postfix.size() == 1)
			return postfix;
		int index = -1;
		for (int i = 0; i < postfix.size(); i++) {
			String currentString = postfix.get(i);

			if (currentString.equals("+") || currentString.equals("-") || currentString.equals("/")
					|| currentString.equals("*")) {
				index = i;
				break;
			}
		}
		if (index < 2)
			throw new Exception("Got some error");
		double num1 = Double.parseDouble(postfix.get(index - 1));
		double num2 = Double.parseDouble(postfix.get(index - 2));
		String operatorString = postfix.get(index);
		double result = operation(num1, num2, operatorString);
		postfix.remove(index);
		postfix.add(index, result + "");
		postfix.remove(index - 2);
		postfix.remove(index - 2);
		singleCalculation(postfix);
		return postfix;
	}

	private double operation(double num2, double num1, String oprator) {
		if (oprator.equals("+"))
			return num1 + num2;
		else if (oprator.equals("-"))
			return num1 - num2;
		else if (oprator.equals("/"))
			return num1 / num2;
		else
			return num1 * num2;
	}
}