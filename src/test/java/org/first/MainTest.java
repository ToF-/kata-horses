package org.first;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void shouldReadAJsonRaceParticipantsSexes() {
        Turf turf = TurfResponse.getForEntity("https://online.turfinfo.api.pmu.fr/rest/client/1/programme/18092020/R5/C6/participants?specialisation=INTERNET");
        assertEquals(8,turf.participants.size());
        assertEquals(null,turf.getParticipantsForSexe("MALES"));
        assertEquals(4,turf.getParticipantsForSexe("HONGRES"));
        assertEquals(4,turf.getParticipantsForSexe("FEMELLES"));
    }
}