package io.quarkus.reproducer.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.annotations.ExecutionTime;
import io.quarkus.deployment.annotations.Record;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.reproducer.ReproducerRecorder;
import org.apache.avro.Schema;

class Quarkus9446ReproducerProcessor {

    private static final String FEATURE = "quarkus-9446-reproducer";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @Record(ExecutionTime.STATIC_INIT)
    @BuildStep
    void reproduceQuarkus9446(ReproducerRecorder recorder){
        Schema avroSchema = new Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Value\",\"namespace\":\"org.apache.camel.quarkus.component.avro.it\",\"fields\":[{\"name\":\"value\",\"type\":\"string\"}]}");
        recorder.recordAvroSchema(avroSchema);
    }

}
