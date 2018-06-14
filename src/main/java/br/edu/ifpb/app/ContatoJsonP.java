package br.edu.ifpb.app;

import java.io.IOException;
import java.io.InputStream;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonString;
import javax.json.stream.JsonCollectors;
import java.util.List;
import java.util.stream.Collectors;
import javax.json.Json;
import javax.json.JsonPointer;
import javax.json.JsonReader;

public class ContatoJsonP {

    private final JsonObject jsonObject = loadJsonObject();

    public List<String> filterJsonArrayToList() {
        List<String> topics = jsonObject.getJsonArray("topics")
                .stream()
                .filter(jsonValue -> ((JsonString) jsonValue)
                        .getString().startsWith("C"))
                .map(jsonValue -> ((JsonString) jsonValue).getString())
                .collect(Collectors.toList());
        return topics;
    }

    public JsonArray filterJsonArrayToJsonArray() {
        JsonArray topics = jsonObject.getJsonArray("topics").stream()
                .filter(jsonValue -> ((JsonString) jsonValue)
                        .getString().startsWith("C"))
                .collect(JsonCollectors.toJsonArray());
        return topics;
    }

    public String find() {
        JsonPointer pointer = Json.createPointer("/topics/1");
        JsonString jsonValue = (JsonString) pointer.getValue(jsonObject);
        return jsonValue.getString();
    }

    public String replace() {
        JsonPointer pointer = Json.createPointer("/topics/1");
        JsonObject newJsonObject = pointer.replace(jsonObject,
                Json.createValue("Big Data"));
        JsonString jsonValue = (JsonString) pointer.getValue(newJsonObject);
        return jsonValue.getString();
    }

    public String add() {
        JsonPointer pointer = Json.createPointer("/topics/0");
        JsonObject newJsonObject = pointer.add(jsonObject,
                Json.createValue("Java EE"));
        JsonString jsonValue = (JsonString) pointer.getValue(newJsonObject);
        return jsonValue.getString();
    }

    public static JsonObject loadJsonObject() {
        try (InputStream is = ContatoJsonP.class
//                .getClassLoader().getResourceAsStream("/jsondata-object.json");
                .getResourceAsStream("/jsondata-object.json");
                JsonReader jsonReader = Json.createReader(is)) {
            return jsonReader.readObject();
        } catch (IOException e) {
            return null;
        }
    }

}
