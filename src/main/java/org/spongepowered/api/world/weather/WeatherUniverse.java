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
package org.spongepowered.api.world.weather;

import org.spongepowered.api.util.temporal.Duration;

/**
 * A universe affected by {@link Weather}.
 */
public interface WeatherUniverse {

    /**
     * Gets the current {@link Weather} in this volume.
     *
     * @return The current weather.
     */
    Weather getWeather();

    /**
     * Gets the remaining {@link Duration} of the current
     * {@link Weather}.
     *
     * @return The remaining weather duration
     */
    Duration getRemainingWeatherDuration();

    /**
     * Gets the {@link Duration} the current {@link Weather}
     * has been running for.
     *
     * @return The running weather duration
     */
    Duration getRunningWeatherDuration();

    /**
     * Sets the {@link Weather} of the volume with a random duration.
     *
     * @param weather The weather that should be switched to
     */
    void setWeather(Weather weather);

    /**
     * Sets the {@link Weather} of the world with the specified duration.
     *
     * @param weather The weather that should be switched to
     * @param duration The specified duration
     */
    void setWeather(Weather weather, Duration duration);
}
