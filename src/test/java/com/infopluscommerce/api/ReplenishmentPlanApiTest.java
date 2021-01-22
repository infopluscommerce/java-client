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
import com.infopluscommerce.model.ModelApiResponse;
import com.infopluscommerce.model.RecordFile;
import com.infopluscommerce.model.ReplenishmentPlan;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReplenishmentPlanApi
 */
@Ignore
public class ReplenishmentPlanApiTest {

    private final ReplenishmentPlanApi api = new ReplenishmentPlanApi();

    
    /**
     * Create a replenishmentPlan
     *
     * Inserts a new replenishmentPlan using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addReplenishmentPlanTest() throws ApiException {
        ReplenishmentPlan body = null;
        ReplenishmentPlan response = api.addReplenishmentPlan(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for a replenishmentPlan
     *
     * Adds an audit to an existing replenishmentPlan.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addReplenishmentPlanAuditTest() throws ApiException {
        Integer replenishmentPlanId = null;
        String replenishmentPlanAudit = null;
        api.addReplenishmentPlanAudit(replenishmentPlanId, replenishmentPlanAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a replenishmentPlan
     *
     * Adds a file to an existing replenishmentPlan.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addReplenishmentPlanFileTest() throws ApiException {
        Integer replenishmentPlanId = null;
        String fileName = null;
        api.addReplenishmentPlanFile(replenishmentPlanId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a replenishmentPlan by URL.
     *
     * Adds a file to an existing replenishmentPlan by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addReplenishmentPlanFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer replenishmentPlanId = null;
        api.addReplenishmentPlanFileByURL(body, replenishmentPlanId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a replenishmentPlan.
     *
     * Adds a tag to an existing replenishmentPlan.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addReplenishmentPlanTagTest() throws ApiException {
        Integer replenishmentPlanId = null;
        String replenishmentPlanTag = null;
        api.addReplenishmentPlanTag(replenishmentPlanId, replenishmentPlanTag);

        // TODO: test validations
    }
    
    /**
     * Delete a replenishmentPlan
     *
     * Deletes the replenishmentPlan identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteReplenishmentPlanTest() throws ApiException {
        Integer replenishmentPlanId = null;
        api.deleteReplenishmentPlan(replenishmentPlanId);

        // TODO: test validations
    }
    
    /**
     * Delete a file for a replenishmentPlan.
     *
     * Deletes an existing replenishmentPlan file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteReplenishmentPlanFileTest() throws ApiException {
        Integer replenishmentPlanId = null;
        Integer fileId = null;
        api.deleteReplenishmentPlanFile(replenishmentPlanId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a replenishmentPlan.
     *
     * Deletes an existing replenishmentPlan tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteReplenishmentPlanTagTest() throws ApiException {
        Integer replenishmentPlanId = null;
        String replenishmentPlanTag = null;
        api.deleteReplenishmentPlanTag(replenishmentPlanId, replenishmentPlanTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a replenishmentPlan by id
     *
     * Returns a duplicated replenishmentPlan identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateReplenishmentPlanByIdTest() throws ApiException {
        Integer replenishmentPlanId = null;
        ReplenishmentPlan response = api.getDuplicateReplenishmentPlanById(replenishmentPlanId);

        // TODO: test validations
    }
    
    /**
     * Search replenishmentPlans by filter
     *
     * Returns the list of replenishmentPlans that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReplenishmentPlanByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<ReplenishmentPlan> response = api.getReplenishmentPlanByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a replenishmentPlan by id
     *
     * Returns the replenishmentPlan identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReplenishmentPlanByIdTest() throws ApiException {
        Integer replenishmentPlanId = null;
        ReplenishmentPlan response = api.getReplenishmentPlanById(replenishmentPlanId);

        // TODO: test validations
    }
    
    /**
     * Get the files for a replenishmentPlan.
     *
     * Get all existing replenishmentPlan files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReplenishmentPlanFilesTest() throws ApiException {
        Integer replenishmentPlanId = null;
        api.getReplenishmentPlanFiles(replenishmentPlanId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a replenishmentPlan.
     *
     * Get all existing replenishmentPlan tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReplenishmentPlanTagsTest() throws ApiException {
        Integer replenishmentPlanId = null;
        api.getReplenishmentPlanTags(replenishmentPlanId);

        // TODO: test validations
    }
    
    /**
     * Update a replenishmentPlan
     *
     * Updates an existing replenishmentPlan using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateReplenishmentPlanTest() throws ApiException {
        ReplenishmentPlan body = null;
        api.updateReplenishmentPlan(body);

        // TODO: test validations
    }
    
    /**
     * Update a replenishmentPlan custom fields
     *
     * Updates an existing replenishmentPlan custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateReplenishmentPlanCustomFieldsTest() throws ApiException {
        ReplenishmentPlan body = null;
        api.updateReplenishmentPlanCustomFields(body);

        // TODO: test validations
    }
    
}