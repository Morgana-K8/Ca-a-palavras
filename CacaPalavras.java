

  public class CacaPalavras {
    private final short qtdLinha = 5;
    private final short qtdColuna = 2;
    private String[][] palavras = new String[qtdLinha][qtdColuna];
  
  // System.out.println("\033[H\033[2J"); // limpa consol
 
  //o atributo qtdColuna define a quantidade de colunas da matriz palavras;
  //o atributo qtdLinha define a quantidade de linhas da matriz palavras;
 
   //o constructor desta classe deve chamar o método palavrasEntrada para iniciar as pal
  public CacaPalavras() {
    palavrasEntrada(); 
  }
 
  //o método palavrasMatriz serve para os outros objetos poderem ter o acesso a matriz de palavras
  public String[][] palavrasMatriz() { 
    return palavras;
  }
 
  private  void  palavrasEntrada() {
     palavras[0][0] = "IFELSE";
     palavras[1][0] = "FORA";
     palavras[2][0] = "WHILE";
     palavras[3][0] = "OBJETO";
     palavras[4][0] = "VETOR";
  }
 
  public void imprimir() {
    //o método imprimir imprime as palavras da matriz palavras; 
    for (short i =  0; i < palavras.length; i++) {
      System.out.println(palavras[i][0]);
    }
  }
 
  public void respostas() {
   for (short i = 0; i < palavras.length; i++) {
     String achou = (palavras[i][0]);
     if (achou == null) {
       System.out.println("....palavra NÃO encontrada: " + palavras[i][0]);
     } else {
       System.out.println(palavras[i][1] + " - " + palavras[i][0]);
      }
    }
  }
}
/*
 * _ Menu: Caça Palavras _____
 * 1. listar palavras
 * 2. listar mapa
 * 3. listar respostas
 * 4. sair
 * __ opção: 1
 * IFELSE
 * FORA
 * WHILE
 * OBJETO
 * VETOR
 * _____ Menu: Caça Palavras _____
 * 1. listar palavras
 * 2. listar mapa
 * 3. listar respostas
 * 4. sair
 * __ opção: 2
 * ---------------------
 * | C | C | Q | W | E |
 * ---------------------
 * | I | X | F | O | R |
 * ---------------------
 * | F | F | R | G | F |
 * ---------------------
 * | E | L | I | H | W |
 * ---------------------
 * | L | S | F | O | U |
 * ---------------------
 * | S | D | G | T | S |
 * ---------------------
 * | E | J | H | E | T |
 * ---------------------
 * | I | I | I | J | M |
 * ---------------------
 * | X | C | K | B | G |
 * ---------------------
 * | V | E | T | O | R |
 * ---------------------
 * _____ Menu: Caça Palavras _____
 * 1. listar palavras
 * 2. listar mapa
 * 3. listar respostas
 * 4. sair
 * __ opção: 3
 * [1,0] - IFELSE
 * .... palavra NÃO encontrada: FORA
 * [3,4] - WHILE
 * [9,3] - OBJETO
 * [9,0] - VETOR
 * _____ Menu: Caça Palavras _____
 * 1. listar palavras
 * 2. listar mapa
 * 3. listar respostas
 * 4. sair
 * __ opção:
 */
