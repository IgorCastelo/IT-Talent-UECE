public class Matriz {
    public static void main(String[] args) {
        int [][] matriz = new int [4][4];

        for (int i = 0; i<matriz.length; i++){
            for (int j =0; j< matriz.length; j++){
                matriz[i][j] = i+j;
            }
        }

        for (int i = 0; i<matriz.length; i++){
            for (int j =0; j< matriz.length; j++){
                System.out.println("A posição " + j + " da coluna" +i+ "é: " + matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int matrizRec [][]= new int [4][];

        matrizRec[0]= new int [3];
        matrizRec[1]= new int [6];
        matrizRec[2]= new int [1];
        matrizRec[3]= new int [9];

        System.out.println(matriz.);
        for (int i = 0; i<matriz.length; i++){
            for (int j =0; j< matriz.length; j++){
                matriz[i][j] = i+j;
            }
        }
        for (int i = 0; i<matriz.length; i++){
            for (int j =0; j< matriz.length; j++){
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
