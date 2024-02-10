public class IF_aninhado {
    public static void main(String[] args) {
        int v = 6;
        if(v % 2==0) {// nivel 1
            if (v % 3 == 0) {// nivel 2
                if (v % 4 == 0) {// nivel 3
                    System.out.println("Onumero é divisivel por 4 e por 2");
                } else {
                    System.out.println("Onúmero é divisivel por 6");
                }
            }else{
                    System.out.println("O número é divisivel por 2");
                }
            } else {
                System.out.println("É divisivel por " + v);
            }
        }

}
