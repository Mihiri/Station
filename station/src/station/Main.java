/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package station;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author mihiri
 */
class proximity_card{
    
      private String codeNumber,details;
      private static String startPlace;
     private float amountOfCredit;
     private static float time;
     
      proximity_card(String codeNumber,String startPlace,String details,float amountOfCredit,float time){
     this.codeNumber=codeNumber;
 
     this.details=details;
     this.amountOfCredit=amountOfCredit;

       }
       public float getAmount(){
           return amountOfCredit;
       }
       public void setAmount(float newAmount){
           amountOfCredit=newAmount;
       }
       public String getCode(){
           return codeNumber;
       }
       public static String getPlace(){
           return startPlace;
       }
       public static float getTime(){
           return time;
       }
 interface Observer{
           void update(Observable coach,Object args);
       }
   class cardReader implements Obsever{
       private String code;
        public String getCode(){
            return code;
        }
        public void update(Observable coach,Object args){
            
        }
   }{
           String code;
           String getCode(){
               return code;
           }
       }
       
           }
           
     
       

 class DoorCardReader extends cardReader{
 }
 class TurnstileCardReader extends cardReader{
 }
 
class TurnstileCardWriter{
     private static String nameOfStation;
     private float time;
     TurnstileCardWriter(String nameOfStation,float time){
         this.nameOfStation=nameOfStation;
         this.time=time;
     }
     public static String getName(){
         return nameOfStation;
     }
     public float time(){
         return time;
     }
 }
 
 class coach extends Observable{
     boolean isOpen,isFull,isRed;
     static int noOfPassengers;
     String passengerCodes[];
    static  void close(){ // open the door of the coach
    }
     static void open(){ // close the door of the coach
     }
     static void turnOnRed(){ // turn on red light
     }
     static void turnOnGreen(){ // turn on green light
     }
     static int getNoOfPassengers(){
         return noOfPassengers;
     }
     void setNoOfpassengers(int newNo){
         noOfPassengers++;
         noOfPassengers=newNo;
     }
    boolean  getisFull(){
        return isFull;
    }
         
     
 class server{
     String name;
     String codes[];
     double charges[];
     int maxPassengers=100;
     int maxTime=120,time ;
     boolean trainStatus;
     
     boolean getTrainStatus(){
         return trainStatus;
     }
     void setChargers(String startPlace,float time,float charges[],String start,double distance,double charge,String destination){
         start=proximity_card.getPlace();
         
         destination=TurnstileCardWriter.getName();
         
         time=proximity_card.getTime();
        float destinationVal,startVal;// assing the value in the list
         distance=destinationVal-startVal;
            float peak;// include in the server the value of peak
         if(time=peak)
         {
             charge=distance*1.5;
         }
         else 
             charge=distance*1;
     }
    public void setEntrance(){
         if(time<30)
         {
             coach.open();
            
         }
         else{
             if((coach.getNoOfPassengers())==maxPassengers)
             {
                 coach.close();
                 
             }
             else if(time==maxTime)
             {
                 coach.close();
            
             }
             else
             {
               coach.open();
               
             }
         }
         
     void setLight(){ 
             if(time<30)
         {
             coach.turnOnGreen();
            
         }
         else{
                 if((coach.getNoOfPassengers())==maxPassengers)
          
             {
                 coach.turnOnRed();
                 
             }
             else if(time==maxTime)
             {
                 coach.turnOnRed();
            
             }
             else
             {
               
               coach.turnOnGreen(); 
             }
         }
             
         }             
         
     int getNoOfPassengers(){
         coach.getNoOfPassengers();
     } 
     
 }
 
 }
public class Main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        coach.addObserver(cardReader);
    }
        // TODO code application logic here
    }

}
