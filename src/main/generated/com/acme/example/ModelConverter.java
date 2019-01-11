package com.acme.example;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter for {@link com.acme.example.Model}.
 * NOTE: This class has been automatically generated from the {@link com.acme.example.Model} original class using Vert.x codegen.
 */
public class ModelConverter {

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, Model obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "message":
          if (member.getValue() instanceof String) {
            obj.setMessage((String)member.getValue());
          }
          break;
      }
    }
  }

  public static void toJson(Model obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(Model obj, java.util.Map<String, Object> json) {
    if (obj.getMessage() != null) {
      json.put("message", obj.getMessage());
    }
  }
}
