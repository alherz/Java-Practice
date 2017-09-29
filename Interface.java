public class Interface{

    // Create objects here
    InputProcessor ip = new InputProcessor();
    Map mapObj = new Map();
    int mapMaxRange = mapObj.getMAX();
    
    public Interface(){
        
        boolean keepLooping = true;
        
        while(keepLooping == true) {

            System.out.print("Would you like to try? (Enter \"Yes\" or \"No\"): ");
            String input = ip.yesNoInput();
            
            if(input.equals("Invalid")) {
                System.out.println(input);
                System.out.println("Please enter either \"Yes\" or \"No\".");
            } else if(input.equals("YES")) {
               // Call method to start stuff
                mapObj.buildMap();
                mapObj.pickNewSpot();
                getMapInput();
            } else {
                keepLooping = false;
            }
            
        }
        
    }
    
    public void getMapInput(){
        boolean keepLooping = true;
        String visualMap;
        while(keepLooping){
           
            //Print map
            visualMap = mapObj.printMap();
            System.out.println(visualMap);
            //Ask for input
            System.out.print("Please give me a number between 1 and " + mapMaxRange + ": ");
            // Check if input is invalid, then if it's already been used, then display results
            int input = ip.getMapInput();

            if(input >= 1 && input <= mapMaxRange){
                
                if(mapObj.hasBeenUsed(input) == false){
                    if(mapObj.isTheSpot(input)){
                        visualMap = mapObj.printMap();
                        System.out.println(visualMap);
                        System.out.println("You found it!");
                        keepLooping = false;
                    } else {
                        System.out.println("Guess again!");
                    }
                } else {
                    System.out.println("You've already guessed that spot!");
                }

            } else {
                System.out.println("That is not a valid range!");
            } 
        }
        
    
    }
}