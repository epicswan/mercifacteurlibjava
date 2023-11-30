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
 * TemplatePublipostageBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-11-30T14:41:58.166575150Z[GMT]")

public class TemplatePublipostageBody {
  /**
   * Type de template envoyé (\&quot;file\&quot; pour une URL vers un fichier docx, ou \&quot;base64\&quot; pour un fichier encodé en base64).
   */
  @JsonAdapter(TypeTemplateEnum.Adapter.class)
  public enum TypeTemplateEnum {
    @SerializedName("file")
    FILE("file"),
    @SerializedName("base64")
    BASE64("base64");

    private String value;

    TypeTemplateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeTemplateEnum fromValue(String input) {
      for (TypeTemplateEnum b : TypeTemplateEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeTemplateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeTemplateEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeTemplateEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeTemplateEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("typeTemplate")
  private TypeTemplateEnum typeTemplate = null;

  @SerializedName("template")
  private String template = null;

  public TemplatePublipostageBody typeTemplate(TypeTemplateEnum typeTemplate) {
    this.typeTemplate = typeTemplate;
    return this;
  }

   /**
   * Type de template envoyé (\&quot;file\&quot; pour une URL vers un fichier docx, ou \&quot;base64\&quot; pour un fichier encodé en base64).
   * @return typeTemplate
  **/
  @Schema(description = "Type de template envoyé (\"file\" pour une URL vers un fichier docx, ou \"base64\" pour un fichier encodé en base64).")
  public TypeTemplateEnum getTypeTemplate() {
    return typeTemplate;
  }

  public void setTypeTemplate(TypeTemplateEnum typeTemplate) {
    this.typeTemplate = typeTemplate;
  }

  public TemplatePublipostageBody template(String template) {
    this.template = template;
    return this;
  }

   /**
   * URL du fichier docx, ou sa version encodée en base64.
   * @return template
  **/
  @Schema(description = "URL du fichier docx, ou sa version encodée en base64.")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplatePublipostageBody templatePublipostageBody = (TemplatePublipostageBody) o;
    return Objects.equals(this.typeTemplate, templatePublipostageBody.typeTemplate) &&
        Objects.equals(this.template, templatePublipostageBody.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeTemplate, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplatePublipostageBody {\n");
    
    sb.append("    typeTemplate: ").append(toIndentedString(typeTemplate)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
