import maxCode.Max;
import maxCode.Photo;
import tonioCode.Tonio;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)  {
        Max m = new Max();
        Photo[] photos =m.read("src/a_example.txt");
        ArrayList<Photo> photoList = new ArrayList<>();
        photoList.toArray(photos);
        photoList.forEach(Tonio::putTag);
        System.out.println("Done");

    }
}
