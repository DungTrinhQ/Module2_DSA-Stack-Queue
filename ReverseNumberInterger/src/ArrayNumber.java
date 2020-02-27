import java.util.Stack;

public class ArrayNumber<E>{
    Stack<Integer> listNumber = new Stack<>();
    Stack<Integer> listNumber1 = new Stack<>();

    public ArrayNumber(){}
    public void add(){
        listNumber.push(1);
        listNumber.push(2);
        listNumber.push(3);
        listNumber.push(4);
        listNumber.push(5);
        listNumber.push(6);
    }

    public void reverse(){
        int j = listNumber.size()-1;
        int tmp;
        for (int i = 0; i <listNumber.size() + i; i++ ){
            tmp =   listNumber.pop();
            listNumber1.push(tmp);
        }
        listNumber.setSize(0);
    }

}