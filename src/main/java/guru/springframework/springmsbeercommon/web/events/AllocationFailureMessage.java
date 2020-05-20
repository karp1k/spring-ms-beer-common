package guru.springframework.springmsbeercommon.web.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author kas
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllocationFailureMessage implements Serializable {

    static final long serialVersionUID = 3926323797003841123L;

    private UUID orderId;
}
