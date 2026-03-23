import fatec.poo.model.Instrutor;
import fatec.poo.model.Cliente;
import java.util.Scanner;
/**
 *
 * @author Otavio
 */
public class Aplic {
    public static void main(String[] args) {
           String cpf, nome, telefone, areaAtuacao;
           double altura, peso;
           int identificacao, opc1;
           
           Scanner entrada = new Scanner(System.in);
           do{
               System.out.println("\n1-Registrar Instrutor\n2-Registrar Cliente\n3-Sair\nSelecione uma opção:");
               opc1 = entrada.nextInt();
               entrada.nextLine();
               if(opc1==1){
                   System.out.println("Digite o nome do Instrutor: ");
                   nome = entrada.nextLine();
                   System.out.println("Digite o telefone do instrutor: ");
                   telefone = entrada.nextLine();
                   System.out.println("Digite a identificação dele: ");
                   identificacao = entrada.nextInt();
                   entrada.nextLine();
                   System.out.println("Insira a área de atuação do instrutor");
                   areaAtuacao = entrada.nextLine();
                   
                   Instrutor objInst = new Instrutor(identificacao, nome, telefone);
                   objInst.setAreaAtuacao(areaAtuacao);
                   
                   System.out.println("\nNome: " + objInst.getNome());
                   System.out.println("Telefone: " + objInst.getTelefone());
                   System.out.println("Identificacao: " + objInst.getIdentificacao());
                   System.out.println("Área de atuação: " + objInst.getAreaAtuacao());
               }
               else{
                   if(opc1==2){
                       System.out.println("Digite o nome do Cliente: ");
                       nome = entrada.nextLine();
                       System.out.println("Digite o telefone do Cliente: ");
                       telefone = entrada.nextLine();
                       System.out.println("Digite o CPF do cliente: ");
                       cpf = entrada.nextLine();
                       System.out.println("Insira a altura do cliente: ");
                       altura = entrada.nextDouble();
                       System.out.println("Insira o peso do cliente: ");
                       peso = entrada.nextDouble();
                       
                       Cliente objCli = new Cliente(cpf, nome, telefone);
                       objCli.setPeso(peso);
                       objCli.setAltura(altura);
                       
                       System.out.println("Nome: " + objCli.getNome() + "\nTelefone: " + objCli.getTelefone() + "\nCPF: " + objCli.getCpf() + "\nAltura: " + objCli.getAltura() + "\nPeso: " + objCli.getPeso());
                           
                   }
                   else{
                       if(opc1 > 3 || opc1 < 1){
                           System.out.println("ERRO\nSELECIONE UMA OPÇÃO VÁLIDA!");
                       }
                   }
               }
           }while(opc1!=3);
    }
    
}
