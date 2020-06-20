import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SolutionA {
    public static void main(String[] args) {
        //minimumTime(4, new ArrayList<Integer>(){20, 4, 8, 2});
    }

    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static int minimumTime(int numOfParts, List<Integer> parts)
    {
        int totalTime = 0;

        while(numOfParts >= 2) {
            Collections.sort(parts, Collections.reverseOrder());
            int bigPartSize = parts.get(parts.size() - 1) + parts.get(parts.size() - 2);
            totalTime += bigPartSize;
            parts.remove(parts.size() - 1);
            parts.set(parts.size() - 1, totalTime);
        }

        return totalTime;

    }
}
