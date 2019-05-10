package com.github.jonfreedman;

import com.google.auto.value.AutoValue;

import java.util.List;
import java.util.Map;

@AutoValue
public abstract class Foo {
    public abstract List<String> getList();

    public abstract Map<String, Map<String, String>> getMap();

    public static Builder builder() {
        return Builder.builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        private static Builder builder() {
            return new AutoValue_Foo.Builder();
        }

        public abstract Builder setList(final List<String> list);

        public abstract Builder setMap(final Map<String, Map<String, String>> map);

        public abstract Foo build();
    }

}
