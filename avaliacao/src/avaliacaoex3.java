import java.util.Scanner;

 public class ClassificacaoDeNota {
     public class ClassificacaoDeNota {
         public static void main(String[] args) {

             Scanner scanner = new Scanner(System.in);
             System.out.print("Digite a nota do aluno (de 0 a 10): ");
             double nota = scanner.nextDouble();

             String classificacao;
             if (nota >= 6) {
                 classificacao = "bom";
             } else if (nota < 6) {
                 classificacao = "ruim";
             }
//            scanner.close();
         }
     }
 }

