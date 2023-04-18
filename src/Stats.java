import java.util.Hashtable;

public class Stats {
    private Hashtable<String, Integer> stats;

    public Stats(BaseStats baseStats, IVStats IVs, String nature, int level) {
        stats = new Hashtable<>();
        stats.put("HP", calcHP(baseStats.getBaseHP(), IVs.getIVHP(), level));
        stats.put("ATTACK", calcStat("ATTACK", baseStats.getBaseAtt(), IVs.getIVAtt(), nature, level));
        stats.put("DEFENSE", calcStat("DEFENSE", baseStats.getBaseDef(), IVs.getIVDef(), nature, level));
        stats.put("SP.ATK", calcStat("SP.ATK", baseStats.getBaseSpA(), IVs.getIVSpA(), nature, level));
        stats.put("SP.DEF", calcStat("SP.DEF", baseStats.getBaseSpD(), IVs.getIVSpD(), nature, level));
        stats.put("SPEED", calcStat("SPEED", baseStats.getBaseSpe(), IVs.getIVSpe(), nature, level));
    }

    public int calcHP(int baseHP, int IV, int level) {
        return (((2 * baseHP + IV) * level) / 100) + level + 10;
    }

    public int calcStat(String statName, int baseStat, int IV, String nature, int level) {
        int stat = ((((2 * baseStat + IV) * level) / 100) + 5);
        switch (statName) {
            case "ATTACK" -> {
                switch (nature) {
                    case "ADAMANT", "LONELY", "BRAVE", "NAUGHTY" -> stat *= 1.1;
                    case "BOLD", "TIMID", "MODEST", "CALM" -> stat *= 0.9;
                }
                return stat;
            }
            case "DEFENSE" -> {
                switch (nature) {
                    case "BOLD", "RELAXED", "IMPISH", "LAX" -> stat *= 1.1;
                    case "HASTY", "MILD", "GENTLE", "LONELY" -> stat *= 0.9;
                }
                return stat;
            }
            case "SP.ATK" -> {
                switch (nature) {
                    case "MODEST", "MILD", "QUIET", "RASH" -> stat *= 1.1;
                    case "ADAMANT", "IMPISH", "JOLLY", "CAREFUL" -> stat *= 0.9;
                }
                return stat;
            }
            case "SP.DEF" -> {
                switch (nature) {
                    case "CALM", "GENTLE", "SASSY", "CAREFUL" -> stat *= 1.1;
                    case "NAUGHTY", "LAX", "NAIVE", "RASH" -> stat *= 0.9;
                }
                return stat;
            }
            case "SPEED" -> {
                switch (nature) {
                    case "TIMID", "HASTY", "JOLLY", "NAIVE" -> stat *= 1.1;
                    case "BRAVE", "RELAXED", "QUIET", "SASSY" -> stat *= 0.9;
                }
                return stat;
            }
            default -> {
                return stat;
            }
        }
    }

    public String toString() {
        return "HP: " + stats.get("HP") + " | ATK: " + stats.get("ATTACK") + " | DEF: " + stats.get("DEFENSE") +
                " | SP.ATK " + stats.get("SP.ATK") + " | SP.DEF " + stats.get("SP.DEF") + " | SPE: " + stats.get("SPEED");
    }
}
