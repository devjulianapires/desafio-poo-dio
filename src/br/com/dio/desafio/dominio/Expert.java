package br.com.dio.desafio.dominio;

public class Expert {
  private String nome;
  private String area;

  public Expert() {
    
  }

  public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

  @Override
public String toString() {
    return "Expert{ " + 
        "nome=" + this.nome + 
      ",area="+ this.area +
      "}";
}
}