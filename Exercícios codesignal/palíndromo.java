public class palíndromo {
    public static void main(String[] args) {
        // .toLowerCase() = deixa todas as letras minúsculas
        // .replace(" ", "") = 1º item é o item que substituirá, 2º item valor que substitui
        String word = "abac".toLowerCase().replace(" ", "");
        String palindromo = "";

        for (int i = word.length() -1; i >= 0; i--) {
            // .charAt() = retorna o caractere no índice especificado, 1º indice = 0
            palindromo = palindromo + word.charAt(i);
        }

        if (palindromo.equals(word) == true) {
            System.out.println("true");
            System.out.println(palindromo);
            System.out.println(word);
        }
        else {
            System.out.println("false");
            System.out.println(palindromo);
            System.out.println(word);
        }
    }
}
