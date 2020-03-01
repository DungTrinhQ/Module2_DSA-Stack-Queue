import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        Stack<StringBuffer> stack = new Stack<>();
        String palindrome = "able was I ere I saw elba";
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = palindrome.length()-1; i>=0; i--){
            stringBuffer=stringBuffer.append(palindrome.charAt(i));
        }
        stack.push(stringBuffer);
        StringBuffer str = stack.pop();

        if (palindrome.equalsIgnoreCase(String.valueOf(str))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}