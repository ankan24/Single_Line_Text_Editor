import java.util.*;

public class ClcFwrk {
    public static void main(String[] args) {

        // ! Normal Array
        // String[] name = new String[10];
        // name[0] = "John";
        // // 0 - 9 fix size
        // name[9]= "John";
        // // but we can not add more element
        // name[10]= "John"; // Error - Array index out of bounds

        // ! ArrayList and LinkedList -------------------------------
        // List<Integer> l1 = new LinkedList<>();
        // ArrayList<String> sname = new ArrayList<>();
        // sname.add("Ankan");
        // sname.add("John");
        // System.out.println(sname);
        // // size = n;
        // // = n + n/2 +1 //Increase size
        // sname.add("Doe");
        // System.out.println(sname); // add element from the last
        // sname.add(1,"Ghorai"); //add element on given position
        // System.out.println(sname);

        // List<String> newList = new ArrayList<>();
        // newList.add("Niraj");
        // newList.add("Chopra");
        // System.out.println(newList);
        // sname.addAll(newList); // append all element of new list on old list
        // System.out.println(sname);
        // System.out.println(sname.get(2)); // get element on index no 2
        // sname.remove(2); // remove element on index no 2
        // System.out.println(sname);
        // sname.remove(String.valueOf("Doe")); // remove provided element
        // System.out.println(sname);
        // sname.set(2,"Nitish"); // replace value of given index
        // System.out.println(sname);
        // System.out.println(sname.contains("Ankan")); // check if element is present or not and return boolean value
        // // // Traverse the list
        // // // using for loop
        // for(int i=0;i<sname.size();i++){ // total number of elements
        // System.out.println(i+" - "+sname.get(i));
        // }
        // // // using foreach loop
        // for(String n : sname){
        // System.out.println(n);
        // }
        // // // using Iterator interface
        // Iterator<String> itr = sname.iterator();
        // while(itr.hasNext()){ // is there an element present or not in the next
        // System.out.println("- " + itr.next());
        // }
        // sname.clear(); // clear all elements
        // System.out.println(sname);

        // ! Stack ------------------------------------------------------
        // Last in First out ---

        // Stack<String> s = new Stack<>();
        // s.push("A"); // add element on the top of the stack
        // s.push("B");
        // s.push("C");
        // s.push("D");
        // System.out.println(s);
        // System.out.println(s.peek()); // return the top element of the stack
        // System.out.println(s.pop());// remove the element from the top of the stack
        // System.out.println(s);

        // ! Queue and LinkedList ------------------------------------------------------
        // First in First out ---

        // Queue<String> q = new LinkedList<>();
        // q.offer("A"); // add elements on queue and return true or false
        // q.add("X"); // add elements on queue and return true or throw exception
        // q.offer("B");
        // q.offer("C");
        // System.out.println(q);
        // System.out.println( q.poll()); // remove values from front and retune null if
        // // queue is empty
        // System.out.println(q);
        // System.out.println(q.remove()); // remove values from front and retune
        // // exception if queue is empty
        // System.out.println(q);
        // System.out.println(q.peek()); // top front element if queue is empty than
        // // retune null
        // System.out.println(q.element()); // top front element if queue is empty than
        // // throw exception

        // ! PriorityQueue ---------------------------------

        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // pq.offer(10);
        // pq.offer(5);
        // pq.offer(15);
        // pq.offer(25);
        // System.out.println(pq); // minimum to maximum value order
        // pq.poll(); // min value will be remove
        // System.out.println(pq);
        // System.out.println(pq.peek());
        // PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        // // first element will be maximum
        // pq1.offer(10);
        // pq1.offer(30);
        // pq1.offer(20);
        // System.out.println(pq1);
        
        //! if we create PriorityQueue by implementing Queue interface , than all methods are common
        // Queue<Integer> p1 = new PriorityQueue<>();
        // p1.add(10);
        // p1.add(30);
        // p1.add(20);
        // p1.add(5);
        // System.out.println(p1);
        // System.out.println(p1.remove());
        // System.out.println(p1);
        // System.out.println(p1.peek());

        // ! ArrayDequeue ----------------------------------------

        // we can add or remove elements from the first and also from the end
        // ArrayDeque<Integer> ad = new ArrayDeque<>();
        // ad.addFirst(100);
        // ad.addLast(200);
        // ad.offer(10); // add elements on the last
        // ad.offerFirst(5); // add elements to the first
        // ad.offerLast(15); // add elements to the last
        // ad.offer(1);
        // System.out.println(ad);
        // System.out.println(ad.peekFirst());
        // System.out.println(ad.peekLast());
        // System.out.println(ad.pollFirst());
        // System.out.println(ad.pollLast());
        // System.out.println(ad.removeLast());
        // System.out.println(ad);

        // ! HashSet and linkedHashSet -----------------------------------------------

        // don't allow duplicate elements

        // Set<Integer> s = new HashSet<>(); // random ordering O(1)
        // Set<Integer> s1 = new LinkedHashSet<>(); // maintain ordering
        // Set<Integer> s2 = new TreeSet<>(); // all elements will be sorted O(logN)
        // s.add(32);
        // s.add(45);
        // s.add(100);
        // s.add(100);
        // s.add(21);
        // s.add(2);
        // System.out.println(s);
        // s.remove(32);
        // System.out.println(s);
        // System.out.println(s.contains(100)); // if element is exist or not
        // System.out.println(s.isEmpty()); // check set is empty or not
        // System.out.println(s.size()); // return how much element available
        // s.clear(); // clear all elements
        // System.out.println(s);

        // ! HashMap , TreeMap -------------------------------------------
        
        // map store on key value pairs , keys must be unique
        // Map<String, Integer> m = new HashMap<>(); // O(1)
        // Map<String, Integer> m1 = new TreeMap<>(); // sorted keys O(logN)
        // m.put("One", 1); // add key and value
        // m.put("Two", 2);
        // m.put("Three", 3);
        // m.put("Four", 4);
        // m.put("Five", 5);
        // // if(!m.containsKey("Two")){
        // // m.put("Two", 22);
        // // }
        // // m.putIfAbsent("Five", 5);
        // System.out.println(m);

        // for(Map.Entry<String, Integer> e : m.entrySet()){
        // System.out.println(e);
        // System.out.println("Key - "+e.getKey());
        // System.out.println("Value - "+e.getValue());
        // }

        // for(String key : m.keySet()){ // iterate only keys
        // System.out.println("Key - "+key);
        // // System.out.println("Value - "+m.get(key));
        // }

        // for(Integer value : m.values()){ // iterate only values
        // System.out.println("Values - "+value);
        // }
        // System.out.println(m.containsValue(5)); // check given value is present or not
        // System.out.println(m.isEmpty()); // check is empty or not
        // m.remove("Three");
        // System.out.println(m);
        // m.clear(); // clear all values

        // ! ArrayClass---
        // work ony for primitive types Arrays
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // int indx = Arrays.binarySearch(arr, 5); // work only when arr is sorted
        // System.out.println(indx);
        // Arrays.sort(arr); // sort all elements of an array
        // Arrays.fill(arr, 10); // fill 10 in all positions
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }

        //! CollectionsClass---
        // List<Integer> l = new ArrayList<>();
        // l.add(34);
        // l.add(12);
        // l.add(9);
        // l.add(76);
        // l.add(12);
        // System.out.println("min value "+Collections.min(l));
        // System.out.println("max value "+Collections.max(l));
        // System.out.println(Collections.frequency(l, 12));  // frequency of an element
        // Collections.sort(l);
        // Collections.sort(l,Comparator.reverseOrder());  // sort in reverse order
        // System.out.println(l);
    }
}
