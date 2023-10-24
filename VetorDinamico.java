public class VetorDinamico {
    private int qtde;
    private int cap;
    private int [] elementos;

    public VetorDinamico() {
        qtde = 0;
        cap = 10;
        elementos = new int[cap];        
    }

    public void AdicaoElemento(int e) {
        elementos[qtde++] = e;
    }

    public void Exibir() {
        System.out.printf(
            "Qtde: %d\nCap: %d\n", qtde, cap
        );

        for (int e : elementos) {
            System.out.printf("%d ", e);
        }
    }

    public static void main(String[] args) {}
}