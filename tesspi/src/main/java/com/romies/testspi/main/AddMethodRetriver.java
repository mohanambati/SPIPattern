package com.romies.testspi.main;

import java.util.Iterator;
import java.util.ServiceLoader;

public interface AddMethodRetriver {
    int performAddMethod(int a, int b);

    final class Factory {
        private Factory() {
            // this is not meant for instantiation
        }

        public static AddMethodRetriver create() {
            final ServiceLoader<AddMethodRetriver> loader = ServiceLoader.load(AddMethodRetriver.class);
            final Iterator<AddMethodRetriver> iterator = loader.iterator();
            if (!iterator.hasNext()) {
                throw new RuntimeException();
            }
            return iterator.next();
        }
    }
}
