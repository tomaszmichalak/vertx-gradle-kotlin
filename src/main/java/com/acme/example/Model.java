package com.acme.example;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;


@DataObject(generateConverter = true)
public class Model {

  private String message;

  private Model() {
    // empty
  }

  public Model(JsonObject json) {
    ModelConverter.fromJson(json, this);
  }

  public String getMessage() {
    return message;
  }

  public Model setMessage(String message) {
    this.message = message;
    return this;
  }

}
