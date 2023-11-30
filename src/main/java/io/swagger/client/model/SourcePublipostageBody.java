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
import io.swagger.client.model.SourcePublipostageSource;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SourcePublipostageBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-11-30T14:41:58.166575150Z[GMT]")

public class SourcePublipostageBody {
  @SerializedName("idUser")
  private Integer idUser = null;

  @SerializedName("templateValidation")
  private Object templateValidation = null;

  @SerializedName("source")
  private SourcePublipostageSource source = null;

  public SourcePublipostageBody idUser(Integer idUser) {
    this.idUser = idUser;
    return this;
  }

   /**
   * Id de l&#x27;utilisateur qui effectue l&#x27;envoi.
   * @return idUser
  **/
  @Schema(description = "Id de l'utilisateur qui effectue l'envoi.")
  public Integer getIdUser() {
    return idUser;
  }

  public void setIdUser(Integer idUser) {
    this.idUser = idUser;
  }

  public SourcePublipostageBody templateValidation(Object templateValidation) {
    this.templateValidation = templateValidation;
    return this;
  }

   /**
   * un json avec la valeur templateValidation telle qu&#x27;elle vous a été retourné lors de l&#x27;envoi du template sur /templatePublipostage.
   * @return templateValidation
  **/
  @Schema(description = "un json avec la valeur templateValidation telle qu'elle vous a été retourné lors de l'envoi du template sur /templatePublipostage.")
  public Object getTemplateValidation() {
    return templateValidation;
  }

  public void setTemplateValidation(Object templateValidation) {
    this.templateValidation = templateValidation;
  }

  public SourcePublipostageBody source(SourcePublipostageSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public SourcePublipostageSource getSource() {
    return source;
  }

  public void setSource(SourcePublipostageSource source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourcePublipostageBody sourcePublipostageBody = (SourcePublipostageBody) o;
    return Objects.equals(this.idUser, sourcePublipostageBody.idUser) &&
        Objects.equals(this.templateValidation, sourcePublipostageBody.templateValidation) &&
        Objects.equals(this.source, sourcePublipostageBody.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUser, templateValidation, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourcePublipostageBody {\n");
    
    sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
    sb.append("    templateValidation: ").append(toIndentedString(templateValidation)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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