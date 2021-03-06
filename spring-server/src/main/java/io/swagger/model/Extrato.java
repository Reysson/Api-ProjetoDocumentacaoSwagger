package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Transacao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Extrato
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-06T12:30:45.544Z")


public class Extrato   {
  @JsonProperty("transacao")
  @Valid
  private List<Transacao> transacao = null;

  public Extrato transacao(List<Transacao> transacao) {
    this.transacao = transacao;
    return this;
  }

  public Extrato addTransacaoItem(Transacao transacaoItem) {
    if (this.transacao == null) {
      this.transacao = new ArrayList<Transacao>();
    }
    this.transacao.add(transacaoItem);
    return this;
  }

  /**
   * Get transacao
   * @return transacao
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Transacao> getTransacao() {
    return transacao;
  }

  public void setTransacao(List<Transacao> transacao) {
    this.transacao = transacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Extrato extrato = (Extrato) o;
    return Objects.equals(this.transacao, extrato.transacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Extrato {\n");
    
    sb.append("    transacao: ").append(toIndentedString(transacao)).append("\n");
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

