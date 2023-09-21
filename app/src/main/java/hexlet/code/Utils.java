package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int START_RANGE = 0;
    public static final int END_RANGE = 101;
    public static final Random RANDOM = new Random();

    public static int getRandomNumber(int startRange, int endRange) {
        return RANDOM.nextInt(startRange, endRange);
    }
}
