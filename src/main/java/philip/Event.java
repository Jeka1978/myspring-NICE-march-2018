package philip;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Event {
    private String type;
    private String content;
}
