package com.example.client.webclients;

import com.example.client.Constants;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

public class AutoWebClient {
    private static final WebClient client = WebClient.builder()
            .baseUrl(Constants.SERVER_ADDRESS)
            .build();
    protected static <T> T getOneItem(String uri, Class return_class)
    {
        return (T) client.get().uri(uri).retrieve().bodyToMono(return_class).block();
    }
    //not tested yet
    protected static <T> List<T> getItemList(String uri, Class return_class)
    {
        return (List<T>) client.get().uri(uri).retrieve().bodyToFlux(return_class).collectList().block();
    }
}
