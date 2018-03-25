package ebay;

import com.nice.quoters.Quoter;
import lombok.Setter;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class EbayService {
    @Setter
    private List<Quoter> quoters;

    @EventListener(ContextRefreshedEvent.class)
    public void doWork() {
        for (Quoter quoter : quoters) {
            System.out.print("ebay says: ");
            quoter.sayQuote();
        }
    }
}
