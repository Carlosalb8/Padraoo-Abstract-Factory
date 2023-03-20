public class Carro {
    private Acelerar acelerar;
    private Freiar freiar;

    public Carro(FabricaAbstrata fabrica) {
        this.acelerar = fabrica.createAceleracao();
        this.freiar = fabrica.createFrenagem();
    }

    public String acelerarCarro() {return this.acelerar.acelerar();}
    public String freiarCarro() {return this.freiar.freiar();}


}
