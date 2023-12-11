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


import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Facultatif, permet de demander la suppression d\\&#x27;éléments du courrier un certain délai (en nombre de jours) après l\\&#x27;impression du courrier. A utiliser si vous ne souhaitez pas que les données des courriers soient conservées sur les serveurs de Merci Facteur. Exemple de valeur : {\&quot;delay\&quot;:15,\&quot;target\&quot;:[\&quot;content\&quot;,\&quot;exp\&quot;,\&quot;dest\&quot;]} (plus d\\&#x27;infos ici : https://github.com/MerciFacteur/Merci-facteur-API/#anonymisation)
 */
@Schema(description = "Facultatif, permet de demander la suppression d\\'éléments du courrier un certain délai (en nombre de jours) après l\\'impression du courrier. A utiliser si vous ne souhaitez pas que les données des courriers soient conservées sur les serveurs de Merci Facteur. Exemple de valeur : {\"delay\":15,\"target\":[\"content\",\"exp\",\"dest\"]} (plus d\\'infos ici : https://github.com/MerciFacteur/Merci-facteur-API/#anonymisation)")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-11T10:32:30.069126169Z[GMT]")

public class SendCourrierAnonymize {

  public enum TargetEnum {
    @SerializedName("exp")
    EXP("exp"),
    @SerializedName("dest")
    DEST("dest"),
    @SerializedName("content")
    CONTENT("content");

    private String value;

    TargetEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TargetEnum fromValue(String input) {
      for (TargetEnum b : TargetEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
  }

  @SerializedName("delay")
  private Integer delay = 10;

  @SerializedName("target")
  private List<TargetEnum> target = null;

  public SendCourrierAnonymize delay(Integer delay) {
    this.delay = delay;
    return this;
  }

  @Schema(description = "Délai en nombre de jours (min. 1, max. 400) à compter de l'impression, après lesquels vous souhaitez que l'anonymisation ai lieu.")
  public Integer getDelay() {
    return delay;
  }

  public void setDelay(Integer delay) {
    this.delay = delay;
  }

  public SendCourrierAnonymize target(List<TargetEnum> target) {
    this.target = target;
    return this;
  }

  public SendCourrierAnonymize addTargetItem(TargetEnum targetItem) {
    if (this.target == null) {
      this.target = new ArrayList<TargetEnum>();
    }
    this.target.add(targetItem);
    return this;
  }

  @Schema(description = "Délai en nombre de jours (min. 1, max. 400) à compter de l'impression, après lesquels vous souhaitez que l'anonymisation ai lieu.")
  public List<TargetEnum> getTarget() {
    return target;
  }

  public void setTarget(List<TargetEnum> target) {
    this.target = target;
  }

  @Override
  public String toString() {
    List<String> targetValues = this.target.stream()
            .map(TargetEnum::getValue)
            .collect(Collectors.toList());

    return String.format("{\"delay\":%d,\"target\":[\"%s\"]}", this.delay, String.join("\",\"", targetValues));
  }

}
