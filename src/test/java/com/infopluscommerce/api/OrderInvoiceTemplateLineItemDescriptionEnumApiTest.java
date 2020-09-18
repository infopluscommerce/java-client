/*
 * Infoplus API
 * Infoplus API.
 *
 * OpenAPI spec version: beta
 * Contact: api@infopluscommerce.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infopluscommerce.api;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.model.OrderInvoiceTemplateLineItemDescriptionEnum;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrderInvoiceTemplateLineItemDescriptionEnumApi
 */
@Ignore
public class OrderInvoiceTemplateLineItemDescriptionEnumApiTest {

    private final OrderInvoiceTemplateLineItemDescriptionEnumApi api = new OrderInvoiceTemplateLineItemDescriptionEnumApi();

    
    /**
     * Get an orderInvoiceTemplateLineItemDescriptionEnum by id
     *
     * Returns the orderInvoiceTemplateLineItemDescriptionEnum identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderInvoiceTemplateLineItemDescriptionEnumByIdTest() throws ApiException {
        String orderInvoiceTemplateLineItemDescriptionEnumId = null;
        OrderInvoiceTemplateLineItemDescriptionEnum response = api.getOrderInvoiceTemplateLineItemDescriptionEnumById(orderInvoiceTemplateLineItemDescriptionEnumId);

        // TODO: test validations
    }
    
    /**
     * Search orderInvoiceTemplateLineItemDescriptionEnums
     *
     * Returns the list of orderInvoiceTemplateLineItemDescriptionEnums that match the given searchText.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderInvoiceTemplateLineItemDescriptionEnumBySearchTextTest() throws ApiException {
        String searchText = null;
        Integer page = null;
        Integer limit = null;
        List<OrderInvoiceTemplateLineItemDescriptionEnum> response = api.getOrderInvoiceTemplateLineItemDescriptionEnumBySearchText(searchText, page, limit);

        // TODO: test validations
    }
    
}