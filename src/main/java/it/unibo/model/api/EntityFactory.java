package it.unibo.model.api;

import it.unibo.common.Pair;

/**
 * EntityFactory
 */
public interface EntityFactory {

    /**
     * Create Felix.
     * 
     * @param position starting Felix's position.
     * @return the created Felix entity.
     */
    public Entity createFelix(final Pair<Double, Double> pos);

    /**
     * Create Ralph.
     * 
     * @param position starting Ralph's position.
     * @return the created Ralph entity.
     */
    public Entity createRalph(final Pair<Double, Double> pos);

}