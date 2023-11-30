# SavApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

Method | HTTP request | Description
------------- | ------------- | -------------
[**openSavTicket**](SavApi.md#openSavTicket) | **POST** /openSavTicket | Ouvrir un ticket SAV auprès de Merci facteur

<a name="openSavTicket"></a>
# **openSavTicket**
> InlineResponse20015 openSavTicket(wwServiceId, wwAccessToken, yourServiceName, email, referenceCourrier, sujet, messageTexte)

Ouvrir un ticket SAV auprès de Merci facteur

Si vous avez besoin de déléguer du SAV lié aux envois de courriers, vous pouvez le faire dans une certaine mesure en ouvrant des tickets SAV.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SavApi;


SavApi apiInstance = new SavApi();
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
String yourServiceName = "yourServiceName_example"; // String | 
String email = "email_example"; // String | 
String referenceCourrier = "referenceCourrier_example"; // String | 
String sujet = "sujet_example"; // String | 
String messageTexte = "messageTexte_example"; // String | 
try {
    InlineResponse20015 result = apiInstance.openSavTicket(wwServiceId, wwAccessToken, yourServiceName, email, referenceCourrier, sujet, messageTexte);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavApi#openSavTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |
 **yourServiceName** | **String**|  | [optional]
 **email** | **String**|  | [optional]
 **referenceCourrier** | **String**|  | [optional]
 **sujet** | **String**|  | [optional]
 **messageTexte** | **String**|  | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

