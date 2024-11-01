import models.Aluno;
import contracts.IPrincipal;

import java.time.LocalDateTime;
import java.util.Hashtable;

public class Principal implements IPrincipal {

    public static void main(String[] args) throws Exception {

        System.out.println("Args: " + args);

        Aluno aluno = new Aluno();
        aluno.idade = 26;
        aluno.nome = "Hernande Monteiro";
        aluno.curso = "Ciência da Computação";

        Hashtable<String, String> hashtable = new Hashtable<String, String>();

        hashtable.put("nome", "Hernande Monteiro");
        hashtable.put("idade", "26");
        hashtable.put("curso", "Ciência da Computação");

        System.out.println("\nName from hash: " + hashtable.get("nome"));

        System.out.println("\nNome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Curso: " + aluno.curso);

        System.out.println("\nHello, World!");

        // Condicional boba apenas para testar o funcionamento do if
        // if (3 == 3) {
        // System.out.println("3 es igual a 3");
        // }

        LocalDateTime data = LocalDateTime.now().plusDays(2);

        System.out.println("\nData: " + data);

    }

}
