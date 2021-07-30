package todolist;

public class Item {
    String name;
    String notes;

    String image_path; //todo void image
    int stars = 3;
    String type;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }

    public void setImage(String image_path) {
        if(!image_path.equals("")){
            this.image_path = image_path;
        }
    }

    public String getImagePath() {
        return image_path;
    }

    public void setStars(String stars) {
        if(!stars.equals("")){
            this.stars = Integer.parseInt(stars);
        }
    }

    public int getStars() {
        return stars;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
