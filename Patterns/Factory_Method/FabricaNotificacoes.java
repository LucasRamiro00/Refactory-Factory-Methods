package Patterns.Factory_Method;

public abstract class FabricaNotificacoes
{

    protected abstract IntNotificacoes criarNotificacoes();

    public void notificar()
    {
        IntNotificacoes notificacoes = criarNotificacoes();
        notificacoes.enviar();
    }
}