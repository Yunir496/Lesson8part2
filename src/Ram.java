public class Ram {
    private VarRam varRam;
    private int volume;
    private double weight;

    public Ram(VarRam varRam, int volume, double weight) {
        this.varRam = varRam;
        this.volume = volume;
        this.weight = weight;
    }

    public VarRam getVarRam() {
        return varRam;
    }

    public void setVarRam(VarRam varRam) {
        this.varRam = varRam;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
