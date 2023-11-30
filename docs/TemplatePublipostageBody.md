# TemplatePublipostageBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**typeTemplate** | [**TypeTemplateEnum**](#TypeTemplateEnum) | Type de template envoyé (\&quot;file\&quot; pour une URL vers un fichier docx, ou \&quot;base64\&quot; pour un fichier encodé en base64). |  [optional]
**template** | **String** | URL du fichier docx, ou sa version encodée en base64. |  [optional]

<a name="TypeTemplateEnum"></a>
## Enum: TypeTemplateEnum
Name | Value
---- | -----
FILE | &quot;file&quot;
BASE64 | &quot;base64&quot;
