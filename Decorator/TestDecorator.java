package Decorator;

public class TestDecorator {
    public static void main(String[] args) {
        Computer compu = new Computer();
        System.out.println("you get a "+ compu.description());

        compu = new Disk(compu);
        System.out.println("you get a "+ compu.description());

        compu = new CD(compu);
        System.out.println("you get a "+ compu.description());

        compu = new Monitor(compu);
        System.out.println("you get a "+ compu.description());
    }
}

class Computer {
    public String description(){
        return "computer";
    }
}

abstract class ComponentDecorator extends Computer {
    public abstract String description();
}

class Disk extends ComponentDecorator{
    Computer computer;
    public Disk(Computer c){ computer = c; }
    public String description(){ return computer.description()+" + disk"; }
}

class CD extends ComponentDecorator{
    Computer computer;
    public CD(Computer c){ computer = c; }
    public String description(){ return computer.description()+" + CD"; }
}

class Monitor extends ComponentDecorator{
    Computer computer;
    public Monitor(Computer c){ computer = c; }
    public String description(){ return computer.description()+" + Monitor"; }
}



