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
package org.spongepowered.api.world.volume.biome;

import org.spongepowered.api.world.volume.MutableVolume;
import org.spongepowered.api.world.volume.UnmodifiableVolume;
import org.spongepowered.api.world.volume.block.ReadableBlockVolume;
import org.spongepowered.api.world.volume.block.worker.BlockVolumeStream;

/**
 * Like a {@link ReadableBlockVolume} except in the case that
 * while the parent volume can potentially be a {@link MutableVolume},
 * this volume returned will not be. This is useful if needing to simply
 * scan blocks or use {@link BlockVolumeStream}s to perform various operations.
 */
public interface UnmodifiableBiomeVolume<U extends UnmodifiableBiomeVolume<U>> extends ReadableBiomeVolume, StreamableBiomeVolume<U>, UnmodifiableVolume {

    @SuppressWarnings("unchecked")
    @Override
    default U asUnmodifiableBiomeVolume() {
        return (U) this;
    }
}
