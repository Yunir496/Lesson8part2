public class Keyboard {
   private TypeKeyboard typeKeyboard;
   private Illumination illumination;
   private double weight;

    public Keyboard(TypeKeyboard typeKeyboard, Illumination illumination, double weight) {
        this.typeKeyboard = typeKeyboard;
        this.illumination = illumination;
        this.weight = weight;
    }

    public TypeKeyboard getTypeKeyboard() {
        return typeKeyboard;
    }

    public void setTypeKeyboard(TypeKeyboard typeKeyboard) {
        this.typeKeyboard = typeKeyboard;
    }

    public Illumination getIllumination() {
        return illumination;
    }

    public void setIllumination(Illumination illumination) {
        this.illumination = illumination;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
