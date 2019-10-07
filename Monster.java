import java.util.HashMap;

public abstract class Monster {
    private final HashMap<String, Integer> items;
    private final Integer xp;
    private final Object maxHP;

    Monster(HashMap<String, Integer> items, Integer xp, Object maxHP){
        this.items = items;
        this.xp = xp;
        this.maxHP = maxHP;
        int hp;



    }
    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        Object max = new Object();
        this.maxHP= max;
        Object hp = this.maxHP;
        this.xp=xp;
        this.items=items;
    }
}
