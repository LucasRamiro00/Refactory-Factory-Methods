package Patterns.Factory_Method;

public class FabricaPush extends FabricaNotificacoes
{
    @Override
    protected IntNotificacoes criarNotificacoes()
    {
        return new EnvioPush();
    }
}