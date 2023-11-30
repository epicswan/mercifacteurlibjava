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
import io.swagger.client.model.Base64FilesSendCourrier;
import io.swagger.client.model.FilesSendCourrier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Définition du contenu de la lettre, envoyer une chaine vide si pas de lettre dans ce courrier (&#x3D;&#x27;&#x27;)
 */
@Schema(description = "Définition du contenu de la lettre, envoyer une chaine vide si pas de lettre dans ce courrier (='')")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-11-30T14:41:58.166575150Z[GMT]")

public class SendCourrierContentLetter {
  @SerializedName("files")
  private FilesSendCourrier files = null;

  @SerializedName("base64files")
  private Base64FilesSendCourrier base64files = null;

  @SerializedName("final_filename")
  private String finalFilename = null;

  /**
   * rectoverso si vous souhaitez une impression recto/verso, ou recto si vous souhaitez une impression recto simple, ou distinctrectoverso si vous souhaitez une impression recto/verso et que nous insérions une page blanche après les fichiers au nombre de pages impair.
   */
  @JsonAdapter(PrintSidesEnum.Adapter.class)
  public enum PrintSidesEnum {
    @SerializedName("recto")
    RECTO("recto"),
    @SerializedName("rectoverso")
    RECTOVERSO("rectoverso"),
    @SerializedName("distinctrectoverso")
    DISTINCTRECTOVERSO("distinctrectoverso");

    private String value;

    PrintSidesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PrintSidesEnum fromValue(String input) {
      for (PrintSidesEnum b : PrintSidesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PrintSidesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrintSidesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PrintSidesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PrintSidesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("print_sides")
  private PrintSidesEnum printSides = null;

  public SendCourrierContentLetter files(FilesSendCourrier files) {
    this.files = files;
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @Schema(description = "")
  public FilesSendCourrier getFiles() {
    return files;
  }

  public void setFiles(FilesSendCourrier files) {
    this.files = files;
  }

  public SendCourrierContentLetter base64files(Base64FilesSendCourrier base64files) {
    this.base64files = base64files;
    return this;
  }

   /**
   * Get base64files
   * @return base64files
  **/
  @Schema(description = "")
  public Base64FilesSendCourrier getBase64files() {
    return base64files;
  }

  public void setBase64files(Base64FilesSendCourrier base64files) {
    this.base64files = base64files;
  }

  public SendCourrierContentLetter finalFilename(String finalFilename) {
    this.finalFilename = finalFilename;
    return this;
  }

   /**
   * Facultatif, maximum 50 caractères, vous pouvez spécifier le nom de fichier que vous souhaitez pour votre lettre. Ne mettez pas d&#x27;&#x27;extension, &#x27;.pdf&#x27; sera ajouté à la fin. Il sera visible dans votre interface Merci facteur Pro pour faciliter vos recherches. Dans le cas d&#x27;envois recommandés électroniques (ERE), ce nom de fichier sera visible par le destinataire.
   * @return finalFilename
  **/
  @Schema(description = "Facultatif, maximum 50 caractères, vous pouvez spécifier le nom de fichier que vous souhaitez pour votre lettre. Ne mettez pas d''extension, '.pdf' sera ajouté à la fin. Il sera visible dans votre interface Merci facteur Pro pour faciliter vos recherches. Dans le cas d'envois recommandés électroniques (ERE), ce nom de fichier sera visible par le destinataire.")
  public String getFinalFilename() {
    return finalFilename;
  }

  public void setFinalFilename(String finalFilename) {
    this.finalFilename = finalFilename;
  }

  public SendCourrierContentLetter printSides(PrintSidesEnum printSides) {
    this.printSides = printSides;
    return this;
  }

   /**
   * rectoverso si vous souhaitez une impression recto/verso, ou recto si vous souhaitez une impression recto simple, ou distinctrectoverso si vous souhaitez une impression recto/verso et que nous insérions une page blanche après les fichiers au nombre de pages impair.
   * @return printSides
  **/
  @Schema(description = "rectoverso si vous souhaitez une impression recto/verso, ou recto si vous souhaitez une impression recto simple, ou distinctrectoverso si vous souhaitez une impression recto/verso et que nous insérions une page blanche après les fichiers au nombre de pages impair.")
  public PrintSidesEnum getPrintSides() {
    return printSides;
  }

  public void setPrintSides(PrintSidesEnum printSides) {
    this.printSides = printSides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendCourrierContentLetter sendCourrierContentLetter = (SendCourrierContentLetter) o;
    return Objects.equals(this.files, sendCourrierContentLetter.files) &&
        Objects.equals(this.base64files, sendCourrierContentLetter.base64files) &&
        Objects.equals(this.finalFilename, sendCourrierContentLetter.finalFilename) &&
        Objects.equals(this.printSides, sendCourrierContentLetter.printSides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, base64files, finalFilename, printSides);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendCourrierContentLetter {\n");
    
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    base64files: ").append(toIndentedString(base64files)).append("\n");
    sb.append("    finalFilename: ").append(toIndentedString(finalFilename)).append("\n");
    sb.append("    printSides: ").append(toIndentedString(printSides)).append("\n");
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