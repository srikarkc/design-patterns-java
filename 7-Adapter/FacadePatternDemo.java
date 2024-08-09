public class FacadePatternDemo {
    public static void main(String[] args) {
        // Create subsystem objects
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();

        // Create facade object
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector);

        // Use the facade to control the subsystem
        homeTheater.watchMovie();
        homeTheater.endMovie();
    }
}
