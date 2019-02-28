package maxCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Max {

    public Photo[] read(String filename){
        Scanner scan= null;
        Photo tab_photo []=null;
        try {
            scan = new Scanner(new File(filename));


            int id_photo = 0;

            int nbr_photo = scan.nextInt();

           tab_photo = new Photo[nbr_photo];

            while (scan.hasNextLine() && id_photo < nbr_photo) {
                String line = scan.nextLine();
                if (line.length()>0){
                    String [] tab = line.split(" ");
                    Photo p = new Photo(id_photo, tab[0], Integer.parseInt(tab[1]),null );

                    String[] tags= new String[p.getNbrTags()];

                    int idx = 0;
                    for(int i = 2; i <tab.length; i++){
                        tags[idx] = tab[i];
                        idx++;
                    }
                    p.setTags(tags);
                    tab_photo[id_photo] = p;

                    id_photo++;}

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return tab_photo;
    }
}
