package demo.server;

import jakarta.xml.ws.Endpoint;

public class UserServicePublisher {
    public static void main(String[] args) {
        Endpoint endpoint = Endpoint.create(new UserServiceImpl());
        endpoint.publish("http://localhost:8091/user");
    }
}
