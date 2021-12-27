
import java.util.Scanner;
public class CacaMain { // nome da classe CacaMain
    private CacaPalavras palavras; //atributo desta classe é private, palavras
    //private CacaMapaOtimizado mapa;
    private CacaMapa mapa;

    private CacaMain() { // metodo principal só instancia o construtor dessa classe
        Scanner teclado = new Scanner(System.in);//new instancia a classe Scanner

        palavras = new CacaPalavras(); //new instancia a classe CacaPlavras
        //mapa = new CacaMapaOtimizado();
        mapa = new CacaMapa(); //new instancia a classe CacaMapa
        mapa.pesquisa(palavras.palavrasMatriz());//metodo construtor chama o metodo pesquisa da classe CacaMapa para resolver o caça palavras
        int opcao;
       //metodo construtor controla o Menu: Caça Palvras, que deve ser implementado usando do/while
        do {
            System.out.println("____Menu: Caça Palavras___");
            System.out.println("1. listar palavras");
            System.out.println("2. listar mapa");
            System.out.println("3. listar respostas");
            System.out.println("4. Sair");
            System.out.println("__Opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1: // chama o método imprimir da classe CacaPalavras;
                    palavras.imprimir();
                    break;
                case 2: // chama o método imprimir da classe CacaMapa;
                    mapa.imprimir();
                    break;
                case 3: // chama o método reposta da classe CacaPalavras;
                    palavras.respostas();
                    break;
                case 4: // sair;
                    break;
                default:
                    System.out.println("Opção Errada!");
            }
        } while (opcao != 4);
        teclado.close();
    }
    public static void main(String[] args) throws Exception { //metodo main
        new CacaMain(); // new instancia o metodo main
    }
}

