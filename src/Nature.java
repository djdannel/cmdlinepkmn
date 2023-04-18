import java.util.Random;

public class Nature {
    static private final String[] natures = {"HARDY",
            "LONELY",
            "BRAVE",
            "ADAMANT",
            "NAUGHTY",
            "BOLD",
            "DOCILE",
            "RELAXED",
            "IMPISH",
            "LAX",
            "TIMID",
            "HASTY",
            "SERIOUS",
            "JOLLY",
            "NAIVE",
            "MODEST",
            "MILD",
            "QUIET",
            "BASHFUL",
            "RASH",
            "CALM",
            "GENTLE",
            "SASSY",
            "CAREFUL",
            "QUIRKY"};

    public static String rollNature() {
        Random rand = new Random();
        return natures[rand.nextInt(0, natures.length)];
    }
}
