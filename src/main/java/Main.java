import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de turmas: ");
        int quantidadeTurmas = scanner.nextInt();

        if (quantidadeTurmas <= 0) {
            System.out.println("A quantidade de turmas deve ser um número positivo.");
        } else {
            int totalAlunos = 0;

            for (int turma = 1; turma <= quantidadeTurmas; turma++) {
                int quantidadeAlunos;
                do {
                    System.out.print("Digite a quantidade de alunos da turma " + turma + " (máximo 40): ");
                    quantidadeAlunos = scanner.nextInt();
                } while (quantidadeAlunos <= 0 || quantidadeAlunos > 40);

                totalAlunos += quantidadeAlunos;
            }

            double mediaAlunosPorTurma = (double) totalAlunos / quantidadeTurmas;
            System.out.println("\nNúmero médio de alunos por turma: " + mediaAlunosPorTurma);
        }

        scanner.close();
    }
}
