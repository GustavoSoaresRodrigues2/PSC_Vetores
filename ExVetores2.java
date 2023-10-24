public class ExVetores2 {
    public static void main(String[] args) {
        int [] notas = new int[] {4, 10 , 11, 12, 13, 14, 15};
        // String [] livros = new String[];

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        for (int nota : notas) {
            System.out.println(nota);
        }

        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        System.out.println(soma);
    }
}
