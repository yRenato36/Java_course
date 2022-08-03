import java.util.Scanner;

import javax.swing.plaf.TextUI;

public class carro {
    
    //atributos
    String nome, marca;
    int ano;
    float vel;
    boolean farolOnOff;

    void statusCarro() {
        System.out.printf("Nome: %s\nMarca: %s\nAno: %d", this.nome, this.marca, this.ano);
    }
    //métodos
    void acelerar(int aceleracao){
        System.out.println("acelerando....");
        while(aceleracao < this.vel){
            aceleracao++;
            System.out.printf(" -> %d", aceleracao); 
        }
    }
    void freiar(int reduzir) {
        vel -= reduzir;
    }
    void buzinar(){
        System.out.println("Digite BIBI para buzinar");
        Scanner ler = new Scanner(System.in);
        String bi = ler.nextLine();
        if(bi.toLowerCase().equals("bibi") == true) {
            System.out.println("Buzinando.... bibibi.....");  
        }
        else{
            System.out.println("digite um valor válido para buzinar");
        }              
    }
    boolean farol() {
        boolean oFarol;
        oFarol = this.farolOnOff; //recebe o valor que foi dado ao método e transfere para uma variável nesta class, então faz todo o processo
        if(oFarol == true){
            System.out.println("Farol aceso");
             oFarol = true;
        }
        else{
            System.out.println("Farol apagado");
            oFarol = false;
        }
        return oFarol;
    }
}
