package CollectionsFrameWorks;

import java.util.*;

public class IteratorList<I extends Number> {

    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>();
        coll.addAll(Arrays.asList(1, 2, 23, 44, 50, 9));

        System.out.println("coll = " + coll);
        ListIterator<Integer> myIter = ((ArrayList<Integer>) coll).listIterator();
        System.out.println("myIter.hasNext() = " + myIter.hasNext());

        System.out.println("coll = " + coll);
        int i = 0;
        while (myIter.hasNext()) {


            int alfa = myIter.next();
            if (alfa > 10) {
                myIter.remove();
                myIter.add(++i);
            } else {

                myIter.add(i++);
            }
            System.out.println("coll.size() = " + coll.size());
        }
        System.out.println("myIter.nextIndex() = " + myIter.nextIndex());
        System.out.println("myIter.nextIndex() = " + myIter.hasNext());
        while (myIter.hasPrevious()) {
            myIter.add(10);
            myIter.previous();
            myIter.previous();

        }
    ((ArrayList<Integer>) coll).sort(Comparator.reverseOrder());
        System.out.println(coll);

    }

}
