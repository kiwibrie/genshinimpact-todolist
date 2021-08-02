package todolist;

public class Character {
    String image = "character.png";
    String name = "N/A";
    int stars = 3;
    String vision = "N/A";
    String weapontype = "N/A";

    public Character(String image, String name, String stars, String vision, String weapontype){
        setImage(image);
        setName(name);
        setStars(stars);
        setVision(vision);
        setWeaponType(weapontype);
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        if (image.endsWith(".png")){
            this.image = image;
        }
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
        if(vision.equals("pyro") || vision.equals("hydro") || vision.equals("anemo") || vision.equals("electro")
                || vision.equals("dendro") || vision.equals("cryo") || vision.equals("geo")){
            this.vision = vision;
        }
    }

    public String getWeaponType() {
        return weapontype;
    }

    public void setWeaponType(String weapontype) {
        if(weapontype.equals("sword") || weapontype.equals("bow") || weapontype.equals("catalyst")
                || weapontype.equals("claymore") || weapontype.equals("polearm")){
            this.weapontype = weapontype;
        }
    }
}
