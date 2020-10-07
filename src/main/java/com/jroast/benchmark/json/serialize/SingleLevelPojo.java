package com.jroast.benchmark.json.serialize;

import com.dslplatform.json.CompiledJson;
import com.dslplatform.json.JsonAttribute;
import com.dslplatform.json.JsonValue;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

@CompiledJson
public class SingleLevelPojo {

    private final Long id;
    private final String name;
    private final UUID uuid;
    private final BigDecimal number;

    public SingleLevelPojo() {
        this.id = null;
        this.name = null;
        this.uuid = null;
        this.number = null;
    }

    public SingleLevelPojo(
        Long id,
        String name,
        UUID uuid,
        BigDecimal number
    ) {
        this.id = id;
        this.name = name;
        this.uuid = uuid;
        this.number = number;
    }

    @JsonValue
    public Long getId() {
        return id;
    }

    @JsonValue
    public String getName() {
        return name;
    }

    @JsonValue
    public UUID getUuid() {
        return uuid;
    }

    @JsonValue
    public BigDecimal getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SingleLevelPojo that = (SingleLevelPojo) o;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(uuid, that.uuid)
            && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, uuid, number);
    }

    @Override
    public String toString() {
        return "SingleLevelPojo{"
            + "id=" + id
            + ", name='" + name + '\''
            + ", uuid=" + uuid
            + ", number=" + number
            + '}';
    }

}
