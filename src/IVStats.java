import java.util.Random;

public class IVStats {
    private int IVHP;
    private int IVAtt;
    private int IVDef;
    private int IVSpA;
    private int IVSpD;
    private int IVSpe;

    public IVStats() {
        Random rand = new Random();
        IVHP = rand.nextInt(0, 32);
        IVAtt = rand.nextInt(0, 32);
        IVDef = rand.nextInt(0, 32);
        IVSpA = rand.nextInt(0, 32);
        IVSpD = rand.nextInt(0, 32);
        IVSpe = rand.nextInt(0, 32);
    }

    public IVStats(boolean min) {
        if (min) IVHP = IVAtt = IVDef = IVSpA = IVSpD = IVSpe = 0;
        else IVHP = IVAtt = IVDef = IVSpA = IVSpD = IVSpe = 31;
    }

    public int getIVHP() {
        return IVHP;
    }

    public void setIVHP(int IVHP) {
        this.IVHP = IVHP;
    }

    public int getIVAtt() {
        return IVAtt;
    }

    public void setIVAtt(int IVAtt) {
        this.IVAtt = IVAtt;
    }

    public int getIVDef() {
        return IVDef;
    }

    public void setIVDef(int IVDef) {
        this.IVDef = IVDef;
    }

    public int getIVSpA() {
        return IVSpA;
    }

    public void setIVSpA(int IVSpA) {
        this.IVSpA = IVSpA;
    }

    public int getIVSpD() {
        return IVSpD;
    }

    public void setIVSpD(int IVSpD) {
        this.IVSpD = IVSpD;
    }

    public int getIVSpe() {
        return IVSpe;
    }

    public void setIVSpe(int IVSpe) {
        this.IVSpe = IVSpe;
    }

    public String toString() {
        return "\nHP: " + getIVHP() + " | ATK: " + getIVAtt() + " | DEF: " + getIVDef() + " | SP.ATK: " + getIVSpA() +
                " | SP.DEF: " + getIVSpD() + " | SPE: " + getIVSpe();
    }
}
