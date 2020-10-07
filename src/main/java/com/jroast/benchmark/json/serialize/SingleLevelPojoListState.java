package com.jroast.benchmark.json.serialize;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;

@State(Scope.Benchmark)
public class SingleLevelPojoListState {

    public static final int TEST_POJO_COUNT = 1000;

    private final SingleLevelPojo[] pojoTestSet = SingleLevelPojoListState.generateRandomArray(TEST_POJO_COUNT);

    public SingleLevelPojo[] getPojoTestSet() {
        return pojoTestSet;
    }

    private static SingleLevelPojo[] generateRandomArray(int size) {
        Random randomizer = new Random();
        SingleLevelPojo[] samples = new SingleLevelPojo[size];
        for (int i = 0; i < size; i++) {
            samples[i] = new SingleLevelPojo(
                randomizer.nextLong(),
                UUID.randomUUID().toString(),
                UUID.randomUUID(),
                new BigDecimal(randomizer.nextLong())
            );
        }
        return samples;
    }

}
