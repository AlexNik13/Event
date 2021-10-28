public class ApplicationProperties {

    private long nSec;
    private int nMassage;

    public ApplicationProperties(int nSec, int nMassage) {
        this.nSec = nSec;
        this.nMassage = nMassage;
    }

    public long getnSec() {
        return nSec;
    }

    public int getnMassage() {
        return nMassage;
    }


}
