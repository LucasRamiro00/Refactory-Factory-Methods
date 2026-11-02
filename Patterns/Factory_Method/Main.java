package Patterns.Factory_Method;

public class Main
{
    public static void main(String[] args)
    {
        executar(new FabricaEmail());
        executar(new FabricaSMS());
        executar(new FabricaPush());
    }

    private static void executar(FabricaNotificacoes fabrica)
    {
        fabrica.notificar();
    }
}