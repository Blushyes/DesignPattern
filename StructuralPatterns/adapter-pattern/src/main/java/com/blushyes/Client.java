package com.blushyes;

public class Client {
    private NewInterface serve;

    public void setServe(NewInterface serve) {
        this.serve = serve;
    }

    public Client() {
    }

    public Client(NewInterface serve) {
        this.serve = serve;
    }

    public void useServe(){
        serve.newServe();
    }
}
