package Decorator;

public class Decorator
{
    public static void main(String[] args) {
        Hamburguer hamburguer = new Hamburguer();
        System.out.println(hamburguer.detail());

        hamburguer = new Tomato(hamburguer);
        System.out.println(hamburguer.detail());

        hamburguer = new Lettuce(hamburguer);
        System.out.println(hamburguer.detail());
    }
}

class Hamburguer{
    public String detail(){
        return "Hamburguer";
    }
}

abstract class Decorater extends Hamburguer{
    public abstract String detail();
}

class Tomato extends Decorater{
    Hamburguer H;
    Tomato(Hamburguer H){ this.H = H; }
    public String detail(){ return H.detail()+" + tomato"; }
}

class Lettuce extends Decorater{
    Hamburguer H;
    Lettuce(Hamburguer H){ this.H = H; }
    public String detail(){ return H.detail()+" + lettuce";}
}