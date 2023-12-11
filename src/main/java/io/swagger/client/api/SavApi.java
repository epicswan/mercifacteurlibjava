/*
 * Merci facteur API
 * Merci facteur PRO vous permet d'envoyer des courriers depuis votre applicatif via son API.     Types de courriers disponibles :   - Lettre de une ou plusieurs pages.  - Carte postale avec ou sans enveloppe  - Carte pliée  - Carte géante  - Carte non pliée  - Photos sur papier brillant    Modes d'envois disponibles :   - Envoi normal (lettre verte)  - Lettre suivie  - Recommandé avec avis de réception      Au sujet des webhooks : [`https://github.com/MerciFacteur/Merci-facteur-API/blob/master/README.md#webhooks`](https://github.com/MerciFacteur/Merci-facteur-API/blob/master/README.md#webhooks)     Librairie PHP et exemples d'intégration : [`https://github.com/MerciFacteur/Merci-facteur-API`](https://github.com/MerciFacteur/Merci-facteur-API)    Infos générales sur l'API : [`https://github.com/MerciFacteur/Merci-facteur-API/blob/master/README.md`](https://github.com/MerciFacteur/Merci-facteur-API/blob/master/README.md)    Plus d'informations sur [`https://www.merci-facteur.com/pro`](https://www.merci-facteur.com/pro)    N'hésitez pas à nous contacter via [`https://www.merci-facteur.com/pro/contact.php`](https://www.merci-facteur.com/pro/contact.php)
 *
 * OpenAPI spec version: 1.2.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.InlineResponse20016;
import io.swagger.client.model.InlineResponse400;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SavApi {
    private ApiClient apiClient;

    public SavApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SavApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for openSavTicket
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param yourServiceName  (optional)
     * @param email  (optional)
     * @param referenceCourrier  (optional)
     * @param sujet  (optional)
     * @param messageTexte  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call openSavTicketCall(String wwServiceId, String wwAccessToken, String yourServiceName, String email, String referenceCourrier, String sujet, String messageTexte, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/openSavTicket";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (wwServiceId != null)
        localVarHeaderParams.put("ww-service-id", apiClient.parameterToString(wwServiceId));
        if (wwAccessToken != null)
        localVarHeaderParams.put("ww-access-token", apiClient.parameterToString(wwAccessToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (yourServiceName != null)
        localVarFormParams.put("yourServiceName", yourServiceName);
        if (email != null)
        localVarFormParams.put("email", email);
        if (referenceCourrier != null)
        localVarFormParams.put("referenceCourrier", referenceCourrier);
        if (sujet != null)
        localVarFormParams.put("sujet", sujet);
        if (messageTexte != null)
        localVarFormParams.put("messageTexte", messageTexte);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call openSavTicketValidateBeforeCall(String wwServiceId, String wwAccessToken, String yourServiceName, String email, String referenceCourrier, String sujet, String messageTexte, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'wwServiceId' is set
        if (wwServiceId == null) {
            throw new ApiException("Missing the required parameter 'wwServiceId' when calling openSavTicket(Async)");
        }
        // verify the required parameter 'wwAccessToken' is set
        if (wwAccessToken == null) {
            throw new ApiException("Missing the required parameter 'wwAccessToken' when calling openSavTicket(Async)");
        }
        
        com.squareup.okhttp.Call call = openSavTicketCall(wwServiceId, wwAccessToken, yourServiceName, email, referenceCourrier, sujet, messageTexte, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Ouvrir un ticket SAV auprès de Merci facteur
     * Si vous avez besoin de déléguer du SAV lié aux envois de courriers, vous pouvez le faire dans une certaine mesure en ouvrant des tickets SAV.
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param yourServiceName  (optional)
     * @param email  (optional)
     * @param referenceCourrier  (optional)
     * @param sujet  (optional)
     * @param messageTexte  (optional)
     * @return InlineResponse20016
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20016 openSavTicket(String wwServiceId, String wwAccessToken, String yourServiceName, String email, String referenceCourrier, String sujet, String messageTexte) throws ApiException {
        ApiResponse<InlineResponse20016> resp = openSavTicketWithHttpInfo(wwServiceId, wwAccessToken, yourServiceName, email, referenceCourrier, sujet, messageTexte);
        return resp.getData();
    }

    /**
     * Ouvrir un ticket SAV auprès de Merci facteur
     * Si vous avez besoin de déléguer du SAV lié aux envois de courriers, vous pouvez le faire dans une certaine mesure en ouvrant des tickets SAV.
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param yourServiceName  (optional)
     * @param email  (optional)
     * @param referenceCourrier  (optional)
     * @param sujet  (optional)
     * @param messageTexte  (optional)
     * @return ApiResponse&lt;InlineResponse20016&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20016> openSavTicketWithHttpInfo(String wwServiceId, String wwAccessToken, String yourServiceName, String email, String referenceCourrier, String sujet, String messageTexte) throws ApiException {
        com.squareup.okhttp.Call call = openSavTicketValidateBeforeCall(wwServiceId, wwAccessToken, yourServiceName, email, referenceCourrier, sujet, messageTexte, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20016>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Ouvrir un ticket SAV auprès de Merci facteur (asynchronously)
     * Si vous avez besoin de déléguer du SAV lié aux envois de courriers, vous pouvez le faire dans une certaine mesure en ouvrant des tickets SAV.
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param yourServiceName  (optional)
     * @param email  (optional)
     * @param referenceCourrier  (optional)
     * @param sujet  (optional)
     * @param messageTexte  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call openSavTicketAsync(String wwServiceId, String wwAccessToken, String yourServiceName, String email, String referenceCourrier, String sujet, String messageTexte, final ApiCallback<InlineResponse20016> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = openSavTicketValidateBeforeCall(wwServiceId, wwAccessToken, yourServiceName, email, referenceCourrier, sujet, messageTexte, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20016>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
