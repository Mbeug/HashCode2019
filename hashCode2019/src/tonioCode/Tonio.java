package tonioCode;
import maxCode.Photo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tonio {

    static ArrayList<Photo> PhotoList = new ArrayList<>();
    static Map<String, Integer> map = new HashMap<String, Integer>();

    public static void main(String[] args) {
        // EXAMPLE
        String [] a = {"a","b","a"};
        String [] b = {"c","b"};
        PhotoList.add(new Photo(0,"H",2,a));
        PhotoList.add(new Photo(1,"H",2,b));

        // USAGE
        PhotoList.forEach((n) -> putTag(n));
        System.out.print("done");
    }

    public static void putTag(Photo photo) {
        String[] tag = photo.getTags();
        for (int i = 0; i < tag.length; i++) {
            if (map.containsKey(tag[i])) { // in
                int val = map.get(tag[i]);
                // remove
                map.remove(tag[i]);
                // put
                val++;
                map.put(tag[i], val);
                System.out.print(val);
            } else {       // in
                map.put(tag[i], 1);
            }
        }
    }
}