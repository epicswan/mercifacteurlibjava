# InlineResponse20011Envois

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idEnvoi** | **Integer** | Id de l&#x27;envoi |  [optional]
**statut** | **String** | Statut de l&#x27;envoi |  [optional]
**nbPage** | **Integer** | Nb page de chaque courrier de l&#x27;envoi |  [optional]
**nbDest** | **Integer** | Nombre de destinataires de l&#x27;envoi (&#x3D;nombre de courriers) |  [optional]
**modeEnvoi** | **String** | Mode d&#x27;envoi (lrar, lrare, suivi, normal) |  [optional]
**date** | **Integer** | Date de l&#x27;envoi au format timestamp |  [optional]
**idExp** | **Integer** | adresse Id de l&#x27;adresse d&#x27;expéditeur |  [optional]
**idDest** | **List&lt;Integer&gt;** | adresse Id de/des l&#x27;adresse(s) de destinataire(s) |  [optional]
**amount** | [**List&lt;InlineResponse20011Amount&gt;**](InlineResponse20011Amount.md) | Résumé du montant facturé par Merci facteur |  [optional]
