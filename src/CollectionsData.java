import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CollectionsData {
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();

        List<Integer> alist = new ArrayList<>();


        alist.add(8);
        alist.add(9);
        alist.add(10);
        alist.add(1);
        alist.add(5);
        alist.add(6);
        Integer[] arr = alist.toArray(new Integer[0]);
//        for (int i : arr) {
//            System.out.println(i);
//        }

        List<Integer> alist1 = alist.subList(1,6);

        alist1.set(0,15);
//        System.out.println(alist);
//        System.out.println(alist1);



//        Iterator<Integer> iterator = list.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        for (int i : list) {
//            System.out.println(i);
//        }

        List<Integer> lk = new LinkedList<>();

        lk.add(1);
        lk.add(2);
        lk.add(6);

        ListIterator<Integer> iterator = lk.listIterator();

//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.previous());

        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(6);

//        System.out.println(q.peek());
//        System.out.println(q.poll());
//        System.out.println(q.peek());

//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(6);
//
//        while (!stack.isEmpty()){
//            System.out.println(stack.peek());
//            stack.pop();
//        }


//        Deque<Integer> dq = new ArrayDeque<>();
//
//        dq.offerLast(1);
//        dq.offerLast(6);
//
//        System.out.println(dq);
//
//        dq.pollFirst();
//        dq.peek();
//
//        System.out.println(dq);




//        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
//
//        pq.offer(1);
//        pq.offer(2);
//        pq.offer(6);
//
//
//
//        List<Integer> top2 = new ArrayList<>();
//        int index = 0;
//        while (!pq.isEmpty()) {
//
//            if (index==2){
//               break;
//            }
//            top2.add(pq.poll());
//            index++;
//        }
//
//        System.out.println(top2);
//        System.out.println(pq);
//

//        List<StudentMarks> studentMarks = new ArrayList<>();
//
//        studentMarks.add(new StudentMarks(90,100));
//        studentMarks.add(new StudentMarks(70,80));
//        studentMarks.add(new StudentMarks(80,90));
//        studentMarks.add(new StudentMarks(50,60));
//        studentMarks.add(new StudentMarks(100,96));
//        studentMarks.add(new StudentMarks(96,100));
//
//
//        PriorityQueue<StudentMarks> pq1 = new PriorityQueue<StudentMarks>((s2, s1)-> {
//
//            System.out.println("Comparator compareTo called");
//            return s2.getMath() - s1.getMath();
//        });
//
//        for (StudentMarks sm: studentMarks) {
//            pq1.add(sm);
//        }
//
//        List<StudentMarks> top3 = new ArrayList<>();
//        int index = 0;
//        while (!pq1.isEmpty()) {
//
//            if (index==3){
//                break;
//            }
//            top3.add(pq1.poll());
//            index++;
//        }
//
//
//        System.out.println(top3);
//        System.out.println(pq1);
//
//        Set<Integer> set = new HashSet<>(alist);
//
//        SortedSet<Integer> sortedSet = new TreeSet<>();


        Map<String, Integer> map = new HashMap<>();

        map.put("Rajat", 15);
        map.put("Shiya", 28);

//        System.out.println(map.getOrDefault("dsk",0));

        Map<Integer, List<Integer>> adj = new HashMap<>();

//         if(adj.get(1) == null)
//             adj.put(1, new ArrayList<>());
//         adj.get(1).add(2);

//        adj.computeIfAbsent(1, f->new ArrayList<>()).add(2);

//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

//        for (Map.Entry<String, Integer> entry: entrySet) {
//            System.out.println(entry.getKey()+","+ entry.getValue());
//        }

        Set<String> keySet = map.keySet();

//        for (String key: keySet) {
//            System.out.println(key+","+ map.get(key));
//        }

//        NavigableMap<Integer, String> tmap = new TreeMap<>((a,b)->b-a);
//
//        tmap.put(15, "Rajat");
//        tmap.put(28, "Shiya");
//
//        System.out.println(tmap);
//
//        Set<Map.Entry<Integer, String>> entrySet = tmap.entrySet();
//
//        for (Map.Entry<Integer, String> entry: entrySet) {
//            System.out.println(entry.getKey()+","+ entry.getValue());
//        }

        Integer[] arr1 = new Integer[] {1,2,0};
        Arrays.sort(arr1);

        List<Integer> arlist = Arrays.asList(arr1);

//        Collections.binarySearch();
    }

}
