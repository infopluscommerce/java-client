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
import com.infopluscommerce.model.JobTime;
import com.infopluscommerce.model.ModelApiResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobTimeApi
 */
@Ignore
public class JobTimeApiTest {

    private final JobTimeApi api = new JobTimeApi();

    
    /**
     * Create a jobTime
     *
     * Inserts a new jobTime using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addJobTimeTest() throws ApiException {
        JobTime body = null;
        JobTime response = api.addJobTime(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for a jobTime
     *
     * Adds an audit to an existing jobTime.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addJobTimeAuditTest() throws ApiException {
        Integer jobTimeId = null;
        String jobTimeAudit = null;
        api.addJobTimeAudit(jobTimeId, jobTimeAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a jobTime
     *
     * Adds a file to an existing jobTime.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addJobTimeFileTest() throws ApiException {
        Integer jobTimeId = null;
        String fileName = null;
        api.addJobTimeFile(jobTimeId, fileName);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a jobTime.
     *
     * Adds a tag to an existing jobTime.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addJobTimeTagTest() throws ApiException {
        Integer jobTimeId = null;
        String jobTimeTag = null;
        api.addJobTimeTag(jobTimeId, jobTimeTag);

        // TODO: test validations
    }
    
    /**
     * Delete a jobTime
     *
     * Deletes the jobTime identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJobTimeTest() throws ApiException {
        Integer jobTimeId = null;
        api.deleteJobTime(jobTimeId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a jobTime.
     *
     * Deletes an existing jobTime tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJobTimeTagTest() throws ApiException {
        Integer jobTimeId = null;
        String jobTimeTag = null;
        api.deleteJobTimeTag(jobTimeId, jobTimeTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a jobTime by id
     *
     * Returns a duplicated jobTime identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateJobTimeByIdTest() throws ApiException {
        Integer jobTimeId = null;
        JobTime response = api.getDuplicateJobTimeById(jobTimeId);

        // TODO: test validations
    }
    
    /**
     * Search jobTimes by filter
     *
     * Returns the list of jobTimes that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobTimeByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<JobTime> response = api.getJobTimeByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a jobTime by id
     *
     * Returns the jobTime identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobTimeByIdTest() throws ApiException {
        Integer jobTimeId = null;
        JobTime response = api.getJobTimeById(jobTimeId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a jobTime.
     *
     * Get all existing jobTime tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobTimeTagsTest() throws ApiException {
        Integer jobTimeId = null;
        api.getJobTimeTags(jobTimeId);

        // TODO: test validations
    }
    
    /**
     * Update a jobTime
     *
     * Updates an existing jobTime using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateJobTimeTest() throws ApiException {
        JobTime body = null;
        api.updateJobTime(body);

        // TODO: test validations
    }
    
    /**
     * Update a jobTime custom fields
     *
     * Updates an existing jobTime custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateJobTimeCustomFieldsTest() throws ApiException {
        JobTime body = null;
        api.updateJobTimeCustomFields(body);

        // TODO: test validations
    }
    
}
