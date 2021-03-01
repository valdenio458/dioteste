package FatorialRecursivo;

public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao colocaPrefixoSenhorNaString = valor -> "Sr." + valor;
        System.out.println(colocaPrefixoSenhorNaString.gerar("João"));
    }
}
