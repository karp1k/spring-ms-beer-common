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
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ValidateBeerOrderResponse implements Serializable {

    static final long serialVersionUID = -8324186440818540959L;

    private UUID orderId;
    private Boolean isValid;
}
