public class shapeArea {
    public static void main(String[] args) {
        int res = 0, area = 1, n = 4;
        //usando for para percorrer em desde o primeiro poligono até o poligo n = número
        //cont =1 pois não existe o poligono de número 0
        for(int cont = 1;  cont <= n; cont++){
            res = (cont * 4) - 4;
            area += + res;
        }
        System.out.printf("%d", area);
    }
}
/* LOGIC
4 it's because we count twice times the border squares
12 it's for all the squares i count
12 - 4 = 8 additionals squares
substituindo 12 por (n * 4) continuamos
tendo 12 de resultado se n = 3 (n = entrada de random values)

another example
16 - 4 = 12 additionals squares
*/