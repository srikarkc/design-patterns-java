public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        projector.on();
        dvdPlayer.on();
        dvdPlayer.play();
    }

    public void endMovie() {
        System.out.println("Shutting down the movie theater...");
        projector.off();
        dvdPlayer.off();
    }
}
