package philip;

/**
 * @author Evgeny Borisov
 */
public class EventHandlerImpl3 implements EventHandler {
    @Override
    public void handle(Event event) {
        System.out.println(333);
    }
}
