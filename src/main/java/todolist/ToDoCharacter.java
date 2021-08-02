package todolist;

public class ToDoCharacter {
    Character character;
    boolean weapon = false;
    boolean flower = false;
    boolean feather = false;
    boolean sands = false;
    boolean goblet = false;
    boolean circlet = false;

    public ToDoCharacter(Character chara){
        this.character = chara;
    }

    public boolean isWeapon() {
        return weapon;
    }

    public void setWeapon(boolean weapon) {
        this.weapon = weapon;
    }

    public boolean isFlower() {
        return flower;
    }

    public void setFlower(boolean flower) {
        this.flower = flower;
    }

    public boolean isFeather() {
        return feather;
    }

    public void setFeather(boolean feather) {
        this.feather = feather;
    }

    public boolean isSands() {
        return sands;
    }

    public void setSands(boolean sands) {
        this.sands = sands;
    }

    public boolean isGoblet() {
        return goblet;
    }

    public void setGoblet(boolean goblet) {
        this.goblet = goblet;
    }

    public boolean isCirclet() {
        return circlet;
    }

    public void setCirclet(boolean circlet) {
        this.circlet = circlet;
    }
}
