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
import com.infopluscommerce.model.PackingSlipTemplateLineItemDescriptionEnum;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PackingSlipTemplateLineItemDescriptionEnumApi
 */
@Ignore
public class PackingSlipTemplateLineItemDescriptionEnumApiTest {

    private final PackingSlipTemplateLineItemDescriptionEnumApi api = new PackingSlipTemplateLineItemDescriptionEnumApi();

    
    /**
     * Get a packingSlipTemplateLineItemDescriptionEnum by id
     *
     * Returns the packingSlipTemplateLineItemDescriptionEnum identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPackingSlipTemplateLineItemDescriptionEnumByIdTest() throws ApiException {
        String packingSlipTemplateLineItemDescriptionEnumId = null;
        PackingSlipTemplateLineItemDescriptionEnum response = api.getPackingSlipTemplateLineItemDescriptionEnumById(packingSlipTemplateLineItemDescriptionEnumId);

        // TODO: test validations
    }
    
    /**
     * Search packingSlipTemplateLineItemDescriptionEnums
     *
     * Returns the list of packingSlipTemplateLineItemDescriptionEnums that match the given searchText.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPackingSlipTemplateLineItemDescriptionEnumBySearchTextTest() throws ApiException {
        String searchText = null;
        Integer page = null;
        Integer limit = null;
        List<PackingSlipTemplateLineItemDescriptionEnum> response = api.getPackingSlipTemplateLineItemDescriptionEnumBySearchText(searchText, page, limit);

        // TODO: test validations
    }
    
}