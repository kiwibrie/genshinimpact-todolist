package todolist;

import todolist.datatypes.Artifact;
import todolist.datatypes.Weapon;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    List<Item> todolist;

    public ToDoList(){
        this.todolist = new ArrayList<>();
    }

    public void addArtifact(String name, String desc, String img, String stars, String piece, List<String> mainstats, String twodesc, String fourdesc){
        Artifact artifact = new Artifact(name, desc, img, stars, piece, mainstats, twodesc, fourdesc);
        todolist.add(artifact);
    }

    public void addWeapon(String name, String desc, String stars, String mstat, String sstat, String pname, String pdesc, String img){
        Weapon weapon = new Weapon(name, desc, stars, mstat, sstat, pname, pdesc);
        weapon.setImagePath(img);
        todolist.add(weapon);
    }

    public void deleteItem(Item item){
        todolist.remove(item);
    }

    public List<Item> sortByType(String type_key){
        List<Item> sortedlist = new ArrayList<>();
        for (Item item : todolist) {
            if (item.type.equals(type_key)) {
                sortedlist.add(item);
            }
        }
        return sortedlist;
    }
}
