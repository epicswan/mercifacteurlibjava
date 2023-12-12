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

import java.util.List;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.SendCourrierContentCardText;
import io.swagger.client.model.SendCourrierContentCardVisuel;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Définition du contenu de la carte, envoyer une chaine vide si pas de carte dans ce courrier (&#x3D;&#x27;&#x27;)
 */
@Schema(description = "Définition du contenu de la carte, envoyer une chaine vide si pas de carte dans ce courrier (='')")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-11T10:32:30.069126169Z[GMT]")

public class SendCourrierContentCard {
  /**
   * Format de la carte : postcard, naked-postcard, classic, folded, large, large-a4
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    @SerializedName("postcard")
    POSTCARD("postcard"),
    @SerializedName("naked-postcard")
    NAKED_POSTCARD("naked-postcard"),
    @SerializedName("classic")
    CLASSIC("classic"),
    @SerializedName("folded")
    FOLDED("folded"),
    @SerializedName("large")
    LARGE("large"),
    @SerializedName("large-a4")
    LARGE_A4("large-a4");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FormatEnum fromValue(String input) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FormatEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("format")
  private FormatEnum format = null;

  @SerializedName("visuel")
  private SendCourrierContentCardVisuel visuel = null;

  @SerializedName("text")
  private SendCourrierContentCardText text = null;

  /**
   * Type de coins de la carte (arrondi ou carre)
   */
  @JsonAdapter(CoinEnum.Adapter.class)
  public enum CoinEnum {
    @SerializedName("arrondi")
    ARRONDI("arrondi"),
    @SerializedName("carre")
    CARRE("carre");

    private String value;

    CoinEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CoinEnum fromValue(String input) {
      for (CoinEnum b : CoinEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CoinEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CoinEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CoinEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CoinEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("coin")
  private CoinEnum coin = null;

  /**
   * Type de papier de la carte (classic, nacre ou creation)
   */
  @JsonAdapter(PapierEnum.Adapter.class)
  public enum PapierEnum {
    @SerializedName("classic")
    CLASSIC("classic"),
    @SerializedName("nacre")
    NACRE("nacre"),
    @SerializedName("creation")
    CREATION("creation");

    private String value;

    PapierEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PapierEnum fromValue(String input) {
      for (PapierEnum b : PapierEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PapierEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PapierEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PapierEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PapierEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("papier")
  private PapierEnum papier = null;

  public SendCourrierContentCard format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * Format de la carte : postcard, naked-postcard, classic, folded, large, large-a4
   * @return format
  **/
  @Schema(description = "Format de la carte : postcard, naked-postcard, classic, folded, large, large-a4")
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public SendCourrierContentCard visuel(SendCourrierContentCardVisuel visuel) {
    this.visuel = visuel;
    return this;
  }

   /**
   * Get visuel
   * @return visuel
  **/
  @Schema(description = "")
  public SendCourrierContentCardVisuel getVisuel() {
    return visuel;
  }

  public void setVisuel(SendCourrierContentCardVisuel visuel) {
    this.visuel = visuel;
  }

  public SendCourrierContentCard text(SendCourrierContentCardText text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @Schema(description = "")
  public SendCourrierContentCardText getText() {
    return text;
  }

  public void setText(SendCourrierContentCardText text) {
    this.text = text;
  }

  public SendCourrierContentCard coin(CoinEnum coin) {
    this.coin = coin;
    return this;
  }

   /**
   * Type de coins de la carte (arrondi ou carre)
   * @return coin
  **/
  @Schema(description = "Type de coins de la carte (arrondi ou carre)")
  public CoinEnum getCoin() {
    return coin;
  }

  public void setCoin(CoinEnum coin) {
    this.coin = coin;
  }

  public SendCourrierContentCard papier(PapierEnum papier) {
    this.papier = papier;
    return this;
  }

   /**
   * Type de papier de la carte (classic, nacre ou creation)
   * @return papier
  **/
  @Schema(description = "Type de papier de la carte (classic, nacre ou creation)")
  public PapierEnum getPapier() {
    return papier;
  }

  public void setPapier(PapierEnum papier) {
    this.papier = papier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendCourrierContentCard sendCourrierContentCard = (SendCourrierContentCard) o;
    return Objects.equals(this.format, sendCourrierContentCard.format) &&
        Objects.equals(this.visuel, sendCourrierContentCard.visuel) &&
        Objects.equals(this.text, sendCourrierContentCard.text) &&
        Objects.equals(this.coin, sendCourrierContentCard.coin) &&
        Objects.equals(this.papier, sendCourrierContentCard.papier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, visuel, text, coin, papier);
  }


  @Override

  public String toString() {
    List<String> values = Arrays.asList(
    "format: " + toIndentedString(format),
    "visuel: " + toIndentedString(visuel),
    "text: " + toIndentedString(text),
    "coin: " + toIndentedString(coin),
    "papier: " + toIndentedString(papier)
    );

    return String.format("{\"%s\"}", String.join(",", values));
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
