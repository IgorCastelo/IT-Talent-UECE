import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tratamento_Arquivo {
    public static void main(String[] args) {
        String caminhoArquivo = "C:\\Users\\freit\\IdeaProjects\\Java_introducao\\src\\Teste.txt";
        try{
            FileReader arquivoReader = new FileReader(caminhoArquivo);
            BufferedReader leitor = new BufferedReader(arquivoReader);

            String linha;
            while((linha = leitor.readLine())!=null){
                System.out.println(linha);
            }
            leitor.close();
        }catch(IOException e ){
            System.err.println("Ocorreu um erro na leitura do seu arquivo");

        }

    }
}