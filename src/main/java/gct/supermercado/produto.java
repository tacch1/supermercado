package gct.supermercado;

/**
 *
 * @author univicosa
 */
public class produto{

    int z = 10,i = 0;
  //
  // Fields
  //
  public String nomeproduto[] = new String[z];
  public float preco[] = new float [z];
  public float preco_adquirido[] = new float [z];
  public float margemlucro[] = new float [z];
  public int quantidade[] = new int [z];
  int cmd;
  
  //
  // Constructors
  //
    void getProduto() { 
        
      if(cmd == 1){
      this.nomeproduto[i] = nomeproduto[i];
      this.preco[i] = preco[i];
      this.quantidade[i] = quantidade[i];
      System.out.println(this.nomeproduto[i]);
      System.out.println(this.preco[i]);
      System.out.println(this.quantidade[i]);
      i++;
      }
      if(cmd == 2){
      
      }
  }

  public void adicionarproduto()
  {
  }


  public void quantidadeproduto()
  {
  }

  public void verlucro()
  {
  }

}