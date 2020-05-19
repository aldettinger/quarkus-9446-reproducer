package io.quarkus.reproducer.deployment;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import io.quarkus.test.QuarkusUnitTest;

public class Quarkus9446ReproducerTest {

    @RegisterExtension
    static final QuarkusUnitTest CONFIG = new QuarkusUnitTest().setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class));

    @Test
    void buildTimeAvroDataFormatAnnotationsShouldBeProcessed() {
        System.out.println("Passed here");
        // Reproduce ?
    }

}
