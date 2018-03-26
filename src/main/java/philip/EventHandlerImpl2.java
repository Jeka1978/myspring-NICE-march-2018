package philip;

/**
 * @author Evgeny Borisov
 */
public class EventHandlerImpl2 implements EventHandler {
    @Override
    public void handle(Event event) {
        System.out.println(2222);
    }
}
