package maxCode;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Max {

    public void read(String filename){
        Scanner lecteur ;
        try {
            File fichier = new File(filename);
            lecteur = new Scanner(fichier);

            int nbr_photo = lecteur.nextInt(); //nombre de photo dans le fichier

            int id_photo = lecteur.nextInt();
            int nbr_tags = lecteur.nextInt();

            for (int a = 0; a < nbr_photo; a++) {
                String or = lecteur.next();
                Photo n = new Photo(id_photo,or , nbr_tags, null);

                for (int i = 0; i < nbr_tags; i++) {
                    String s;
                    s = lecteur.next();
                    n.getTags()[i] = s;
                }

                id_photo++;
                nbr_tags = 0;
            }
        }catch(IOException e){
            System.out.println("[ERROR]:"+e.getMessage());
        }
    }
}
