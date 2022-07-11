public class Aula10 {
    public static void main(String[] args) {
        // cada objetivo instânciado é independente um do outro
        // preciso declara o valor que this.num receberá
        Jogador j1 = new Jogador(1);
        Jogador j2 = new Jogador(2);
        Jogador j3 = new Jogador(3);

        /*
         * para utilizar uma variável de outra classe é preciso
         * declarar qual classe que será utilizada e a variável que
         * receberá o valor
         */
        // j1.num = 10;
        // System.out.printf("acesso public, valores:%d, %d", j1.num, j2.num = 4);

        System.out.println("");
        System.out.println("");

        int num = 0;
        /*
         * pré incremento, ele soma primeiro, depois atribui o valor à variável
         * 1 + num = num;
         */
        System.out.println("j1_1, j2_2, j3_1 respectivamente");
        Jogador j1_1 = new Jogador(++num);
        Jogador j2_1 = new Jogador(++num);
        Jogador j3_1 = new Jogador(++num);
    }
}
