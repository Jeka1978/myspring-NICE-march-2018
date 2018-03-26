package philip;

/**
 * @author Evgeny Borisov
 */
public class EventHandlerImpl1 implements EventHandler {
    @Override
    public void handle(Event event) {
        System.out.println(1111);
    }
}
