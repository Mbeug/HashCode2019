package antoineTests;

import antoineCode.SlideShow;
import maxCode.Photo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;


public class AntoineTests {

    @Test
    public void testToString(){
        ArrayList<Photo> array = new ArrayList<>();
        String[] tags = new String[2];
        tags[0] = "cat";
        tags[1] = "garden";
        Photo photo = new Photo(0, "v", 2, tags);
        array.add(photo);
        SlideShow slideShow = new SlideShow(1, array);

        System.out.println(slideShow.toString());

        assertEquals("1\n0", slideShow.toString());

    }
}
