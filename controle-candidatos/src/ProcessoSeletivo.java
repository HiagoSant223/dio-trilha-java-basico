import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args){
        String [] candidatos = {"HIAGO", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato (String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do {
            atendeu = antender();
            continuaTentando = !atendeu;
            if(continuaTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuaTentando && tentativasRealizadas < 3);

        if(atendeu)
         System.out.println("Conseguimos contato com " + candidato + " Na " + tentativasRealizadas + " Tentativa ");
        else
         System.out.println("Não conseguimos contato com " + candidato + ", numero maximo tentativas " + tentativasRealizadas + " Realizada");
    }

    //metodo auxiliar
    static boolean antender (){
        return new Random().nextInt(3)==1;
    }


    static void imprimirSelecionados(){
        String [] candidatos = {"HIAGO", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Lista de selecionados");

        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + indice + " é o " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"HIAGO", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para vaga ");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
        


    static void analisarCandidato(double salarioPretendido){
        
        double salarioBase = 2000.0;


        if(salarioBase > salarioPretendido) {
             System.out.println("LIGAR PARA CANDIDATO");
        }else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }


    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
