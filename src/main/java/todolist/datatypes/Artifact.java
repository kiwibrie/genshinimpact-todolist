package todolist.datatypes;

import todolist.Item;

import java.util.List;

public class Artifact extends Item {
    String artifact_piece;
    List<String> main_stat;
    String two_piece_desc;
    String four_piece_desc;

    public Artifact(String name, String notes, String img, String stars, String piece,
                    List<String> mainstats, String twodesc, String fourdesc){
        setType("Artifact");
        setName(name);
        setNotes(notes);
        setImage(img);
        setStars(stars);
        setArtifactPiece(piece);
        setMainStat(mainstats);
        setTwoPieceDesc(twodesc);
        setFourPieceDesc(fourdesc);
    }

    public void setArtifactPiece(String artifact_type) {
        this.artifact_piece = artifact_type;
    }

    public String getArtifactPiece() {
        return artifact_piece;
    }

    public void setMainStat(List<String> main_stat) {
        this.main_stat = main_stat;
    }

    public String getMainStat() {
        return formatMainStat();
    }

    public void setTwoPieceDesc(String two_piece_desc) {
        this.two_piece_desc = two_piece_desc;
    }

    public String getTwoPieceDesc() {
        return two_piece_desc;
    }

    public void setFourPieceDesc(String four_piece_desc) {
        this.four_piece_desc = four_piece_desc;
    }

    public String getFourPieceDesc() {
        return four_piece_desc;
    }

    private String formatMainStat(){
        String temp = "";
        for(int i = 0; i < main_stat.size(); i++){
            temp = temp.concat(main_stat.get(i));
            if(main_stat.get(i+1) == null){
                break;
            }
            temp = temp.concat("/");
        }
        return temp;
    }
}
