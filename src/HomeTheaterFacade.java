public class HomeTheaterFacade {
    private AparelhoDVD AparelhoDVD;
    private BarraDeSom soundSystem;
    private TV tv;

    public HomeTheaterFacade() {
        AparelhoDVD = new AparelhoDVD();
        soundSystem = new BarraDeSom();
        tv = new TV();
    }

    public void assistirFilme(String movie) {
        System.out.println("Preparando para ver o filme...");
        AparelhoDVD.ligar();
        AparelhoDVD.tocar(movie);
        soundSystem.ligar();
        soundSystem.mudaVolume(8);
        tv.ligar();
        tv.mudarCanal("TV Aberta");
    }

    public void terminarFilme() {
        System.out.println("Desligando o home theater...");
        AparelhoDVD.desligar();
        soundSystem.desligar();
        tv.desligar();
    }
}
