# SendCourrierContentCardVisuel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Type de visuel : customimg ou base64 |  [optional]
**value** | **String** | Si type&#x3D;customimg, alors value&#x3D;url de l&#x27;image du visuel. Si type&#x3D;base64, alors value&#x3D;fichier de l&#x27;image du visuel converti en base64.  (voir spécifications de l&#x27;image dans la documentation) |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CUSTOMIMG | &quot;customimg&quot;
BASE64 | &quot;base64&quot;
