package gct.supermercado;


public class funcionario extends pessoa{

  //
  // Fields
  //
    
  int z = 10;
  
  public String horariotrabalho[] = new String [z];
  public float salario[] = new float[z];
  
  //
  // Constructors
  //
  public funcionario () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of horariotrabalho
   * @param newVar the new value of horariotrabalho
   */
  public void setHorariotrabalho (String newVar) {
    horariotrabalho[z] = newVar;
  }

  /**
   * Get the value of horariotrabalho
   * @return the value of horariotrabalho
   */
  public String getHorariotrabalho () {
    return horariotrabalho[z];
  }

  /**
   * Set the value of salario
   * @param newVar the new value of salario
   */
  public void setSalario (float newVar) {
    salario[z] = newVar;
  }

  /**
   * Get the value of salario
   * @return the value of salario
   */
  public float getSalario () {
    return salario[z];
  }

  //
  // Other methods
  //

  /**
   */
  public void adicionarfuncionario()
  {
  }


  /**
   */
  public void alterarsalario()
  {
  }


  /**
   */
  public void alterarhorario()
  {
  }


}