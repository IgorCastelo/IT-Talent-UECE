public class Continue_Break {
    public static void main(String[] args) {
        System.out.println("Contimue no FOR");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                continue; //  Pular para a proxima posição , baseado na condição. (Imprime  os numeros impares)
            }
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("Break no FOR");
        for (int i = 0; i <= 20; i++) {
            if (i == 10) {
                break;
            }
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("Contimue no WHILE");
        int a = 0;
        while (a <= 20) {
            a++;
            if (a % 2 != 0) {
                continue; //Imprimir os numeros PARES.
            }
            System.out.println(a + " ");
        }
        System.out.println();
        System.out.println("Break do WHILE");
        a = -1;
        while (a <= 20) {
            a++;
            if (a == 10) {
                break;
            }
            System.out.println(a + " ");
        }
        System.out.println();
        System.out.println("Continue do DO_WHILE: ");
        int b = 0;
        do {
            b++;
            if (b % 3 == 0) {
                continue;//Não imprime os números divisiveis por 3
            }
            System.out.println(b + " ");
        } while (b <= 20);
        System.out.println();
        System.out.println("Break do DO_WHILE: ");
        b = 0;
        do {
            b++;
            if (b == 10) {
                break;
            }
        } while (b <= 20);
        System.out.println(b + " ");
    }
}
