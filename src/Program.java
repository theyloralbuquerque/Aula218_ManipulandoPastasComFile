import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Instancia��o do Scanner.

        System.out.println("Digite o caminho da pasta: ");
        String strCaminho = sc.nextLine(); // Entrada do caminho da pasta.

        File caminho = new File(strCaminho); // Instancia��o da vari�vel caminho do tipo File, recebendo o caminho da pasta que o usu�rio digitar.

     // .listFiles() retorna um array de objetos File.
        File[] pastas = caminho.listFiles(File::isDirectory); // isDirectory verifica se o objeto File representa um diret�rio (pasta).
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
        boolean sucesso = new File(caminho + "\\subdir").mkdir(); // A vari�vel caminho � o caminho onde a pasta ser� criada e a String seguida de "\\" ser� o nome da pasta criada.
        System.out.println("Diret�rio criado com sucesso: " + sucesso);

        sc.close();
    }
}