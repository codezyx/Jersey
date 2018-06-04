package xyz.yuxiangz.grizzly;

import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;

public class Main {

    private final static String BASE_URL = "http://127.0.0.1:8520/api/";

    public static void main(String[] args) {
        ResourceConfig resourceConfig = new ResourceConfig().packages("xyz.yuxiangz.grizzly");
        GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URL), resourceConfig);
    }
}
