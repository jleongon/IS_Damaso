/*
 * Dámaso temporizadores API
 * API de sensorización del proyecto Dámaso. Ingeniería de Servicios TIC, Universidad de Extremadura
 *
 * OpenAPI spec version: 1.0.0
 * Contact: jleongon@alumnos.unex.es
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.TimerNotification;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;
import javax.validation.constraints.*;

/**
 * Temporizador para una notificación.
 */
@Schema(description = "Temporizador para una notificación.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-11-07T18:16:59.231Z[GMT]")public class Timer   {
  @JsonProperty("idTimer")
  private Long idTimer = null;

  @JsonProperty("timestamp")
  private Date timestamp = null;

  @JsonProperty("notification")
  private TimerNotification notification = null;

  public Timer idTimer(Long idTimer) {
    this.idTimer = idTimer;
    return this;
  }

  /**
   * Identificador único para cada temporizador
   * @return idTimer
   **/
  @JsonProperty("idTimer")
  @Schema(example = "12397812", required = true, description = "Identificador único para cada temporizador")
  @NotNull
  public Long getIdTimer() {
    return idTimer;
  }

  public void setIdTimer(Long idTimer) {
    this.idTimer = idTimer;
  }

  public Timer timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Timestamp de la ejecución del temporizador
   * @return timestamp
   **/
  @JsonProperty("timestamp")
  @Schema(required = true, description = "Timestamp de la ejecución del temporizador")
  @NotNull
  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public Timer notification(TimerNotification notification) {
    this.notification = notification;
    return this;
  }

  /**
   * Get notification
   * @return notification
   **/
  @JsonProperty("notification")
  @Schema(required = true, description = "")
  @NotNull
  public TimerNotification getNotification() {
    return notification;
  }

  public void setNotification(TimerNotification notification) {
    this.notification = notification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timer timer = (Timer) o;
    return Objects.equals(this.idTimer, timer.idTimer) &&
        Objects.equals(this.timestamp, timer.timestamp) &&
        Objects.equals(this.notification, timer.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTimer, timestamp, notification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timer {\n");
    
    sb.append("    idTimer: ").append(toIndentedString(idTimer)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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
