package Operadores;

import java.util.Scanner;

public class NotaFrequencia {
    Scanner sc = new Scanner (System.in);
    public void calcular(){
        System.out.println("Informe a nota 1 do Aluno");
        int nota1 = sc.nextInt();
        System.out.println("Informe a nota 2 do Aluno");
        int nota2 = sc.nextInt();
        //Operação Aritmética
        double media = (nota1+nota2)/2;
        // media = nota1
        // media += nota2 
        // meida /=2 //  caralho 
        System.out.println("A media do aluno é "+media);
        boolean mediaAprovada = media >= 50;
        System.out.println("O aluno está aprovado por Nota? "+mediaAprovada);
        System.out.println("Informe a Frequencia do aluno:");
        int Frequencia = sc.nextInt();
        boolean frequenciaAprovada = Frequencia >= 75;
        System.out.println("O aluno está aprovado por frequencia:"
        + frequenciaAprovada);
        boolean resultadoFinal = (mediaAprovada==true)&&(frequenciaAprovada==true);
        System.out.println("O aluno está aprovado no curso?;"
        + resultadoFinal );

    }

}
