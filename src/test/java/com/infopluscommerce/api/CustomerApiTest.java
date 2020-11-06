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
import com.infopluscommerce.model.Customer;
import com.infopluscommerce.model.ModelApiResponse;
import com.infopluscommerce.model.RecordFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerApi
 */
@Ignore
public class CustomerApiTest {

    private final CustomerApi api = new CustomerApi();

    
    /**
     * Create a customer
     *
     * Inserts a new customer using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCustomerTest() throws ApiException {
        Customer body = null;
        Customer response = api.addCustomer(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for a customer
     *
     * Adds an audit to an existing customer.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCustomerAuditTest() throws ApiException {
        Integer customerId = null;
        String customerAudit = null;
        api.addCustomerAudit(customerId, customerAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a customer
     *
     * Adds a file to an existing customer.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCustomerFileTest() throws ApiException {
        Integer customerId = null;
        String fileName = null;
        api.addCustomerFile(customerId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a customer by URL.
     *
     * Adds a file to an existing customer by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCustomerFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer customerId = null;
        api.addCustomerFileByURL(body, customerId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a customer.
     *
     * Adds a tag to an existing customer.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCustomerTagTest() throws ApiException {
        Integer customerId = null;
        String customerTag = null;
        api.addCustomerTag(customerId, customerTag);

        // TODO: test validations
    }
    
    /**
     * Delete a customer
     *
     * Deletes the customer identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomerTest() throws ApiException {
        Integer customerId = null;
        api.deleteCustomer(customerId);

        // TODO: test validations
    }
    
    /**
     * Delete a file for a customer.
     *
     * Deletes an existing customer file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomerFileTest() throws ApiException {
        Integer customerId = null;
        Integer fileId = null;
        api.deleteCustomerFile(customerId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a customer.
     *
     * Deletes an existing customer tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomerTagTest() throws ApiException {
        Integer customerId = null;
        String customerTag = null;
        api.deleteCustomerTag(customerId, customerTag);

        // TODO: test validations
    }
    
    /**
     * Get a customer by Customer No
     *
     * Returns the customer identified by the specified parameters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByCustomerNoTest() throws ApiException {
        Integer lobId = null;
        String customerNo = null;
        Customer response = api.getByCustomerNo(lobId, customerNo);

        // TODO: test validations
    }
    
    /**
     * Search customers by filter
     *
     * Returns the list of customers that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<Customer> response = api.getCustomerByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a customer by id
     *
     * Returns the customer identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerByIdTest() throws ApiException {
        Integer customerId = null;
        Customer response = api.getCustomerById(customerId);

        // TODO: test validations
    }
    
    /**
     * Get the files for a customer.
     *
     * Get all existing customer files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerFilesTest() throws ApiException {
        Integer customerId = null;
        api.getCustomerFiles(customerId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a customer.
     *
     * Get all existing customer tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerTagsTest() throws ApiException {
        Integer customerId = null;
        api.getCustomerTags(customerId);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a customer by id
     *
     * Returns a duplicated customer identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateCustomerByIdTest() throws ApiException {
        Integer customerId = null;
        Customer response = api.getDuplicateCustomerById(customerId);

        // TODO: test validations
    }
    
    /**
     * Update a customer
     *
     * Updates an existing customer using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerTest() throws ApiException {
        Customer body = null;
        api.updateCustomer(body);

        // TODO: test validations
    }
    
    /**
     * Update a customer custom fields
     *
     * Updates an existing customer custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerCustomFieldsTest() throws ApiException {
        Customer body = null;
        api.updateCustomerCustomFields(body);

        // TODO: test validations
    }
    
}
