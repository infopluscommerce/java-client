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
import com.infopluscommerce.model.Carrier;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CarrierApi
 */
@Ignore
public class CarrierApiTest {

    private final CarrierApi api = new CarrierApi();

    
    /**
     * Get a carrier by id
     *
     * Returns the carrier identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCarrierByIdTest() throws ApiException {
        String carrierId = null;
        Carrier response = api.getCarrierById(carrierId);

        // TODO: test validations
    }
    
    /**
     * Search carriers
     *
     * Returns the list of carriers that match the given searchText.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCarrierBySearchTextTest() throws ApiException {
        String searchText = null;
        Integer page = null;
        Integer limit = null;
        List<Carrier> response = api.getCarrierBySearchText(searchText, page, limit);

        // TODO: test validations
    }
    
}
