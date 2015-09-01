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
package org.spongepowered.api.event.entity;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.living.Human;
import org.spongepowered.api.entity.living.Living;
import org.spongepowered.api.entity.living.animal.Horse;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.cause.CauseTracked;
import org.spongepowered.api.event.entity.living.LivingEvent;
import org.spongepowered.api.event.entity.living.human.HumanEvent;
import org.spongepowered.api.event.entity.living.player.PlayerEvent;

/**
 * Raised when the targeted {@link Entity} is being dismounted from another
 * {@link Entity}. Traditionally, if a {@link Player} is riding a
 * {@link Horse}, and the {@link Player} "dismounts", the {@link Horse}
 * would be the {@link #getTargetEntity()} in this event.
 */
public interface DismountEntityEvent extends TargetEntityEvent, CauseTracked {

    /**
     * An event where an {@link Entity} is the one performing the dismount.
     */
    interface SourceEntity extends DismountEntityEvent, EntityEvent { }

    /**
     * An event where the source is a {@link Living} entity.
     */
    interface SourceLiving extends SourceEntity, LivingEvent { }

    /**
     * An event where the source is a {@link Human}.
     */
    interface SourceHuman extends SourceLiving, HumanEvent { }

    /**
     * An event where the source is a {@link Player}.
     */
    interface SourcePlayer extends SourceHuman, PlayerEvent { }

}
