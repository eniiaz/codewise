package oopRecap;

import java.text.SimpleDateFormat;
import java.util.*;

public class Learning {

    public static void main(String[] args) {

        Set<Integer> list = new HashSet<>();
        list.add(3);
        list.add(32);
        list.add(1);
        list.add(12);
        list.add(3);
        for (Integer i:list) {
            System.out.println(i);
        }

        ArrayList<String> names = new ArrayList<>( );
        names.add("James");
        names.add("John");
        Iterator iterator = names.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());




    }
}
