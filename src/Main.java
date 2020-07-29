import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//        //Create  Stream on fly
//        Stream stream = Stream.of("Ananya", 123, "Ram", 124, "Dan");
//        //Print stream
//        stream.forEach(p-> System.out.println(p));

//        strList.stream().filter(l->l.length()>4).forEach(p-> System.out.println(p));

        //0 will be returned. Lambda with multiple operations
        long len = strList.stream().filter(a->{
            a.startsWith("A");
            return false;
        }).count();
        System.out.println(len);

        //Composite filter operations
//        strList.stream().filter(a->a.startsWith("A")).filter(l->l.endsWith("a")).forEach(p-> System.out.println(p));

        //Limit output
//        strList.stream().filter(a->a.startsWith("A")).limit(2).forEach(p-> System.out.println(p));

        //Using map - filter data which starts with letter A and then convert the word to UPPERCASE
        strList.stream().filter(a->a.startsWith("A")).map(u->u.toUpperCase()).forEach(p-> System.out.println(p));

        //Converting to List
        String[] strArray = {"Rahul", "Mayur", "Rashmi", "Raaaa"};
        List<String> list1 = Arrays.asList(strArray);

        List<String> list2 = Arrays.asList("Bikash", "Trupti", "Mayur");

        //Sort
        list1.stream().filter(a->a.startsWith("R")).sorted().forEach(p-> System.out.println(p));

        //Merge two lists
        System.out.println("\n");
        List<String> list3 = Arrays.asList("Tina", "Sally", "Meera", "Sonu");
        List<String> list4 = Arrays.asList("Anita", "Ananya", "Riya", "Sammy");
        Stream<String> list5 = Stream.concat(list3.stream(), list4.stream());

        //Search for text in list
//        System.out.println(list5.anyMatch(s->s.equalsIgnoreCase("Meera")));

        //Stream to list
        List<String> list6 = list5.filter(a->a.startsWith("S")).sorted().map(u->u.toUpperCase()).collect(Collectors.toList());
        for (String s : list6)
            System.out.println(s);

        List<Integer> list7 = Arrays.asList(7, 8, 8, 6, 4, 7, 8, 2, 1);
        list7 = list7.stream().distinct().sorted().collect(Collectors.toList());
        for (int i : list7)
            System.out.println(i);
    }

}
