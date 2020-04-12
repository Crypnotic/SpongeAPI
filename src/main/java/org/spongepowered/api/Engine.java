/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api;

import org.spongepowered.api.scheduler.Scheduler;
import org.spongepowered.api.util.temporal.Duration;

/**
 * Shared functionality between {@link Client} and {@link Server} engines.
 */
public interface Engine {

    /**
     * Gets the {@link Scheduler} used to schedule sync tasks on this {@link Engine}.
     *
     * @return The sync scheduler
     */
    Scheduler getScheduler();

    /**
     * Gets the estimated time for the given {@link Duration} based
     * on the performance of this engine.
     *
     * @param duration The duration
     * @return The estimated ticks
     */
    Duration.Ticks getEstimatedTicks(Duration duration);

    /**
     * Gets the estimated ticks for the given {@link Duration} based
     * on the performance of this engine.
     *
     * @param duration The duration
     * @return The estimated ticks
     */
    Duration.Time getEstimatedTime(Duration duration);

    /**
     * Gets the {@link Duration} of a tick when the engine
     * would be performing optimally.
     *
     * <p>For a vanilla server, this will be 50 milliseconds.</p>
     *
     * @return The optimal tick duration
     */
    Duration.Time getOptimalTickDuration();

    /**
     * Gets the actual {@link Duration} of a tick.
     *
     * @return The actual tick duration
     */
    Duration.Time getTickDuration();

    /**
     * Checks if the {@link Thread#currentThread() current thread} is the main thread of the engine.
     *
     * @return {@code true} if main thread, {@code false} if not
     */
    boolean onMainThread();
}
