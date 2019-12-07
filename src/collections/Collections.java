package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/*STORING AND ACCESS ORDER

Collections can store and access elements in three ways:
• Random, Hash Map which keeps object in no particular order and use hashCode
to place them in the collection. They are fast to search. The time it takes to search
does not depend on the number of elements it contains.

• Ordered, ArrayList, elements are stored in the order they are added. That is true for
all classes that implement the List interface. Searching can take a long time and
depend on the number of elements it contains.
• Sorted, Tree set, The order is based on the compareTo method of the objects.
They are fast to search.

All elements inserted into a sorted set must implement the Comparable interface.*/

public class Collections {

    public static void main(String[] args) {
//        Map<String, String> dictionary = new LinkedHashMap();     Ordered in same order as added
        Map<String, String> dictionary = new HashMap();            // Unordered placed according the hashcode
//        Map<String, String> dictionary = new TreeMap();           Ordered according the compareTo() method in String Class
        
        dictionary.put("Star", "Stjärna");
        dictionary.put("Sahib", "Kung");
        dictionary.put("Tiara", "Princessa");
        dictionary.put("Saga", "Story");
        
        System.out.println(dictionary);
        
        for (Map.Entry<String, String>entry : dictionary.entrySet()) {
            System.out.println(entry.getKey()+ "=" + entry.getValue());
            System.out.println(entry);
        }
        
    }
}
        
//    List<Integer> listOfNumbers = new ArrayList<>();
//    
//    Integer [] numbers = {33, 55, 33, 22, 98, 56, 43, 65, 567};
//    
//    listOfNumbers.addAll(Arrays.asList(numbers));
//    
//        System.out.println("Sorted Set : " + listOfNumbers);
//        
//         }
//
//        }

//        Collection values = new ArrayList<>();
//// ArrayList value = new ArrayList<>();
//
//        Iterator i = values.iterator();
//        
//        values.add("Harkanwal");
//        values.add(1.5);
//        values.size();
//        
//        
//        values.remove(1);
//        
////        while(i.hasNext()){
//       
//        System.out.println(values);
//        System.out.println(i.hasNext());
//        
         
   
//}
    

/*What Is Collection In Java

A collection is simply an object that groups multiple elements
into a single unit such as an ArrayList.

There are diffrent types of Collections

There are Severeal Collection Data structure in the Java Collections framework
(JCK)

The most important questions is how to choose Suitable Collection

---Sets you can’t have duplicate values in the set. Elements are ordered.

---List ordered in the order elements are added. Can have duplicate values.

---Maps store values paired with a key. The key has to be unique but you
can have duplicate values as long as they have different keys.


Maps store values paired with a key. The key has to be unique but you can have duplicate

values as long as they have different keys.

There are different kind of Maps:
HashMap order: Random contains only unique elements
LinkedHashMap order: same as input order contains only unique elements
TreeMap order: sorted based on compareTo() method contains only unique


MAP

In general if you don’t have reason not to, use HashMap. Randomly ordered, fastest.

If you want the elements in the order you added them use LinkedHashMap.

If you need to get the keys to be ordered then use TreeMap.

*/
