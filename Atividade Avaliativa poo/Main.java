/*
 * Atividade avaliativa de Programação orientada a objetos II
 * @authors Nícolas André e Jefferson Eduardo
 */

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) 
        {
            System.out.println("Insira o primeiro número:");
            double num1 = scanner.nextDouble();

            System.out.println("Insira o segundo número:");
            double num2 = scanner.nextDouble();

            System.out.println("Insira a operação desejada (+, -, *, /):");
            String operacao = scanner.next();

            Operacao op;
            switch (operacao) 
            {
                case "+":
                    op = new Soma();
                    break;
                case "-":
                    op = new Subtracao();
                    break;
                case "*":
                    op = new Multiplicacao();
                    break;
                case "/":
                    op = new Divisao();
                    break;
                default:
                    System.out.println("Operação inválida");
                    continue;
            }

            Calculadora calculadora = new Calculadora(op);
            try 
            {
                double resultado = calculadora.calcular(num1, num2);
                System.out.println("Resultado: " + resultado);
            } catch (ArithmeticException e) 
            {
                System.out.println(e.getMessage());
            }

            System.out.println("Deseja continuar? (s/n)");
            String resposta = scanner.next();
            
            if (!resposta.equalsIgnoreCase("s")) 
            {
                continuar = false;
            }
        }

        scanner.close();
    }
}
