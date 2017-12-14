package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        CreadorAbstracto creator = new Creador();

        IArchivo audio = creator.crear( Creador.AUDIO );
        audio.reproducir();

        IArchivo video = creator.crear( Creador.VIDEO );
        video.reproducir();
    }
}

interface IArchivo {
    public void reproducir();
}

class ArchivoAudio implements IArchivo {
    public ArchivoAudio(){
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo archivo de audio...");
    }
}

class ArchivoVideo implements IArchivo {
    public ArchivoVideo() {
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo archivo de vídeo...");
    }
}

abstract class CreadorAbstracto {
    public static final int AUDIO = 1;
    public static final int VIDEO = 2;

    public abstract IArchivo crear(int tipo);
}

class Creador extends CreadorAbstracto {
    public void Creador() {
    }

    @Override
    public IArchivo crear(int tipo)
    {
        IArchivo objeto;
        switch( tipo )
        {
            case AUDIO:
                objeto = new ArchivoAudio();
                break;
            case VIDEO:
                objeto = new ArchivoVideo();
                break;
            default:
                objeto = null;
        }
        return objeto;
    }
}
