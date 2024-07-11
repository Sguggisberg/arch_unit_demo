package ch.guggisberg.archunit.archunitdemo.controller;


import ch.guggisberg.archunit.archunitdemo.service.ServiceDummy;

public class PresentationDummy {
    private ServiceDummy serviceDummy;

    public void sayHello() {
        serviceDummy.test();
    }
}
