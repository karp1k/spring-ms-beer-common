package guru.springframework.springmsbeercommon.web.config;

/**
 * @author kas
 */
public final class Constants {

    public static final String NEW_INVENTORY_QUEUE = "new-inventory";
    public static final String VALIDATE_ORDER_QUEUE = "validate-order";
    public static final String VALIDATE_ORDER_RESULT_QUEUE = "validate-order-result";
    public static final String ALLOCATE_ORDER_QUEUE = "allocate-order";
    public static final String ALLOCATE_ORDER_RESULT_QUEUE = "allocate-order-result";
    public static final String ALLOCATE_ORDER_FAILURE_QUEUE = "allocate-order-failure";
    public static final String DEALLOCATE_ORDER_QUEUE = "deallocate-order";
}
