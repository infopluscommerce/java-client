package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.WarehouseDocumentType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class WarehouseDocumentTypeApi {
  private ApiClient apiClient;

  public WarehouseDocumentTypeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WarehouseDocumentTypeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for a warehouseDocumentType
   * Adds an audit to an existing warehouseDocumentType.
   * @param warehouseDocumentTypeId Id of the warehouseDocumentType to add an audit to (required)
   * @param warehouseDocumentTypeAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addWarehouseDocumentTypeAudit(Integer warehouseDocumentTypeId, String warehouseDocumentTypeAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseDocumentTypeId' is set
    if (warehouseDocumentTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentTypeId' when calling addWarehouseDocumentTypeAudit");
    }
    
    // verify the required parameter 'warehouseDocumentTypeAudit' is set
    if (warehouseDocumentTypeAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentTypeAudit' when calling addWarehouseDocumentTypeAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouseDocumentType/{warehouseDocumentTypeId}/audit/{warehouseDocumentTypeAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseDocumentTypeId" + "\\}", apiClient.escapeString(warehouseDocumentTypeId.toString()))
      .replaceAll("\\{" + "warehouseDocumentTypeAudit" + "\\}", apiClient.escapeString(warehouseDocumentTypeAudit.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Add new tags for a warehouseDocumentType.
   * Adds a tag to an existing warehouseDocumentType.
   * @param warehouseDocumentTypeId Id of the warehouseDocumentType to add a tag to (required)
   * @param warehouseDocumentTypeTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addWarehouseDocumentTypeTag(Integer warehouseDocumentTypeId, String warehouseDocumentTypeTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseDocumentTypeId' is set
    if (warehouseDocumentTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentTypeId' when calling addWarehouseDocumentTypeTag");
    }
    
    // verify the required parameter 'warehouseDocumentTypeTag' is set
    if (warehouseDocumentTypeTag == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentTypeTag' when calling addWarehouseDocumentTypeTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouseDocumentType/{warehouseDocumentTypeId}/tag/{warehouseDocumentTypeTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseDocumentTypeId" + "\\}", apiClient.escapeString(warehouseDocumentTypeId.toString()))
      .replaceAll("\\{" + "warehouseDocumentTypeTag" + "\\}", apiClient.escapeString(warehouseDocumentTypeTag.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete a tag for a warehouseDocumentType.
   * Deletes an existing warehouseDocumentType tag using the specified data.
   * @param warehouseDocumentTypeId Id of the warehouseDocumentType to remove tag from (required)
   * @param warehouseDocumentTypeTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWarehouseDocumentTypeTag(Integer warehouseDocumentTypeId, String warehouseDocumentTypeTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseDocumentTypeId' is set
    if (warehouseDocumentTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentTypeId' when calling deleteWarehouseDocumentTypeTag");
    }
    
    // verify the required parameter 'warehouseDocumentTypeTag' is set
    if (warehouseDocumentTypeTag == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentTypeTag' when calling deleteWarehouseDocumentTypeTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouseDocumentType/{warehouseDocumentTypeId}/tag/{warehouseDocumentTypeTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseDocumentTypeId" + "\\}", apiClient.escapeString(warehouseDocumentTypeId.toString()))
      .replaceAll("\\{" + "warehouseDocumentTypeTag" + "\\}", apiClient.escapeString(warehouseDocumentTypeTag.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Get a duplicated a warehouseDocumentType by id
   * Returns a duplicated warehouseDocumentType identified by the specified id.
   * @param warehouseDocumentTypeId Id of the warehouseDocumentType to be duplicated. (required)
   * @return WarehouseDocumentType
   * @throws ApiException if fails to make API call
   */
  public WarehouseDocumentType getDuplicateWarehouseDocumentTypeById(Integer warehouseDocumentTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseDocumentTypeId' is set
    if (warehouseDocumentTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentTypeId' when calling getDuplicateWarehouseDocumentTypeById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouseDocumentType/duplicate/{warehouseDocumentTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseDocumentTypeId" + "\\}", apiClient.escapeString(warehouseDocumentTypeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    GenericType<WarehouseDocumentType> localVarReturnType = new GenericType<WarehouseDocumentType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search warehouseDocumentTypes by filter
   * Returns the list of warehouseDocumentTypes that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<WarehouseDocumentType>
   * @throws ApiException if fails to make API call
   */
  public List<WarehouseDocumentType> getWarehouseDocumentTypeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/warehouseDocumentType/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    GenericType<List<WarehouseDocumentType>> localVarReturnType = new GenericType<List<WarehouseDocumentType>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a warehouseDocumentType by id
   * Returns the warehouseDocumentType identified by the specified id.
   * @param warehouseDocumentTypeId Id of the warehouseDocumentType to be returned. (required)
   * @return WarehouseDocumentType
   * @throws ApiException if fails to make API call
   */
  public WarehouseDocumentType getWarehouseDocumentTypeById(Integer warehouseDocumentTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseDocumentTypeId' is set
    if (warehouseDocumentTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentTypeId' when calling getWarehouseDocumentTypeById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouseDocumentType/{warehouseDocumentTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseDocumentTypeId" + "\\}", apiClient.escapeString(warehouseDocumentTypeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    GenericType<WarehouseDocumentType> localVarReturnType = new GenericType<WarehouseDocumentType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a warehouseDocumentType.
   * Get all existing warehouseDocumentType tags.
   * @param warehouseDocumentTypeId Id of the warehouseDocumentType to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getWarehouseDocumentTypeTags(Integer warehouseDocumentTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'warehouseDocumentTypeId' is set
    if (warehouseDocumentTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'warehouseDocumentTypeId' when calling getWarehouseDocumentTypeTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/warehouseDocumentType/{warehouseDocumentTypeId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "warehouseDocumentTypeId" + "\\}", apiClient.escapeString(warehouseDocumentTypeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
}
