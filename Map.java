import java.util.Random;

public class Map{

    static final int MAX = 5;
    String[] mapBoard = new String[MAX];
    int hiddingSpot;
    
    public String printMap(){
        String map = "";
        
        for(int x = 0; x < MAX; x++){
            map = map + mapBoard[x];
        }
        
        return map;
    }
    
    public int getMAX(){
        return MAX;
    }
    
    public boolean hasBeenUsed(int input){
        input = input - 1;
        if(mapBoard[input].equals("[X] ") || mapBoard[input].equals("[O] ")){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isTheSpot(int input){
        input = input - 1;
        if(input == hiddingSpot){
            updateMap(input, "X");
            return true;
        } else {
            updateMap(input, "O");
            return false;
        }
        
    }
    
    public void updateMap(int input, String sym) {
        mapBoard[input] = "[" + sym + "] ";
    }
    
    public void buildMap(){
            for(int x = 0; x < MAX; x++){
            int i = x + 1;
            mapBoard[x] = "[" + i + "] ";
        }
    }
    
    public void pickNewSpot(){
        Random rand = new Random();
        hiddingSpot = rand.nextInt(MAX);
    }
}