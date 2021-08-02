package todolist;

public class DepthCharacter extends Character{
    int[] hp;
    int[] atk;
    int[] def;
    int[] em;
    double[] cr;
    double[] cd;

    String ascensionmaterial1, ascensionmaterial2, ascensionmaterial3, ascensionmaterial4;
    String talentmaterial1, talentmaterial2, talentmaterial3;

    public DepthCharacter(String image, String name, String stars, String vision, String weapontype,
                          int[] hp, int[] atk, int[] def, int[] em, double[] cr, double[] cd,
                          String ascmat1, String ascmat2, String ascmat3, String ascmat4,
                          String talmat1, String talmat2, String talmat3){
        super(image, name, stars, vision, weapontype);
        setHP(hp);
        setATK(atk);
        setDEF(def);
        setEM(em);
        setCR(cr);
        setCD(cd);

        this.ascensionmaterial1 = ascmat1;
        this.ascensionmaterial2 = ascmat2;
        this.ascensionmaterial3 = ascmat3;
        this.ascensionmaterial4 = ascmat4;
        this.talentmaterial1 = talmat1;
        this.talentmaterial2 = talmat2;
        this.talentmaterial3 = talmat3;
    }

    public int[] getHP() {
        return hp;
    }

    public void setHP(int[] hp) {
        this.hp = hp;
    }

    public int[] getATK() {
        return atk;
    }

    public void setATK(int[] atk) {
        this.atk = atk;
    }

    public int[] getDEF() {
        return def;
    }

    public void setDEF(int[] def) {
        this.def = def;
    }

    public int[] getEM() {
        return em;
    }

    public void setEM(int[] em) {
        this.em = em;
    }

    public double[] getCR() {
        return cr;
    }

    public void setCR(double[] cr) {
        this.cr = cr;
    }

    public double[] getCD() {
        return cd;
    }

    public void setCD(double[] cd) {
        this.cd = cd;
    }
}
