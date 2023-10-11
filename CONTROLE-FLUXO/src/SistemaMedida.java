public class SistemaMedida {
    public static void main(String[] args) {
        String tamanho = "G";

       /* if(tamanho == "P")
            System.out.println("PEQUENO");
        else if(tamanho == "M")
            System.out.println("MEDIO");
        else if(tamanho == "G")
            System.out.println("GRANDE");
        else
            System.out.println("Selecione um tamanho!");*/


        // Exemplo com SWITCH Case ==================================================================

        switch (tamanho) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("Selecione um tamanho!");
        }
    }
}
