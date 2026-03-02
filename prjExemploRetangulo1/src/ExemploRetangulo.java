

/**
 *
 * @author KumonRick
 */
public class ExemploRetangulo {
    public static void main(String[] args) {
        ExemploRetangul objRet;//Definição do ponteiro
        
        objRet = new ExemploRetangul ();//Instanciação(alocação) do objeto na memória
        
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        System.out.println("Medida da áea do retângulo: " + objRet.calcArea());
        System.out.println("\nMedida do perìmetro do retângulo: " + objRet.calcPerimetro());
        System.out.println("\nA altura do retângulo: " + objRet.getAltura());
        System.out.println("\nA base do retâmgulo: " + objRet.getBase());
        System.out.println("\nMedida da diagonal do retângulo: " + objRet.calDiagonal());
    }
    
}
