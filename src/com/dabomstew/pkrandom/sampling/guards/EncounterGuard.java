package com.dabomstew.pkrandom.sampling.guards;

import com.dabomstew.pkrandom.pokemon.Encounter;
import com.dabomstew.pkrandom.pokemon.Pokemon;
import com.dabomstew.pkrandom.sampling.Guard;

public abstract class EncounterGuard extends Guard<Pokemon> {
    protected Encounter encounter = null;
    
    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }
    
    @Override
    public double getWeight(Pokemon obj) {
        if (encounter == null) return 1;
        return super.getWeight(obj);
    }
}
