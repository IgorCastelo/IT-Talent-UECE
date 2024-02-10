public class EstruturaDeDecisao {

    void medium (float nota){
        if(nota>=7){
            System.out.println("Aluno aprovado!");
        } else if (nota>=4&& nota<=6.99) {
            System.out.println("O aluno está de recuperação");
        } else/*caso contrário*/ {
            System.out.println("Reprovado");
        }
    }
    public static void main(String[] args) {
       float a=10.0f,b=6.0f,c=7.5f,d=8.7f;
       float medium = (a+b+c+d)/4;
        System.out.println("Amedia do aluno é: " +medium);
        new EstruturaDeDecisao().medium(medium);
    }
}
