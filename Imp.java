import java.util.HashMap;

public class Imp extends Monster{
    Imp(HashMap<String, Integer> items, Integer xp, Object maxHP) {
        super(items, xp, maxHP);
    }

  @Override
    public String toString(){
        return "Imp has :"+ super.toString();
  }
}
