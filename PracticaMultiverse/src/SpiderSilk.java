public class SpiderSilk extends Spiderhero implements SpiderSilkPowers{
    boolean superFlexibilidad = true;


    public SpiderSilk(String name, String file, int fuerza, int resistencia, int inteligencia) {
        super(name, file, fuerza, resistencia, inteligencia);
    }

    public void run() {
        spider.setTitle(name);
        spider.changeStyle("Georgia bold", 20, Colors.Desire);
        spider.out("\n\n!" + name + " Ataca!");
        try{
            Thread.sleep(1500);
            TrampaSeda();
            Thread.sleep(1000);
            CorteTelarana();
            Thread.sleep(1000);
            AtaqueRapido();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

    }
    public void TrampaSeda() {
        spider.out("\nSilk lanza una telaraña que inmobiliza a oponente\n");
        System.out.println("Silk lanza una telaraña que inmobiliza a oponente");
    }

    public void CorteTelarana() {
        spider.out("Silk lanza una telaraña afilada\n");
        System.out.println("Silk lanza una telaraña afilada");
    }

    public void AtaqueRapido() {
        spider.out("Silk se mueve a gran velocidad y golpea\n");
        System.out.println("Silk se mueve a gran velocidad y golpea");
    }
}
