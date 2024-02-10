public class ConversaoDeDados {
    public static void main(String[] args) {
        String str = "0123";
            System.out.println((Integer.valueOf(str))+200);
            System.out.println((Byte.valueOf(str))+200);
            System.out.println((Short.valueOf(str))+200);
            System.out.println((Float.valueOf(str))+200);
            System.out.println((Double.valueOf(str))+200);

            System.out.println("-----------------------------------------------");
        Byte b = 10;
            System.out.println(b.intValue());
            System.out.println(b.shortValue());
            System.out.println(b.floatValue());
            System.out.println(b.doubleValue());
            System.out.println(b.toString());

        System.out.println("---------------------------------------------------");
        Double c = 1234.1234;
        System.out.println(c.intValue());



    }

}
