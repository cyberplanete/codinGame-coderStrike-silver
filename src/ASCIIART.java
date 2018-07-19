import java.util.*;
import java.io.*;
import java.math.*;


public class ASCIIART {
private static List<String> listMots = new ArrayList<String>();
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        
        String T = in.nextLine();
        
        
        if (L <= 4) {
            
             for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            System.err.println("ROW :" + ROW);
                
                String unMot = T.toUpperCase();        
            
                String str = ROW;
                String [] arrOfStr = str.split("(?<=\\G.{4})");
                
                if (unMot.equalsIgnoreCase("E") ) {
                   listMots.add(arrOfStr[4]);
                   System.err.println("ici :" + arrOfStr[4]);
                   
                    }
                
                 if (unMot.equalsIgnoreCase("MANHATTAN") ) {
                   listMots.add(arrOfStr[12] +arrOfStr[0] + arrOfStr[13] + arrOfStr[7]
                        + arrOfStr[0] + arrOfStr[19] + arrOfStr[19] + arrOfStr[0] + arrOfStr[13] );//M
                   
                   
                   
                   System.err.println("ici :" + arrOfStr[4]);
                   
                    }
                
                if (unMot.equalsIgnoreCase("M@NH@TT@N") ) {
                   listMots.add(arrOfStr[12] +arrOfStr[26] + arrOfStr[13] + arrOfStr[7]
                        + arrOfStr[26] + arrOfStr[19] + arrOfStr[19] + arrOfStr[26] + arrOfStr[13] );//M
                   
                   
                   
                   System.err.println("ici :" + arrOfStr[4]);
                   
                    }
            
                }
        
            }
            else {
                
                 for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            System.err.println("ROW :" + ROW);
                
                String unMot = T.toUpperCase();        
            
                String str = ROW;
                String [] arrOfStr = str.split("(?<=\\G.{20})");
                
                if (unMot.equalsIgnoreCase("E") ) {
                   listMots.add(arrOfStr[4]);
                   System.err.println("ici :" + arrOfStr[4]);
                   
                    }
                
                 if (unMot.equalsIgnoreCase("MANHATTAN") ) {
                   listMots.add(arrOfStr[12] +arrOfStr[0] + arrOfStr[13] + arrOfStr[7]
                        + arrOfStr[0] + arrOfStr[19] + arrOfStr[19] + arrOfStr[0] + arrOfStr[13] );//M
                   
                   
                   
                   System.err.println("ici :" + arrOfStr[4]);
                   
                    }
                
                if (unMot.equalsIgnoreCase("M@NH@TT@N") ) {
                   listMots.add(arrOfStr[12] +arrOfStr[26] + arrOfStr[13] + arrOfStr[7]
                        + arrOfStr[26] + arrOfStr[19] + arrOfStr[19] + arrOfStr[26] + arrOfStr[13] );//M
                   
                   
                   
                   System.err.println("ici :" + arrOfStr[4]);
                   
                    }
            
                }
                
                
                
                }
        
       
        
        for (String unMot : listMots) {
                    
                    System.out.println(unMot);
        
                    
                    }
                

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
System.err.println("**********************************************************");
System.err.println("L :" + L);
System.err.println("H :" + H);
System.err.println("T " + T);

 

    }
}