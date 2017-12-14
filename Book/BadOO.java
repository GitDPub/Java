package Book;

public class BadOO
{

    public int size;
    public int weight;

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public BadOO(){ }

    public BadOO(int size, int weight){
        this.size = size;
        this.weight = weight;
    }


}
