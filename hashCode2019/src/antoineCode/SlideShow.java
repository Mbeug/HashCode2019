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
        String result = Integer.toString(nb_slide);
        for (Object photo : photos) {
            Photo temp = (Photo) photo;
            result = result.concat("\n" + temp.getId());
        }
        return result;
    }
}
