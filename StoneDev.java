public class StoneDev extends Criatura{
	private static String NOME = "StoneDev";
	public StoneDev() {
		super(Tipo.TERRA,NOME);
	}

	@Override
	public void levarAtaqueElemental(Criatura criaturaAtacando,Criatura criaturaSendoAtacada) {
		int dano = 0;
		switch (criaturaAtacando.getTipo()) {
			case AGUA:
			case FOGO:	
				calcularDano(criaturaAtacando,criaturaSendoAtacada);
				break;
			case AR:
				dano = (criaturaAtacando.getPoder() * criaturaAtacando.getAtaque())/(criaturaSendoAtacada.getDefesa() * 2);
				receberDano(dano);
				break;
			default:
			System.out.println("Erro");
				break;
		}
	}

	@Override
    public Criatura[] criarInimigos() {
        return new Criatura[]{new BurnCoder(), new BreezeHacker(), new WaveNerd()};
    }

	@Override
	public String criarMensagemCriaturaCriada(){
		return "\nA poderosa criatura " + getNome() + " surgiu na batalha!\n\nEsses são os atributos dela:\nTipo: " + getTipo().toString() + "\nPontos de vida: "+ getPontoDeVida() + " \nPoder: " + getPoder() + "\nAtaque: " + getAtaque() + "\nDefesa: " + getDefesa() + "\nVelocidade: " + getVelocidade() + "\n\n";
	}

	@Override
	public void criarMensagemDeAtaqueFisico()	{
		System.out.printf("\nPrepare-se para ser esmagado pela força da terra!\n");
	}

	@Override
	public void criarMensagemDeAtaqueElemental() {
		System.out.printf("\nMeu ataque elemental fará você ser soterrado pela pela minha chuva de pedras!\n");
	}


}