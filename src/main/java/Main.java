// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  // public static void main(String[] args) {
  // Pessoa p1 = new Pessoa("João", 25);
  // System.out.println(p1.toString());
  // Pessoa pessoa = new Pessoa();
  // pessoa.setNome("Barbarosa ");
  // pessoa.setIdade(90);

  // System.out.println("Nome: " + pessoa.getNome());
  // System.out.println("Idade: " + pessoa.getIdade());
  /*
   * public static void main(String[] args) {
   * Aluno aluno = new Aluno("Joelma", 22, 1234);
   * Professor professor = new Professor("Getulio Vargas", 78, "Matemática",
   * 12345678);
   * 
   * System.out.println("Informações do Aluno:\n" + aluno.toString()+"\n");
   * System.out.println("Informações do Professor:\n" + professor.toString());
   */
  public static void main(String[] args) {
    /*
     * Aluno[] alunos = new Aluno[2];
     * alunos[0] = new Aluno("Joelma", 22, 1234);
     * alunos[1] = new Aluno("Max Steel", 60, 1234567);
     * 
     * for (Aluno a : alunos) {
     * System.out.println(a.toString());
     * }
     */
    Pessoa p1 = new Pessoa("Orgalorg o destruidor de mundos", 5000);
    Pessoa p2 = new Pessoa("Sukuna", 2000);

    p1.apresentar();
    p2.apresentar(p2.getIdade());
  }
}
