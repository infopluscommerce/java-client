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
import com.infopluscommerce.model.ThirdPartyParcelAccount;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ThirdPartyParcelAccountApi
 */
@Ignore
public class ThirdPartyParcelAccountApiTest {

    private final ThirdPartyParcelAccountApi api = new ThirdPartyParcelAccountApi();

    
    /**
     * Create a thirdPartyParcelAccount
     *
     * Inserts a new thirdPartyParcelAccount using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addThirdPartyParcelAccountTest() throws ApiException {
        ThirdPartyParcelAccount body = null;
        ThirdPartyParcelAccount response = api.addThirdPartyParcelAccount(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for a thirdPartyParcelAccount
     *
     * Adds an audit to an existing thirdPartyParcelAccount.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addThirdPartyParcelAccountAuditTest() throws ApiException {
        Integer thirdPartyParcelAccountId = null;
        String thirdPartyParcelAccountAudit = null;
        api.addThirdPartyParcelAccountAudit(thirdPartyParcelAccountId, thirdPartyParcelAccountAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a thirdPartyParcelAccount
     *
     * Adds a file to an existing thirdPartyParcelAccount.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addThirdPartyParcelAccountFileTest() throws ApiException {
        Integer thirdPartyParcelAccountId = null;
        String fileName = null;
        api.addThirdPartyParcelAccountFile(thirdPartyParcelAccountId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a thirdPartyParcelAccount by URL.
     *
     * Adds a file to an existing thirdPartyParcelAccount by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addThirdPartyParcelAccountFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer thirdPartyParcelAccountId = null;
        api.addThirdPartyParcelAccountFileByURL(body, thirdPartyParcelAccountId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a thirdPartyParcelAccount.
     *
     * Adds a tag to an existing thirdPartyParcelAccount.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addThirdPartyParcelAccountTagTest() throws ApiException {
        Integer thirdPartyParcelAccountId = null;
        String thirdPartyParcelAccountTag = null;
        api.addThirdPartyParcelAccountTag(thirdPartyParcelAccountId, thirdPartyParcelAccountTag);

        // TODO: test validations
    }
    
    /**
     * Delete a thirdPartyParcelAccount
     *
     * Deletes the thirdPartyParcelAccount identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteThirdPartyParcelAccountTest() throws ApiException {
        Integer thirdPartyParcelAccountId = null;
        api.deleteThirdPartyParcelAccount(thirdPartyParcelAccountId);

        // TODO: test validations
    }
    
    /**
     * Delete a file for a thirdPartyParcelAccount.
     *
     * Deletes an existing thirdPartyParcelAccount file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteThirdPartyParcelAccountFileTest() throws ApiException {
        Integer thirdPartyParcelAccountId = null;
        Integer fileId = null;
        api.deleteThirdPartyParcelAccountFile(thirdPartyParcelAccountId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a thirdPartyParcelAccount.
     *
     * Deletes an existing thirdPartyParcelAccount tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteThirdPartyParcelAccountTagTest() throws ApiException {
        Integer thirdPartyParcelAccountId = null;
        String thirdPartyParcelAccountTag = null;
        api.deleteThirdPartyParcelAccountTag(thirdPartyParcelAccountId, thirdPartyParcelAccountTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a thirdPartyParcelAccount by id
     *
     * Returns a duplicated thirdPartyParcelAccount identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateThirdPartyParcelAccountByIdTest() throws ApiException {
        Integer thirdPartyParcelAccountId = null;
        ThirdPartyParcelAccount response = api.getDuplicateThirdPartyParcelAccountById(thirdPartyParcelAccountId);

        // TODO: test validations
    }
    
    /**
     * Search thirdPartyParcelAccounts by filter
     *
     * Returns the list of thirdPartyParcelAccounts that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getThirdPartyParcelAccountByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<ThirdPartyParcelAccount> response = api.getThirdPartyParcelAccountByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a thirdPartyParcelAccount by id
     *
     * Returns the thirdPartyParcelAccount identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getThirdPartyParcelAccountByIdTest() throws ApiException {
        Integer thirdPartyParcelAccountId = null;
        ThirdPartyParcelAccount response = api.getThirdPartyParcelAccountById(thirdPartyParcelAccountId);

        // TODO: test validations
    }
    
    /**
     * Get the files for a thirdPartyParcelAccount.
     *
     * Get all existing thirdPartyParcelAccount files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getThirdPartyParcelAccountFilesTest() throws ApiException {
        Integer thirdPartyParcelAccountId = null;
        api.getThirdPartyParcelAccountFiles(thirdPartyParcelAccountId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a thirdPartyParcelAccount.
     *
     * Get all existing thirdPartyParcelAccount tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getThirdPartyParcelAccountTagsTest() throws ApiException {
        Integer thirdPartyParcelAccountId = null;
        api.getThirdPartyParcelAccountTags(thirdPartyParcelAccountId);

        // TODO: test validations
    }
    
    /**
     * Update a thirdPartyParcelAccount
     *
     * Updates an existing thirdPartyParcelAccount using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateThirdPartyParcelAccountTest() throws ApiException {
        ThirdPartyParcelAccount body = null;
        api.updateThirdPartyParcelAccount(body);

        // TODO: test validations
    }
    
    /**
     * Update a thirdPartyParcelAccount custom fields
     *
     * Updates an existing thirdPartyParcelAccount custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateThirdPartyParcelAccountCustomFieldsTest() throws ApiException {
        ThirdPartyParcelAccount body = null;
        api.updateThirdPartyParcelAccountCustomFields(body);

        // TODO: test validations
    }
    
}
