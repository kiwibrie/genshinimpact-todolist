import todolist.Character;
import todolist.DepthCharacter;
import todolist.ToDoCharacter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterArchive {
    List<DepthCharacter> list;

    public CharacterArchive(){
        this.list = readFile();
    }

    private List<DepthCharacter> readFile(){
        List<DepthCharacter> list = new ArrayList<>();

        Scanner scanner = new Scanner(String.valueOf(getClass().getResource("characters.txt")));
        if(scanner.nextLine().equals("NAME/STARS/AMAT1/AMAT2/AMAT3/AMAT4/TMAT1/TMAT2/TMAT3")){
            while(scanner.hasNextLine()){

                String name = scanner.nextLine();
                String[] baseinfo = scanner.nextLine().split(" ");
                String[] mat = scanner.nextLine().split("\t");

                int[] hp = new int[10], atk = new int[10], def = new int[10], em = new int[10];
                double[] cr = new double[10], cd = new double[10];
                for(int i = 0; i < 11; i++){
                     hp[i] = Integer.parseInt(scanner.next());
                     atk[i] = Integer.parseInt(scanner.next());
                     def[i] = Integer.parseInt(scanner.next());
                     em[i] = Integer.parseInt(scanner.next());
                     cr[i] = Double.parseDouble(scanner.next());
                     cd[i] = Double.parseDouble(scanner.next());
                }

                DepthCharacter chara = new DepthCharacter(name+".png", name,
                        baseinfo[0], baseinfo[1], baseinfo[2],
                        hp, atk, def, em, cr, cd,
                        mat[0], mat[1], mat[2], mat[3], mat[3], mat[4], mat[5]);
                list.add(chara);
            }
        }
        return list;
    }

    public List<Character> sortByVision(String key){
        List<Character> sortedlist = new ArrayList<>();
        for (DepthCharacter depthCharacter : list) {
            if (depthCharacter.getVision().equals(key)) {
                sortedlist.add(depthCharacter);
            }
        }
        return sortedlist;
    }

    public List<Character> sortByWeaponType(String key){
        List<Character> sortedlist = new ArrayList<>();
        for (DepthCharacter depthCharacter : list) {
            if (depthCharacter.getWeaponType().equals(key)) {
                sortedlist.add(depthCharacter);
            }
        }
        return sortedlist;
    }
}
