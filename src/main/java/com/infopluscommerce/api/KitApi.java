package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.Kit;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class KitApi {
  private ApiClient apiClient;

  public KitApi() {
    this(Configuration.getDefaultApiClient());
  }

  public KitApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a kit
   * Inserts a new kit using the specified data.
   * @param body Kit to be inserted. (required)
   * @return Kit
   * @throws ApiException if fails to make API call
   */
  public Kit addKit(Kit body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addKit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/kit".replaceAll("\\{format\\}","json");

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

    
    GenericType<Kit> localVarReturnType = new GenericType<Kit>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a kit
   * Adds an audit to an existing kit.
   * @param kitId Id of the kit to add an audit to (required)
   * @param kitAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addKitAudit(Integer kitId, String kitAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'kitId' is set
    if (kitId == null) {
      throw new ApiException(400, "Missing the required parameter 'kitId' when calling addKitAudit");
    }
    
    // verify the required parameter 'kitAudit' is set
    if (kitAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'kitAudit' when calling addKitAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/kit/{kitId}/audit/{kitAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "kitId" + "\\}", apiClient.escapeString(kitId.toString()))
      .replaceAll("\\{" + "kitAudit" + "\\}", apiClient.escapeString(kitAudit.toString()));

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
   * Add new tags for a kit.
   * Adds a tag to an existing kit.
   * @param kitId Id of the kit to add a tag to (required)
   * @param kitTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addKitTag(Integer kitId, String kitTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'kitId' is set
    if (kitId == null) {
      throw new ApiException(400, "Missing the required parameter 'kitId' when calling addKitTag");
    }
    
    // verify the required parameter 'kitTag' is set
    if (kitTag == null) {
      throw new ApiException(400, "Missing the required parameter 'kitTag' when calling addKitTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/kit/{kitId}/tag/{kitTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "kitId" + "\\}", apiClient.escapeString(kitId.toString()))
      .replaceAll("\\{" + "kitTag" + "\\}", apiClient.escapeString(kitTag.toString()));

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
   * Delete a kit
   * Deletes the kit identified by the specified id.
   * @param kitId Id of the kit to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteKit(Integer kitId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'kitId' is set
    if (kitId == null) {
      throw new ApiException(400, "Missing the required parameter 'kitId' when calling deleteKit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/kit/{kitId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "kitId" + "\\}", apiClient.escapeString(kitId.toString()));

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
   * Delete a tag for a kit.
   * Deletes an existing kit tag using the specified data.
   * @param kitId Id of the kit to remove tag from (required)
   * @param kitTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteKitTag(Integer kitId, String kitTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'kitId' is set
    if (kitId == null) {
      throw new ApiException(400, "Missing the required parameter 'kitId' when calling deleteKitTag");
    }
    
    // verify the required parameter 'kitTag' is set
    if (kitTag == null) {
      throw new ApiException(400, "Missing the required parameter 'kitTag' when calling deleteKitTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/kit/{kitId}/tag/{kitTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "kitId" + "\\}", apiClient.escapeString(kitId.toString()))
      .replaceAll("\\{" + "kitTag" + "\\}", apiClient.escapeString(kitTag.toString()));

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
   * Get a duplicated a kit by id
   * Returns a duplicated kit identified by the specified id.
   * @param kitId Id of the kit to be duplicated. (required)
   * @return Kit
   * @throws ApiException if fails to make API call
   */
  public Kit getDuplicateKitById(Integer kitId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'kitId' is set
    if (kitId == null) {
      throw new ApiException(400, "Missing the required parameter 'kitId' when calling getDuplicateKitById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/kit/duplicate/{kitId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "kitId" + "\\}", apiClient.escapeString(kitId.toString()));

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

    
    GenericType<Kit> localVarReturnType = new GenericType<Kit>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search kits by filter
   * Returns the list of kits that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<Kit>
   * @throws ApiException if fails to make API call
   */
  public List<Kit> getKitByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/kit/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Kit>> localVarReturnType = new GenericType<List<Kit>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a kit by id
   * Returns the kit identified by the specified id.
   * @param kitId Id of the kit to be returned. (required)
   * @return Kit
   * @throws ApiException if fails to make API call
   */
  public Kit getKitById(Integer kitId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'kitId' is set
    if (kitId == null) {
      throw new ApiException(400, "Missing the required parameter 'kitId' when calling getKitById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/kit/{kitId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "kitId" + "\\}", apiClient.escapeString(kitId.toString()));

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

    
    GenericType<Kit> localVarReturnType = new GenericType<Kit>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a kit.
   * Get all existing kit tags.
   * @param kitId Id of the kit to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getKitTags(Integer kitId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'kitId' is set
    if (kitId == null) {
      throw new ApiException(400, "Missing the required parameter 'kitId' when calling getKitTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/kit/{kitId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "kitId" + "\\}", apiClient.escapeString(kitId.toString()));

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
  
  /**
   * Update a kit
   * Updates an existing kit using the specified data.
   * @param body Kit to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateKit(Kit body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateKit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/kit".replaceAll("\\{format\\}","json");

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
   * Update a kit custom fields
   * Updates an existing kit custom fields using the specified data.
   * @param body Kit to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateKitCustomFields(Kit body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateKitCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/kit/customFields".replaceAll("\\{format\\}","json");

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
  
}
