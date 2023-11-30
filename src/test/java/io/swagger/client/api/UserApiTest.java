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

import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse400;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    /**
     * Supprimer un utilisateur
     *
     * Attention, opération irrémédiable. Cela ne supprimera pas ses adresses, ni ses courriers qui sont conservés sur votre compte Merci facteur Pro
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws Exception {
        String wwServiceId = null;
        String wwAccessToken = null;
        Integer idUser = null;
        InlineResponse2002 response = api.deleteUser(wwServiceId, wwAccessToken, idUser);

        // TODO: test validations
    }
    /**
     * Récupérer le user ID d&#x27;un utilisateur
     *
     * Récupérer le user ID à partir de l&#x27;adresse email. Pour utiliser cette fonction le moins possible, stockez les userId en local.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserIdTest() throws Exception {
        String wwServiceId = null;
        String wwAccessToken = null;
        String emailUser = null;
        InlineResponse2003 response = api.getUserId(wwServiceId, wwAccessToken, emailUser);

        // TODO: test validations
    }
    /**
     * Créer un nouvel utilisateur
     *
     * Chaque utilisateur aura un carnet d&#x27;adresses et un historique des envois. Vous retrouverez ces utilisateurs dans votre interface Merci facteur Pro. L&#x27;email indiqué doit être unique et vous permettre d&#x27;identifier l&#x27;utilisateur. Nous vous conseillons d&#x27;enregistrer en local les id d&#x27;utilisateurs retournés dans la réonse pour plus de confort d&#x27;utilisation de l&#x27;API.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setUserTest() throws Exception {
        String emailUser = null;
        String firstName = null;
        String lastName = null;
        String wwServiceId = null;
        String wwAccessToken = null;
        InlineResponse2001 response = api.setUser(emailUser, firstName, lastName, wwServiceId, wwAccessToken);

        // TODO: test validations
    }
    /**
     * Modifier les informations d&#x27;un utilisateur
     *
     * Attention, toutes les informations doivent être envoyées, même si il n&#x27;y a pas des modifications sur toutes.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() throws Exception {
        String emailUser = null;
        String firstName = null;
        String lastName = null;
        String wwServiceId = null;
        String wwAccessToken = null;
        Integer idUser = null;
        InlineResponse2002 response = api.updateUser(emailUser, firstName, lastName, wwServiceId, wwAccessToken, idUser);

        // TODO: test validations
    }
}