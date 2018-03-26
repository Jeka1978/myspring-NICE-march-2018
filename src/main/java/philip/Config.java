package philip;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class Config {
    public Map<String,List<EventHandler>> eventHandlersByType(){
        HashMap<String, List<EventHandler>> map = new HashMap<>();
        map.put("gps", Arrays.asList(new EventHandlerImpl1(), new EventHandlerImpl2()));
        map.put("nav", Arrays.asList(new EventHandlerImpl3(), new EventHandlerImpl4(), new EventHandlerImpl5()));

        return map;

    }
}
