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
import com.infopluscommerce.model.InvoiceWorksheetLine;
import com.infopluscommerce.model.ModelApiResponse;
import com.infopluscommerce.model.RecordFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoiceWorksheetLineApi
 */
@Ignore
public class InvoiceWorksheetLineApiTest {

    private final InvoiceWorksheetLineApi api = new InvoiceWorksheetLineApi();

    
    /**
     * Create an invoiceWorksheetLine
     *
     * Inserts a new invoiceWorksheetLine using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addInvoiceWorksheetLineTest() throws ApiException {
        InvoiceWorksheetLine body = null;
        InvoiceWorksheetLine response = api.addInvoiceWorksheetLine(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for an invoiceWorksheetLine
     *
     * Adds an audit to an existing invoiceWorksheetLine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addInvoiceWorksheetLineAuditTest() throws ApiException {
        Integer invoiceWorksheetLineId = null;
        String invoiceWorksheetLineAudit = null;
        api.addInvoiceWorksheetLineAudit(invoiceWorksheetLineId, invoiceWorksheetLineAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to an invoiceWorksheetLine
     *
     * Adds a file to an existing invoiceWorksheetLine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addInvoiceWorksheetLineFileTest() throws ApiException {
        Integer invoiceWorksheetLineId = null;
        String fileName = null;
        api.addInvoiceWorksheetLineFile(invoiceWorksheetLineId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to an invoiceWorksheetLine by URL.
     *
     * Adds a file to an existing invoiceWorksheetLine by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addInvoiceWorksheetLineFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer invoiceWorksheetLineId = null;
        api.addInvoiceWorksheetLineFileByURL(body, invoiceWorksheetLineId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for an invoiceWorksheetLine.
     *
     * Adds a tag to an existing invoiceWorksheetLine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addInvoiceWorksheetLineTagTest() throws ApiException {
        Integer invoiceWorksheetLineId = null;
        String invoiceWorksheetLineTag = null;
        api.addInvoiceWorksheetLineTag(invoiceWorksheetLineId, invoiceWorksheetLineTag);

        // TODO: test validations
    }
    
    /**
     * Delete an invoiceWorksheetLine
     *
     * Deletes the invoiceWorksheetLine identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInvoiceWorksheetLineTest() throws ApiException {
        Integer invoiceWorksheetLineId = null;
        api.deleteInvoiceWorksheetLine(invoiceWorksheetLineId);

        // TODO: test validations
    }
    
    /**
     * Delete a file for an invoiceWorksheetLine.
     *
     * Deletes an existing invoiceWorksheetLine file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInvoiceWorksheetLineFileTest() throws ApiException {
        Integer invoiceWorksheetLineId = null;
        Integer fileId = null;
        api.deleteInvoiceWorksheetLineFile(invoiceWorksheetLineId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for an invoiceWorksheetLine.
     *
     * Deletes an existing invoiceWorksheetLine tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInvoiceWorksheetLineTagTest() throws ApiException {
        Integer invoiceWorksheetLineId = null;
        String invoiceWorksheetLineTag = null;
        api.deleteInvoiceWorksheetLineTag(invoiceWorksheetLineId, invoiceWorksheetLineTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated an invoiceWorksheetLine by id
     *
     * Returns a duplicated invoiceWorksheetLine identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateInvoiceWorksheetLineByIdTest() throws ApiException {
        Integer invoiceWorksheetLineId = null;
        InvoiceWorksheetLine response = api.getDuplicateInvoiceWorksheetLineById(invoiceWorksheetLineId);

        // TODO: test validations
    }
    
    /**
     * Search invoiceWorksheetLines by filter
     *
     * Returns the list of invoiceWorksheetLines that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceWorksheetLineByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<InvoiceWorksheetLine> response = api.getInvoiceWorksheetLineByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get an invoiceWorksheetLine by id
     *
     * Returns the invoiceWorksheetLine identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceWorksheetLineByIdTest() throws ApiException {
        Integer invoiceWorksheetLineId = null;
        InvoiceWorksheetLine response = api.getInvoiceWorksheetLineById(invoiceWorksheetLineId);

        // TODO: test validations
    }
    
    /**
     * Get the files for an invoiceWorksheetLine.
     *
     * Get all existing invoiceWorksheetLine files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceWorksheetLineFilesTest() throws ApiException {
        Integer invoiceWorksheetLineId = null;
        api.getInvoiceWorksheetLineFiles(invoiceWorksheetLineId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for an invoiceWorksheetLine.
     *
     * Get all existing invoiceWorksheetLine tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceWorksheetLineTagsTest() throws ApiException {
        Integer invoiceWorksheetLineId = null;
        api.getInvoiceWorksheetLineTags(invoiceWorksheetLineId);

        // TODO: test validations
    }
    
    /**
     * Update an invoiceWorksheetLine
     *
     * Updates an existing invoiceWorksheetLine using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateInvoiceWorksheetLineTest() throws ApiException {
        InvoiceWorksheetLine body = null;
        api.updateInvoiceWorksheetLine(body);

        // TODO: test validations
    }
    
}
