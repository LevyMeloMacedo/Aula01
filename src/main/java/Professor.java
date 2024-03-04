class Professor extends Pessoa {
  private String disciplina;
  private int cpf;

  public Professor(String nome, int idade, String disciplina, int cpf){
    super(nome, idade);
    this.disciplina = disciplina; 
    this.cpf = cpf; 
  }

  public String getDisciplina() {
    return disciplina;
  }
  public int getCpf() {
    return cpf;
  }

  @Override
  public String toString() {
    return super.toString() + "\nDisciplina: " + disciplina + "\nCPF: " + cpf;
  }

  @Override
  public String getInfoAdicional(){
    return "Disciplina:" + disciplina;
  }
}