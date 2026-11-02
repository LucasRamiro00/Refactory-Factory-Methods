package Patterns.Abstract_Factory;

public class Tela
{
    private final Botao botao;
    private final Input input;

    public Tela(Fabricas fabrica)
    {
        this.botao = fabrica.criarBotao();
        this.input = fabrica.criarInput();
    }
    public void renderizar()
    {
        botao.renderizarBotao();
        input.renderizarInput();
    }
}