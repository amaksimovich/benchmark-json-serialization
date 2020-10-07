package com.jroast.benchmark.json.serialize;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

@JsonSerializerBenchmark
public class JacksonJsonSerializerBenchmark {

    @Benchmark
    public void singleLevelPojoSerialization(
        SerializerEnginesState engines, SingleLevelPojoListState data, Blackhole blackhole
    ) throws JsonProcessingException {

        SingleLevelPojo[] pojoTestSet = data.getPojoTestSet();
        ObjectMapper objectMapper = engines.getObjectMapper();

        for (int i = 0; i < SingleLevelPojoListState.TEST_POJO_COUNT; i++) {
            SingleLevelPojo it = pojoTestSet[i];
            String result = objectMapper.writeValueAsString(it);
            blackhole.consume(result);
        }

    }

}
