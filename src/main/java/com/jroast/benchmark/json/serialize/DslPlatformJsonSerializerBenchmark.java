package com.jroast.benchmark.json.serialize;

import com.dslplatform.json.JsonWriter;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

@JsonSerializerBenchmark
public class DslPlatformJsonSerializerBenchmark {

    @Benchmark
    public void singleLevelPojoSerialization(
        SerializerEnginesState engines, SingleLevelPojoListState data, Blackhole blackhole
    ) throws JsonProcessingException {

        SingleLevelPojo[] pojoTestSet = data.getPojoTestSet();
        JsonWriter jsonWriter = engines.getJsonWriter();

        for (int i = 0; i < SingleLevelPojoListState.TEST_POJO_COUNT; i++) {
            SingleLevelPojo it = pojoTestSet[i];
            jsonWriter.reset();
            jsonWriter.serializeObject(it);
            blackhole.consume(jsonWriter.toString());
        }

    }

}
