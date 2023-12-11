# PublipostageApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendPublipostage**](PublipostageApi.md#sendPublipostage) | **POST** /sendPublipostage | Envoi de la source de données du publipostage
[**sourcePublipostage**](PublipostageApi.md#sourcePublipostage) | **POST** /sourcePublipostage | Envoi de la source de données du publipostage
[**templatePublipostage**](PublipostageApi.md#templatePublipostage) | **POST** /templatePublipostage | Envoi du template de la lettre à envoyer en nombre

<a name="sendPublipostage"></a>
# **sendPublipostage**
> InlineResponse2009 sendPublipostage(idEnvoi, idExp, jsonExp, modeEnvoi, anonymize, wwServiceId, wwAccessToken)

Envoi de la source de données du publipostage

Validation de l&#x27;envoi d&#x27;un publipostage. Cela enclenche la fusion des données, la mise en production, l&#x27;impression et l&#x27;envoi de l&#x27;ensemble des lettres du publipostage.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublipostageApi;


PublipostageApi apiInstance = new PublipostageApi();
Integer idEnvoi = 56; // Integer | 
Integer idExp = 56; // Integer | 
String jsonExp = "jsonExp_example"; // String | 
String modeEnvoi = "modeEnvoi_example"; // String | 
SendCourrierAnonymize anonymize = new SendCourrierAnonymize(); // SendCourrierAnonymize | 
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
try {
    InlineResponse2009 result = apiInstance.sendPublipostage(idEnvoi, idExp, jsonExp, modeEnvoi, anonymize, wwServiceId, wwAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublipostageApi#sendPublipostage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idEnvoi** | **Integer**|  |
 **idExp** | **Integer**|  |
 **jsonExp** | **String**|  |
 **modeEnvoi** | **String**|  | [enum: normal, suivi, lrar, lrare]
 **anonymize** | [**SendCourrierAnonymize**](.md)|  |
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="sourcePublipostage"></a>
# **sourcePublipostage**
> InlineResponse20015 sourcePublipostage(idUser, templateValidation, source, wwServiceId, wwAccessToken)

Envoi de la source de données du publipostage

La source de donnée contient les informations de vos destinataires. Elle peut être au format CSV/TXT (; entre les champs, et saut de ligne entre les lignes, la première ligne doit contenir les champs de fusion), ou au format json (de la forme [{\&quot;prenom\&quot;:\&quot;Jean-Marc\&quot;, \&quot;ville\&quot;:\&quot;Paris\&quot;, \&quot;champ_de_fusion\&quot;:\&quot;valeur\&quot;},{\&quot;prenom\&quot;:\&quot;Julie\&quot;, \&quot;ville\&quot;:\&quot;Lyon\&quot;, \&quot;champ_de_fusion\&quot;:\&quot;valeur\&quot;}]). Votre fichier source doit au minimum contenir les champs de fusion suivants : \&quot;nom\&quot; ou \&quot;societe\&quot;, \&quot;cp\&quot;, \&quot;ville\&quot;, \&quot;pays\&quot;. Dans le cas d&#x27;un fichier CSV ou TXT, la premi&amp;egrave;re ligne doit &amp;ecirc;tre : civilite;nom;prenom;societe;adresse1;adresse2;adresse3;cp;ville;pays

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublipostageApi;


PublipostageApi apiInstance = new PublipostageApi();
Integer idUser = 56; // Integer | 
Object templateValidation = null; // Object | 
SourcePublipostageSource source = new SourcePublipostageSource(); // SourcePublipostageSource | 
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
try {
    InlineResponse20015 result = apiInstance.sourcePublipostage(idUser, templateValidation, source, wwServiceId, wwAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublipostageApi#sourcePublipostage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idUser** | **Integer**|  |
 **templateValidation** | [**Object**](.md)|  |
 **source** | [**SourcePublipostageSource**](.md)|  |
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="templatePublipostage"></a>
# **templatePublipostage**
> InlineResponse20014 templatePublipostage(typeTemplate, template, wwServiceId, wwAccessToken)

Envoi du template de la lettre à envoyer en nombre

Le template doit être un fichier au format DOCX, il peut contenir des zones de remplacement (ou champs de fusion) qui seront remplacés par des données contenues dans la source de données. Les champs de fusion dans le template doivent être de la forme ${prenom} (avec uniquement des lettres, chiffres et le caractère _).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublipostageApi;


PublipostageApi apiInstance = new PublipostageApi();
String typeTemplate = "typeTemplate_example"; // String | 
String template = "template_example"; // String | 
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
try {
    InlineResponse20014 result = apiInstance.templatePublipostage(typeTemplate, template, wwServiceId, wwAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublipostageApi#templatePublipostage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeTemplate** | **String**|  | [enum: file, base64]
 **template** | **String**|  |
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

