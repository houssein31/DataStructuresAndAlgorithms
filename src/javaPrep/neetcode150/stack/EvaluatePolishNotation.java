package javaPrep.neetcode150.stack;

import java.util.Stack;

public class EvaluatePolishNotation {

    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String c : tokens) {
            if (c.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (c.equals("-")) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first - second);
            } else if (c.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (c.equals("/")) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first / second);
            } else {
                stack.push(Integer.parseInt(c));
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {

        String tokens1[] = {"4","13","5","/","+"};  // Returns 6
        String tokens2[] = {"2","1","+","3","*"};  // Returns 9

        System.out.println(evalRPN(tokens1));
        System.out.println(evalRPN(tokens2));
    }
}
