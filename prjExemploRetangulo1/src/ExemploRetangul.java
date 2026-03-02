
/**
 *
 * @author KumonRick
 */
public class ExemploRetangul {
      private double altura;
      private double base;
      public void setAltura(double a){
          altura = a;
      }
      public double getAltura(){
          return(altura);
      }
      public double getBase(){
          return(base);
      }
      public double calDiagonal(){
          double x, y, z;
          x = Math.pow(base,2);
          y = Math.pow(altura,2);
          z = x + y;
          return(Math.sqrt(z));
      }
      public void setBase(double b){
          base = b;
      }
      public double calcArea(){
          return (altura * base);
      }
      public double calcPerimetro(){
      return (2 * (base + altura));
    }//fim da classe
}
