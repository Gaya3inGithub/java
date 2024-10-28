package j20_Collection;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	scanner.close();
        String s = "{[()]}";  

        if (isValid(s)) {
            System.out.println("The string is valid.");
        } else {
            System.out.println("The string is not valid.");
        }
    }
}


