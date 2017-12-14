package FactoryMethod;

public class Fact
{
    public static void main(String[] args)
    {
        AbstractCreator creates = new Creator();

        Media audioObj = creates.crea("audio");
        Media videoObj = creates.crea("video");

        audioObj.play();
        videoObj.play();
    }
}

interface Media
{
    void play();
}

class Audio implements Media
{
    @Override
    public void play()
    {
        System.out.println("Playing audio . . ");
    }
}

class Video implements Media
{
    @Override
    public  void play()
    {
        System.out.println("Playing video . . ");
    }
}

abstract class AbstractCreator
{
    abstract Media crea(String op);
}

class Creator extends AbstractCreator
{
    @Override
    Media crea (String op)
    {
        Media media=null;
        switch(op)
        {
            case "audio":
                media=new Audio();
                break;
            case "video":
                media=new Video();
                break;
        }
        return media;
    }
}