import java.util.HashMap;

public class Kobold extends Monster {

    Kobold(HashMap<String, Integer> items, Integer xp, Object maxHP) {
        super(items, xp, maxHP);
    }
    @Override
    public String toString(){
        return "Imp has :"+ super.toString();
    }
}
