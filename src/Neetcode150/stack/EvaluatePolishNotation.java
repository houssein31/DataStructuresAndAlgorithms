package Neetcode150.stack;

import java.util.Stack;

public class EvaluatePolishNotation {

    public static int evalRPN(String[] tokens) {

        Stack<Integer> charStack = new Stack<>();

        for (String token : tokens) {

            if(isOperator(token)) {
                int operand2 = charStack.pop();
                int operand1 = charStack.pop();
                int result = performOperation(token, operand1, operand2);
                charStack.push(result);
            } else {
                charStack.push(Integer.parseInt(token));
            }
        }

        return charStack.pop();
    }

    private static int performOperation(String operator, int operand1, int operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if(operand2 != 0)
                    return operand1 / operand2;
                else
                    throw new ArithmeticException("Cannot divide by zero");
            default:
                throw new IllegalArgumentException("Invalid Operator");
        }
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    public static void main(String[] args) {

        String tokens1[] ={"4","13","5","/","+"};  // Returns 6
        String tokens2[] ={"2","1","+","3","*"};  // Returns 9

        System.out.println(evalRPN(tokens2));
    }
}
