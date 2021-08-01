package todolist.datatypes;

public class ToDoCharacter{
    Character character;
    boolean weapon;
    boolean flower;
    boolean feather;
    boolean sands;
    boolean goblet;
    boolean circlet;
    boolean built;

    public ToDoCharacter(Character character) {
        this.character = character;
        setWeapon(false);
        setFlower(false);
        setFeather(false);
        setSands(false);
        setGoblet(false);
        setCirclet(false);
        this.built = false;
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

    public boolean isBuilt(){
        if(isWeapon() && isFlower() && isFeather() && isSands() && isGoblet() && isCirclet()){
            this.built = true;
        }
        return this.built;
    }
}
