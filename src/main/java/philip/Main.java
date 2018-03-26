package philip;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Config config = new Config();
        MainHandler mainHandler = new MainHandler(config.eventHandlersByType());
        mainHandler.handle(Event.builder().type("gps").build());
    }
}
