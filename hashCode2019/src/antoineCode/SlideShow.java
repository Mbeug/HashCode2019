package antoineCode;

import maxCode.Photo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class representing a slide show.
 */
public class SlideShow {
    private int nb_slide;
    private ArrayList photos;

    /**
     * The constructor of the slide show.
     * @param nb_slide = the number of photos in the slide.
     * @param photos = the photos in the slide.
     */
    public SlideShow(int nb_slide, ArrayList photos){
        this.nb_slide = nb_slide;
        this.photos = photos;
    }

    public int getNb_slide(){
        return this.nb_slide;
    }

    public ArrayList getPhotos(){
        return this.photos;
    }

    public String optimizing(Photo p1, Photo p2) {
        if (p1.getOr().equals("V") && p2.getOr().equals("V")) {
            return p1.getOr() + p2.getOr();
        }
        return p1.getOr() + "\n" + p2.getOr();
    }
    @Override
    public String toString() {
        String result = Integer.toString(nb_slide);
        Iterator ite = photos.iterator();
        while (ite.hasNext()){
            Photo temp = (Photo) ite.next();
            if (ite.hasNext()) {
                Photo nextTemp = (Photo) ite.next();
                if (temp.getOr().equals("V") && nextTemp.getOr().equals("V")) {
                    result = result.concat("\n" + temp.getId() + " " + nextTemp.getId());
                }
                else {
                    result = result.concat("\n" + temp.getId() + "\n" + nextTemp.getId());
                }
            }
            else {
                result = result.concat("\n" + temp.getId());
            }
        }
        return result;
    }
}
