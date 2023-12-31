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


import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse400;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserApi {
    private ApiClient apiClient;

    public UserApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteUser
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param idUser User ID de l&#x27;utilisateur à supprimer (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteUserCall(String wwServiceId, String wwAccessToken, Integer idUser, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/deleteUser";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (idUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("idUser", idUser));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteUserValidateBeforeCall(String wwServiceId, String wwAccessToken, Integer idUser, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'wwServiceId' is set
        if (wwServiceId == null) {
            throw new ApiException("Missing the required parameter 'wwServiceId' when calling deleteUser(Async)");
        }
        // verify the required parameter 'wwAccessToken' is set
        if (wwAccessToken == null) {
            throw new ApiException("Missing the required parameter 'wwAccessToken' when calling deleteUser(Async)");
        }
        // verify the required parameter 'idUser' is set
        if (idUser == null) {
            throw new ApiException("Missing the required parameter 'idUser' when calling deleteUser(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteUserCall(wwServiceId, wwAccessToken, idUser, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Supprimer un utilisateur
     * Attention, opération irrémédiable. Cela ne supprimera pas ses adresses, ni ses courriers qui sont conservés sur votre compte Merci facteur Pro
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param idUser User ID de l&#x27;utilisateur à supprimer (required)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2002 deleteUser(String wwServiceId, String wwAccessToken, Integer idUser) throws ApiException {
        ApiResponse<InlineResponse2002> resp = deleteUserWithHttpInfo(wwServiceId, wwAccessToken, idUser);
        return resp.getData();
    }

    /**
     * Supprimer un utilisateur
     * Attention, opération irrémédiable. Cela ne supprimera pas ses adresses, ni ses courriers qui sont conservés sur votre compte Merci facteur Pro
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param idUser User ID de l&#x27;utilisateur à supprimer (required)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2002> deleteUserWithHttpInfo(String wwServiceId, String wwAccessToken, Integer idUser) throws ApiException {
        com.squareup.okhttp.Call call = deleteUserValidateBeforeCall(wwServiceId, wwAccessToken, idUser, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Supprimer un utilisateur (asynchronously)
     * Attention, opération irrémédiable. Cela ne supprimera pas ses adresses, ni ses courriers qui sont conservés sur votre compte Merci facteur Pro
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param idUser User ID de l&#x27;utilisateur à supprimer (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteUserAsync(String wwServiceId, String wwAccessToken, Integer idUser, final ApiCallback<InlineResponse2002> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteUserValidateBeforeCall(wwServiceId, wwAccessToken, idUser, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUserId
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param emailUser Email de l&#x27;utilisateur (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserIdCall(String wwServiceId, String wwAccessToken, String emailUser, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/getUserId";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (emailUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("emailUser", emailUser));

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
    private com.squareup.okhttp.Call getUserIdValidateBeforeCall(String wwServiceId, String wwAccessToken, String emailUser, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'wwServiceId' is set
        if (wwServiceId == null) {
            throw new ApiException("Missing the required parameter 'wwServiceId' when calling getUserId(Async)");
        }
        // verify the required parameter 'wwAccessToken' is set
        if (wwAccessToken == null) {
            throw new ApiException("Missing the required parameter 'wwAccessToken' when calling getUserId(Async)");
        }
        // verify the required parameter 'emailUser' is set
        if (emailUser == null) {
            throw new ApiException("Missing the required parameter 'emailUser' when calling getUserId(Async)");
        }
        
        com.squareup.okhttp.Call call = getUserIdCall(wwServiceId, wwAccessToken, emailUser, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Récupérer le user ID d&#x27;un utilisateur
     * Récupérer le user ID à partir de l&#x27;adresse email. Pour utiliser cette fonction le moins possible, stockez les userId en local.
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param emailUser Email de l&#x27;utilisateur (required)
     * @return InlineResponse2003
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2003 getUserId(String wwServiceId, String wwAccessToken, String emailUser) throws ApiException {
        ApiResponse<InlineResponse2003> resp = getUserIdWithHttpInfo(wwServiceId, wwAccessToken, emailUser);
        return resp.getData();
    }

    /**
     * Récupérer le user ID d&#x27;un utilisateur
     * Récupérer le user ID à partir de l&#x27;adresse email. Pour utiliser cette fonction le moins possible, stockez les userId en local.
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param emailUser Email de l&#x27;utilisateur (required)
     * @return ApiResponse&lt;InlineResponse2003&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2003> getUserIdWithHttpInfo(String wwServiceId, String wwAccessToken, String emailUser) throws ApiException {
        com.squareup.okhttp.Call call = getUserIdValidateBeforeCall(wwServiceId, wwAccessToken, emailUser, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Récupérer le user ID d&#x27;un utilisateur (asynchronously)
     * Récupérer le user ID à partir de l&#x27;adresse email. Pour utiliser cette fonction le moins possible, stockez les userId en local.
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param emailUser Email de l&#x27;utilisateur (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserIdAsync(String wwServiceId, String wwAccessToken, String emailUser, final ApiCallback<InlineResponse2003> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserIdValidateBeforeCall(wwServiceId, wwAccessToken, emailUser, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for setUser
     * @param emailUser  (required)
     * @param firstName  (required)
     * @param lastName  (required)
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call setUserCall(String emailUser, String firstName, String lastName, String wwServiceId, String wwAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/setUser";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (wwServiceId != null)
        localVarHeaderParams.put("ww-service-id", apiClient.parameterToString(wwServiceId));
        if (wwAccessToken != null)
        localVarHeaderParams.put("ww-access-token", apiClient.parameterToString(wwAccessToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (emailUser != null)
        localVarFormParams.put("emailUser", emailUser);
        if (firstName != null)
        localVarFormParams.put("first_name", firstName);
        if (lastName != null)
        localVarFormParams.put("last_name", lastName);

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
    private com.squareup.okhttp.Call setUserValidateBeforeCall(String emailUser, String firstName, String lastName, String wwServiceId, String wwAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'emailUser' is set
        if (emailUser == null) {
            throw new ApiException("Missing the required parameter 'emailUser' when calling setUser(Async)");
        }
        // verify the required parameter 'firstName' is set
        if (firstName == null) {
            throw new ApiException("Missing the required parameter 'firstName' when calling setUser(Async)");
        }
        // verify the required parameter 'lastName' is set
        if (lastName == null) {
            throw new ApiException("Missing the required parameter 'lastName' when calling setUser(Async)");
        }
        // verify the required parameter 'wwServiceId' is set
        if (wwServiceId == null) {
            throw new ApiException("Missing the required parameter 'wwServiceId' when calling setUser(Async)");
        }
        // verify the required parameter 'wwAccessToken' is set
        if (wwAccessToken == null) {
            throw new ApiException("Missing the required parameter 'wwAccessToken' when calling setUser(Async)");
        }
        
        com.squareup.okhttp.Call call = setUserCall(emailUser, firstName, lastName, wwServiceId, wwAccessToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Créer un nouvel utilisateur
     * Chaque utilisateur aura un carnet d&#x27;adresses et un historique des envois. Vous retrouverez ces utilisateurs dans votre interface Merci facteur Pro. L&#x27;email indiqué doit être unique et vous permettre d&#x27;identifier l&#x27;utilisateur. Nous vous conseillons d&#x27;enregistrer en local les id d&#x27;utilisateurs retournés dans la réonse pour plus de confort d&#x27;utilisation de l&#x27;API.
     * @param emailUser  (required)
     * @param firstName  (required)
     * @param lastName  (required)
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @return InlineResponse2001
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2001 setUser(String emailUser, String firstName, String lastName, String wwServiceId, String wwAccessToken) throws ApiException {
        ApiResponse<InlineResponse2001> resp = setUserWithHttpInfo(emailUser, firstName, lastName, wwServiceId, wwAccessToken);
        return resp.getData();
    }

    /**
     * Créer un nouvel utilisateur
     * Chaque utilisateur aura un carnet d&#x27;adresses et un historique des envois. Vous retrouverez ces utilisateurs dans votre interface Merci facteur Pro. L&#x27;email indiqué doit être unique et vous permettre d&#x27;identifier l&#x27;utilisateur. Nous vous conseillons d&#x27;enregistrer en local les id d&#x27;utilisateurs retournés dans la réonse pour plus de confort d&#x27;utilisation de l&#x27;API.
     * @param emailUser  (required)
     * @param firstName  (required)
     * @param lastName  (required)
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @return ApiResponse&lt;InlineResponse2001&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2001> setUserWithHttpInfo(String emailUser, String firstName, String lastName, String wwServiceId, String wwAccessToken) throws ApiException {
        com.squareup.okhttp.Call call = setUserValidateBeforeCall(emailUser, firstName, lastName, wwServiceId, wwAccessToken, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Créer un nouvel utilisateur (asynchronously)
     * Chaque utilisateur aura un carnet d&#x27;adresses et un historique des envois. Vous retrouverez ces utilisateurs dans votre interface Merci facteur Pro. L&#x27;email indiqué doit être unique et vous permettre d&#x27;identifier l&#x27;utilisateur. Nous vous conseillons d&#x27;enregistrer en local les id d&#x27;utilisateurs retournés dans la réonse pour plus de confort d&#x27;utilisation de l&#x27;API.
     * @param emailUser  (required)
     * @param firstName  (required)
     * @param lastName  (required)
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call setUserAsync(String emailUser, String firstName, String lastName, String wwServiceId, String wwAccessToken, final ApiCallback<InlineResponse2001> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = setUserValidateBeforeCall(emailUser, firstName, lastName, wwServiceId, wwAccessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateUser
     * @param emailUser  (required)
     * @param firstName  (required)
     * @param lastName  (required)
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param idUser User ID de l&#x27;utilisateur à modifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateUserCall(String emailUser, String firstName, String lastName, String wwServiceId, String wwAccessToken, Integer idUser, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/updateUser";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (idUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("idUser", idUser));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (wwServiceId != null)
        localVarHeaderParams.put("ww-service-id", apiClient.parameterToString(wwServiceId));
        if (wwAccessToken != null)
        localVarHeaderParams.put("ww-access-token", apiClient.parameterToString(wwAccessToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (emailUser != null)
        localVarFormParams.put("emailUser", emailUser);
        if (firstName != null)
        localVarFormParams.put("first_name", firstName);
        if (lastName != null)
        localVarFormParams.put("last_name", lastName);

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
    private com.squareup.okhttp.Call updateUserValidateBeforeCall(String emailUser, String firstName, String lastName, String wwServiceId, String wwAccessToken, Integer idUser, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'emailUser' is set
        if (emailUser == null) {
            throw new ApiException("Missing the required parameter 'emailUser' when calling updateUser(Async)");
        }
        // verify the required parameter 'firstName' is set
        if (firstName == null) {
            throw new ApiException("Missing the required parameter 'firstName' when calling updateUser(Async)");
        }
        // verify the required parameter 'lastName' is set
        if (lastName == null) {
            throw new ApiException("Missing the required parameter 'lastName' when calling updateUser(Async)");
        }
        // verify the required parameter 'wwServiceId' is set
        if (wwServiceId == null) {
            throw new ApiException("Missing the required parameter 'wwServiceId' when calling updateUser(Async)");
        }
        // verify the required parameter 'wwAccessToken' is set
        if (wwAccessToken == null) {
            throw new ApiException("Missing the required parameter 'wwAccessToken' when calling updateUser(Async)");
        }
        // verify the required parameter 'idUser' is set
        if (idUser == null) {
            throw new ApiException("Missing the required parameter 'idUser' when calling updateUser(Async)");
        }
        
        com.squareup.okhttp.Call call = updateUserCall(emailUser, firstName, lastName, wwServiceId, wwAccessToken, idUser, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Modifier les informations d&#x27;un utilisateur
     * Attention, toutes les informations doivent être envoyées, même si il n&#x27;y a pas des modifications sur toutes.
     * @param emailUser  (required)
     * @param firstName  (required)
     * @param lastName  (required)
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param idUser User ID de l&#x27;utilisateur à modifier (required)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2002 updateUser(String emailUser, String firstName, String lastName, String wwServiceId, String wwAccessToken, Integer idUser) throws ApiException {
        ApiResponse<InlineResponse2002> resp = updateUserWithHttpInfo(emailUser, firstName, lastName, wwServiceId, wwAccessToken, idUser);
        return resp.getData();
    }

    /**
     * Modifier les informations d&#x27;un utilisateur
     * Attention, toutes les informations doivent être envoyées, même si il n&#x27;y a pas des modifications sur toutes.
     * @param emailUser  (required)
     * @param firstName  (required)
     * @param lastName  (required)
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param idUser User ID de l&#x27;utilisateur à modifier (required)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2002> updateUserWithHttpInfo(String emailUser, String firstName, String lastName, String wwServiceId, String wwAccessToken, Integer idUser) throws ApiException {
        com.squareup.okhttp.Call call = updateUserValidateBeforeCall(emailUser, firstName, lastName, wwServiceId, wwAccessToken, idUser, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Modifier les informations d&#x27;un utilisateur (asynchronously)
     * Attention, toutes les informations doivent être envoyées, même si il n&#x27;y a pas des modifications sur toutes.
     * @param emailUser  (required)
     * @param firstName  (required)
     * @param lastName  (required)
     * @param wwServiceId Votre service Id (required)
     * @param wwAccessToken Un access token valide (required)
     * @param idUser User ID de l&#x27;utilisateur à modifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateUserAsync(String emailUser, String firstName, String lastName, String wwServiceId, String wwAccessToken, Integer idUser, final ApiCallback<InlineResponse2002> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateUserValidateBeforeCall(emailUser, firstName, lastName, wwServiceId, wwAccessToken, idUser, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
