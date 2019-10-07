import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Driver {
    public static void main(String[] args){
        HashMap<String,Integer> items= new HashMap<>();
        items.put("gold",5);
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Imp(items, 15, 20));
        monsters.add(new Kobold(items, 1, 5));

        for(Monster m: monsters){
            System.out.println(m);
        }
    }
}
