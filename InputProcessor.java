import java.util.Scanner;

public class InputProcessor{
    Scanner scanner = new Scanner(System.in);
    
    public String yesNoInput(){
        try {
             String tryInput = scanner.nextLine();
            tryInput = tryInput.toUpperCase();
            if(tryInput.equals("YES") || tryInput.equals("NO")){
                return tryInput;
            } else {
                return "Invalid";
            }
            
        } catch (Exception ex){
            return "Invalid";
        }
    }
    
    public int getMapInput(){
        try {
            int mapInput = scanner.nextInt();
            scanner.nextLine();
            return mapInput;
        } catch (Exception ex){
            scanner.nextLine();
            return -1000;
        }
        
    }

}