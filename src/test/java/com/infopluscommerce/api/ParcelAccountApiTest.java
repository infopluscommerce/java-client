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
import com.infopluscommerce.model.ParcelAccount;
import com.infopluscommerce.model.RecordFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ParcelAccountApi
 */
@Ignore
public class ParcelAccountApiTest {

    private final ParcelAccountApi api = new ParcelAccountApi();

    
    /**
     * Create a parcelAccount
     *
     * Inserts a new parcelAccount using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addParcelAccountTest() throws ApiException {
        ParcelAccount body = null;
        ParcelAccount response = api.addParcelAccount(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for a parcelAccount
     *
     * Adds an audit to an existing parcelAccount.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addParcelAccountAuditTest() throws ApiException {
        Integer parcelAccountId = null;
        String parcelAccountAudit = null;
        api.addParcelAccountAudit(parcelAccountId, parcelAccountAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a parcelAccount
     *
     * Adds a file to an existing parcelAccount.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addParcelAccountFileTest() throws ApiException {
        Integer parcelAccountId = null;
        String fileName = null;
        api.addParcelAccountFile(parcelAccountId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a parcelAccount by URL.
     *
     * Adds a file to an existing parcelAccount by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addParcelAccountFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer parcelAccountId = null;
        api.addParcelAccountFileByURL(body, parcelAccountId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a parcelAccount.
     *
     * Adds a tag to an existing parcelAccount.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addParcelAccountTagTest() throws ApiException {
        Integer parcelAccountId = null;
        String parcelAccountTag = null;
        api.addParcelAccountTag(parcelAccountId, parcelAccountTag);

        // TODO: test validations
    }
    
    /**
     * Delete a file for a parcelAccount.
     *
     * Deletes an existing parcelAccount file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParcelAccountFileTest() throws ApiException {
        Integer parcelAccountId = null;
        Integer fileId = null;
        api.deleteParcelAccountFile(parcelAccountId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a parcelAccount.
     *
     * Deletes an existing parcelAccount tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParcelAccountTagTest() throws ApiException {
        Integer parcelAccountId = null;
        String parcelAccountTag = null;
        api.deleteParcelAccountTag(parcelAccountId, parcelAccountTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a parcelAccount by id
     *
     * Returns a duplicated parcelAccount identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateParcelAccountByIdTest() throws ApiException {
        Integer parcelAccountId = null;
        ParcelAccount response = api.getDuplicateParcelAccountById(parcelAccountId);

        // TODO: test validations
    }
    
    /**
     * Search parcelAccounts by filter
     *
     * Returns the list of parcelAccounts that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParcelAccountByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<ParcelAccount> response = api.getParcelAccountByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a parcelAccount by id
     *
     * Returns the parcelAccount identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParcelAccountByIdTest() throws ApiException {
        Integer parcelAccountId = null;
        ParcelAccount response = api.getParcelAccountById(parcelAccountId);

        // TODO: test validations
    }
    
    /**
     * Get the files for a parcelAccount.
     *
     * Get all existing parcelAccount files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParcelAccountFilesTest() throws ApiException {
        Integer parcelAccountId = null;
        api.getParcelAccountFiles(parcelAccountId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a parcelAccount.
     *
     * Get all existing parcelAccount tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParcelAccountTagsTest() throws ApiException {
        Integer parcelAccountId = null;
        api.getParcelAccountTags(parcelAccountId);

        // TODO: test validations
    }
    
    /**
     * Update a parcelAccount
     *
     * Updates an existing parcelAccount using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateParcelAccountTest() throws ApiException {
        ParcelAccount body = null;
        api.updateParcelAccount(body);

        // TODO: test validations
    }
    
    /**
     * Update a parcelAccount custom fields
     *
     * Updates an existing parcelAccount custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateParcelAccountCustomFieldsTest() throws ApiException {
        ParcelAccount body = null;
        api.updateParcelAccountCustomFields(body);

        // TODO: test validations
    }
    
}
