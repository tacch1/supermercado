package gct.supermercado;

public class pessoa {

    int z = 10;

  public String nome[] = new String [z];
  public String endereco[] = new String [z];
  public String CEP[] = new String [z];
  public String CPF[] = new String [z];
  public int idade[] = new int [z];
  
  //
  // Constructors
  //
  public pessoa () { };

  public void setNome (String newVar) {
    nome[z] = newVar;
  }


  public String getNome () {
    return nome[z];
  }


  public void setEndereco (String newVar) {
    endereco[z] = newVar;
  }

  /**
   * Get the value of endereco
   * @return the value of endereco
   */
  public String getEndereco () {
    return endereco[z];
  }

  public void setCEP (String newVar) {
    CEP[z] = newVar;
  }

  /**
   * Get the value of CEP
   * @return the value of CEP
   */
  public String getCEP () {
    return CEP[z];
  }


  public void setCPF (String newVar) {
    CPF[z] = newVar;
  }

  /**
   * Get the value of CPF
   * @return the value of CPF
   */
  public String getCPF () {
    return CPF[z];
  }

  /**
   * Set the value of idade
   * @param newVar the new value of idade
   */
  public void setIdade (int newVar) {
    idade[z] = newVar;
  }

  /**
   * Get the value of idade
   * @return the value of idade
   */
  public int getIdade () {
    return idade[z];
  }

  //
  // Other methods
  //

  /**
   */
  public void classificacao()
  {
  }


}
