# CourrierApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEnvoi**](CourrierApi.md#deleteEnvoi) | **DELETE** /deleteEnvoi | Annuler un envoi et son contenu
[**getEnvoi**](CourrierApi.md#getEnvoi) | **GET** /getEnvoi | Lister les courriers d&#x27;un envoi en particulier
[**getPostagePrice**](CourrierApi.md#getPostagePrice) | **GET** /getPostagePrice | Obtenir le montant d&#x27;un ou plusieurs courriers (non nécessaire à l&#x27;envoi)
[**getProof**](CourrierApi.md#getProof) | **GET** /getProof | Obtenir les documents preuves d&#x27;un courrier (preuve de dépôt, preuve de réception, preuve de télechargement, etc.)
[**getSuiviEnvoi**](CourrierApi.md#getSuiviEnvoi) | **GET** /getSuiviEnvoi | Obtenir le suivi et l&#x27;état des courriers d&#x27;un envoi
[**listEnvois**](CourrierApi.md#listEnvois) | **GET** /listEnvois | Lister les 50 derniers envois d&#x27;un utilisateur
[**sendCourrier**](CourrierApi.md#sendCourrier) | **POST** /sendCourrier | Valider l&#x27;envoi d&#x27;un courrier
[**uploadFile**](CourrierApi.md#uploadFile) | **POST** /uploadFile | Charger des fichiers dans un token pour les envoyer dans un courrier (facultatif) - uniquement disponible pour l&#x27;envoi de photos actuellement

<a name="deleteEnvoi"></a>
# **deleteEnvoi**
> InlineResponse2002 deleteEnvoi(wwServiceId, wwAccessToken, idEnvoi)

Annuler un envoi et son contenu

Attention, opération irrémédiable. Selon le statut actuel des courriers, une demande d&#x27;annulation d&#x27;envoi pourra être rejetée immédiatement, rejetée après un certain délai, rejetée partiellement (annulation de l&#x27;envoi mais facturation partiellement annulée), ou acceptée intégralement (annulation de l&#x27;envoi et annulation intégrale de la facturation de cet envoi).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourrierApi;


CourrierApi apiInstance = new CourrierApi();
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
Integer idEnvoi = 56; // Integer | Id de l'envoi contenant les courriers à annuler (Id retourné par /sendCourrier)
try {
    InlineResponse2002 result = apiInstance.deleteEnvoi(wwServiceId, wwAccessToken, idEnvoi);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourrierApi#deleteEnvoi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |
 **idEnvoi** | **Integer**| Id de l&#x27;envoi contenant les courriers à annuler (Id retourné par /sendCourrier) |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEnvoi"></a>
# **getEnvoi**
> InlineResponse20012 getEnvoi(wwServiceId, wwAccessToken, idEnvoi)

Lister les courriers d&#x27;un envoi en particulier

Cette opération entre dans le détail des informations d&#x27;un envoi précis. Un envoi peut etre composé de plusieurs destinataires (une lettre identique envoyée a des destinataires différents). Un envoi peut donc contenir plusieurs courriers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourrierApi;


CourrierApi apiInstance = new CourrierApi();
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
Integer idEnvoi = 56; // Integer | Id de l'envoi dont on veut extraire les détails.
try {
    InlineResponse20012 result = apiInstance.getEnvoi(wwServiceId, wwAccessToken, idEnvoi);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourrierApi#getEnvoi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |
 **idEnvoi** | **Integer**| Id de l&#x27;envoi dont on veut extraire les détails. |

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPostagePrice"></a>
# **getPostagePrice**
> InlineResponse20010 getPostagePrice(wwServiceId, wwAccessToken, modeEnvoi, cardFormat, cardPapier, cardCoin, letterPageNumber, photoNumber, paysDestinataire, idDestinataire, letterPrintSides)

Obtenir le montant d&#x27;un ou plusieurs courriers (non nécessaire à l&#x27;envoi)

Vous permet d&#x27;avoir le montant de l&#x27;affranchissement et du contenu d&#x27;un courrier en fonction de son contenu, de son mode d&#x27;envoi et de sa destination. Vous n&#x27;avez pas besoin d&#x27;utiliser cette fonction pour envoyer un courrier, mais vous pouvez l&#x27;utiliser si vous avez besoin de cette information avant d&#x27;envoyer un courrier (par exemple pour des raisons de facturation). Le montant retourné est un montant HT. La partie \&quot;affranchissement\&quot; n&#x27;est pas soumise à la TVA.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourrierApi;


CourrierApi apiInstance = new CourrierApi();
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
List<String> modeEnvoi = Arrays.asList("modeEnvoi_example"); // List<String> | Mode d'envoi du courrier : normal, suivi, lrar ou lrare
List<String> cardFormat = Arrays.asList("cardFormat_example"); // List<String> | Format de la carte (laisser vide si pas de carte)
List<String> cardPapier = Arrays.asList("cardPapier_example"); // List<String> | Papier de la carte (laisser vide si pas de carte)
List<String> cardCoin = Arrays.asList("cardCoin_example"); // List<String> | Coins de la carte (laisser vide si pas de carte)
Integer letterPageNumber = 0; // Integer | Nombre de page(s) de lettre (indiquer 0 si pas de lettre)
Integer photoNumber = 0; // Integer | Nombre de photo(s) (indiquer 0 si pas de lettre)
List<String> paysDestinataire = Arrays.asList("paysDestinataire_example"); // List<String> | Tableau de pays de destination, avec une orthographe conforme via /getCountry  (indiquez soit paysDestinataire, soit idDestinataire).
List<Integer> idDestinataire = Arrays.asList(56); // List<Integer> | Tableau d'id de destinataire(s) déjà créé (indiquez soit paysDestinataire, soit idDestinataire).
String letterPrintSides = "recto"; // String | rectoverso pour une lettre imprimée recto-verso, recto pour une lettre imprimée en recto simple.
try {
    InlineResponse20010 result = apiInstance.getPostagePrice(wwServiceId, wwAccessToken, modeEnvoi, cardFormat, cardPapier, cardCoin, letterPageNumber, photoNumber, paysDestinataire, idDestinataire, letterPrintSides);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourrierApi#getPostagePrice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |
 **modeEnvoi** | [**List&lt;String&gt;**](String.md)| Mode d&#x27;envoi du courrier : normal, suivi, lrar ou lrare | [enum: normal, suivi, lrar, lrare]
 **cardFormat** | [**List&lt;String&gt;**](String.md)| Format de la carte (laisser vide si pas de carte) | [enum: , postcard, naked-postcard, classic, folded, large]
 **cardPapier** | [**List&lt;String&gt;**](String.md)| Papier de la carte (laisser vide si pas de carte) | [enum: , classic, nacre, creation]
 **cardCoin** | [**List&lt;String&gt;**](String.md)| Coins de la carte (laisser vide si pas de carte) | [enum: , carre, arrondi]
 **letterPageNumber** | **Integer**| Nombre de page(s) de lettre (indiquer 0 si pas de lettre) | [default to 0]
 **photoNumber** | **Integer**| Nombre de photo(s) (indiquer 0 si pas de lettre) | [default to 0]
 **paysDestinataire** | [**List&lt;String&gt;**](String.md)| Tableau de pays de destination, avec une orthographe conforme via /getCountry  (indiquez soit paysDestinataire, soit idDestinataire). | [optional]
 **idDestinataire** | [**List&lt;Integer&gt;**](Integer.md)| Tableau d&#x27;id de destinataire(s) déjà créé (indiquez soit paysDestinataire, soit idDestinataire). | [optional]
 **letterPrintSides** | **String**| rectoverso pour une lettre imprimée recto-verso, recto pour une lettre imprimée en recto simple. | [optional] [default to recto] [enum: recto, rectoverso]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProof"></a>
# **getProof**
> InlineResponse20017 getProof(wwServiceId, wwAccessToken, trackingNumber, document)

Obtenir les documents preuves d&#x27;un courrier (preuve de dépôt, preuve de réception, preuve de télechargement, etc.)

Cela vous permet de récepérer les fichiers de preuves de vos courriers. Uniquement possible pour les courriers envoyés en Suivi, Recommandés avec avis de réception, ou Recommandé électroniques. Vous pourrez récupérer les preuves de dépôt (pour les suivi, les recommandés et les recommandés électroniques), les avis de réception (pour les recommandés avec avis de réception numérisé et les recommandés électropniques), ainsi que les preuves de télechargements (pour les recommandés électroniques). Les documents récupérés sont au format PDF ou JPEG.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourrierApi;


CourrierApi apiInstance = new CourrierApi();
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
String trackingNumber = "trackingNumber_example"; // String | Numéro de suivi du courrier.
String document = "\"depot\""; // String | Le document de preuve souhaité : depot (preuve de dépôt), reception (avis de réception), ou telechargement (preuve de téléchargement).
try {
    InlineResponse20017 result = apiInstance.getProof(wwServiceId, wwAccessToken, trackingNumber, document);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourrierApi#getProof");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |
 **trackingNumber** | **String**| Numéro de suivi du courrier. |
 **document** | **String**| Le document de preuve souhaité : depot (preuve de dépôt), reception (avis de réception), ou telechargement (preuve de téléchargement). | [enum: depot, reception, telechargement]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSuiviEnvoi"></a>
# **getSuiviEnvoi**
> InlineResponse20016 getSuiviEnvoi(wwServiceId, wwAccessToken, idEnvoi)

Obtenir le suivi et l&#x27;état des courriers d&#x27;un envoi

Cette opération vous permet d&#x27;obtenir à n&#x27;importe quel moment l&#x27;état de courriers qui composent un envoi. Cet état correspond à l&#x27;état de l&#x27;impression du courrier jusqu&#x27;à sa remise à La Poste, et dans le cas des envois en LRAR ou en SUIVI, également l&#x27;historique du suivi de l&#x27;acheminement des courriers de la prise en charge par La Poste jusqu&#x27;à la distribution au destinataire.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourrierApi;


CourrierApi apiInstance = new CourrierApi();
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
Integer idEnvoi = 56; // Integer | Id de l'envoi dont on veut extraire le suivi.
try {
    InlineResponse20016 result = apiInstance.getSuiviEnvoi(wwServiceId, wwAccessToken, idEnvoi);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourrierApi#getSuiviEnvoi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |
 **idEnvoi** | **Integer**| Id de l&#x27;envoi dont on veut extraire le suivi. |

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEnvois"></a>
# **listEnvois**
> InlineResponse20011 listEnvois(wwServiceId, wwAccessToken, idUser)

Lister les 50 derniers envois d&#x27;un utilisateur

Cette opération liste les envois, sans entrer dans le détail de chaque envoi.Un envoi peut etre composé de plusieurs destinataires (une lettre identique envoyée a des destinataires différents). Un envoi peut donc contenir plusieurs courriers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourrierApi;


CourrierApi apiInstance = new CourrierApi();
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
Integer idUser = 56; // Integer | User Id de l'utilisateur dont on veut lister les envois.
try {
    InlineResponse20011 result = apiInstance.listEnvois(wwServiceId, wwAccessToken, idUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourrierApi#listEnvois");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |
 **idUser** | **Integer**| User Id de l&#x27;utilisateur dont on veut lister les envois. |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendCourrier"></a>
# **sendCourrier**
> InlineResponse2009 sendCourrier(idUser, modeEnvoi, adress, dateEnvoi, designation, anonymize, content, wwServiceId, wwAccessToken)

Valider l&#x27;envoi d&#x27;un courrier

ATTENTION, cette opération génère un courrier qui sera débité de votre compte, imprimé et posté. Pour effectuer vos tests d&#x27;intégration, n&#x27;hésitez pas à contacter notre service client pour ouvrir un compte \&quot;Sandbox\&quot;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourrierApi;


CourrierApi apiInstance = new CourrierApi();
Integer idUser = 56; // Integer | 
String modeEnvoi = "modeEnvoi_example"; // String | 
AdressSendCourrier adress = new AdressSendCourrier(); // AdressSendCourrier | 
String dateEnvoi = "dateEnvoi_example"; // String | 
String designation = "designation_example"; // String | 
SendCourrierAnonymize anonymize = new SendCourrierAnonymize(); // SendCourrierAnonymize | 
SendCourrierContent content = new SendCourrierContent(); // SendCourrierContent | 
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
try {
    InlineResponse2009 result = apiInstance.sendCourrier(idUser, modeEnvoi, adress, dateEnvoi, designation, anonymize, content, wwServiceId, wwAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourrierApi#sendCourrier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idUser** | **Integer**|  |
 **modeEnvoi** | **String**|  | [enum: normal, suivi, lrar, lrare, ere_otp_mail, ere_otp_sms]
 **adress** | [**AdressSendCourrier**](.md)|  |
 **dateEnvoi** | **String**|  |
 **designation** | **String**|  |
 **anonymize** | [**SendCourrierAnonymize**](.md)|  |
 **content** | [**SendCourrierContent**](.md)|  |
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="uploadFile"></a>
# **uploadFile**
> InlineResponse2008 uploadFile(idUser, token, product, type, file, wwServiceId, wwAccessToken)

Charger des fichiers dans un token pour les envoyer dans un courrier (facultatif) - uniquement disponible pour l&#x27;envoi de photos actuellement

Vous pouvez charger des fichiers (photos) dans un Token avec /uploadFile. Utile si vous envoyez plusieurs fois le même contenu, ou si vous envoyez beaucoup de fichiers (surtout en base64). A la première utilisation, un token est créé et vous est retourné. Le Token peut être ensuite utilisé pour plusieurs envois.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourrierApi;


CourrierApi apiInstance = new CourrierApi();
Integer idUser = 56; // Integer | 
String token = "token_example"; // String | 
String product = "product_example"; // String | 
String type = "type_example"; // String | 
String file = "file_example"; // String | 
String wwServiceId = "\"yourIdService\""; // String | Votre service Id
String wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
try {
    InlineResponse2008 result = apiInstance.uploadFile(idUser, token, product, type, file, wwServiceId, wwAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourrierApi#uploadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idUser** | **Integer**|  |
 **token** | **String**|  |
 **product** | **String**|  | [enum: photo]
 **type** | **String**|  | [enum: url, base64]
 **file** | **String**|  |
 **wwServiceId** | **String**| Votre service Id |
 **wwAccessToken** | **String**| Un access token valide |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

