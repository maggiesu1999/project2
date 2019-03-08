import java.util.Random;

public class GolfClub {
       static int mean;
       static int sd; 
       static Random randGen = new Random();
       public GolfClub(int mean, int sd){
              this.mean = mean;
              this.sd = sd;
       }
       // setter and getters;
       public void setMean(int mean){
              this.mean = mean;
       }
       
       public int getMean(){
              return mean;
       }

       public void setSd(int sd){
              this.sd = sd;
       }
       
       public int getSd(){
              return sd;
       }
       
       public static int nextDistance(int power){
           double meanAdj = mean * power / 10.0;
           double sdAdj = sd * power / 10.0;
           int userDistance = (int)(Math.abs(randGen.nextGaussian() * sdAdj + meanAdj));
           return userDistance;
       }
       
       public static GolfClub[] generateClub() {
   		GolfClub one = new GolfClub(230,30);
   		GolfClub two = new GolfClub(215,20);
   		GolfClub three = new GolfClub(180,20);
   		GolfClub four = new GolfClub(170,17);
   		GolfClub five = new GolfClub(155,15);
   		GolfClub six = new GolfClub(145,15);
   		GolfClub seven = new GolfClub(135,15);
   		GolfClub eight = new GolfClub(125,15);
   		GolfClub nine = new GolfClub(110,10);
   		GolfClub ten = new GolfClub(50,10);
   		
   		GolfClub[] clubArray = {one,two,three,four,five,six,seven,eight,nine,ten};
   		return clubArray;
   	}
}