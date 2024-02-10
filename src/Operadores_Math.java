public class Operadores_Math {
    public static void main(String[] args) {
            System.out.println("5 + 2 = " + (5+2));
            System.out.println("5 - 2 = " + (5-2));
            System.out.println("5 * 2 = " + (5*2));
            System.out.println("5 / 2 = " + (5/2));
            System.out.println("5 % 2 = " + (5%2));// resto
            float a =5.0f;
            float b = 2.0f;

        System.out.println("A/B = " + (a/b));

        double x = 10.0;
        System.out.println(x);
        int y =20;
        x=x+y; //sobre escreve o valor de x
        System.out.println(x);
        y++;  /** y recebe mais 1 **/
        //ou
        y = y+1;
        //ou
        y+=1;
        System.out.println(y);

        System.out.println(Math.sqrt(x));
    }
}
