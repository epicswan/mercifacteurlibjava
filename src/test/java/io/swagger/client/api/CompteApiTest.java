/*
 * Merci facteur API
 * Merci facteur PRO vous permet d'envoyer des courriers depuis votre applicatif via son API.     Types de courriers disponibles :   - Lettre de une ou plusieurs pages.  - Carte postale avec ou sans enveloppe  - Carte pliée  - Carte géante  - Carte non pliée  - Photos sur papier brillant    Modes d'envois disponibles :   - Envoi normal (lettre verte)  - Lettre suivie  - Recommandé avec avis de réception      Au sujet des webhooks : [`https://github.com/MerciFacteur/Merci-facteur-API/blob/master/README.md#webhooks`](https://github.com/MerciFacteur/Merci-facteur-API/blob/master/README.md#webhooks)     Librairie PHP et exemples d'intégration : [`https://github.com/MerciFacteur/Merci-facteur-API`](https://github.com/MerciFacteur/Merci-facteur-API)    Infos générales sur l'API : [`https://github.com/MerciFacteur/Merci-facteur-API/blob/master/README.md`](https://github.com/MerciFacteur/Merci-facteur-API/blob/master/README.md)    Plus d'informations sur [`https://www.merci-facteur.com/pro`](https://www.merci-facteur.com/pro)    N'hésitez pas à nous contacter via [`https://www.merci-facteur.com/pro/contact.php`](https://www.merci-facteur.com/pro/contact.php)
 *
 * OpenAPI spec version: 1.2.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.InlineResponse20018;
import io.swagger.client.model.InlineResponse20019;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.InlineResponse400;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CompteApi
 */
@Ignore
public class CompteApiTest {

    private final CompteApi api = new CompteApi();

    /**
     * Obtenir les infos des quotas liés au compte Merci facteur Pro.
     *
     * Obtenir le montant restant sur le compte, la date d&#x27;expiration du plan, ainsi que le nombre de pages envoyées dans le mois.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getQuotaCompteTest() throws Exception {
        String wwServiceId = null;
        String wwAccessToken = null;
        InlineResponse20018 response = api.getQuotaCompte(wwServiceId, wwAccessToken);

        // TODO: test validations
    }
    /**
     * Obtenir l&#x27;URL de webhook parametrée sur le compte.
     *
     * Obtenir l&#x27;URL de webhook parametrée sur le compte (URL sur laquelle seront envoyé les évènements liés à vos courriers). Si aucune URL webhook n&#x27;est renseigné, vous recevrez une chaine de caractères vide. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getWebhookEndpointTest() throws Exception {
        String wwServiceId = null;
        String wwAccessToken = null;
        InlineResponse20019 response = api.getWebhookEndpoint(wwServiceId, wwAccessToken);

        // TODO: test validations
    }
    /**
     * Définir l&#x27;URL du endpoint sur laquelle les évènements liés à vos courriers seront envoyés via webhooks
     *
     * Définir l&#x27;URL du endpoint sur laquelle les évènements liés à vos courriers seront envoyés via webhooks. Pour supprimer l&#x27;URL et ne plus recevoir les évènement, envoyez une chaine vide dans \&quot;url\&quot;.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setWebhookEndpointTest() throws Exception {
        String url = null;
        String wwServiceId = null;
        String wwAccessToken = null;
        InlineResponse2002 response = api.setWebhookEndpoint(url, wwServiceId, wwAccessToken);

        // TODO: test validations
    }
}