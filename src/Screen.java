public class Screen {
 private int diagonal;
 private VarScreen varScreen;
 private double weight;

    public Screen(int diagonal, VarScreen varScreen, double weight) {
        this.diagonal = diagonal;
        this.varScreen = varScreen;
        this.weight = weight;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public VarScreen getVarScreen() {
        return varScreen;
    }

    public void setVarScreen(VarScreen varScreen) {
        this.varScreen = varScreen;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
