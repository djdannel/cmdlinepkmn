public class Pokemon {
    private String name;
    private String type1;
    private String type2;
    private String ability;
    private int level;
    private IVStats IVStats;
    private String nature;
    private BaseStats baseStats;
    private Stats stats;

    public Pokemon(String name, String type1, String type2, String ability, int level, BaseStats baseStats) {
        setName(name);
        setType1(type1);
        setType2(type2);
        setAbility(ability);
        setLevel(level);

        IVStats = new IVStats();
        nature = Nature.rollNature();
        stats = new Stats(baseStats, IVStats, nature, level);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public String getTyping() {
        if (type2.equals("")) return type1;
        else return type1 + ", " + type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public IVStats getIVStats() {
        return IVStats;
    }

    public void setIVStats(IVStats IVStats) {
        this.IVStats = IVStats;
    }

    public String toString() {
        return "-----INFO-----\n" + getName() + " | " + getTyping() + " | " + getAbility() + " | " + "Level: " + getLevel() + " | " +
                "Nature: " + getNature() + "\n-----IVs-----" + getIVStats() + "\n-----STATS-----\n" + stats;
    }
}
