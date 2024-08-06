public class Calculadora 
{
    private Operacao operacao;
    
    public Calculadora(Operacao operacao)
    {
        this.operacao = operacao;
    }

    public double calcular(double num1, double num2)
    {
        return operacao.calcular(num1, num2);
    }
}
