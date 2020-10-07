package com.jroast.benchmark.json.serialize;

import com.dslplatform.json.DslJson;
import com.dslplatform.json.JsonWriter;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class SerializerEnginesState {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final JsonWriter jsonWriter = new DslJson<>().newWriter();

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public JsonWriter getJsonWriter() {
        return jsonWriter;
    }

}
