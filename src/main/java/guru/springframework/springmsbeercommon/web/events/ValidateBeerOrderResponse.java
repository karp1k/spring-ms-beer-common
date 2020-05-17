package guru.springframework.springmsbeercommon.web.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author kas
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ValidateBeerOrderResponse {

    private UUID orderId;
    private Boolean isValid;
}
