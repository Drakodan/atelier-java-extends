import java.util.ArrayList;
import java.util.List;

class Arena {

    public static void main(String[] args) {
        
        // create two monsters
        Monster machin = new AirMonster("machin", 2);
        Monster truc = new WaterMonster("truc", 8);

        // monsters attack each other
        while (machin.getLife() > 0 && truc.getLife() > 0) {
            machin.attack(truc);
            if (truc.getLife() > 0) {
                truc.attack(machin);
            }
        }
    }
}