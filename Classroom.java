package ImpQuestions;
import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {

        ArrayList<Integer>list= new ArrayList<>();
        ArrayList<String>list2= new ArrayList<>();
        ArrayList<Boolean>list3= new ArrayList<>();


        //Add Operation
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //Get Operation
        int element = list.get(2);
        System.out.println(element);


        //Remove Operation
        list.remove(1);
        System.out.println(list);

        //set Operation
        list.set(2,10);
        System.out.println(list);
    }
}
