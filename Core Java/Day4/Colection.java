import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
public class Colection {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);   
        nums.add(30);
        System.out.println(nums);
        List<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(50);
        list.add(70);
        list.add(50);
        list.add(40);
        System.out.println(list);
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", null);
        System.out.println(map);
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10){
                    return 1;
                } else return -1;
            }
        };
        Collections.sort(list, comp);
        System.out.println(list);
    }
}