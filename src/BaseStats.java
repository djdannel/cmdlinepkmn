public class BaseStats {
    private int baseHP;
    private int baseAtt;
    private int baseDef;
    private int baseSpA;
    private int baseSpD;
    private int baseSpe;

    public BaseStats() {
        baseHP = baseAtt = baseDef = baseSpA = baseSpD = baseSpe = 100;
    }

    public BaseStats(int baseHP, int baseAtt, int baseDef, int baseSpA, int baseSpD, int baseSpe) {
        this.baseHP = baseHP;
        this.baseAtt = baseAtt;
        this.baseDef = baseDef;
        this.baseSpA = baseSpA;
        this.baseSpD = baseSpD;
        this.baseSpe = baseSpe;
    }

    public int getBaseHP() {
        return baseHP;
    }

    public void setBaseHP(int baseHP) {
        this.baseHP = baseHP;
    }

    public int getBaseAtt() {
        return baseAtt;
    }

    public void setBaseAtt(int baseAtt) {
        this.baseAtt = baseAtt;
    }

    public int getBaseDef() {
        return baseDef;
    }

    public void setBaseDef(int baseDef) {
        this.baseDef = baseDef;
    }

    public int getBaseSpA() {
        return baseSpA;
    }

    public void setBaseSpA(int baseSpA) {
        this.baseSpA = baseSpA;
    }

    public int getBaseSpD() {
        return baseSpD;
    }

    public void setBaseSpD(int baseSpD) {
        this.baseSpD = baseSpD;
    }

    public int getBaseSpe() {
        return baseSpe;
    }

    public void setBaseSpe(int baseSpe) {
        this.baseSpe = baseSpe;
    }
}
