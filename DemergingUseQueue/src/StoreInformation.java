import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import  java.util.Date;
public class StoreInformation<E>{

    ArrayList<Demerging> listPerson = new ArrayList<>();
    Queue<Demerging> listFemale = new LinkedList<>();
    Queue<Demerging> listMale = new LinkedList<>();


    Demerging A = new Demerging("AA","nam","23/11/1997");
    Demerging B = new Demerging("BB","nu","23/11/1997");

    Demerging C = new Demerging("CC","nu","23/11/1997");
    Demerging D = new Demerging("DD","nam","19/05/2003");

    public StoreInformation() throws ParseException {
    }

    public void add(){
        listPerson.add(A);
        listPerson.add(B);
        listPerson.add(C);
        listPerson.add(D);
    }
    public void addSexToQueue(){
        for (int i = 0; i < listPerson.size(); i++){

            if((listPerson.get(i)).getSex().equals("nu")){
                listFemale.add(listPerson.get(i));
            }

            else if((listPerson.get(i)).getSex().equals("nam")){
                listMale.add(listPerson.get(i));
            }
        }
    }
}