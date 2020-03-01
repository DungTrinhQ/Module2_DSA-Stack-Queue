import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Binary<E> {
    Stack<Integer> binary = new Stack<>();
    Queue<Integer> dc = new LinkedList<>();



    public void convertBinary(int NumberToConvert){
        while (NumberToConvert != 0 ){
            int d = NumberToConvert % 2;
            binary.push(d);
            NumberToConvert /= 2;
        }

    }
    public void showBinary(){
        for (Integer a: binary){
            System.out.print(a);
        }
    }
}