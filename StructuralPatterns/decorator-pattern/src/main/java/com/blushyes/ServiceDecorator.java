package com.blushyes;

public abstract class ServiceDecorator implements Service {
    private Service service;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public ServiceDecorator(Service service) {
        this.service = service;
    }
}
