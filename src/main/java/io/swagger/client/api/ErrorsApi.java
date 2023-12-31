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


import io.swagger.client.model.InlineResponse20021;
import io.swagger.client.model.InlineResponse400;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ErrorsApi {
    private ApiClient apiClient;

    public ErrorsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ErrorsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listErrors
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listErrorsCall(String wwServiceId, String wwAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/listErrors";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (wwServiceId != null)
        localVarHeaderParams.put("ww-service-id", apiClient.parameterToString(wwServiceId));
        if (wwAccessToken != null)
        localVarHeaderParams.put("ww-access-token", apiClient.parameterToString(wwAccessToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listErrorsValidateBeforeCall(String wwServiceId, String wwAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'wwServiceId' is set
        if (wwServiceId == null) {
            throw new ApiException("Missing the required parameter 'wwServiceId' when calling listErrors(Async)");
        }
        // verify the required parameter 'wwAccessToken' is set
        if (wwAccessToken == null) {
            throw new ApiException("Missing the required parameter 'wwAccessToken' when calling listErrors(Async)");
        }
        
        com.squareup.okhttp.Call call = listErrorsCall(wwServiceId, wwAccessToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Obtenir la liste des erreurs possiblement retournées par l&#x27;API.
     * Vous pouvez personnaliser tous les messages d&#x27;erreur en fonction des codes d&#x27;erreur retournés par l&#x27;API. Chaque erreur est identifiée par un code d&#x27;erreur qui ne changera jamais. Ce code d&#x27;erreur est retourné dans l&#x27;entête (en erreur 400 ou 401), ainsi que dans le résultat tel que result[error][code].
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @return InlineResponse20021
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20021 listErrors(String wwServiceId, String wwAccessToken) throws ApiException {
        ApiResponse<InlineResponse20021> resp = listErrorsWithHttpInfo(wwServiceId, wwAccessToken);
        return resp.getData();
    }

    /**
     * Obtenir la liste des erreurs possiblement retournées par l&#x27;API.
     * Vous pouvez personnaliser tous les messages d&#x27;erreur en fonction des codes d&#x27;erreur retournés par l&#x27;API. Chaque erreur est identifiée par un code d&#x27;erreur qui ne changera jamais. Ce code d&#x27;erreur est retourné dans l&#x27;entête (en erreur 400 ou 401), ainsi que dans le résultat tel que result[error][code].
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @return ApiResponse&lt;InlineResponse20021&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20021> listErrorsWithHttpInfo(String wwServiceId, String wwAccessToken) throws ApiException {
        com.squareup.okhttp.Call call = listErrorsValidateBeforeCall(wwServiceId, wwAccessToken, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20021>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Obtenir la liste des erreurs possiblement retournées par l&#x27;API. (asynchronously)
     * Vous pouvez personnaliser tous les messages d&#x27;erreur en fonction des codes d&#x27;erreur retournés par l&#x27;API. Chaque erreur est identifiée par un code d&#x27;erreur qui ne changera jamais. Ce code d&#x27;erreur est retourné dans l&#x27;entête (en erreur 400 ou 401), ainsi que dans le résultat tel que result[error][code].
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listErrorsAsync(String wwServiceId, String wwAccessToken, final ApiCallback<InlineResponse20021> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listErrorsValidateBeforeCall(wwServiceId, wwAccessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20021>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
