public class HardDrive {
    private VarHD varHD;
    private int volume;
    private double weight;

    public HardDrive(VarHD varHD, int volume, double weight) {
        this.varHD = varHD;
        this.volume = volume;
        this.weight = weight;
    }

    public VarHD getVarHD() {
        return varHD;
    }

    public void setVarHD(VarHD varHD) {
        this.varHD = varHD;
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
