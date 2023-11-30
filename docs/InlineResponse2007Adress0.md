# InlineResponse2007Adress0

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Id de l&#x27;adresse |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | \\\&quot;dest\\\&quot; si c&#x27;est un destinataire, \\\&quot;exp\\\&quot; si c&#x27;est un expéditeur |  [optional]
**civilite** | **String** | Civilité du contact |  [optional]
**nom** | **String** | Nom du contact |  [optional]
**prenom** | **String** | Prénom du contact |  [optional]
**societe** | **String** | Société du contact |  [optional]
**adresse1** | **String** | Adresse ligne 1 du contact |  [optional]
**adresse2** | **String** | Adresse ligne 2 du contact |  [optional]
**adresse3** | **String** | Adresse ligne 3 du contact |  [optional]
**cp** | **String** | Code postal du contact |  [optional]
**ville** | **String** | Ville du contact |  [optional]
**pays** | **String** | Pays du contact |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
DEST | &quot;dest&quot;
EXP | &quot;exp&quot;
