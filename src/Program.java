import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Instanciação do Scanner.

        System.out.println("Digite o caminho da pasta: ");
        String strCaminho = sc.nextLine(); // Entrada do caminho da pasta.

        File caminho = new File(strCaminho); // Instanciação da variável caminho do tipo File, recebendo o caminho da pasta que o usuário digitar.

     // .listFiles() retorna um array de objetos File.
        File[] pastas = caminho.listFiles(File::isDirectory); // isDirectory verifica se o objeto File representa um diretório (pasta).
        System.out.println("PASTAS:");
        for (File pasta : pastas) {
            System.out.println(pasta);
        }

        File[] arquivos =caminho.listFiles(File::isFile); // isFile verifica se o objeto File representa um arquivo.
        System.out.println("ARQUIVOS:");
        for (File arquivo : arquivos) {
            System.out.println(arquivo);
        }

        // .mkdir() cria uma pasta no caminho especificado.
        boolean sucesso = new File(caminho + "\\subdir").mkdir(); // A variável caminho é o caminho onde a pasta será criada e a String seguida de "\\" será o nome da pasta criada.
        System.out.println("Diretório criado com sucesso: " + sucesso);

        sc.close();
    }
}