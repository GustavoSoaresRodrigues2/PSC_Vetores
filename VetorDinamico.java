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

        for (int i = 0; i < qtde; i++) {
            System.out.printf("%d ", elementos[i]);
        }
    }

    private void aumentarCapacidade() {
        var aux = new int[cap * 2];
        for (int i = 0; i < qtde; i++){
            aux[i] = elementos[i];
        }
        elementos = aux;
        cap *= 2;
    }

    private boolean estaCheio(){
        return qtde == cap;
    }

    private boolean estaVazio(){
        return qtde == 0;
    }

    public void remover(){
        if(!estaVazio())
            qtde--;
    }
    public static void main(String[] args) {}
}