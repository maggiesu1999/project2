import java.util.Random;
public class GolfClub {
       private String name;
       private int mean;
       private int sd; 
       public GolfClub1(String name, int mean, int sd){
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
       
       //
       public int nextDistance(int power){
              double meanAdj = mean * power / 10.0;
              double sdAdj = sd * power / 10.0;
              int userDistance = (int)(Math.abs(random.nextGaussian() * sdAdj + meanAdj));
              return userDistance;
       }
       
       
       
}


