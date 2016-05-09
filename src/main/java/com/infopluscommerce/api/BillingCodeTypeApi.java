package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.BillingCodeType;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class BillingCodeTypeApi {
  private ApiClient apiClient;

  public BillingCodeTypeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BillingCodeTypeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update a billingCodeType
   * Updates an existing billingCodeType using the specified data.
   * @param body BillingCodeType to be updated.
   * @return void
   */
  public void updateBillingCodeType(BillingCodeType body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateBillingCodeType");
     }
     
    // create path and map variables
    String path = "/v1.0/billingCodeType".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Create a billingCodeType
   * Inserts a new billingCodeType using the specified data.
   * @param body BillingCodeType to be inserted.
   * @return BillingCodeType
   */
  public BillingCodeType addBillingCodeType(BillingCodeType body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addBillingCodeType");
     }
     
    // create path and map variables
    String path = "/v1.0/billingCodeType".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<BillingCodeType> returnType = new GenericType<BillingCodeType>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search billingCodeTypes by filter
   * Returns the list of billingCodeTypes that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<BillingCodeType>
   */
  public List<BillingCodeType> getBillingCodeTypeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/billingCodeType/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<List<BillingCodeType>> returnType = new GenericType<List<BillingCodeType>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a billingCodeType by id
   * Returns the billingCodeType identified by the specified id.
   * @param billingCodeTypeId Id of the billingCodeType to be returned.
   * @return BillingCodeType
   */
  public BillingCodeType getBillingCodeTypeById(Integer billingCodeTypeId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'billingCodeTypeId' is set
     if (billingCodeTypeId == null) {
        throw new ApiException(400, "Missing the required parameter 'billingCodeTypeId' when calling getBillingCodeTypeById");
     }
     
    // create path and map variables
    String path = "/v1.0/billingCodeType/{billingCodeTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billingCodeTypeId" + "\\}", apiClient.escapeString(billingCodeTypeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<BillingCodeType> returnType = new GenericType<BillingCodeType>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a billingCodeType
   * Deletes the billingCodeType identified by the specified id.
   * @param billingCodeTypeId Id of the billingCodeType to be deleted.
   * @return void
   */
  public void deleteBillingCodeType(Integer billingCodeTypeId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'billingCodeTypeId' is set
     if (billingCodeTypeId == null) {
        throw new ApiException(400, "Missing the required parameter 'billingCodeTypeId' when calling deleteBillingCodeType");
     }
     
    // create path and map variables
    String path = "/v1.0/billingCodeType/{billingCodeTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billingCodeTypeId" + "\\}", apiClient.escapeString(billingCodeTypeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
}
