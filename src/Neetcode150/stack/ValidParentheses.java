package Neetcode150.stack;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> parStack = new Stack<> ();

        for(char c : s.toCharArray ()) {

            if( c == '(' || c == '{' || c == '[')
               parStack.push ( c );
            else if (c == ')' && !parStack.isEmpty () && parStack.peek () =='(')
                parStack.pop();
            else if (c == '}' && !parStack.isEmpty () && parStack.peek () =='{')
                parStack.pop();
            else if (c == ']' && !parStack.isEmpty () && parStack.peek () =='[')
                parStack.pop();
            else
                return false;
         }

        return parStack.isEmpty ();
    }

    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "[";

        System.out.println (isValid(s2));
    }
}
