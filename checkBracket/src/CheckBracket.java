import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        String str = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        CheckBracket bracket = new CheckBracket();
        System.out.println(bracket.check(str));
    }

    public boolean check(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }else{
                if (str.charAt(i) == ')'){
                    if (stack.empty()){
                        return false;
                    } else stack.pop();
                }
            }
        }
        return stack.empty() ;
    }
}