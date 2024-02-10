public class SwitchCase {
    float calculoBonus(String cargo, float salario) {
        float bonus = 0f;
        cargo = cargo.toLowerCase();// transforma a string em lower case.
        switch (cargo) {
            case "gerente":
                bonus = salario * 1.5f;
                break;
            case "analista":
                bonus = salario * 1.3f;
                break;
            case "supervisor":
                bonus = salario * 1.1f;
            default:
                bonus = salario * 0.7f;
        }
        return bonus;

        /* if(cargo.equals("gerente")){
            bonus = salario * 1.5f;
        }else if(cargo.equals("analista")){
            bonus= salario*1.3f;
        }else if(cargo.equals("supervisor")){
            bonus = salario *1.1;
        }else{
            bonus = salario*0.7f;
        }
        return bonus;

        */
    }
    public static void main(String[] args) {
        String cargo = "gerente";
        float salario = 1300f;
        float bonus = new SwitchCase().calculoBonus(cargo, salario);
        System.out.println("O salario do " + cargo + " é: " + salario + " e sua bonificaçção é: " + bonus);
        System.out.println("E seua ganho total é de : " + (salario + bonus));
    }
}

