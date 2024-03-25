package it.unibo.model.impl;

import it.unibo.common.Pair;
import it.unibo.model.api.Entity;

/**
 * EntityImpl
 */
public class EntityImpl implements Entity{

    private Pair<Double, Double> position;

    @Override
    public Pair<Double, Double> getPosition() {
        return this.position;
    }

    
}