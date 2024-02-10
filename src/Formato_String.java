import java.util.Locale;

public class Formato_String {
    public static void main(String[] args) {
        String str = "Curso de programação";
        System.out.println("Tamanho da String: "+str.length());
        System.out.println("Terceira posicao da String é: "+ str.charAt(2));

        System.out.println(str.equals("Curso de Programacao."));
        System.out.println("---------------------------------------------------------------");
        System.out.println("Minha string começa com \"Curso\"?: "+str.startsWith("Curso"));
        System.out.println("Minha string começa com \"programação\"?: "+str.endsWith("programação"));

        System.out.println(str.substring(5));
        System.out.println(str.substring(0,5));
        System.out.println(str.replace("Curso","Curso top"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String str2 = "                     Curso de programação                 ";
        System.out.println(str.trim());


    }
}
