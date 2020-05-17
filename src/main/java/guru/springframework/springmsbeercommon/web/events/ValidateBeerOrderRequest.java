package guru.springframework.springmsbeercommon.web.events;

import guru.springframework.springmsbeercommon.web.model.BeerOrderDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * payload for jms
 * @author kas
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ValidateBeerOrderRequest {

    BeerOrderDto beerOrderDto;
}
