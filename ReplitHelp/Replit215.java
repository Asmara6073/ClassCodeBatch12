package ReplitHelp;

import java.lang.invoke.SwitchPoint;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Replit215 {
/**
 * A bracket is considered to be of the following characters: (, ).
 * Two brackets are considered to be a matched pair if the an opening bracket "(" occurs to the left of a closing bracket ")" of the exact same type.
 * A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, "(()" is not balanced because the contents is not balanced.
 * By this logic, we say a sequence of brackets is balanced if the following conditions are met:
 * It contains no unmatched brackets. The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets. Given strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return true. Otherwise, return false.
 * Function Description
 * Complete the function isBalanced in the editor below.
 * isBalanced has the following parameter(s):
 * string s: a string of brackets Returns
 * string: either true or false
 * Examples
 * input "(()" -> false
 * input "(" -> false
 * input ")" -> false
 * input "(()))" -> false
 * input "(())" -> true
 * input "()" -> true
 * input ")()(" -> true
 */



static String isBalancedUsingStack(String s){
    Stack<Character> stack= new Stack();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i) == '['){
            stack.push(s.charAt(i));
        }else{
            if (stack.isEmpty()){
                return "false";
            }else{
                char popValue=stack.pop();
                if (s.charAt(i) == ')'&& popValue!='('){
                    return "false";
                }else if (s.charAt(i) == ']'&& popValue!='['){
                    return "false";
                }else if(s.charAt(i) == '}'&& popValue!='{'){
                    return "false";
                }
            }
        }
    }
    if(stack.isEmpty()){
        return "true";
    }else{
        return "false";
    }
}

    public static boolean isBalanced(String s){
        int num1=s.replace("(","").length();
        int num2=s.replace(")","").length();
        if (num1 == num2) {
            return true;
        } else  {
            return false;
        }
    }







public static void main(String[] args) {

    System.out.println(isBalanced(")()("));

String s= "))()((";

int num1=s.replace(")","").length();
    System.out.println(num1);

int num2=s.replace("(","").length();
    System.out.println(num2);







}


}
