package CollectionsFrameWorks;



import java.util.*;

public class CollectionFrameWorkOverwiew {
    //Duplicates are allowed
    //Ordered
    static List<String> stringList = new ArrayList<>();


    //No dublicates
    static Set<String> stringSet = new HashSet<String>();

    public static void main(String[] args) {
        ListIterator<String> iterator = stringList.listIterator();
        stringList.add("1");
        stringList.add("2");
        stringList.add("asdsa");
        stringList.add("asdsa");
        stringList.add("asdsa");
        stringList.add("asdsa");
        stringList.add("3");
        stringList.add("0014");
        stringList.add("24");
        stringList.add("44");
        stringList.add("5");
        List integerList = new ArrayList() ;
        integerList.add(31);
        integerList.add(1442);
        integerList.add(13);
        integerList.add(14);
        Set<Integer> strings = new TreeSet < Integer>(integerList );

        for (Integer bekleyenler : strings) {
            System.out.println(bekleyenler);
        }

    }
}
