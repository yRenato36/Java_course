import java.util.Scanner;

public class carroTestar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        carro carro1 = new carro();

        //dando valores aos atributos
        carro1.nome = "Celta";
        carro1.marca = "Chevrolet";
        carro1.ano = 2009;
        carro1.vel = 30;
        
        carro1.statusCarro();

        System.out.println("\nVamos acelerar? + acelera, - desacelera");
        String acel;
        acel = ler.nextLine();
        if(acel.equals("+")){
            System.out.println("Qual a Max aceleração?");
            int max = 0;
            max = ler.nextInt();
            carro1.vel = max;
            carro1.acelerar(0);
        }
        else if(acel.equals("-")) {
            //pensar em algo para fazer nesta condição.
        }
        Scanner lerFarol = new Scanner(System.in);
        
        System.out.println("\nDigite ACENDER ou APAGAR para fazer uma ação no farol do carro");
        String onOFF;
        onOFF = lerFarol.nextLine();

        if(onOFF.toLowerCase().equals("acender")){ //para comparar strings, é necessário ultilizar o método equals
            carro1.farolOnOff = true; //envia o valor para um método em outra class
        }
        else {
            carro1.farolOnOff = false; //envia o valor para um método em outra class
        }
        carro1.farol(); 
        
        carro1.buzinar(); //quando chamo um método, ele traz todos os valores e comandos que estão não outra classe
        
        //chamando os métodos
        //carro1.statusCarro();
                       
    }
}
