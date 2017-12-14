package Book;

class GameShape{

    public void displayShape(){
        System.out.println("Display shape");
    }
}

class PlayerPiece extends GameShape{
    public void movePiece(){
        System.out.println("moving game piece");
    }
}

class TilePiece extends GameShape{
    public void getAdjacent(){
        System.out.println("getting adjacent tiles");
    }
}

class TestShapes{
    static public void main(String [] args){
        PlayerPiece shape = new PlayerPiece();
        shape.displayShape();
        shape.movePiece();

        PlayerPiece player = new PlayerPiece();
        TilePiece tile = new TilePiece();
        doShapes(player);
        doShapes(tile);
    }

    public static void doShapes(GameShape shape){
        shape.displayShape();
    }
}