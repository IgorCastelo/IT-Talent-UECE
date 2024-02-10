import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratamento_excecao {
    public static void main(String[] args) {
        String str = "ABC";// 0 1 2
        String numero=null;

        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int n = 10/0;
            System.out.println("Tamanho do vetor: " + numero.length());
            System.out.println(str.charAt(3));
        }catch(StringIndexOutOfBoundsException e ){
            System.out.println(" Posição invalida!" );

        }catch (NullPointerException e ){
            System.out.println("Não existe nome digitado: ");
        }catch(ArithmeticException e){
            System.out.println("Não existe divisao por zero!");
        }catch(InputMismatchException e ){
            System.out.println("O numero digitado deve ser um inteiro");
        }catch(Exception e){
            System.out.println("Exceção generica");
        }finally{
            System.out.println(" ");
        }


        }
    }

