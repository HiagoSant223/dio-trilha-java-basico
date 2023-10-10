public class Operadores {
    public static void main(String[] args){

        int numero = 5;

        //x repeticao
        numero++;
        //numero = numero + 1

        System.out.println(numero);

        boolean variavel = true;

        System.out.println(!variavel);


        int c, d;

        c = 10;
        d = 10;

        /*String resultado2 = "";
        if(c==d)
            resultado2 = "verdadeiro";
        else
            resultado2 = "falso";*/

        String resultado2 = c==d ? "Verdadeiro" : "Falso"; // Função usando Operador Ternário. " ? "se a condição acontecer e " : " se não;

        System.out.println(resultado2);

    }

    public void metodo2 (int num1, int num2) {
        
    }
}


