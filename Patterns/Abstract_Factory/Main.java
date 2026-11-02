package Patterns.Abstract_Factory;

public class Main
{
    public static void main(String[] args)
    {
        executar(new FabricaAndroid());
        executar(new FabricaIOS());
        executar(new FabricaWindows());
    }

    private static void executar(Fabricas fabrica)
    {
        new Tela(fabrica).renderizar();
    }
}