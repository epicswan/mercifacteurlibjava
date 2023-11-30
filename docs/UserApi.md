# UserApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /deleteUser | Supprimer un utilisateur
[**getUserId**](UserApi.md#getUserId) | **GET** /getUserId | Récupérer le user ID d&#x27;un utilisateur
[**setUser**](UserApi.md#setUser) | **POST** /setUser | Créer un nouvel utilisateur
[**updateUser**](UserApi.md#updateUser) | **POST** /updateUser | Modifier les informations d&#x27;un utilisateur

<a name="deleteUser"></a>
# **deleteUser**
> InlineResponse2002 deleteUser(wwServiceId, wwAccessToken, idUser)

Supprimer un utilisateur

Attention, opération irrémédiable. Cela ne supprimera pas ses adresses, ni ses courriers qui sont conservés sur votre compte Merci facteur Pro

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
Integer idUser = 56; // Integer | User ID de l'utilisateur à supprimer
try {
    InlineResponse2002 result = apiInstance.deleteUser(wwServiceId, wwAccessToken, idUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |
 **idUser** | **Integer**| User ID de l&#x27;utilisateur à supprimer |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserId"></a>
# **getUserId**
> InlineResponse2003 getUserId(wwServiceId, wwAccessToken, emailUser)

Récupérer le user ID d&#x27;un utilisateur

Récupérer le user ID à partir de l&#x27;adresse email. Pour utiliser cette fonction le moins possible, stockez les userId en local.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
String emailUser = "emailUser_example"; // String | Email de l'utilisateur
try {
    InlineResponse2003 result = apiInstance.getUserId(wwServiceId, wwAccessToken, emailUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |
 **emailUser** | **String**| Email de l&#x27;utilisateur |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setUser"></a>
# **setUser**
> InlineResponse2001 setUser(emailUser, firstName, lastName, wwServiceId, wwAccessToken)

Créer un nouvel utilisateur

Chaque utilisateur aura un carnet d&#x27;adresses et un historique des envois. Vous retrouverez ces utilisateurs dans votre interface Merci facteur Pro. L&#x27;email indiqué doit être unique et vous permettre d&#x27;identifier l&#x27;utilisateur. Nous vous conseillons d&#x27;enregistrer en local les id d&#x27;utilisateurs retournés dans la réonse pour plus de confort d&#x27;utilisation de l&#x27;API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String emailUser = "emailUser_example"; // String | 
String firstName = "firstName_example"; // String | 
String lastName = "lastName_example"; // String | 
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
try {
    InlineResponse2001 result = apiInstance.setUser(emailUser, firstName, lastName, wwServiceId, wwAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#setUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailUser** | **String**|  |
 **firstName** | **String**|  |
 **lastName** | **String**|  |
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> InlineResponse2002 updateUser(emailUser, firstName, lastName, wwServiceId, wwAccessToken, idUser)

Modifier les informations d&#x27;un utilisateur

Attention, toutes les informations doivent être envoyées, même si il n&#x27;y a pas des modifications sur toutes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String emailUser = "emailUser_example"; // String | 
String firstName = "firstName_example"; // String | 
String lastName = "lastName_example"; // String | 
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
Integer idUser = 56; // Integer | User ID de l'utilisateur à modifier
try {
    InlineResponse2002 result = apiInstance.updateUser(emailUser, firstName, lastName, wwServiceId, wwAccessToken, idUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailUser** | **String**|  |
 **firstName** | **String**|  |
 **lastName** | **String**|  |
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |
 **idUser** | **Integer**| User ID de l&#x27;utilisateur à modifier |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

