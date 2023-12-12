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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * URL du fichier csv/txt, sa version encodée en base64, ou le json des données.
 */
@Schema(description = "URL du fichier csv/txt, sa version encodée en base64, ou le json des données.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-11T10:32:30.069126169Z[GMT]")

public class SourcePublipostageSource {
  /**
   * Type de source envoyée (\&quot;file\&quot; pour une URL vers un fichier CSV ou TXT, \&quot;base64\&quot; pour un fichier CSV ou TXT encodé en base64, ou \&quot;json\&quot; pour un json).
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("file")
    FILE("file"),
    @SerializedName("base64")
    BASE64("base64"),
    @SerializedName("json")
    JSON("json");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("value")
  private String value = null;

  public SourcePublipostageSource type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type de source envoyée (\&quot;file\&quot; pour une URL vers un fichier CSV ou TXT, \&quot;base64\&quot; pour un fichier CSV ou TXT encodé en base64, ou \&quot;json\&quot; pour un json).
   * @return type
  **/
  @Schema(description = "Type de source envoyée (\"file\" pour une URL vers un fichier CSV ou TXT, \"base64\" pour un fichier CSV ou TXT encodé en base64, ou \"json\" pour un json).")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SourcePublipostageSource value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Si type&#x3D;\&quot;file\&quot;, l&#x27;URL du fichier. Si type&#x3D;\&quot;base64\&quot;, la base64. Si type&#x3D;\&quot;json\&quot;, un json contenant les données sources ([{destinataire 1},{destinataire 2},etc...])
   * @return value
  **/
  @Schema(description = "Si type=\"file\", l'URL du fichier. Si type=\"base64\", la base64. Si type=\"json\", un json contenant les données sources ([{destinataire 1},{destinataire 2},etc...])")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourcePublipostageSource sourcePublipostageSource = (SourcePublipostageSource) o;
    return Objects.equals(this.type, sourcePublipostageSource.type) &&
        Objects.equals(this.value, sourcePublipostageSource.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }


  @Override
  public String toString() {
    List<String> values = Arrays.asList(
            "\"type\": \"" + toIndentedString(type) + "\"",
            "\"value\": [" + toIndentedString(value) + "]"
    );

    return String.format("{%s}", String.join(",", values));
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
