# UploadFileBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idUser** | **Integer** | user ID de l&#x27;utilisateur qui envoi le courrier |  [optional]
**token** | **String** | Token du groupe de fichiers à envoyer. Laisser vide lors du premier appel, un Token vous sera retourné et vous pourrez l&#x27;utiliser pour les fichiers suivants. |  [optional]
**product** | [**ProductEnum**](#ProductEnum) | produit envoyé (photo). |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type de fichier envoyé (url ou base64). |  [optional]
**file** | **String** | Le fichier à envoyer (une url ou une base64). |  [optional]

<a name="ProductEnum"></a>
## Enum: ProductEnum
Name | Value
---- | -----
PHOTO | &quot;photo&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
URL | &quot;url&quot;
BASE64 | &quot;base64&quot;
