# SendPublipostageBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idEnvoi** | **Integer** | Identifiant de l&#x27;envoi qui vous a été retourné par \\sourcePublipostage |  [optional]
**idExp** | **Integer** | Id de l&#x27;adresse d&#x27;expéditeur (créée auparavant avec /setNewAdress) - si vous utilisez \&quot;idExp\&quot;, laissez vide \&quot;jsonExp\&quot;. |  [optional]
**jsonExp** | **String** | json contenant l&#x27;adresse d&#x27;expéditeur (si vous ne souhaitez pas créer l&#x27;adresse auparavant avec /setNewAdress) - si vous utilisez \&quot;jsonExp\&quot;, laissez vide \&quot;idExp\&quot;. |  [optional]
**modeEnvoi** | [**ModeEnvoiEnum**](#ModeEnvoiEnum) | Mode d&#x27;envoi du courrier : suivi, lrar, lrare, ou normal |  [optional]
**anonymize** | [**SendCourrierAnonymize**](SendCourrierAnonymize.md) |  |  [optional]

<a name="ModeEnvoiEnum"></a>
## Enum: ModeEnvoiEnum
Name | Value
---- | -----
NORMAL | &quot;normal&quot;
SUIVI | &quot;suivi&quot;
LRAR | &quot;lrar&quot;
LRARE | &quot;lrare&quot;
