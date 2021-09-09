package io.github.gh

import com.squareup.wire.GrpcClient
import kotlinx.coroutines.runBlocking
import okhttp3.OkHttpClient
import okhttp3.Protocol

fun main() {
    runBlocking {
        val grpcClient = GrpcClient.Builder()
            .client(OkHttpClient.Builder().protocols(listOf(Protocol.H2_PRIOR_KNOWLEDGE)).build())
            .baseUrl("http://foo")
            .build()
        val client = grpcClient.create(GreeterClient::class)
        client.SayHello().execute(HelloRequest("hello", "world"))
    }
}