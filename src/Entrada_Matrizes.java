import java.util.Scanner;

public class Entrada_Matrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero de linhas");
        int l = scanner.nextInt();
        System.out.print("Digite o numero de colunas");
        int c = scanner.nextInt();

        int[][] matriz = new int[l][c];
        System.out.println("Diogite os elementos da matriz: ");

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz lida, agora vamos imprimila: ");

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println();

        }

        scanner.close();
    }
    }
