import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Ananya");
        strList.add("Anyaa");
        strList.add("Arjun");
        strList.add("Trupti");
        strList.add("Anna");

//        Stream stringStream = strList.stream().filter(p -> p.startsWith("A"));
//        Iterator iterator = stringStream.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        long count = strList.stream().filter(p->p.startsWith("A")).count();
        System.out.println(count);
    }
}
