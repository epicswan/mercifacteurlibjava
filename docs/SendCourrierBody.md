# SendCourrierBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idUser** | **Integer** | user ID de l&#x27;utilisateur qui envoi le courrier |  [optional]
**modeEnvoi** | [**ModeEnvoiEnum**](#ModeEnvoiEnum) | Mode d&#x27;envoi du courrier : suivi, lrar, lrare, ou normal pour les envois papier. ere_otp_mail ou ere_otp_sms pour les recommandés électroniques. |  [optional]
**adress** | [**AdressSendCourrier**](AdressSendCourrier.md) |  |  [optional]
**dateEnvoi** | **String** | Date d&#x27;envoi souhaitée du courrier. Si vide ou non spécifié, l&#x27;envoi sera fait le jour même (ou le jour ouvrable suivant). Doit être au format AAAA-MM-JJ et doit être une date non passée. |  [optional]
**designation** | **String** | Facultatif, 50 caractères maximum, la designation sera reprise sur votre interface Merci facteur pro dans le listing de vos courriers afin de faciliter vos recherches. Pour les envois recommandés élécroniques (ERE) la designation sera présente dans l&#x27;email envoyé à votre destinataire |  [optional]
**anonymize** | [**SendCourrierAnonymize**](SendCourrierAnonymize.md) |  |  [optional]
**content** | [**SendCourrierContent**](SendCourrierContent.md) |  |  [optional]

<a name="ModeEnvoiEnum"></a>
## Enum: ModeEnvoiEnum
Name | Value
---- | -----
NORMAL | &quot;normal&quot;
SUIVI | &quot;suivi&quot;
LRAR | &quot;lrar&quot;
LRARE | &quot;lrare&quot;
ERE_OTP_MAIL | &quot;ere_otp_mail&quot;
ERE_OTP_SMS | &quot;ere_otp_sms&quot;
