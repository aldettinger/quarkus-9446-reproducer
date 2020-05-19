package io.quarkus.reproducer;

import org.apache.avro.Schema;

import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class ReproducerRecorder {

    public void recordAvroSchema(Schema schema) {
        schema.toString();
    }

}
