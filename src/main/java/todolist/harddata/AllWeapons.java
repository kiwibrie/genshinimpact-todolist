package todolist.harddata;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AllWeapons {
    Map<String, Map<String, String>> weapons;

    public AllWeapons(){
        weapons = new HashMap<>();
        readFile();
    }

    private void readFile(){
        Scanner reader = new Scanner(String.valueOf(getClass().getResource("weapons.txt")));

        if(reader.nextLine().equals("NAME/IMAGE/STARS/SUBSTAT/PASSIVE")){
            while(reader.hasNextLine()){
                Map<String, String> weapondata = new HashMap<>();

                String name = reader.nextLine();
                weapondata.put("image", reader.nextLine());
                weapondata.put("stars", reader.nextLine());
                weapondata.put("substat", reader.nextLine());
                weapondata.put("passive", reader.nextLine());

                weapons.put(name, weapondata);
            }
        }
        reader.close();
    }
}

