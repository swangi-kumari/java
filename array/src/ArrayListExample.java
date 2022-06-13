import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//
//        list.add(6);
//        list.add(675);
//        list.add(67);
//        list.add(6778);
//        list.add(6007);
//        list.add(6667);
//
//        list.set(0, 99);
//
//        list.remove(2);
//
//        System.out.println(list);

        //input
        for(int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

        //get item at any indx
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i)); //pass index here
        }
        System.out.println(list);

    }
}
