import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

public class ThirtyDaysOfJava {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.push("Kye");
        names.push("John");
        names.push("Sue");

        ListIterator<String> it = names.listIterator();
        it.next();
        it.next();
        it.add("Kye");


        names.add(2, "Peter");

        for(String s: names) {
            System.out.println(s);
        }

    }

}
