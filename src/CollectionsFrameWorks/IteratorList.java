package CollectionsFrameWorks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;

public class IteratorList<I extends Number> {

    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>();
        coll.addAll(Arrays.asList(1, 2, 23, 44, 50, 9));

        System.out.println("coll = " + coll);
        ListIterator<Integer> myIter = ((ArrayList<Integer>) coll).listIterator();
        System.out.println("myIter.hasNext() = " + myIter.hasNext());

        System.out.println("coll = " + coll);
        while (myIter.hasNext()) {
            int alfa = myIter.next();
            if (alfa > 10) {
                myIter.remove();
                myIter.add(5);
            } else {

                myIter.add(1);
            }
            System.out.println("coll.size() = " + coll.size());
        }
        System.out.println("coll = " + coll);

        System.out.println("coll = " + coll);
        //        while (myIter.hasPrevious()) {
//            myIter.previous();
////            coll.add(12);
//        }
    }

    public void CollectionArrayList() {

    }
}
