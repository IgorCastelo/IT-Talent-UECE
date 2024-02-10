public class Funcao {

    void hello(){
        System.out.println("Hello!");
    }

    void helo(String nome){
        System.out.println("Hello " + nome + "!");
    }


    String chegada(){
        return "Hwllo! " + "(VOID)";
    }

    public static void main(String[] args) {
        //Com retorno - Tipo de dados - com ou sem parametros

        new Funcao().hello();
        new Funcao().helo("Igor");
       String x = new Funcao().chegada();
        System.out.println(x);




        //Sem retorno - Void - com ou sem parâmetros


    }
}
