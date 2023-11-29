package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.SendCourrierContentCard;
import io.swagger.server.api.model.SendCourrierContentLetter;
import io.swagger.server.api.model.SendCourrierContentPhoto;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Contenu du courrier à envoyer
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class SendCourrierContent   {
  private SendCourrierContentLetter letter = null;

  private SendCourrierContentPhoto photo = null;

  private SendCourrierContentCard card = null;

  public SendCourrierContent letter(SendCourrierContentLetter letter) {
    this.letter = letter;
    return this;
  }

  /**
   * Get letter
   * @return letter
   **/
    public SendCourrierContentLetter getLetter() {
    return letter;
  }

  public void setLetter(SendCourrierContentLetter letter) {
    this.letter = letter;
  }

  public SendCourrierContent photo(SendCourrierContentPhoto photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Get photo
   * @return photo
   **/
    public SendCourrierContentPhoto getPhoto() {
    return photo;
  }

  public void setPhoto(SendCourrierContentPhoto photo) {
    this.photo = photo;
  }

  public SendCourrierContent card(SendCourrierContentCard card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
   **/
    public SendCourrierContentCard getCard() {
    return card;
  }

  public void setCard(SendCourrierContentCard card) {
    this.card = card;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendCourrierContent sendCourrierContent = (SendCourrierContent) o;
    return Objects.equals(this.letter, sendCourrierContent.letter) &&
        Objects.equals(this.photo, sendCourrierContent.photo) &&
        Objects.equals(this.card, sendCourrierContent.card);
  }

  @Override
  public int hashCode() {
    return Objects.hash(letter, photo, card);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendCourrierContent {\n");
    
    sb.append("    letter: ").append(toIndentedString(letter)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
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
