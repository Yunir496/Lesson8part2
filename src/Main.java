public class Main {
    public static void main(String[] args) {

     Processor processor1 = new Processor(Frequency.FREQUENCY2000hg,Core.COREi3,Manufacturer.MSI,1.3);
     Processor processor2 = new Processor(Frequency.FREQUENCY3000hg,Core.COREi5,Manufacturer.APPLE,1.9);

     Ram ram1 = new Ram(VarRam.DDR2, 4, 0.8);
     Ram ram2 = new Ram(VarRam.DDR3,6,1.1);

     HardDrive hardDrive1 = new HardDrive(VarHD.HDD,160,2.5);
     HardDrive hardDrive2 = new HardDrive(VarHD.SSD,512,2.2);

     Screen screen1 = new Screen(15,VarScreen.VA,1.9);
     Screen screen2 = new Screen(17,VarScreen.IPS,1.7);

     Keyboard keyboard1 = new Keyboard(TypeKeyboard.Mechanical,Illumination.TRUE,2.1);
     Keyboard keyboard2 = new Keyboard(TypeKeyboard.Membrane,Illumination.TRUE,2.3);

     Computer computer1 = new Computer("Китай","Asus",processor1,ram1,hardDrive1,screen1,keyboard1);
     Computer computer2 = new Computer("Корея","MSI",processor2,ram2,hardDrive2,screen2,keyboard2);
     Computer computer3 = new Computer("Россия","Acer",processor1,ram2,hardDrive2,screen1,keyboard2);

     System.out.println(computer1);
     computer1.cloneComp(computer2);
             computer1.toString();
     System.out.println(computer1);

    }
}
