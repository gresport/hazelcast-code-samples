package com.test.portable;

import com.hazelcast.query.extractor.ValueCallback;
import com.hazelcast.query.extractor.ValueCollector;
import com.hazelcast.query.extractor.ValueExtractor;
import com.hazelcast.query.extractor.ValueReader;

public class LimbNameExtractor implements ValueExtractor<ValueReader, Object> {

    @Override
    public void extract(ValueReader valueReader, Object arg, ValueCollector valueCollector) {
        valueReader.read("limbs[any].name", valueCollector);

        // just for debug - to print all the values read
        // remember that extractor may be invoked in attribute type examination too
        valueReader.read("limbs[any].name", (ValueCallback<String>) System.out::println);
    }

}
