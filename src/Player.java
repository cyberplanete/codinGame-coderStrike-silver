import java.util.*;
import java.io.*;
import java.math.*;


class Player {

static boolean boostOK = true;
static String vitesse;
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int tempNextCheckpointX = 0;
        int borne = 0;
        int borneRepèreX = 0;
       
        int etape = 0;
        int nombreBorne = 0;
        int tempNombreBorne = 0;
        List<Integer> listX =  new ArrayList<>();
        List<Integer> listY =  new ArrayList<>();
        
        // game loop
        while (true) {
            int x = in.nextInt();
            int y = in.nextInt();
            int nextCheckpointX = in.nextInt(); // x position of the next check point
            int nextCheckpointY = in.nextInt(); // y position of the next check point
            int nextCheckpointDist = in.nextInt(); // distance to the next checkpoint
            int nextCheckpointAngle = in.nextInt(); // angle between your pod orientation and the direction of the next checkpoint
            int opponentX = in.nextInt();
            int opponentY = in.nextInt();

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            // You have to output the target position
            // followed by the power (0 <= thrust <= 100)
            // i.e.: "x y thrust"
              
            if(nombreBorne > 1) {
                System.err.println("Vers X: " + listX.get(borne));
                System.err.println("Vers Y: " + listY.get(borne));
                if((nextCheckpointDist <= 880 && nextCheckpointDist >= 0 )) {
                   System.out.println(prochainCheckPointX(listX.get(borne +1),x) + " " + prochainCheckPointY(listY.get(borne +1),y) + " " + angle(nextCheckpointAngle,nextCheckpointDist));
                  
                       
                   }
                else {
                    System.out.println(positionCheckPointX(nextCheckpointX,x) + " " + positionCheckPointY(nextCheckpointY,y) + " " + angle(nextCheckpointAngle,nextCheckpointDist));
                    
                    }
                
                }
            
            else {
                if(etape == 0) {
                    borneRepèreX = nextCheckpointX;
                    System.out.println(positionCheckPointX(nextCheckpointX,x) + " " + positionCheckPointY(nextCheckpointY,y) + " BOOST");   
                 }
                 else {
                    System.out.println(positionCheckPointX(nextCheckpointX,x) + " " + positionCheckPointY(nextCheckpointY,y) + " " + angle(nextCheckpointAngle,nextCheckpointDist)); 
                 }
            };
              
            
            // + 1 au compteur borne à chaque passage d'une borne  
             if(tempNextCheckpointX != nextCheckpointX) {
                tempNextCheckpointX = nextCheckpointX;
                borne++;
                listY.add(nextCheckpointY);
                listX.add(nextCheckpointX);
                }  
              
            //je compte le nombre de borne  
            if ((borneRepèreX == nextCheckpointX) ) {
                
                etape ++ ;
                
                    if (etape > 1) {
                        tempNombreBorne = borne  ;
                        borne = 0;
                    }              
                }

            //j'assigne le nombre de borne
                if (tempNombreBorne != 0) {
                    
                    nombreBorne = tempNombreBorne;
                    }
            
          
           

             
                
             System.err.println("Angle:...:" + nextCheckpointAngle );
             System.err.println("position adversaire y...:" + opponentY );
             System.err.println("position adversaire x...:" + opponentX );
             System.err.println("distance:...:" + nextCheckpointDist );
             System.err.println("borne numéro: " + borne );
             System.err.println("nombre de etape: " + etape );
             System.err.println("nombre de borne: " + nombreBorne );
            
             
           
        }
    }
    
public static String angle (int nextCheckpointAngle , int nextCheckpointDist) {
    double rad = Math.toRadians(nextCheckpointAngle);
    int force = 100;
    
     if (nextCheckpointAngle < 90 || nextCheckpointAngle > - 90) {
            
            double perfectForce = nextCheckpointDist * Math.cos(rad) * 0.15;
            if (perfectForce > 100) {
                force = 100;
            } else if (perfectForce < 0) {
                force = 0;
            } else {
                force = (int) perfectForce;
            }
        } else {
            force = 0;
        }
        vitesse = String.valueOf(force);
        
        // a case to boost
        if ((boostOK && nextCheckpointDist > 3000) && (nextCheckpointAngle == 0 )) {
            vitesse = " BOOST";
            boostOK = false;
        }

    return vitesse;
    
    }
    
public static int positionCheckPointX (int nextCheckpointX,int x){
    
        if(nextCheckpointX < x){
            nextCheckpointX += 1;
            return nextCheckpointX ;
            }
    return nextCheckpointX -= 1 ;
}
public static int positionCheckPointY (int nextCheckpointY, int y){
  
        if(nextCheckpointY < y){
            nextCheckpointY += 1;
            return nextCheckpointY ;
            }
    return nextCheckpointY -= 1 ;
}

public static int prochainCheckPointX (int nextCheckpointX,int x){
    
        if(nextCheckpointX < x){
            nextCheckpointX += 1;
            return nextCheckpointX ;
            }
    return nextCheckpointX -= 1 ;
}
public static int prochainCheckPointY (int nextCheckpointY, int y){
  
        if(nextCheckpointY < y){
            nextCheckpointY += 1;
            return nextCheckpointY ;
            }
    return nextCheckpointY -= 1 ;
}
}    