package antoineTests;

import antoineCode.SlideShow;
import maxCode.Photo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;


class AntoineTests {

    @Test
    void testToString(){
        ArrayList<Photo> array = new ArrayList<>();
        String[] tags = new String[2];
        tags[0] = "cat";
        tags[1] = "garden";
        Photo photo = new Photo(0, "H", 2, tags);
        array.add(photo);
        SlideShow slideShow = new SlideShow(1, array);

        System.out.println(slideShow.toString());

        assertEquals("1\n0", slideShow.toString());
    }

    @Test
    void testToStringHashCode(){
        ArrayList<Photo> array = new ArrayList<>();
        String[] tags0 = {"cat", "beach", "sun"};
        String[] tags1 = {"selfie", "smile"};
        String[] tags2 = {"garden", "selfie"};
        String[] tags3 = {"garden", "cat"};
        Photo photo0 = new Photo(0, "H", 3, tags0);
        Photo photo1 = new Photo(1, "V", 2, tags1);
        Photo photo2 = new Photo(2, "V", 2, tags2);
        Photo photo3 = new Photo(3, "H", 2, tags3);
        array.add(photo0);
        array.add(photo3);
        array.add(photo1);
        array.add(photo2);
        SlideShow slideShow = new SlideShow(3, array);

        System.out.println(slideShow.toString());

        assertEquals("3\n0\n3\n1 2", slideShow.toString());
    }
}
