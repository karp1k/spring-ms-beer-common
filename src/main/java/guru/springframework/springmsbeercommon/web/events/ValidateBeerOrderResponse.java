package guru.springframework.springmsbeercommon.web.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kas
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ValidateBeerOrderResponse {

    Boolean isValid;
}
