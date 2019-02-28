package maxTests;

import maxCode.Max;
import maxCode.Photo;
import org.junit.jupiter.api.Test;

public class MaxTests {

    @Test
    void readTest(){
        Max m = new Max();
        Photo[] photos =m.read("/Users/maximebeugoms/Documents/Travaux_ecole/2018-2019/Q2/HashCode2019/hashCode2019/src/a_example.txt");
        for (Photo p :photos) {
            System.out.println(p);
        }
    }

}
