package Patterns.Factory_Method;

public class EnvioPush implements IntNotificacoes
{
    @Override
    public void enviar()
    {
        System.out.println("Enviando por Push");
    }
}