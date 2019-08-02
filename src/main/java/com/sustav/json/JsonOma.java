package com.sustav.json;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;
import javax.json.JsonWriter;

public class JsonOma {
    public static void main(String[] args) throws IOException {
        JsonObject json = new JsonOma().getJson();
        JsonWriter writer = Json.createWriter(new FileWriter("Student.json"));
        writer.writeObject(json);
        writer.close();

        JsonReader reader = Json.createReader(new FileReader("Student.json"));
        JsonObject jsonObject = reader.readObject();
        JsonObject student = jsonObject.getJsonObject("Student");
        System.out.println(student.getString("name"));
        System.out.println(student.getInt("age"));
        JsonObject address = student.getJsonObject("address");
        System.out.println(address.getString("city"));
        List<JsonValue> exams = student.getJsonArray("exams");
        for (JsonValue value: exams) {
            System.out.println(value.toString());
        }


    }

    private JsonObject getJson() {
        return Json.createObjectBuilder()
                .add("Student", Json.createObjectBuilder()
                        .add("name", "Max")
                        .add("age", 22)
                        .add("address", Json.createObjectBuilder()
                            .add("street", "Lenina")
                                .add("city", "Moscow")
                            )
                        .add("exams", Json.createArrayBuilder()
                                .add("English")
                                .add("Camestry")
                            )

                    ).build();
    }
}
