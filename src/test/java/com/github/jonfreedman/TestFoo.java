package com.github.jonfreedman;

import java.util.Collections;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFoo {
    @Test
    public void test() {
        final Foo foo = Foo.builder()
                .setList(Collections.singletonList("foo"))
                .setMap(Collections.singletonMap("foo", Collections.singletonMap("bar", "baz")))
                .build();
        final String nullable = foo.getMap().get("foo").get("bar");
        assertEquals("baz", nullable);
    }
}
