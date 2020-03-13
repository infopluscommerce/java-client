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
import com.infopluscommerce.model.CartonType;
import com.infopluscommerce.model.ModelApiResponse;
import com.infopluscommerce.model.RecordFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CartonTypeApi
 */
@Ignore
public class CartonTypeApiTest {

    private final CartonTypeApi api = new CartonTypeApi();

    
    /**
     * Create a cartonType
     *
     * Inserts a new cartonType using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCartonTypeTest() throws ApiException {
        CartonType body = null;
        CartonType response = api.addCartonType(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for a cartonType
     *
     * Adds an audit to an existing cartonType.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCartonTypeAuditTest() throws ApiException {
        Integer cartonTypeId = null;
        String cartonTypeAudit = null;
        api.addCartonTypeAudit(cartonTypeId, cartonTypeAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a cartonType
     *
     * Adds a file to an existing cartonType.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCartonTypeFileTest() throws ApiException {
        Integer cartonTypeId = null;
        String fileName = null;
        api.addCartonTypeFile(cartonTypeId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a cartonType by URL.
     *
     * Adds a file to an existing cartonType by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCartonTypeFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer cartonTypeId = null;
        api.addCartonTypeFileByURL(body, cartonTypeId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a cartonType.
     *
     * Adds a tag to an existing cartonType.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCartonTypeTagTest() throws ApiException {
        Integer cartonTypeId = null;
        String cartonTypeTag = null;
        api.addCartonTypeTag(cartonTypeId, cartonTypeTag);

        // TODO: test validations
    }
    
    /**
     * Delete a cartonType
     *
     * Deletes the cartonType identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCartonTypeTest() throws ApiException {
        Integer cartonTypeId = null;
        api.deleteCartonType(cartonTypeId);

        // TODO: test validations
    }
    
    /**
     * Delete a file for a cartonType.
     *
     * Deletes an existing cartonType file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCartonTypeFileTest() throws ApiException {
        Integer cartonTypeId = null;
        Integer fileId = null;
        api.deleteCartonTypeFile(cartonTypeId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a cartonType.
     *
     * Deletes an existing cartonType tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCartonTypeTagTest() throws ApiException {
        Integer cartonTypeId = null;
        String cartonTypeTag = null;
        api.deleteCartonTypeTag(cartonTypeId, cartonTypeTag);

        // TODO: test validations
    }
    
    /**
     * Search cartonTypes by filter
     *
     * Returns the list of cartonTypes that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCartonTypeByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<CartonType> response = api.getCartonTypeByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a cartonType by id
     *
     * Returns the cartonType identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCartonTypeByIdTest() throws ApiException {
        Integer cartonTypeId = null;
        CartonType response = api.getCartonTypeById(cartonTypeId);

        // TODO: test validations
    }
    
    /**
     * Get the files for a cartonType.
     *
     * Get all existing cartonType files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCartonTypeFilesTest() throws ApiException {
        Integer cartonTypeId = null;
        api.getCartonTypeFiles(cartonTypeId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a cartonType.
     *
     * Get all existing cartonType tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCartonTypeTagsTest() throws ApiException {
        Integer cartonTypeId = null;
        api.getCartonTypeTags(cartonTypeId);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a cartonType by id
     *
     * Returns a duplicated cartonType identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateCartonTypeByIdTest() throws ApiException {
        Integer cartonTypeId = null;
        CartonType response = api.getDuplicateCartonTypeById(cartonTypeId);

        // TODO: test validations
    }
    
    /**
     * Update a cartonType
     *
     * Updates an existing cartonType using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCartonTypeTest() throws ApiException {
        CartonType body = null;
        api.updateCartonType(body);

        // TODO: test validations
    }
    
    /**
     * Update a cartonType custom fields
     *
     * Updates an existing cartonType custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCartonTypeCustomFieldsTest() throws ApiException {
        CartonType body = null;
        api.updateCartonTypeCustomFields(body);

        // TODO: test validations
    }
    
}
