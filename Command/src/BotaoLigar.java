
public class BotaoLigar implements ICommand {

	@Override
	public void precionar(Dispositivo d) {
		System.out.println(d.getNome() + " Ligado");	
	}
}