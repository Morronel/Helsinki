package fourth;

import java.util.ArrayList;

public class MyClass {

    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second){
        for (int i = 0; i < second.size(); i++) {
            first.add(second.get(i));
        }
    }

    public static void pritner(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> uno = new ArrayList<>();
        ArrayList<Integer> dos = new ArrayList<>();

        uno.add(1);
        uno.add(2);
        dos.add(7);
        dos.add(5);
        combine(uno, dos);
        pritner(uno);
    }
}
