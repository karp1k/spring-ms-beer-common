package guru.springframework.springmsbeercommon.web.events;

import guru.springframework.springmsbeercommon.web.model.BeerOrderDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * payload for jms
 * @author kas
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ValidateBeerOrderRequest implements Serializable {

    static final long serialVersionUID = 8642276394226869627L;

    BeerOrderDto beerOrderDto;
}
