import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

public class ThirtyDaysOfJava {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<String>();
        names.push("Kye");
        names.add("John");
        names.add("sue");

        System.out.println(names.remove(1));
        System.out.println(names.pop());
        System.out.println(names.removeLast());

    }

}
