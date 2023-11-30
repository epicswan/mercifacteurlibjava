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


import io.swagger.client.model.InlineResponse20018;
import io.swagger.client.model.InlineResponse20019;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.InlineResponse400;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompteApi {
    private ApiClient apiClient;

    public CompteApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CompteApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getQuotaCompte
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getQuotaCompteCall(String wwServiceId, String wwAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/getQuotaCompte";

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
    private com.squareup.okhttp.Call getQuotaCompteValidateBeforeCall(String wwServiceId, String wwAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'wwServiceId' is set
        if (wwServiceId == null) {
            throw new ApiException("Missing the required parameter 'wwServiceId' when calling getQuotaCompte(Async)");
        }
        // verify the required parameter 'wwAccessToken' is set
        if (wwAccessToken == null) {
            throw new ApiException("Missing the required parameter 'wwAccessToken' when calling getQuotaCompte(Async)");
        }
        
        com.squareup.okhttp.Call call = getQuotaCompteCall(wwServiceId, wwAccessToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Obtenir les infos des quotas liés au compte Merci facteur Pro.
     * Obtenir le montant restant sur le compte, la date d&#x27;expiration du plan, ainsi que le nombre de pages envoyées dans le mois.
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @return InlineResponse20018
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20018 getQuotaCompte(String wwServiceId, String wwAccessToken) throws ApiException {
        ApiResponse<InlineResponse20018> resp = getQuotaCompteWithHttpInfo(wwServiceId, wwAccessToken);
        return resp.getData();
    }

    /**
     * Obtenir les infos des quotas liés au compte Merci facteur Pro.
     * Obtenir le montant restant sur le compte, la date d&#x27;expiration du plan, ainsi que le nombre de pages envoyées dans le mois.
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @return ApiResponse&lt;InlineResponse20018&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20018> getQuotaCompteWithHttpInfo(String wwServiceId, String wwAccessToken) throws ApiException {
        com.squareup.okhttp.Call call = getQuotaCompteValidateBeforeCall(wwServiceId, wwAccessToken, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20018>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Obtenir les infos des quotas liés au compte Merci facteur Pro. (asynchronously)
     * Obtenir le montant restant sur le compte, la date d&#x27;expiration du plan, ainsi que le nombre de pages envoyées dans le mois.
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getQuotaCompteAsync(String wwServiceId, String wwAccessToken, final ApiCallback<InlineResponse20018> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getQuotaCompteValidateBeforeCall(wwServiceId, wwAccessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20018>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getWebhookEndpoint
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getWebhookEndpointCall(String wwServiceId, String wwAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/getWebhookEndpoint";

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
    private com.squareup.okhttp.Call getWebhookEndpointValidateBeforeCall(String wwServiceId, String wwAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'wwServiceId' is set
        if (wwServiceId == null) {
            throw new ApiException("Missing the required parameter 'wwServiceId' when calling getWebhookEndpoint(Async)");
        }
        // verify the required parameter 'wwAccessToken' is set
        if (wwAccessToken == null) {
            throw new ApiException("Missing the required parameter 'wwAccessToken' when calling getWebhookEndpoint(Async)");
        }
        
        com.squareup.okhttp.Call call = getWebhookEndpointCall(wwServiceId, wwAccessToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Obtenir l&#x27;URL de webhook parametrée sur le compte.
     * Obtenir l&#x27;URL de webhook parametrée sur le compte (URL sur laquelle seront envoyé les évènements liés à vos courriers). Si aucune URL webhook n&#x27;est renseigné, vous recevrez une chaine de caractères vide. 
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @return InlineResponse20019
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20019 getWebhookEndpoint(String wwServiceId, String wwAccessToken) throws ApiException {
        ApiResponse<InlineResponse20019> resp = getWebhookEndpointWithHttpInfo(wwServiceId, wwAccessToken);
        return resp.getData();
    }

    /**
     * Obtenir l&#x27;URL de webhook parametrée sur le compte.
     * Obtenir l&#x27;URL de webhook parametrée sur le compte (URL sur laquelle seront envoyé les évènements liés à vos courriers). Si aucune URL webhook n&#x27;est renseigné, vous recevrez une chaine de caractères vide. 
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @return ApiResponse&lt;InlineResponse20019&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20019> getWebhookEndpointWithHttpInfo(String wwServiceId, String wwAccessToken) throws ApiException {
        com.squareup.okhttp.Call call = getWebhookEndpointValidateBeforeCall(wwServiceId, wwAccessToken, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20019>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Obtenir l&#x27;URL de webhook parametrée sur le compte. (asynchronously)
     * Obtenir l&#x27;URL de webhook parametrée sur le compte (URL sur laquelle seront envoyé les évènements liés à vos courriers). Si aucune URL webhook n&#x27;est renseigné, vous recevrez une chaine de caractères vide. 
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getWebhookEndpointAsync(String wwServiceId, String wwAccessToken, final ApiCallback<InlineResponse20019> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getWebhookEndpointValidateBeforeCall(wwServiceId, wwAccessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20019>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for setWebhookEndpoint
     * @param url  (required)
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call setWebhookEndpointCall(String url, String wwServiceId, String wwAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/setWebhookEndpoint";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (wwServiceId != null)
        localVarHeaderParams.put("ww-service-id", apiClient.parameterToString(wwServiceId));
        if (wwAccessToken != null)
        localVarHeaderParams.put("ww-access-token", apiClient.parameterToString(wwAccessToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (url != null)
        localVarFormParams.put("url", url);

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
    private com.squareup.okhttp.Call setWebhookEndpointValidateBeforeCall(String url, String wwServiceId, String wwAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'url' is set
        if (url == null) {
            throw new ApiException("Missing the required parameter 'url' when calling setWebhookEndpoint(Async)");
        }
        // verify the required parameter 'wwServiceId' is set
        if (wwServiceId == null) {
            throw new ApiException("Missing the required parameter 'wwServiceId' when calling setWebhookEndpoint(Async)");
        }
        // verify the required parameter 'wwAccessToken' is set
        if (wwAccessToken == null) {
            throw new ApiException("Missing the required parameter 'wwAccessToken' when calling setWebhookEndpoint(Async)");
        }
        
        com.squareup.okhttp.Call call = setWebhookEndpointCall(url, wwServiceId, wwAccessToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Définir l&#x27;URL du endpoint sur laquelle les évènements liés à vos courriers seront envoyés via webhooks
     * Définir l&#x27;URL du endpoint sur laquelle les évènements liés à vos courriers seront envoyés via webhooks. Pour supprimer l&#x27;URL et ne plus recevoir les évènement, envoyez une chaine vide dans \&quot;url\&quot;.
     * @param url  (required)
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2002 setWebhookEndpoint(String url, String wwServiceId, String wwAccessToken) throws ApiException {
        ApiResponse<InlineResponse2002> resp = setWebhookEndpointWithHttpInfo(url, wwServiceId, wwAccessToken);
        return resp.getData();
    }

    /**
     * Définir l&#x27;URL du endpoint sur laquelle les évènements liés à vos courriers seront envoyés via webhooks
     * Définir l&#x27;URL du endpoint sur laquelle les évènements liés à vos courriers seront envoyés via webhooks. Pour supprimer l&#x27;URL et ne plus recevoir les évènement, envoyez une chaine vide dans \&quot;url\&quot;.
     * @param url  (required)
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2002> setWebhookEndpointWithHttpInfo(String url, String wwServiceId, String wwAccessToken) throws ApiException {
        com.squareup.okhttp.Call call = setWebhookEndpointValidateBeforeCall(url, wwServiceId, wwAccessToken, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Définir l&#x27;URL du endpoint sur laquelle les évènements liés à vos courriers seront envoyés via webhooks (asynchronously)
     * Définir l&#x27;URL du endpoint sur laquelle les évènements liés à vos courriers seront envoyés via webhooks. Pour supprimer l&#x27;URL et ne plus recevoir les évènement, envoyez une chaine vide dans \&quot;url\&quot;.
     * @param url  (required)
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call setWebhookEndpointAsync(String url, String wwServiceId, String wwAccessToken, final ApiCallback<InlineResponse2002> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = setWebhookEndpointValidateBeforeCall(url, wwServiceId, wwAccessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}