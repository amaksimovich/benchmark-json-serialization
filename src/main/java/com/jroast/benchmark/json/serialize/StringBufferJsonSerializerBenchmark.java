package com.jroast.benchmark.json.serialize;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

@JsonSerializerBenchmark
public class StringBufferJsonSerializerBenchmark {

    @Benchmark
    public void singleLevelPojoSerialization(SingleLevelPojoListState data, Blackhole blackhole) {
        SingleLevelPojo[] pojoTestSet = data.getPojoTestSet();
        for (int i = 0; i < SingleLevelPojoListState.TEST_POJO_COUNT; i++) {
            SingleLevelPojo it = pojoTestSet[i];
            StringBuffer json = new StringBuffer().append("{")
                .append("\"id\": ").append(it.getId()).append(",")
                .append("\"name\": \"").append(it.getName()).append("\","
                ).append("\"uuid\": \"").append(it.getUuid()).append("\","
                ).append("\"number\": ").append(it.getNumber()
                ).append("}");
            blackhole.consume(json.toString());
        }

    }

}
