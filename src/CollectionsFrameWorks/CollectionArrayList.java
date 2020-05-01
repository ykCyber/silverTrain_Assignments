package CollectionsFrameWorks;

import java.util.*;

public class CollectionArrayList {

   public void CollectionArrayList (){

    }

    public static void main(String[] args) {
        Collection<Integer> coll
                = new ArrayList<>();
        coll.addAll(Arrays.asList(1, 2, 23, 44, 50, 9));
        System.out.println("coll = " + coll);

        Iterator<Integer> myIter = coll.iterator();
        System.out.println("myIter.hasNext() = " + myIter.hasNext());
        while (myIter.hasNext()){
            Integer each = myIter.next();
            if (each>10){
             //   coll.add(5)
                System.out.println(each);;
            }

        }
        int i=0;
        while (i<5){
            coll.add(5);
            i++;
        }
        System.out.println("coll = " + coll);

    }
}
