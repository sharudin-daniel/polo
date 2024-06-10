package com.example.polo.grpc;

import dsharudin.marco_polo.grpc.MarcoPolo;
import dsharudin.marco_polo.grpc.MarcoPoloServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class PoloServerImpl extends MarcoPoloServiceGrpc.MarcoPoloServiceImplBase {

    @Override
    public void getPolo(MarcoPolo.MarcoRequest request, io.grpc.stub.StreamObserver<dsharudin.marco_polo.grpc.MarcoPolo.PoloResponse> responseObserver) {
        var resp = MarcoPolo.PoloResponse.newBuilder()
                .setName(request.getName() +  " + Polo Grpc response")
                .build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
}
