package todolist.datatypes;

public class Character {
    String name;
    int stars;
    String vision;
    String weapontype;

    String ascension_mat1;
    String ascension_mat2;
    String ascension_mat3;
    String ascension_mat4;

    String talent_mat1;
    String talent_mat2;
    String talent_mat3;

    boolean weapon;
    boolean flower;
    boolean feather;
    boolean sands;
    boolean goblet;
    boolean circlet;

    public Character(String name, String stars, String vision, String weapontype,
                     String amat1, String amat2, String amat3, String amat4,
                     String tmat1, String tmat2, String tmat3){
        setName(name);
        setStars(stars);
        setVision(vision);
        setWeaponType(weapontype);
        setAscensionMaterial1(amat1);
        setAscensionMaterial2(amat2);
        setAscensionMaterial3(amat3);
        setAscensionMaterial4(amat4);
        setTalentMaterial1(tmat1);
        setTalentMaterial2(tmat2);
        setTalentMaterial3(tmat3);
        setWeapon(false);
        setFlower(false);
        setFeather(false);
        setFeather(false);
        setSands(false);
        setGoblet(false);
        setCirclet(false);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(String stars) {
        if(!stars.equals("")){
            this.stars = Integer.parseInt(stars);
        }
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        if(vision.equals("anemo") || vision.equals("geo") || vision.equals("electro") ||
                vision.equals("dendro") || vision.equals("hydro") || vision.equals("pyro") ||
                vision.equals("cryo")){
            this.vision = vision;
        }
    }

    public String getWeaponType() {
        return weapontype;
    }

    private void setWeaponType(String weapontype) {
        if(vision.equals("sword") || vision.equals("bow") || vision.equals("claymore") ||
                vision.equals("polearm") || vision.equals("catalyst")){
            this.weapontype = weapontype;
        }
    }

    public String getAscensionMaterial1() {
        return ascension_mat1;
    }

    public void setAscensionMaterial1(String ascension_mat1) {
        this.ascension_mat1 = ascension_mat1;
    }

    public String getAscensionMaterial2() {
        return ascension_mat2;
    }

    public void setAscensionMaterial2(String ascension_mat2) {
        this.ascension_mat2 = ascension_mat2;
    }

    public String getAscensionMaterial3() {
        return ascension_mat3;
    }

    public void setAscensionMaterial3(String ascension_mat3) {
        this.ascension_mat3 = ascension_mat3;
    }

    public String getAscensionMaterial4() {
        return ascension_mat4;
    }

    public void setAscensionMaterial4(String ascension_mat4) {
        this.ascension_mat4 = ascension_mat4;
    }

    public String getTalentMaterial1() {
        return talent_mat1;
    }

    public void setTalentMaterial1(String talent_mat1) {
        this.talent_mat1 = talent_mat1;
    }

    public String getTalentMaterial2() {
        return talent_mat2;
    }

    public void setTalentMaterial2(String talent_mat2) {
        this.talent_mat2 = talent_mat2;
    }

    public String getTalentMaterial3() {
        return talent_mat3;
    }

    public void setTalentMaterial3(String talent_mat3) {
        this.talent_mat3 = talent_mat3;
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
