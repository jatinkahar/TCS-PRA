import java.util.*;
public class hmp{
    public static void main(String[] args){
        HashMap<Integer,String> map=new HashMap<>();
                map.put(3,"kartik");

        map.put(1,"jatin");
        map.put(2,"rahul");
        map.put(3,"kartik");
        map.put(4,"jatin");
        map.put(1,"kahar");
        
        for(int i : map.keySet()){
            System.out.println(map.get(i));
        }


        Set<Map.Entry<Integer,String>> entries=map.entrySet();
        for(Map.Entry<Integer,String> entry :entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        // Set<Integer> keys=map.keySet();
        // for(int i : keys){
        //     System.out.println(map.get(i));
        // }
        // System.out.println(map.containsValue("jatin"));
        // System.out.println(map);
        // String s=map.get(4);
        // System.out.println(map.containsKey(4));
    }
}