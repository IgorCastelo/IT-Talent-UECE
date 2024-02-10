public class FluxoWhile {
    public static void main(String[] args) {
       int i = 0;
        while(i<10){
            System.out.println(i + " ");
            i++;
        }
        System.out.println();
        i = 0;
        while(i<10){
            System.out.println(i + " ");
            i+=2;
        }
        System.out.println(i);

        while(i>=0){
            System.out.println(i + " ");
            i--;
        }
        i=9;
        while(i>=0){
            System.out.println(i + " ");
            i-=2;
        }
    }
}
