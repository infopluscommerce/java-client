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
import com.infopluscommerce.model.ItemProductCode;
import com.infopluscommerce.model.ModelApiResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ItemProductCodeApi
 */
@Ignore
public class ItemProductCodeApiTest {

    private final ItemProductCodeApi api = new ItemProductCodeApi();

    
    /**
     * Create an itemProductCode
     *
     * Inserts a new itemProductCode using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemProductCodeTest() throws ApiException {
        ItemProductCode body = null;
        ItemProductCode response = api.addItemProductCode(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for an itemProductCode
     *
     * Adds an audit to an existing itemProductCode.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemProductCodeAuditTest() throws ApiException {
        Integer itemProductCodeId = null;
        String itemProductCodeAudit = null;
        api.addItemProductCodeAudit(itemProductCodeId, itemProductCodeAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to an itemProductCode
     *
     * Adds a file to an existing itemProductCode.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemProductCodeFileTest() throws ApiException {
        Integer itemProductCodeId = null;
        String fileName = null;
        api.addItemProductCodeFile(itemProductCodeId, fileName);

        // TODO: test validations
    }
    
    /**
     * Add new tags for an itemProductCode.
     *
     * Adds a tag to an existing itemProductCode.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemProductCodeTagTest() throws ApiException {
        Integer itemProductCodeId = null;
        String itemProductCodeTag = null;
        api.addItemProductCodeTag(itemProductCodeId, itemProductCodeTag);

        // TODO: test validations
    }
    
    /**
     * Delete an itemProductCode
     *
     * Deletes the itemProductCode identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteItemProductCodeTest() throws ApiException {
        Integer itemProductCodeId = null;
        api.deleteItemProductCode(itemProductCodeId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for an itemProductCode.
     *
     * Deletes an existing itemProductCode tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteItemProductCodeTagTest() throws ApiException {
        Integer itemProductCodeId = null;
        String itemProductCodeTag = null;
        api.deleteItemProductCodeTag(itemProductCodeId, itemProductCodeTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated an itemProductCode by id
     *
     * Returns a duplicated itemProductCode identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateItemProductCodeByIdTest() throws ApiException {
        Integer itemProductCodeId = null;
        ItemProductCode response = api.getDuplicateItemProductCodeById(itemProductCodeId);

        // TODO: test validations
    }
    
    /**
     * Search itemProductCodes by filter
     *
     * Returns the list of itemProductCodes that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemProductCodeByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<ItemProductCode> response = api.getItemProductCodeByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get an itemProductCode by id
     *
     * Returns the itemProductCode identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemProductCodeByIdTest() throws ApiException {
        Integer itemProductCodeId = null;
        ItemProductCode response = api.getItemProductCodeById(itemProductCodeId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for an itemProductCode.
     *
     * Get all existing itemProductCode tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemProductCodeTagsTest() throws ApiException {
        Integer itemProductCodeId = null;
        api.getItemProductCodeTags(itemProductCodeId);

        // TODO: test validations
    }
    
    /**
     * Update an itemProductCode
     *
     * Updates an existing itemProductCode using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateItemProductCodeTest() throws ApiException {
        ItemProductCode body = null;
        api.updateItemProductCode(body);

        // TODO: test validations
    }
    
}
