public class Genesee{
  static int yards;
  static int par;
  
  public Genesee(int yards, int par){
    this.yards = yards;
    this.par = par;
    }
  
  public static int getYards(){
    return yards;
    }
  
  public int getPar(){
    return par;
    }
  
  public String toString(){
    return "yards: " + getYards() + " yards, par: " + getPar();
    }
  
  public static Genesee[] generateHoles(){
    Genesee first = new Genesee(530,5);
    Genesee second = new Genesee(305,4);
    Genesee third = new Genesee(331,4);
    Genesee fourth = new Genesee(201,3);
    Genesee fifth = new Genesee(500,5);
    Genesee sixth = new Genesee(226,3);
    Genesee seventh = new Genesee(409,4);
    Genesee eighth = new Genesee(410,4);
    Genesee ninth = new Genesee(229,3);
    Genesee tenth = new Genesee(433,4);
    Genesee eleventh = new Genesee(363,4);
    Genesee twelfth = new Genesee(174,3);
    Genesee thirteen = new Genesee(545,5);
    Genesee fourteen = new Genesee(419,4);
    Genesee fifteen = new Genesee(512,5);
    Genesee sixteen = new Genesee(410,4);
    Genesee seventeen = new Genesee(320,4);
    Genesee eighteen = new Genesee(170,3);
    Genesee[] geneseeHoles = {first,second,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh,twelfth,thirteen,fourteen,fifteen,sixteen,seventeen,eighteen};
    return geneseeHoles;
    }
}