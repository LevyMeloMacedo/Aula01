// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("João", 25);
    System.out.println(p1.toString());
    Pessoa pessoa = new Pessoa();
    pessoa.setNome("Barbarosa ");
    pessoa.setIdade(90);

    System.out.println("Nome: " + pessoa.getNome());
    System.out.println("Idade: " + pessoa.getIdade());

  }
}