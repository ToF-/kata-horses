package org.first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Turf {
    public ArrayList<Participant> participants;
    public ArrayList<Object> ecuries;
    public ArrayList<SpriteCasaque> spriteCasaques;
    public boolean cached;

    public Integer getParticipantsForSexe(String target) {
        Map<String, Integer> sexes = new HashMap<String,Integer>();
        for (Participant participant : this.participants) {
            String sexe = participant.sexe;
            if(sexes.containsKey(sexe)) {
                sexes.put(sexe, sexes.get(sexe)+1);
            }
            else {
                sexes.put(sexe, 1);
            }
        }
        return sexes.get(target);
    }
}
