package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InlineResponse2007Adress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-11T10:32:30.069126169Z[GMT]")

public class InlineResponse2007Adress {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("civilite")
  private String civilite = null;

  @SerializedName("nom")
  private String nom = null;

  @SerializedName("prenom")
  private String prenom = null;

  @SerializedName("societe")
  private String societe = null;

  @SerializedName("adresse1")
  private String adresse1 = null;

  @SerializedName("adresse2")
  private String adresse2 = null;

  @SerializedName("adresse3")
  private String adresse3 = null;

  @SerializedName("cp")
  private String cp = null;

  @SerializedName("ville")
  private String ville = null;

  @SerializedName("pays")
  private String pays = null;

  public InlineResponse2007Adress id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Id de l'adresse
   * @return id
   **/
  @Schema(description = "Id de l'adresse")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InlineResponse2007Adress type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type de contact
   * @return type
   **/
  @Schema(description = "Type de contact")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InlineResponse2007Adress civilite(String civilite) {
    this.civilite = civilite;
    return this;
  }

  /**
   * Civilité du contact
   * @return civilite
   **/
  @Schema(description = "Civilité du contact")
  public String getCivilite() {
    return civilite;
  }

  public void setCivilite(String civilite) {
    this.civilite = civilite;
  }

  public InlineResponse2007Adress nom(String nom) {
    this.nom = nom;
    return this;
  }

  /**
   * Nom du contact
   * @return nom
   **/
  @Schema(description = "Nom du contact")
  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public InlineResponse2007Adress prenom(String prenom) {
    this.prenom = prenom;
    return this;
  }

  /**
   * Prénom du contact
   * @return prenom
   **/
  @Schema(description = "Prénom du contact")
  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public InlineResponse2007Adress societe(String societe) {
    this.societe = societe;
    return this;
  }

  /**
   * Société du contact
   * @return societe
   **/
  @Schema(description = "Société du contact")
  public String getSociete() {
    return societe;
  }

  public void setSociete(String societe) {
    this.societe = societe;
  }

  public InlineResponse2007Adress adresse1(String adresse1) {
    this.adresse1 = adresse1;
    return this;
  }

  /**
   * Adresse ligne 1 du contact
   * @return adresse1
   **/
  @Schema(description = "Adresse ligne 1 du contact")
  public String getAdresse1() {
    return adresse1;
  }

  public void setAdresse1(String adresse1) {
    this.adresse1 = adresse1;
  }

  public InlineResponse2007Adress adresse2(String adresse2) {
    this.adresse2 = adresse2;
    return this;
  }

  /**
   * Adresse ligne 2 du contact
   * @return adresse2
   **/
  @Schema(description = "Adresse ligne 2 du contact")
  public String getAdresse2() {
    return adresse2;
  }

  public void setAdresse2(String adresse2) {
    this.adresse2 = adresse2;
  }

  public InlineResponse2007Adress adresse3(String adresse3) {
    this.adresse3 = adresse3;
    return this;
  }

  /**
   * Adresse ligne 3 du contact
   * @return adresse3
   **/
  @Schema(description = "Adresse ligne 3 du contact")
  public String getAdresse3() {
    return adresse3;
  }

  public void setAdresse3(String adresse3) {
    this.adresse3 = adresse3;
  }

  public InlineResponse2007Adress cp(String cp) {
    this.cp = cp;
    return this;
  }

  /**
   * Code postal du contact
   * @return cp
   **/
  @Schema(description = "Code postal du contact")
  public String getCp() {
    return cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public InlineResponse2007Adress ville(String ville) {
    this.ville = ville;
    return this;
  }

  /**
   * Ville du contact
   * @return ville
   **/
  @Schema(description = "Ville du contact")
  public String getVille() {
    return ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

  public InlineResponse2007Adress pays(String pays) {
    this.pays = pays;
    return this;
  }

  /**
   * Pays du contact
   * @return pays
   **/
  @Schema(description = "Pays du contact")
  public String getPays() {
    return pays;
  }

  public void setPays(String pays) {
    this.pays = pays;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007Adress inlineResponse2007Adress = (InlineResponse2007Adress) o;
    return Objects.equals(this.id, inlineResponse2007Adress.id) &&
            Objects.equals(this.type, inlineResponse2007Adress.type) &&
            Objects.equals(this.civilite, inlineResponse2007Adress.civilite) &&
            Objects.equals(this.nom, inlineResponse2007Adress.nom) &&
            Objects.equals(this.prenom, inlineResponse2007Adress.prenom) &&
            Objects.equals(this.societe, inlineResponse2007Adress.societe) &&
            Objects.equals(this.adresse1, inlineResponse2007Adress.adresse1) &&
            Objects.equals(this.adresse2, inlineResponse2007Adress.adresse2) &&
            Objects.equals(this.adresse3, inlineResponse2007Adress.adresse3) &&
            Objects.equals(this.cp, inlineResponse2007Adress.cp) &&
            Objects.equals(this.ville, inlineResponse2007Adress.ville) &&
            Objects.equals(this.pays, inlineResponse2007Adress.pays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, civilite, nom, prenom, societe, adresse1, adresse2, adresse3, cp, ville, pays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007Adress {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    civilite: ").append(toIndentedString(civilite)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    prenom: ").append(toIndentedString(prenom)).append("\n");
    sb.append("    societe: ").append(toIndentedString(societe)).append("\n");
    sb.append("    adresse1: ").append(toIndentedString(adresse1)).append("\n");
    sb.append("    adresse2: ").append(toIndentedString(adresse2)).append("\n");
    sb.append("    adresse3: ").append(toIndentedString(adresse3)).append("\n");
    sb.append("    cp: ").append(toIndentedString(cp)).append("\n");
    sb.append("    ville: ").append(toIndentedString(ville)).append("\n");
    sb.append("    pays: ").append(toIndentedString(pays)).append("\n");
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
