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
import com.infopluscommerce.model.RecordFile;
import com.infopluscommerce.model.Work;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkApi
 */
@Ignore
public class WorkApiTest {

    private final WorkApi api = new WorkApi();

    
    /**
     * Add new audit for a work
     *
     * Adds an audit to an existing work.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addWorkAuditTest() throws ApiException {
        Integer workId = null;
        String workAudit = null;
        api.addWorkAudit(workId, workAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a work
     *
     * Adds a file to an existing work.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addWorkFileTest() throws ApiException {
        Integer workId = null;
        String fileName = null;
        api.addWorkFile(workId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a work by URL.
     *
     * Adds a file to an existing work by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addWorkFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer workId = null;
        api.addWorkFileByURL(body, workId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a work.
     *
     * Adds a tag to an existing work.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addWorkTagTest() throws ApiException {
        Integer workId = null;
        String workTag = null;
        api.addWorkTag(workId, workTag);

        // TODO: test validations
    }
    
    /**
     * Delete a file for a work.
     *
     * Deletes an existing work file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWorkFileTest() throws ApiException {
        Integer workId = null;
        Integer fileId = null;
        api.deleteWorkFile(workId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a work.
     *
     * Deletes an existing work tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWorkTagTest() throws ApiException {
        Integer workId = null;
        String workTag = null;
        api.deleteWorkTag(workId, workTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a work by id
     *
     * Returns a duplicated work identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateWorkByIdTest() throws ApiException {
        Integer workId = null;
        Work response = api.getDuplicateWorkById(workId);

        // TODO: test validations
    }
    
    /**
     * Search works by filter
     *
     * Returns the list of works that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<Work> response = api.getWorkByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a work by id
     *
     * Returns the work identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkByIdTest() throws ApiException {
        Integer workId = null;
        Work response = api.getWorkById(workId);

        // TODO: test validations
    }
    
    /**
     * Get the files for a work.
     *
     * Get all existing work files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkFilesTest() throws ApiException {
        Integer workId = null;
        api.getWorkFiles(workId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a work.
     *
     * Get all existing work tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkTagsTest() throws ApiException {
        Integer workId = null;
        api.getWorkTags(workId);

        // TODO: test validations
    }
    
    /**
     * Update a work
     *
     * Updates an existing work using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWorkTest() throws ApiException {
        Work body = null;
        api.updateWork(body);

        // TODO: test validations
    }
    
    /**
     * Update a work custom fields
     *
     * Updates an existing work custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWorkCustomFieldsTest() throws ApiException {
        Work body = null;
        api.updateWorkCustomFields(body);

        // TODO: test validations
    }
    
}