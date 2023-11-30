# GetTokenApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getToken**](GetTokenApi.md#getToken) | **GET** /getToken | Obtenir un access token

<a name="getToken"></a>
# **getToken**
> InlineResponse200 getToken(wwServiceSignature, wwTimestamp, wwServiceId, wwAuthorizedIp)

Obtenir un access token

IMPORTANT :   - Ne demander un access token qu&#x27;une seule fois par tranche de 24h. Après execution de getToken, stockez en local l&#x27;access token obtenu et refaites une demande lorsqu&#x27;il est expiré.  - Ne jamais faire transiter votre Secret Key non hashée.  [&#x60;En savoir plus sur le hashage de la private key&#x60;](https://github.com/MerciFacteur/Merci-facteur-API/tree/master/hash-secret-key)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GetTokenApi;


GetTokenApi apiInstance = new GetTokenApi();
String wwServiceSignature = "\"hashedSignatureWithSha256\""; // String | Votre clé secrète hashée (ne jamais transmettre non hashé).
String wwTimestamp = "\"1539700479\""; // String | Le timestamp identique à celui utilisé pour hasher la clé secrète.
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAuthorizedIp = "\"111.111.111;222.222.222;333.333.333\""; // String | La ou les adresses IP des serveurs autorisés, séparées par des points-virgules. (si la restriction d'ip a été levée pour votre compte, passez une IP random, comme par exemple 111.111.111).
try {
    InlineResponse200 result = apiInstance.getToken(wwServiceSignature, wwTimestamp, wwServiceId, wwAuthorizedIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetTokenApi#getToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wwServiceSignature** | **String**| Votre clé secrète hashée (ne jamais transmettre non hashé). |
 **wwTimestamp** | **String**| Le timestamp identique à celui utilisé pour hasher la clé secrète. |
 **wwServiceId** | **String**| Votre service Id |
 **wwAuthorizedIp** | **String**| La ou les adresses IP des serveurs autorisés, séparées par des points-virgules. (si la restriction d&#x27;ip a été levée pour votre compte, passez une IP random, comme par exemple 111.111.111). |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

