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

import io.swagger.client.model.InlineResponse20021;
import io.swagger.client.model.InlineResponse400;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ErrorsApi
 */
@Ignore
public class ErrorsApiTest {

    private final ErrorsApi api = new ErrorsApi();

    /**
     * Obtenir la liste des erreurs possiblement retournées par l&#x27;API.
     *
     * Vous pouvez personnaliser tous les messages d&#x27;erreur en fonction des codes d&#x27;erreur retournés par l&#x27;API. Chaque erreur est identifiée par un code d&#x27;erreur qui ne changera jamais. Ce code d&#x27;erreur est retourné dans l&#x27;entête (en erreur 400 ou 401), ainsi que dans le résultat tel que result[error][code].
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listErrorsTest() throws Exception {
        String wwServiceId = null;
        String wwAccessToken = null;
        InlineResponse20021 response = api.listErrors(wwServiceId, wwAccessToken);

        // TODO: test validations
    }
}
