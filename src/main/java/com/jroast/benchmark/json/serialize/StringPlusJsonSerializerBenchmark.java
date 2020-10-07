package com.jroast.benchmark.json.serialize;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

@JsonSerializerBenchmark
public class StringPlusJsonSerializerBenchmark {

    @Benchmark
    public void singleLevelPojoSerialization(SingleLevelPojoListState data, Blackhole blackhole) {
        SingleLevelPojo[] pojoTestSet = data.getPojoTestSet();
        for (int i = 0; i < SingleLevelPojoListState.TEST_POJO_COUNT; i++) {
            SingleLevelPojo it = pojoTestSet[i];
            String json = "{"
                + "\"id\": " + it.getId() + ","
                + "\"name\": \"" + it.getName() + "\","
                + "\"uuid\": \"" + it.getUuid() + "\","
                + "\"number\": " + it.getNumber()
                + "}";
            blackhole.consume(json);
        }

    }

}
