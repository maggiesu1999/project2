import java.util.Random;

public class Power {
		static Random randGen = new Random();
        static int mean;
        static int sd;
        public Power(int mean,int sd){
          this.mean= mean;
          this.sd = sd;
        }
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
       
       public static int nextDistance(){
           double meanAdj = mean/3.0;
           double sdAdj = sd/3.0;
           int userDistance = (int)(Math.abs(randGen.nextGaussian() * sdAdj + meanAdj));
           return userDistance;
       }
       
       public static Power[] generatePower(){
    	    Power pow10 = new Power(40,5);
    	    Power pow9 = new Power(30,5);
    	    Power pow8 = new Power(25,4);
    	    Power pow7 = new Power(20,4);
    	    Power pow6 = new Power(16,3);
    	    Power pow5 = new Power(12,3);
    	    Power pow4 = new Power(8,2);
    	    Power pow3 = new Power(4,2);
    	    Power pow2 = new Power(2,1);
    	    Power pow1 = new Power(1,1);
    	    
    	    Power[] powerArray = {pow1,pow2,pow3,pow4,pow5,pow6,pow7,pow8,pow9,pow10};
    	    return powerArray;
    	    
    	  }
       
       
       
}