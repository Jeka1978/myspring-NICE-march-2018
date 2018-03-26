package philip;

import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class MainHandler {
    private Map<String,List<EventHandler>> map;

    public MainHandler(Map<String, List<EventHandler>> map) {
        this.map = map;
    }

    public void handle(Event event) {
        List<EventHandler> eventHandlers = map.get(event.getType());
        eventHandlers.forEach(eventHandler -> eventHandler.handle(event));
    }
}
