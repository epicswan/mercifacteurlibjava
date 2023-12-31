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


import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse400;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetTokenApi {
    private ApiClient apiClient;

    public GetTokenApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GetTokenApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getToken
     * @param wwServiceSignature Votre clé secrète hashée (ne jamais transmettre non hashé). (required)
     * @param wwTimestamp Le timestamp identique à celui utilisé pour hasher la clé secrète. (required)
     * @param wwServiceId Votre service Id (required)
     * @param wwAuthorizedIp La ou les adresses IP des serveurs autorisés, séparées par des points-virgules. (si la restriction d&#x27;ip a été levée pour votre compte, passez une IP random, comme par exemple 111.111.111). (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTokenCall(String wwServiceSignature, String wwTimestamp, String wwServiceId, String wwAuthorizedIp, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/getToken";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (wwServiceSignature != null)
        localVarHeaderParams.put("ww-service-signature", apiClient.parameterToString(wwServiceSignature));
        if (wwTimestamp != null)
        localVarHeaderParams.put("ww-timestamp", apiClient.parameterToString(wwTimestamp));
        if (wwServiceId != null)
        localVarHeaderParams.put("ww-service-id", apiClient.parameterToString(wwServiceId));
        if (wwAuthorizedIp != null)
        localVarHeaderParams.put("ww-authorized-ip", apiClient.parameterToString(wwAuthorizedIp));

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
    private com.squareup.okhttp.Call getTokenValidateBeforeCall(String wwServiceSignature, String wwTimestamp, String wwServiceId, String wwAuthorizedIp, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'wwServiceSignature' is set
        if (wwServiceSignature == null) {
            throw new ApiException("Missing the required parameter 'wwServiceSignature' when calling getToken(Async)");
        }
        // verify the required parameter 'wwTimestamp' is set
        if (wwTimestamp == null) {
            throw new ApiException("Missing the required parameter 'wwTimestamp' when calling getToken(Async)");
        }
        // verify the required parameter 'wwServiceId' is set
        if (wwServiceId == null) {
            throw new ApiException("Missing the required parameter 'wwServiceId' when calling getToken(Async)");
        }
        // verify the required parameter 'wwAuthorizedIp' is set
        if (wwAuthorizedIp == null) {
            throw new ApiException("Missing the required parameter 'wwAuthorizedIp' when calling getToken(Async)");
        }
        
        com.squareup.okhttp.Call call = getTokenCall(wwServiceSignature, wwTimestamp, wwServiceId, wwAuthorizedIp, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Obtenir un access token
     * IMPORTANT :   - Ne demander un access token qu&#x27;une seule fois par tranche de 24h. Après execution de getToken, stockez en local l&#x27;access token obtenu et refaites une demande lorsqu&#x27;il est expiré.  - Ne jamais faire transiter votre Secret Key non hashée.  [&#x60;En savoir plus sur le hashage de la private key&#x60;](https://github.com/MerciFacteur/Merci-facteur-API/tree/master/hash-secret-key)
     * @param wwServiceSignature Votre clé secrète hashée (ne jamais transmettre non hashé). (required)
     * @param wwTimestamp Le timestamp identique à celui utilisé pour hasher la clé secrète. (required)
     * @param wwServiceId Votre service Id (required)
     * @param wwAuthorizedIp La ou les adresses IP des serveurs autorisés, séparées par des points-virgules. (si la restriction d&#x27;ip a été levée pour votre compte, passez une IP random, comme par exemple 111.111.111). (required)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse200 getToken(String wwServiceSignature, String wwTimestamp, String wwServiceId, String wwAuthorizedIp) throws ApiException {
        ApiResponse<InlineResponse200> resp = getTokenWithHttpInfo(wwServiceSignature, wwTimestamp, wwServiceId, wwAuthorizedIp);
        return resp.getData();
    }

    /**
     * Obtenir un access token
     * IMPORTANT :   - Ne demander un access token qu&#x27;une seule fois par tranche de 24h. Après execution de getToken, stockez en local l&#x27;access token obtenu et refaites une demande lorsqu&#x27;il est expiré.  - Ne jamais faire transiter votre Secret Key non hashée.  [&#x60;En savoir plus sur le hashage de la private key&#x60;](https://github.com/MerciFacteur/Merci-facteur-API/tree/master/hash-secret-key)
     * @param wwServiceSignature Votre clé secrète hashée (ne jamais transmettre non hashé). (required)
     * @param wwTimestamp Le timestamp identique à celui utilisé pour hasher la clé secrète. (required)
     * @param wwServiceId Votre service Id (required)
     * @param wwAuthorizedIp La ou les adresses IP des serveurs autorisés, séparées par des points-virgules. (si la restriction d&#x27;ip a été levée pour votre compte, passez une IP random, comme par exemple 111.111.111). (required)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse200> getTokenWithHttpInfo(String wwServiceSignature, String wwTimestamp, String wwServiceId, String wwAuthorizedIp) throws ApiException {
        com.squareup.okhttp.Call call = getTokenValidateBeforeCall(wwServiceSignature, wwTimestamp, wwServiceId, wwAuthorizedIp, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Obtenir un access token (asynchronously)
     * IMPORTANT :   - Ne demander un access token qu&#x27;une seule fois par tranche de 24h. Après execution de getToken, stockez en local l&#x27;access token obtenu et refaites une demande lorsqu&#x27;il est expiré.  - Ne jamais faire transiter votre Secret Key non hashée.  [&#x60;En savoir plus sur le hashage de la private key&#x60;](https://github.com/MerciFacteur/Merci-facteur-API/tree/master/hash-secret-key)
     * @param wwServiceSignature Votre clé secrète hashée (ne jamais transmettre non hashé). (required)
     * @param wwTimestamp Le timestamp identique à celui utilisé pour hasher la clé secrète. (required)
     * @param wwServiceId Votre service Id (required)
     * @param wwAuthorizedIp La ou les adresses IP des serveurs autorisés, séparées par des points-virgules. (si la restriction d&#x27;ip a été levée pour votre compte, passez une IP random, comme par exemple 111.111.111). (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTokenAsync(String wwServiceSignature, String wwTimestamp, String wwServiceId, String wwAuthorizedIp, final ApiCallback<InlineResponse200> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTokenValidateBeforeCall(wwServiceSignature, wwTimestamp, wwServiceId, wwAuthorizedIp, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
