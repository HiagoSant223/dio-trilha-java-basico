public class ForArray {
    public static void main(String[] args) {
        String alunos [] = {"HIAGO", "FELIPE", "MARIANA", "PAI"};

        /*for (int x=0; x<alunos.length; x++){
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        }*/

        // exemplo com For  =================================

        for (String aluno : alunos){
            System.out.println("Nome do aulo é: " + aluno);
        }
    }
}
