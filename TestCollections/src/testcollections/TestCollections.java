
package testcollections;

import java.util.*;


public class TestCollections {

    
    public static void main(String[] args) {
        
        //key value
        Map<String, Integer> testMap = new HashMap<>();
        
        testMap.put("Gyula", 21);
        testMap.put("Gizi", 22);
        testMap.put("Jani", 23);
        
     //   System.out.println(testMap);
        
        Iterator it = testMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            
            String key = (String) pair.getKey();
            Integer value = (Integer) pair.getValue();
            
            System.out.println(key + " = " + value);
            if (value.equals("Gyula"))
                it.remove();
        }
        
        System.out.println("VÉGLEGES" + testMap);
       /* String[] array = {"Gizi", "Gyula", "Krisz", "Norbi", "Gyula"};
        List<String> list1 = Arrays.asList(array);
        System.out.println("list1: " + list1);
        
        Set<String> set = new LinkedHashSet<>(list1);
        System.out.println("set " + set);
        set.add("Gyula");
        System.out.println("set " + set);
        
       /* Stack<String> st = new Stack<String>();
        st.push("Legalja");
        st.push("Közepe");
        st.push("Teteje");
        
        printStack(st);
        st.pop();
        printStack(st);
        st.pop();
        printStack(st);
        st.pop();
        printStack(st);
    }
    
    public static void printStack(Stack<String> st) {
        System.out.println(st.isEmpty() ? "A verem üres" : st.toString());
    }
        
     /*   Queue<String> qu = new PriorityQueue<>((a,b) -> a.length() - b.length());
        qu.offer("Első Giziiiiiiiiiiiiiiiiiiiiiiiiiii");
        System.out.println(qu);
        qu.offer("Második Gyula");
        System.out.println(qu);
        qu.offer("Harmadik Fordó");
        System.out.println(qu);
        
        
        System.out.println(qu.peek());
        
        qu.poll();
        System.out.println(qu);
        qu.poll();
        System.out.println(qu);
        
     /*   ArrayList<Person> people = new ArrayList<>();
        
        people.add(new Person (21,"Gyula"));
        people.add(new Person (25, "Krisz"));
        people.add(new Person (27, "Norbi"));
        people.add(new Person (22, "Zoli"));
        
     
       
     /*  for (int i=0; i<people.size(); i++)           // 1. féle kiíratás
           System.out.println(people.get(i));
        
  //     for (String s : words)                         2. féle kiíratás
  //         System.out.println(s);
        
  //      people.forEach(s -> System.out.println(s.getName()));
        
  //      System.out.println(people);*/
       
       /*LinkedList<String> list1 = new LinkedList<>();
       
       list1.add("Gyula");
       list1.add("Krisz");
       
       System.out.println(list1);
       
       Iterator<String> it = list1.iterator();
       
       while(it.hasNext()){
           String actual = it.next();
           if (actual.equals("Gyula"))
               it.remove();
           System.out.println(it.next());
           
           
       }*/
   
    }
}
