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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UpdateUserBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-11T10:32:30.069126169Z[GMT]")

public class UpdateUserBody {
  @SerializedName("emailUser")
  private String emailUser = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  public UpdateUserBody emailUser(String emailUser) {
    this.emailUser = emailUser;
    return this;
  }

   /**
   * Email de l&#x27;utilisateur. Peut être fictif mais doit être unique et vous permettre d&#x27;identifier l&#x27;utilisateur.
   * @return emailUser
  **/
  @Schema(required = true, description = "Email de l'utilisateur. Peut être fictif mais doit être unique et vous permettre d'identifier l'utilisateur.")
  public String getEmailUser() {
    return emailUser;
  }

  public void setEmailUser(String emailUser) {
    this.emailUser = emailUser;
  }

  public UpdateUserBody firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Prénom de l&#x27;utilisateur, vous permet de savoir qui est tel utilisateur.
   * @return firstName
  **/
  @Schema(description = "Prénom de l'utilisateur, vous permet de savoir qui est tel utilisateur.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UpdateUserBody lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Nom de l&#x27;utilisateur, vous permet de savoir qui est tel utilisateur.
   * @return lastName
  **/
  @Schema(description = "Nom de l'utilisateur, vous permet de savoir qui est tel utilisateur.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserBody updateUserBody = (UpdateUserBody) o;
    return Objects.equals(this.emailUser, updateUserBody.emailUser) &&
        Objects.equals(this.firstName, updateUserBody.firstName) &&
        Objects.equals(this.lastName, updateUserBody.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailUser, firstName, lastName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserBody {\n");
    
    sb.append("    emailUser: ").append(toIndentedString(emailUser)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
