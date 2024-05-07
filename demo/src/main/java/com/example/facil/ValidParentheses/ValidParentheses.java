package com.example.facil.ValidParentheses;
import java.util.Stack;
public class ValidParentheses {
    public boolean isValid(String parentheses)
    {
        Stack<Character>stack = new Stack<>();
        char[]symbols  = new char[]{'(', ')', '{', '}', '[', ']'};
        char []allParentheses = parentheses.toCharArray();
        for(char c : allParentheses)
        {
            //Abertura
            if (c== symbols[0]|| c== symbols[2] || c== symbols[4])
            {
                stack.push(c);
            }
            //Fechamento
            else if( c== symbols[1] || c == symbols[3] || c== symbols[5])
            {
                if (stack.isEmpty() || !isValidPair(stack.pop(),c)) {
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isValidPair(char open, char close) {
        return(open == '(' && close == ')') ||
              (open == '{' && close == '}') ||
              (open == '[' && close == ']');
    }
}
