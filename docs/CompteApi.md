# CompteApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getQuotaCompte**](CompteApi.md#getQuotaCompte) | **GET** /getQuotaCompte | Obtenir les infos des quotas liés au compte Merci facteur Pro.
[**getWebhookEndpoint**](CompteApi.md#getWebhookEndpoint) | **GET** /getWebhookEndpoint | Obtenir l&#x27;URL de webhook parametrée sur le compte.
[**setWebhookEndpoint**](CompteApi.md#setWebhookEndpoint) | **POST** /setWebhookEndpoint | Définir l&#x27;URL du endpoint sur laquelle les évènements liés à vos courriers seront envoyés via webhooks

<a name="getQuotaCompte"></a>
# **getQuotaCompte**
> InlineResponse20018 getQuotaCompte(wwServiceId, wwAccessToken)

Obtenir les infos des quotas liés au compte Merci facteur Pro.

Obtenir le montant restant sur le compte, la date d&#x27;expiration du plan, ainsi que le nombre de pages envoyées dans le mois.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompteApi;


CompteApi apiInstance = new CompteApi();
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
try {
    InlineResponse20018 result = apiInstance.getQuotaCompte(wwServiceId, wwAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompteApi#getQuotaCompte");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhookEndpoint"></a>
# **getWebhookEndpoint**
> InlineResponse20019 getWebhookEndpoint(wwServiceId, wwAccessToken)

Obtenir l&#x27;URL de webhook parametrée sur le compte.

Obtenir l&#x27;URL de webhook parametrée sur le compte (URL sur laquelle seront envoyé les évènements liés à vos courriers). Si aucune URL webhook n&#x27;est renseigné, vous recevrez une chaine de caractères vide. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompteApi;


CompteApi apiInstance = new CompteApi();
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
try {
    InlineResponse20019 result = apiInstance.getWebhookEndpoint(wwServiceId, wwAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompteApi#getWebhookEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setWebhookEndpoint"></a>
# **setWebhookEndpoint**
> InlineResponse2002 setWebhookEndpoint(url, wwServiceId, wwAccessToken)

Définir l&#x27;URL du endpoint sur laquelle les évènements liés à vos courriers seront envoyés via webhooks

Définir l&#x27;URL du endpoint sur laquelle les évènements liés à vos courriers seront envoyés via webhooks. Pour supprimer l&#x27;URL et ne plus recevoir les évènement, envoyez une chaine vide dans \&quot;url\&quot;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompteApi;


CompteApi apiInstance = new CompteApi();
String url = "url_example"; // String | 
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
try {
    InlineResponse2002 result = apiInstance.setWebhookEndpoint(url, wwServiceId, wwAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompteApi#setWebhookEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**|  |
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

