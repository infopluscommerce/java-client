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
import com.infopluscommerce.model.Shipment;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShipmentApi
 */
@Ignore
public class ShipmentApiTest {

    private final ShipmentApi api = new ShipmentApi();

    
    /**
     * Add new audit for a shipment
     *
     * Adds an audit to an existing shipment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addShipmentAuditTest() throws ApiException {
        Integer shipmentId = null;
        String shipmentAudit = null;
        api.addShipmentAudit(shipmentId, shipmentAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a shipment
     *
     * Adds a file to an existing shipment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addShipmentFileTest() throws ApiException {
        Integer shipmentId = null;
        String fileName = null;
        api.addShipmentFile(shipmentId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a shipment by URL.
     *
     * Adds a file to an existing shipment by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addShipmentFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer shipmentId = null;
        api.addShipmentFileByURL(body, shipmentId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a shipment.
     *
     * Adds a tag to an existing shipment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addShipmentTagTest() throws ApiException {
        Integer shipmentId = null;
        String shipmentTag = null;
        api.addShipmentTag(shipmentId, shipmentTag);

        // TODO: test validations
    }
    
    /**
     * Delete a file for a shipment.
     *
     * Deletes an existing shipment file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteShipmentFileTest() throws ApiException {
        Integer shipmentId = null;
        Integer fileId = null;
        api.deleteShipmentFile(shipmentId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a shipment.
     *
     * Deletes an existing shipment tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteShipmentTagTest() throws ApiException {
        Integer shipmentId = null;
        String shipmentTag = null;
        api.deleteShipmentTag(shipmentId, shipmentTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a shipment by id
     *
     * Returns a duplicated shipment identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateShipmentByIdTest() throws ApiException {
        Integer shipmentId = null;
        Shipment response = api.getDuplicateShipmentById(shipmentId);

        // TODO: test validations
    }
    
    /**
     * Search shipments by filter
     *
     * Returns the list of shipments that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShipmentByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<Shipment> response = api.getShipmentByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a shipment by id
     *
     * Returns the shipment identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShipmentByIdTest() throws ApiException {
        Integer shipmentId = null;
        Shipment response = api.getShipmentById(shipmentId);

        // TODO: test validations
    }
    
    /**
     * Get the files for a shipment.
     *
     * Get all existing shipment files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShipmentFilesTest() throws ApiException {
        Integer shipmentId = null;
        api.getShipmentFiles(shipmentId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a shipment.
     *
     * Get all existing shipment tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShipmentTagsTest() throws ApiException {
        Integer shipmentId = null;
        api.getShipmentTags(shipmentId);

        // TODO: test validations
    }
    
    /**
     * Update a shipment custom fields
     *
     * Updates an existing shipment custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateShipmentCustomFieldsTest() throws ApiException {
        Shipment body = null;
        api.updateShipmentCustomFields(body);

        // TODO: test validations
    }
    
}
