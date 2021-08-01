package todolist.datatypes;

import java.util.HashMap;
import java.util.Map;

public class Character {
    String name;
    int stars;
    String vision;
    String weapon;

    int level;
    int[] hp;
    int[] atk;
    int[] def;
    int[] elem;
    double[] critrate;
    double[] critdmg;

    String ascension_mat1;
    String ascension_mat2;
    String ascension_mat3;
    String ascension_mat4;

    String talent_mat1;
    String talent_mat2;
    String talent_mat3;

    public Character(String name, String stars, String vision, String weapon,
                     int[] hp, int[] atk, int[] def, int[] elem, double[] cr, double[] cd,
                     String ascmat1, String ascmat2, String ascmat3, String ascmat4,
                     String talmat1, String talmat2, String talmat3){
        setName(name);
        setStars(stars);
        setVision(vision);
        setWeapon(weapon);
        setLevel(1);
        setStats(hp, atk, def, elem, cr, cd);
        setAscensionMaterials(ascmat1, ascmat2, ascmat3, ascmat4);
        setTalentMaterials(talmat1, talmat2, talmat3);
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
        if(stars.length() == 1){
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

    public String getWeapon() {
        return weapon;
    }

    private void setWeapon(String weapon) {
        if(vision.equals("sword") || vision.equals("bow") || vision.equals("claymore") ||
                vision.equals("polearm") || vision.equals("catalyst")){
            this.weapon = weapon;
        }
    }

    public int getLevel(){
        return this.level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public Map<String, String> getStats(){
        Map<String, String> stats = new HashMap<>();
        stats.put("hp", String.valueOf(getHP()));
        stats.put("atk", String.valueOf(getATK()));
        stats.put("def", String.valueOf(getDEF()));
        stats.put("em", String.valueOf(getEM()));
        stats.put("cr", String.valueOf(getCritRate()));
        stats.put("cd", String.valueOf(getCritDamage()));
        return stats;
    }

    public void setStats(int[] hp, int[] atk, int[] def, int[] elem, double[] critrate, double[] critdmg){
        setHP(hp);
        setATK(atk);
        setDEF(def);
        setEM(elem);
        setCritRate(critrate);
        setCritDamage(critdmg);
    }

    public int getHP(){
        return this.hp[(getLevel() / 10)];
    }

    public void setHP(int[] health){
        this.hp = health;
    }

    public int getATK(){
        return this.atk[(getLevel() / 10)];
    }

    public void setATK(int[] attack){
        this.atk = attack;
    }

    public int getDEF(){
        return this.def[(getLevel() / 10)];
    }

    public void setDEF(int[] defense){
        this.def = defense;
    }

    public int getEM(){
        return this.elem[(getLevel() / 10)];
    }

    public void setEM(int[] elementalmastery){
        this.elem = elementalmastery;
    }

    public double getCritRate(){
        return this.critrate[(getLevel() / 10)];
    }

    public void setCritRate(double[] critrate){
        this.critrate = critrate;
    }

    public double getCritDamage(){
        return this.critdmg[(getLevel() / 10)];
    }

    public void setCritDamage(double[] critdamage){
        this.critdmg = critdamage;
    }

    public void setAscensionMaterials(String ascmat1, String ascmat2, String ascmat3, String ascmat4){
        setAscensionMaterial1(ascmat1);
        setAscensionMaterial2(ascmat2);
        setAscensionMaterial3(ascmat3);
        setAscensionMaterial4(ascmat4);
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

    public void setTalentMaterials(String talmat1, String talmat2, String talmat3){
        setTalentMaterial1(talmat1);
        setTalentMaterial2(talmat2);
        setTalentMaterial3(talmat3);
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
}
