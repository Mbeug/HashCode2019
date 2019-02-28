import damsCode.Dams;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static class Photo{
        public String [] tags;
        public String orientation;
        public int id;
    }

    public static void main(String[] args) throws FileNotFoundException {
        java.util.Scanner lecteur ;

        java.io.File fichier = new java.io.File(args[0]);
        lecteur = new java.util.Scanner(fichier);

        int nbr_photo = lecteur.nextInt(); //nombre de photo dans le fichier

        int id_photo = 0;
        int nbr_tags = 0;

        for (int a = 0; a <= nbr_photo; a++) {
            Photo n = new Photo();
            n.id = id_photo;
            n.orientation = lecteur.next();

            //création tableau pour les tags
            n.tags = new String[nbr_tags];

            for (int i = 0; i < nbr_tags; i++) {
                String s = new String();
                s = lecteur.next();
                n.tags[i] = s;
            }

            id_photo++;
            nbr_tags = 0;
        }
    }
}
