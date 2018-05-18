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
import com.infopluscommerce.model.LocationFootprint;
import com.infopluscommerce.model.ModelApiResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocationFootprintApi
 */
@Ignore
public class LocationFootprintApiTest {

    private final LocationFootprintApi api = new LocationFootprintApi();

    
    /**
     * Create a locationFootprint
     *
     * Inserts a new locationFootprint using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLocationFootprintTest() throws ApiException {
        LocationFootprint body = null;
        LocationFootprint response = api.addLocationFootprint(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for a locationFootprint
     *
     * Adds an audit to an existing locationFootprint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLocationFootprintAuditTest() throws ApiException {
        Integer locationFootprintId = null;
        String locationFootprintAudit = null;
        api.addLocationFootprintAudit(locationFootprintId, locationFootprintAudit);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a locationFootprint.
     *
     * Adds a tag to an existing locationFootprint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLocationFootprintTagTest() throws ApiException {
        Integer locationFootprintId = null;
        String locationFootprintTag = null;
        api.addLocationFootprintTag(locationFootprintId, locationFootprintTag);

        // TODO: test validations
    }
    
    /**
     * Delete a locationFootprint
     *
     * Deletes the locationFootprint identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLocationFootprintTest() throws ApiException {
        Integer locationFootprintId = null;
        api.deleteLocationFootprint(locationFootprintId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a locationFootprint.
     *
     * Deletes an existing locationFootprint tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLocationFootprintTagTest() throws ApiException {
        Integer locationFootprintId = null;
        String locationFootprintTag = null;
        api.deleteLocationFootprintTag(locationFootprintId, locationFootprintTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a locationFootprint by id
     *
     * Returns a duplicated locationFootprint identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateLocationFootprintByIdTest() throws ApiException {
        Integer locationFootprintId = null;
        LocationFootprint response = api.getDuplicateLocationFootprintById(locationFootprintId);

        // TODO: test validations
    }
    
    /**
     * Search locationFootprints by filter
     *
     * Returns the list of locationFootprints that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationFootprintByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<LocationFootprint> response = api.getLocationFootprintByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a locationFootprint by id
     *
     * Returns the locationFootprint identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationFootprintByIdTest() throws ApiException {
        Integer locationFootprintId = null;
        LocationFootprint response = api.getLocationFootprintById(locationFootprintId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a locationFootprint.
     *
     * Get all existing locationFootprint tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationFootprintTagsTest() throws ApiException {
        Integer locationFootprintId = null;
        api.getLocationFootprintTags(locationFootprintId);

        // TODO: test validations
    }
    
    /**
     * Update a locationFootprint
     *
     * Updates an existing locationFootprint using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLocationFootprintTest() throws ApiException {
        LocationFootprint body = null;
        api.updateLocationFootprint(body);

        // TODO: test validations
    }
    
    /**
     * Update a locationFootprint custom fields
     *
     * Updates an existing locationFootprint custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLocationFootprintCustomFieldsTest() throws ApiException {
        LocationFootprint body = null;
        api.updateLocationFootprintCustomFields(body);

        // TODO: test validations
    }
    
}