# SendCourrierContentLetter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**files** | [**FilesSendCourrier**](FilesSendCourrier.md) |  |  [optional]
**base64files** | [**Base64FilesSendCourrier**](Base64FilesSendCourrier.md) |  |  [optional]
**finalFilename** | **String** | Facultatif, maximum 50 caractères, vous pouvez spécifier le nom de fichier que vous souhaitez pour votre lettre. Ne mettez pas d&#x27;&#x27;extension, &#x27;.pdf&#x27; sera ajouté à la fin. Il sera visible dans votre interface Merci facteur Pro pour faciliter vos recherches. Dans le cas d&#x27;envois recommandés électroniques (ERE), ce nom de fichier sera visible par le destinataire. |  [optional]
**printSides** | [**PrintSidesEnum**](#PrintSidesEnum) | rectoverso si vous souhaitez une impression recto/verso, ou recto si vous souhaitez une impression recto simple, ou distinctrectoverso si vous souhaitez une impression recto/verso et que nous insérions une page blanche après les fichiers au nombre de pages impair. |  [optional]

<a name="PrintSidesEnum"></a>
## Enum: PrintSidesEnum
Name | Value
---- | -----
RECTO | &quot;recto&quot;
RECTOVERSO | &quot;rectoverso&quot;
DISTINCTRECTOVERSO | &quot;distinctrectoverso&quot;
