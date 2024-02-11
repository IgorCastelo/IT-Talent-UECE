package OOP;

public class Cliente {
    private String nome;
    private int ano_nascimento;
    protected float consumo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno_nascimento() {
        return ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento) {
        if((getAno_nascimento()<1950)||(getAno_nascimento()>2005)) {
            this.ano_nascimento = 0;
        }
        this.ano_nascimento = ano_nascimento;
    }
}
//private fica restrito a somente a classe.
// protected etá dsponivel ao pacote que pertence.
