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
import io.swagger.client.model.InlineResponse20011Contenu;
import io.swagger.client.model.InlineResponse20011Total;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20011Amount
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-11T10:32:30.069126169Z[GMT]")

public class InlineResponse20011Amount {
  @SerializedName("contenu")
  private List<InlineResponse20011Contenu> contenu = null;

  @SerializedName("affranchissement")
  private String affranchissement = null;

  @SerializedName("total")
  private List<InlineResponse20011Total> total = null;

  public InlineResponse20011Amount contenu(List<InlineResponse20011Contenu> contenu) {
    this.contenu = contenu;
    return this;
  }

  public InlineResponse20011Amount addContenuItem(InlineResponse20011Contenu contenuItem) {
    if (this.contenu == null) {
      this.contenu = new ArrayList<InlineResponse20011Contenu>();
    }
    this.contenu.add(contenuItem);
    return this;
  }

   /**
   * Get contenu
   * @return contenu
  **/
  @Schema(description = "")
  public List<InlineResponse20011Contenu> getContenu() {
    return contenu;
  }

  public void setContenu(List<InlineResponse20011Contenu> contenu) {
    this.contenu = contenu;
  }

  public InlineResponse20011Amount affranchissement(String affranchissement) {
    this.affranchissement = affranchissement;
    return this;
  }

   /**
   * Sous-total de l&#x27;affranchissement
   * @return affranchissement
  **/
  @Schema(description = "Sous-total de l'affranchissement")
  public String getAffranchissement() {
    return affranchissement;
  }

  public void setAffranchissement(String affranchissement) {
    this.affranchissement = affranchissement;
  }

  public InlineResponse20011Amount total(List<InlineResponse20011Total> total) {
    this.total = total;
    return this;
  }

  public InlineResponse20011Amount addTotalItem(InlineResponse20011Total totalItem) {
    if (this.total == null) {
      this.total = new ArrayList<InlineResponse20011Total>();
    }
    this.total.add(totalItem);
    return this;
  }

   /**
   * Montant total facturé
   * @return total
  **/
  @Schema(description = "Montant total facturé")
  public List<InlineResponse20011Total> getTotal() {
    return total;
  }

  public void setTotal(List<InlineResponse20011Total> total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20011Amount inlineResponse20011Amount = (InlineResponse20011Amount) o;
    return Objects.equals(this.contenu, inlineResponse20011Amount.contenu) &&
        Objects.equals(this.affranchissement, inlineResponse20011Amount.affranchissement) &&
        Objects.equals(this.total, inlineResponse20011Amount.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contenu, affranchissement, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20011Amount {\n");
    
    sb.append("    contenu: ").append(toIndentedString(contenu)).append("\n");
    sb.append("    affranchissement: ").append(toIndentedString(affranchissement)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
