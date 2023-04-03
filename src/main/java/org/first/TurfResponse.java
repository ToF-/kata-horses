package org.first;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class TurfResponse {
    public static Turf getForEntity(String url) {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Turf> responseEntity = restTemplate.getForEntity
                (url, Turf.class);
        return responseEntity.getBody();
    }
}
