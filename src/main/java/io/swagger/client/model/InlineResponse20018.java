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
 * InlineResponse20018
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-11T10:32:30.069126169Z[GMT]")

public class InlineResponse20018 {
  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("format_return")
  private String formatReturn = null;

  @SerializedName("document")
  private String document = null;

  public InlineResponse20018 success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @Schema(description = "")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public InlineResponse20018 error(String error) {
    this.error = error;
    return this;
  }

   /**
   * le code d&#x27;erreur en cas d&#x27;erreur
   * @return error
  **/
  @Schema(description = "le code d'erreur en cas d'erreur")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public InlineResponse20018 formatReturn(String formatReturn) {
    this.formatReturn = formatReturn;
    return this;
  }

   /**
   * Le format du document (jpeg ou pdf).
   * @return formatReturn
  **/
  @Schema(description = "Le format du document (jpeg ou pdf).")
  public String getFormatReturn() {
    return formatReturn;
  }

  public void setFormatReturn(String formatReturn) {
    this.formatReturn = formatReturn;
  }

  public InlineResponse20018 document(String document) {
    this.document = document;
    return this;
  }

   /**
   * La base64 du document retourné. Pour créer le document en local ou l&#x27;afficher, associez-y la bonne entête en fonction du \&quot;format_return\&quot;.
   * @return document
  **/
  @Schema(description = "La base64 du document retourné. Pour créer le document en local ou l'afficher, associez-y la bonne entête en fonction du \"format_return\".")
  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20018 inlineResponse20018 = (InlineResponse20018) o;
    return Objects.equals(this.success, inlineResponse20018.success) &&
        Objects.equals(this.error, inlineResponse20018.error) &&
        Objects.equals(this.formatReturn, inlineResponse20018.formatReturn) &&
        Objects.equals(this.document, inlineResponse20018.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error, formatReturn, document);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20018 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    formatReturn: ").append(toIndentedString(formatReturn)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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
