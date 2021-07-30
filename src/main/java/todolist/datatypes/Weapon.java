package todolist.datatypes;

import todolist.Item;

public class Weapon extends Item {
    String main_stat;
    String sub_stat;

    String passive_name;
    String passive_desc;

    public Weapon(String name, String desc, String stars, String mstat, String sstat, String pname, String pdesc){
        setType("Weapon");
        setName(name);
        setDesc(desc);
        setStars(stars);
        setMainStat(mstat);
        setSubStat(sstat);
        setPassiveName(pname);
        setPassiveDesc(pdesc);
    }

    public void setMainStat(String main_stat) {
        this.main_stat = main_stat;
    }

    public String getMainStat() {
        return main_stat;
    }

    public void setSubStat(String sub_stat) {
        this.sub_stat = sub_stat;
    }

    public String getSubStat() {
        return sub_stat;
    }

    public void setPassiveName(String passive_name) {
        this.passive_name = passive_name;
    }

    public String getPassiveName() {
        return passive_name;
    }

    public void setPassiveDesc(String passive_desc) {
        this.passive_desc = passive_desc;
    }

    public String getPassiveDesc() {
        return passive_desc;
    }
}
