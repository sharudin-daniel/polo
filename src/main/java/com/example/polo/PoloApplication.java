package com.example.polo;

import com.example.polo.grpc.PoloServerImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class PoloApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(PoloApplication.class, args);
        Server server = ServerBuilder.forPort(9090)
                .addService(new PoloServerImpl())
                .build()
                .start();

        System.out.println("Server started on port 9090");
        server.awaitTermination();
    }

}
