public class Aula09 {
    /*
    sempre quando se cria um novo método, deve-se chama-lo
    no método que você quer utilizar
    */
    public static void main(String[] args)   {
        //método, param1, param2
        impressao("mensagem", 2);
        //você pode colocar o método em uma variável,
        /*
        int r;
        r=soma2(10,5);
        System.out.println(r);
        */
        
        //ou então chamar o método direto para printar
        System.out.println("método com quantidade de valores definida");
        System.out.println(soma2(10,5));

        System.out.println("");

        System.out.println("método com quantidade de valores indefinida");
        System.out.println(soma(10,20,30));

        System.out.println("");

        System.out.println("2º declaração do mesmo método, porém aceitando double");
        System.out.println(soma(4.5,2.5,3.5));
        
        System.out.println("");

        System.out.println("Mesclando duas declarações do mesmo método");
        System.out.println(soma(10,20,30,40,5.5,3.2));
    }
    //estrutura do método
    //modificador de acesso, retorno, nome, conjunto de parâmetros
    public static void impressao(String m, int cont){
        for(int i=0; i<cont; i++)
            System.out.println(m);
    }

    //método que retornará um int, sempre quando o método retorna algo, 
    //tem que colocar o return para o método receber esse algo
    public static int soma2(int n1, int n2){
        int res=n1+n2;
        return res;
    }

    //para criar um método com quantidade de valores indefinida
    public static int soma(int... numeros) {
        int res=0;
        for(int n:numeros) {
            res+=n;
        }
        return res;
    }
    /*
    sobrecarga de métodos: quando o mesmo método é utilizado mais de 1x
    porém com retorno/parâmetro diferentes, assim esse mesmo método será
    possível aceitar esses dois tipos de retorno.
    */
    public static double soma(double...  numeros) {
        double resDouble = 0.0;
        for(double n:numeros) {
            resDouble+=n;
        }
        return resDouble;
    }
}
