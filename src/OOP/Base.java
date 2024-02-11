package OOP;

public class Base {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Igor");
        System.out.println("meu nome é: " + cliente.getNome());
        cliente.consumo = 1090;
        System.out.println("Meu consumo é: "+ cliente.consumo);

            cliente.setAno_nascimento(2006);
            System.out.println("O ano de nascimento é: " + cliente.getAno_nascimento());

            //CLiente c2 = c;  (C2 está apontando para c)
            Cliente c2 = new Cliente();// foi instanciado um novo obejeto do tipo Cliente
    }
}
