package javaSubject.neetcode150.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        // Stack to store the current state: a pair of (current string, open count, close count)
        Stack<PartialState> stack = new Stack<>();

        // Start with an empty string, 0 open and 0 close parentheses used
        stack.push(new PartialState("", 0, 0));

        while (!stack.isEmpty()) {
            PartialState currentState = stack.pop();

            // If we have used n open and n close parentheses, we have a valid combination
            if (currentState.open == n && currentState.close == n) {
                result.add(currentState.str);
            } else {
                // Option 1: Add an opening parenthesis if we haven't used all open parentheses
                if (currentState.open < n) {
                    stack.push(new PartialState(currentState.str + "(", currentState.open + 1, currentState.close));
                }

                // Option 2: Add a closing parenthesis if the number of close is less than open
                if (currentState.close < currentState.open) {
                    stack.push(new PartialState(currentState.str + ")", currentState.open, currentState.close + 1));
                }
            }
        }

        return result;
    }

    // Helper class to store the state of each recursive call
    static class PartialState {
        String str;
        int open;
        int close;

        PartialState(String str, int open, int close) {
            this.str = str;
            this.open = open;
            this.close = close;
        }
    }
}
