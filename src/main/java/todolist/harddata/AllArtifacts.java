package todolist.harddata;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AllArtifacts {
    Map<String, Map<String, String>> artifacts;

    public AllArtifacts(){
        artifacts = new HashMap<>();
        readFile();
    }

    private void readFile(){
        Scanner reader = new Scanner(String.valueOf(getClass().getResource("artifacts.txt")));

        if(reader.nextLine().equals("NAME/IMAGE/STARS/TWOPIECE/FOURPIECE")){
            while(reader.hasNextLine()){
                Map<String, String> artifactdata = new HashMap<>();

                String name = reader.nextLine();
                artifactdata.put("image", reader.nextLine());
                artifactdata.put("stars", reader.nextLine());
                artifactdata.put("twopiece", reader.nextLine());
                artifactdata.put("fourpiece", reader.nextLine());

                artifacts.put(name, artifactdata);
            }
        }
        reader.close();
    }
}
