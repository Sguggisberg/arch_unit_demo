package ch.guggisberg.archunit.archunitdemo.persistent;

import ch.guggisberg.archunit.archunitdemo.service.ServiceDummy;

public class PersistentDummy {
    private ServiceDummy serviceDummy;

    public void sayHello() {
        serviceDummy.test();
    }
}
