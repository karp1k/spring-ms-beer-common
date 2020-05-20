package guru.springframework.springmsbeercommon.web.events;

import guru.springframework.springmsbeercommon.web.model.BeerOrderDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author kas
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DeallocateOrderRequest implements Serializable {

    static final long serialVersionUID = -4716515425429340339L;

    private BeerOrderDto beerOrderDto;

}
