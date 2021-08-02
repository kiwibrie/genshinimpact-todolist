package todolist;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    List<ToDoCharacter> list;

    public ToDoList(){
        this.list = new ArrayList<>();
    }

    public void addCharacter(Character character){
        ToDoCharacter tdchar = new ToDoCharacter(character);
        list.add(tdchar);
    }

    public List<ToDoCharacter> sortByVision(String key){
        List<ToDoCharacter> sortedlist = new ArrayList<>();
        for (ToDoCharacter toDoCharacter : list) {
            if (toDoCharacter.character.getVision().equals(key)) {
                sortedlist.add(toDoCharacter);
            }
        }
        return sortedlist;
    }

    public List<ToDoCharacter> sortByWeaponType(String key){
        List<ToDoCharacter> sortedlist = new ArrayList<>();
        for (ToDoCharacter toDoCharacter : list) {
            if (toDoCharacter.character.getWeaponType().equals(key)) {
                sortedlist.add(toDoCharacter);
            }
        }
        return sortedlist;
    }
}
