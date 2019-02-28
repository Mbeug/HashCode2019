package antoineCode;

import maxCode.Photo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class representing a slide show.
 */
public class SlideShow {
    int nb_slide;
    ArrayList photos;

    /**
     * The constructor of the slide show.
     * @param nb_slide = the number of photos in the slide.
     * @param photos = the photos in the slide.
     */
    public SlideShow(int nb_slide, ArrayList photos){
        this.nb_slide = nb_slide;
        this.photos = photos;
    }

    @Override
    public String toString() {
        String result = nb_slide + "\n";
        for (Object photo : photos) {
            Photo temp = (Photo) photo;
            result = result.concat(Integer.toString(temp.getId())) + "\n";
        }
        return result;
    }
}
