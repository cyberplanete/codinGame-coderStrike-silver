import java.util.*;
import java.io.*;
import java.math.*;


public class MarsLander2 {

    private static List<Integer> listSufaceY = new ArrayList<Integer>();
    private static List<Integer> listSufaceX = new ArrayList<Integer>();

  public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
      String force = " 3";
      String rotation = "";
      int temp = 0;
      for (int i = 0; i < surfaceN; i++) {
          int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
          int landY = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
          
         listSufaceY.add(landY);
         listSufaceX.add(landX);
      }
      
    

      
      
      
      //trouver la zone d'atterissage
      int tempY=  listSufaceY.get(0);
      int indexPosition = 0;
      for(int i =0 ; i < listSufaceY.size(); i++ ){
          
          if(tempY == listSufaceY.get(i)){
              
              indexPosition = i;
              }
          else {
              tempY = listSufaceY.get(i);
              
              }
          
          }
      // game loop
      while (true) {
          int X = in.nextInt();
          int Y = in.nextInt();
          int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
          int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
          int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
          int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
          int power = in.nextInt(); // the thrust power (0 to 4).

          

          log(rotate, surfaceN, indexPosition, hSpeed, X, Y);
          //Se déplacer à droite
           int zoneLanding = listSufaceY.get(indexPosition );
          if (X <  listSufaceX.get(indexPosition - 1)) {
              
             
                  rotation = "-30";
                  if (hSpeed > 50  ){
                      rotation = "40";
                      force = " 4";
                      }
                 
                 
                 if (hSpeed > 40 && hSpeed < 50 ){
                      rotation = "0";
                      force = " 4";
                      }
                              
          }
          else if (X >  listSufaceX.get(indexPosition )) {
              
             
                  rotation = "30";
                  
                  if (hSpeed < -50  ){
                      rotation = "-40";
                      force = " 4";
                      }
                  
                  if (hSpeed < - 40   && hSpeed >  -50){
                      rotation = "0";
                      force = " 3";
                      if(Y < listSufaceY.get(indexPosition ) + 500) {
                          force = " 4";
                          }
                  
                      }
                   
                     
              
              
              
          }
          else if (X >  listSufaceX.get(indexPosition - 1) && X <  listSufaceX.get(indexPosition )) {
              rotation = "0";
              System.err.println("ici ");
              System.err.println("vSpeed :" + vSpeed);
              if (vSpeed >  - 20 || X < zoneLanding + 1500) {
                  force = " 3";
                  System.err.println("force 3 " );
                  if (vSpeed >  0 ) {
                      System.err.println("force 2 " );
                      force = " 0";
                      }

                  }
             
              if ((hSpeed > 0 || hSpeed < 0) && Y > zoneLanding + 100){
                      rotation = "20";
                      force = " 4";
                      }
              
               if (hSpeed < 0    ){
                      rotation = "-20";
                      force = " 4";
                      }
              
              if (vSpeed < -30 ) {
                  
                  force = " 4";
                  }
              
              
              }
          
         
         
        
          
          // rotate power. rotate is the desired rotation angle. power is the desired thrust power.
          System.err.println("force : " + force );
          System.out.println(rotation + force);
      }
  }
  
  
  public static void log(int rotate, int surfaceN, int indexPosition, int hSpeed, int x, int y) {
      
      System.err.println("Angle: " + rotate);
      System.err.println("hSpeed: " + hSpeed);
      System.err.println("surfaceN: " + surfaceN);
      System.err.println("indexPositionY " + indexPosition);           
      System.err.println("PositionY " + listSufaceY.get(indexPosition));
      System.err.println("PositionY " + listSufaceY.get(indexPosition - 1));
      System.err.println("indexPositionY " + indexPosition);           
      System.err.println("PositionX 1 :" + listSufaceX.get(indexPosition - 1));
      System.err.println("PositionX 2 :" + listSufaceX.get(indexPosition));
      System.err.println("PositionX  POD1 :" + x );
      System.err.println("PositionY POD :" + y );
      
      }

  public static void moveRight(){
      
      
      }
  
  
}