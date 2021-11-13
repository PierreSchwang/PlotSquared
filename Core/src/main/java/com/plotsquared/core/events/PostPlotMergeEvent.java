package com.plotsquared.core.events;

import com.plotsquared.core.player.PlotPlayer;
import com.plotsquared.core.plot.Plot;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Event called after several plots were merged
 * {@inheritDoc}
 */
public class PostPlotMergeEvent extends PlotPlayerEvent {

    private final String world;
    private final PlotPlayer<?> player;

    /**
     * PostPlotMergeEvent: Called after plots were merged
     *
     * @param world  World in which the event occurred
     * @param plot   Plot that was merged
     * @param player The player that executed the merge
     */

    public PostPlotMergeEvent(final @NonNull String world, final @NonNull Plot plot, final PlotPlayer<?> player) {
        super(player, plot);
        this.world = world;
        this.player = player;
    }

    public String getWorld() {
        return world;
    }

    public PlotPlayer<?> getPlayer() {
        return player;
    }

}
