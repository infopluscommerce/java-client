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
import com.infopluscommerce.model.InvoiceWorksheetLineDetail;
import com.infopluscommerce.model.RecordFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoiceWorksheetLineDetailApi
 */
@Ignore
public class InvoiceWorksheetLineDetailApiTest {

    private final InvoiceWorksheetLineDetailApi api = new InvoiceWorksheetLineDetailApi();

    
    /**
     * Add new audit for an invoiceWorksheetLineDetail
     *
     * Adds an audit to an existing invoiceWorksheetLineDetail.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addInvoiceWorksheetLineDetailAuditTest() throws ApiException {
        Integer invoiceWorksheetLineDetailId = null;
        String invoiceWorksheetLineDetailAudit = null;
        api.addInvoiceWorksheetLineDetailAudit(invoiceWorksheetLineDetailId, invoiceWorksheetLineDetailAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to an invoiceWorksheetLineDetail
     *
     * Adds a file to an existing invoiceWorksheetLineDetail.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addInvoiceWorksheetLineDetailFileTest() throws ApiException {
        Integer invoiceWorksheetLineDetailId = null;
        String fileName = null;
        api.addInvoiceWorksheetLineDetailFile(invoiceWorksheetLineDetailId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to an invoiceWorksheetLineDetail by URL.
     *
     * Adds a file to an existing invoiceWorksheetLineDetail by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addInvoiceWorksheetLineDetailFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer invoiceWorksheetLineDetailId = null;
        api.addInvoiceWorksheetLineDetailFileByURL(body, invoiceWorksheetLineDetailId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for an invoiceWorksheetLineDetail.
     *
     * Adds a tag to an existing invoiceWorksheetLineDetail.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addInvoiceWorksheetLineDetailTagTest() throws ApiException {
        Integer invoiceWorksheetLineDetailId = null;
        String invoiceWorksheetLineDetailTag = null;
        api.addInvoiceWorksheetLineDetailTag(invoiceWorksheetLineDetailId, invoiceWorksheetLineDetailTag);

        // TODO: test validations
    }
    
    /**
     * Delete a file for an invoiceWorksheetLineDetail.
     *
     * Deletes an existing invoiceWorksheetLineDetail file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInvoiceWorksheetLineDetailFileTest() throws ApiException {
        Integer invoiceWorksheetLineDetailId = null;
        Integer fileId = null;
        api.deleteInvoiceWorksheetLineDetailFile(invoiceWorksheetLineDetailId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for an invoiceWorksheetLineDetail.
     *
     * Deletes an existing invoiceWorksheetLineDetail tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInvoiceWorksheetLineDetailTagTest() throws ApiException {
        Integer invoiceWorksheetLineDetailId = null;
        String invoiceWorksheetLineDetailTag = null;
        api.deleteInvoiceWorksheetLineDetailTag(invoiceWorksheetLineDetailId, invoiceWorksheetLineDetailTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated an invoiceWorksheetLineDetail by id
     *
     * Returns a duplicated invoiceWorksheetLineDetail identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateInvoiceWorksheetLineDetailByIdTest() throws ApiException {
        Integer invoiceWorksheetLineDetailId = null;
        InvoiceWorksheetLineDetail response = api.getDuplicateInvoiceWorksheetLineDetailById(invoiceWorksheetLineDetailId);

        // TODO: test validations
    }
    
    /**
     * Search invoiceWorksheetLineDetails by filter
     *
     * Returns the list of invoiceWorksheetLineDetails that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceWorksheetLineDetailByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<InvoiceWorksheetLineDetail> response = api.getInvoiceWorksheetLineDetailByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get an invoiceWorksheetLineDetail by id
     *
     * Returns the invoiceWorksheetLineDetail identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceWorksheetLineDetailByIdTest() throws ApiException {
        Integer invoiceWorksheetLineDetailId = null;
        InvoiceWorksheetLineDetail response = api.getInvoiceWorksheetLineDetailById(invoiceWorksheetLineDetailId);

        // TODO: test validations
    }
    
    /**
     * Get the files for an invoiceWorksheetLineDetail.
     *
     * Get all existing invoiceWorksheetLineDetail files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceWorksheetLineDetailFilesTest() throws ApiException {
        Integer invoiceWorksheetLineDetailId = null;
        api.getInvoiceWorksheetLineDetailFiles(invoiceWorksheetLineDetailId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for an invoiceWorksheetLineDetail.
     *
     * Get all existing invoiceWorksheetLineDetail tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceWorksheetLineDetailTagsTest() throws ApiException {
        Integer invoiceWorksheetLineDetailId = null;
        api.getInvoiceWorksheetLineDetailTags(invoiceWorksheetLineDetailId);

        // TODO: test validations
    }
    
    /**
     * Update an invoiceWorksheetLineDetail custom fields
     *
     * Updates an existing invoiceWorksheetLineDetail custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateInvoiceWorksheetLineDetailCustomFieldsTest() throws ApiException {
        InvoiceWorksheetLineDetail body = null;
        api.updateInvoiceWorksheetLineDetailCustomFields(body);

        // TODO: test validations
    }
    
}
