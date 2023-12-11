# ErrorsApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listErrors**](ErrorsApi.md#listErrors) | **GET** /listErrors | Obtenir la liste des erreurs possiblement retournées par l&#x27;API.

<a name="listErrors"></a>
# **listErrors**
> InlineResponse20021 listErrors(wwServiceId, wwAccessToken)

Obtenir la liste des erreurs possiblement retournées par l&#x27;API.

Vous pouvez personnaliser tous les messages d&#x27;erreur en fonction des codes d&#x27;erreur retournés par l&#x27;API. Chaque erreur est identifiée par un code d&#x27;erreur qui ne changera jamais. Ce code d&#x27;erreur est retourné dans l&#x27;entête (en erreur 400 ou 401), ainsi que dans le résultat tel que result[error][code].

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ErrorsApi;


ErrorsApi apiInstance = new ErrorsApi();
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
try {
    InlineResponse20021 result = apiInstance.listErrors(wwServiceId, wwAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ErrorsApi#listErrors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

