package ejemplo;

public class Main {
  
  public static void main(String[] args) {
    System.out.println("Hola profe");
    
    int suma= suma(4,6);
    System.out.println(suma);
    
    int resta= resta(6,8);
    System.out.println(resta);
    
    int mult= mult(2,3);
    System.out.println(mult);
    
    try{
     double divi= divi(3,0);
     System.out.println(divi);
    } catch (Exception e){
      String mensaje= e.getMessage();
      System.out.println(mensaje);
    }
    
  }
  
  
  public static int suma(int n1, int n2) {
    return n1+ n2;
  }
  
  public static int resta(int n1, int n2) {
    return n1-n2;
  }
  
  public static int mult(int n1, int n2){
    return n1*n2;
  }
  
  public static double divi(double n1, double n2) throws Exception {
    if (n2==0){
      throw new Exception("No es posible realizar la division");
   }
    return n1/n2;
  }
}