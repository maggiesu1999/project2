public class Old{
  static int yards;
  static int par;
  public Old(int yards, int par){
  this.yards = yards;
  this.par = par;
  }
  
  public getYards(){
  return yards;
  }
  public getPar(){
  return par;
  }
  
  public static Old[] oldArray(){
  Old burn = new Old(376,4);
  Old dyke = new Old(453,4);
  Old cartgateOut = new Old(397,4);
  Old gingerBeer = new Old(480,4);
  Old holeOCrossOut = new Old(568,5);
  Old heatheryOut = new Old(412,4);
  Old highOut = new Old(371,4);
  Old short = new Old(175,3);
  Old end = new Old(352,4);
  Old bobbyJones = new Old(386,4);
  Old highIn = new Old(174,3);
  Old heatheryIn = new Old(348,4);
  Old holeOCrossIn = new Old(465,4);
  Old long = new Old(618,5);
  Old cartgateIn = new Old(455,4);
  Old cornerOfTheDyke = new Old(423,4);
  Old road = new Old(495,4);
  Old tomMorris = new Old(357,4);
  
  Old[] oldCourse = new Old[];
  oldCourse = {burn, dyke, cartageOut, gingerBeer, holeOCrossOut, heatheryOut, highOut, short, end, bobbyJones,highIn,heatheryIn,holeOCrossIn,long,cartgateIn,cornerOfTheDyke,road,tomMorris};
  return oldCourse;
  }
}
