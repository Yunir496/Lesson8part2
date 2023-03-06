/* ДЗ 1. Вам нужно создать компьютер. Он состоит из:
        1.	Процессор:
        •	частота, (создать разные енамы)
        •	количество ядер, (так же через энамы)
        •	производитель,(так же через энамы)
        •	вес.
        2.	Оперативная память:
        •	тип, (так же через энамы)
        •	объём,
        •	вес.
        3.	Жёсткий диск:
        •	тип — HDD, SSD, (так же через энамы)
        •	объём памяти,
        •	вес.
        4.	Экран:
        •	диагональ,
        •	тип (IPS, TN, VA), (так же через энамы)
        •	вес.
        5.	Клавиатура:
        •	тип, (так же через энамы)
        •	наличие подсветки, (так же через энамы)
        •	вес.

        2) В классе Computer также создайте неизменяемые текстовые поля vendor (производитель) и name (название) и реализуйте следующие методы:
        •	Метод расчёта общей массы компьютера, возвращающий суммарный вес всех его компонентов.
        •	Геттеры и сеттеры для всех компонентов компьютера.
        •	Метод toString, возвращающий в удобочитаемом формате всю информацию о компьютере и его компонентах.

        3) Напишите код, создающий три разных ноутбука (на ваш выбор, можете взять примеры из любого интернет-магазина).

        4) скопируйте свойства первого ноута третьему. Можете создать для этого отдельный метод в классе компьютера.*/
public class Computer {
    private final String vendor;
    private final String name;
    private Processor processor;
    private Ram ram;
    private HardDrive hardDrive;
    private Screen screen;
    private Keyboard keyboard;

    public Computer(String vendor, String name, Processor processor, Ram ram, HardDrive hardDrive, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Ram getRam() {
        return ram;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public double getweight(){
        return processor.getWeight() + ram.getWeight() + hardDrive.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    public  void cloneComp(Computer computer){

       this.setProcessor (computer.getProcessor());
        this.setRam(computer.getRam());
        this.setHardDrive(computer.getHardDrive());
        this.setScreen(computer.getScreen());
        this.setKeyboard(computer.getKeyboard());
    }

    public String toString(){
        return "Компьютер производства "+vendor+", модель "+ name+", Процессор с частотой "+ processor.getFrequency()+", с ядром "+
                processor.getCore()+", Производитель "+ processor.getManufacturer()+", весом "+getweight()+"килограмм.";
    }
}





