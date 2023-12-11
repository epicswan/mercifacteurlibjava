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
import io.swagger.client.model.InlineResponse20011Amount;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20011Envois
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-11T10:32:30.069126169Z[GMT]")

public class InlineResponse20011Envois {
  @SerializedName("idEnvoi")
  private Integer idEnvoi = null;

  @SerializedName("statut")
  private String statut = null;

  @SerializedName("nbPage")
  private Integer nbPage = null;

  @SerializedName("nbDest")
  private Integer nbDest = null;

  @SerializedName("modeEnvoi")
  private String modeEnvoi = null;

  @SerializedName("date")
  private Integer date = null;

  @SerializedName("idExp")
  private Integer idExp = null;

  @SerializedName("idDest")
  private List<Integer> idDest = null;

  @SerializedName("amount")
  private List<InlineResponse20011Amount> amount = null;

  public InlineResponse20011Envois idEnvoi(Integer idEnvoi) {
    this.idEnvoi = idEnvoi;
    return this;
  }

   /**
   * Id de l&#x27;envoi
   * @return idEnvoi
  **/
  @Schema(description = "Id de l'envoi")
  public Integer getIdEnvoi() {
    return idEnvoi;
  }

  public void setIdEnvoi(Integer idEnvoi) {
    this.idEnvoi = idEnvoi;
  }

  public InlineResponse20011Envois statut(String statut) {
    this.statut = statut;
    return this;
  }

   /**
   * Statut de l&#x27;envoi
   * @return statut
  **/
  @Schema(description = "Statut de l'envoi")
  public String getStatut() {
    return statut;
  }

  public void setStatut(String statut) {
    this.statut = statut;
  }

  public InlineResponse20011Envois nbPage(Integer nbPage) {
    this.nbPage = nbPage;
    return this;
  }

   /**
   * Nb page de chaque courrier de l&#x27;envoi
   * @return nbPage
  **/
  @Schema(description = "Nb page de chaque courrier de l'envoi")
  public Integer getNbPage() {
    return nbPage;
  }

  public void setNbPage(Integer nbPage) {
    this.nbPage = nbPage;
  }

  public InlineResponse20011Envois nbDest(Integer nbDest) {
    this.nbDest = nbDest;
    return this;
  }

   /**
   * Nombre de destinataires de l&#x27;envoi (&#x3D;nombre de courriers)
   * @return nbDest
  **/
  @Schema(description = "Nombre de destinataires de l'envoi (=nombre de courriers)")
  public Integer getNbDest() {
    return nbDest;
  }

  public void setNbDest(Integer nbDest) {
    this.nbDest = nbDest;
  }

  public InlineResponse20011Envois modeEnvoi(String modeEnvoi) {
    this.modeEnvoi = modeEnvoi;
    return this;
  }

   /**
   * Mode d&#x27;envoi (lrar, lrare, suivi, normal)
   * @return modeEnvoi
  **/
  @Schema(description = "Mode d'envoi (lrar, lrare, suivi, normal)")
  public String getModeEnvoi() {
    return modeEnvoi;
  }

  public void setModeEnvoi(String modeEnvoi) {
    this.modeEnvoi = modeEnvoi;
  }

  public InlineResponse20011Envois date(Integer date) {
    this.date = date;
    return this;
  }

   /**
   * Date de l&#x27;envoi au format timestamp
   * @return date
  **/
  @Schema(description = "Date de l'envoi au format timestamp")
  public Integer getDate() {
    return date;
  }

  public void setDate(Integer date) {
    this.date = date;
  }

  public InlineResponse20011Envois idExp(Integer idExp) {
    this.idExp = idExp;
    return this;
  }

   /**
   * adresse Id de l&#x27;adresse d&#x27;expéditeur
   * @return idExp
  **/
  @Schema(description = "adresse Id de l'adresse d'expéditeur")
  public Integer getIdExp() {
    return idExp;
  }

  public void setIdExp(Integer idExp) {
    this.idExp = idExp;
  }

  public InlineResponse20011Envois idDest(List<Integer> idDest) {
    this.idDest = idDest;
    return this;
  }

  public InlineResponse20011Envois addIdDestItem(Integer idDestItem) {
    if (this.idDest == null) {
      this.idDest = new ArrayList<Integer>();
    }
    this.idDest.add(idDestItem);
    return this;
  }

   /**
   * adresse Id de/des l&#x27;adresse(s) de destinataire(s)
   * @return idDest
  **/
  @Schema(description = "adresse Id de/des l'adresse(s) de destinataire(s)")
  public List<Integer> getIdDest() {
    return idDest;
  }

  public void setIdDest(List<Integer> idDest) {
    this.idDest = idDest;
  }

  public InlineResponse20011Envois amount(List<InlineResponse20011Amount> amount) {
    this.amount = amount;
    return this;
  }

  public InlineResponse20011Envois addAmountItem(InlineResponse20011Amount amountItem) {
    if (this.amount == null) {
      this.amount = new ArrayList<InlineResponse20011Amount>();
    }
    this.amount.add(amountItem);
    return this;
  }

   /**
   * Résumé du montant facturé par Merci facteur
   * @return amount
  **/
  @Schema(description = "Résumé du montant facturé par Merci facteur")
  public List<InlineResponse20011Amount> getAmount() {
    return amount;
  }

  public void setAmount(List<InlineResponse20011Amount> amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20011Envois inlineResponse20011Envois = (InlineResponse20011Envois) o;
    return Objects.equals(this.idEnvoi, inlineResponse20011Envois.idEnvoi) &&
        Objects.equals(this.statut, inlineResponse20011Envois.statut) &&
        Objects.equals(this.nbPage, inlineResponse20011Envois.nbPage) &&
        Objects.equals(this.nbDest, inlineResponse20011Envois.nbDest) &&
        Objects.equals(this.modeEnvoi, inlineResponse20011Envois.modeEnvoi) &&
        Objects.equals(this.date, inlineResponse20011Envois.date) &&
        Objects.equals(this.idExp, inlineResponse20011Envois.idExp) &&
        Objects.equals(this.idDest, inlineResponse20011Envois.idDest) &&
        Objects.equals(this.amount, inlineResponse20011Envois.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idEnvoi, statut, nbPage, nbDest, modeEnvoi, date, idExp, idDest, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20011Envois {\n");
    
    sb.append("    idEnvoi: ").append(toIndentedString(idEnvoi)).append("\n");
    sb.append("    statut: ").append(toIndentedString(statut)).append("\n");
    sb.append("    nbPage: ").append(toIndentedString(nbPage)).append("\n");
    sb.append("    nbDest: ").append(toIndentedString(nbDest)).append("\n");
    sb.append("    modeEnvoi: ").append(toIndentedString(modeEnvoi)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    idExp: ").append(toIndentedString(idExp)).append("\n");
    sb.append("    idDest: ").append(toIndentedString(idDest)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
