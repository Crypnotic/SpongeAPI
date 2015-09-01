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

package org.spongepowered.api.event.cause.entity.health;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import com.google.common.base.Objects;
import org.spongepowered.api.event.cause.Cause;

/**
 * A builder that creates {@link HealthModifier}s, for use in both plugin and
 * implementation requirements.
 */
public final class HealthModifierBuilder {

    private HealthModifierType type;
    private Cause cause;

    private HealthModifierBuilder() {
    }

    /**
     * Creates a new {@link HealthModifierBuilder}.
     *
     * @return The new builder instance
     */
    public static HealthModifierBuilder builder() {
        return new HealthModifierBuilder();
    }

    /**
     * Sets the {@link HealthModifierType} for the {@link HealthModifier} to
     * build.
     *
     * @param healthModifierType The health modifier type
     * @return This builder, for chaining
     */
    public HealthModifierBuilder type(HealthModifierType healthModifierType) {
        this.type = checkNotNull(healthModifierType);
        return this;
    }

    /**
     * Sets the {@link Cause} for the {@link HealthModifier} to build.
     *
     * @param cause The cause for the health modifier
     * @return This builder, for chaining
     */
    public HealthModifierBuilder cause(Cause cause) {
        this.cause = checkNotNull(cause);
        return this;
    }

    /**
     * Creates a new {@link HealthModifier} with this builder's provided
     * {@link Cause} and {@link HealthModifierType}.
     *
     * @return The newly created health modifier
     */
    public HealthModifier build() {
        checkState(this.type != null, "The HealthModifierType must not be null!");
        checkState(this.cause != null, "The cause for the HealthModifier must not be null!");
        return new ImplementedHealthModifier(this);
    }


    private static class ImplementedHealthModifier implements HealthModifier {
        private final HealthModifierType type;
        private final Cause cause;

        private ImplementedHealthModifier(HealthModifierBuilder builder) {
            this.type = builder.type;
            this.cause = builder.cause;
        }

        @Override
        public HealthModifierType getType() {
            return this.type;
        }

        @Override
        public Cause getCause() {
            return this.cause;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(this.type, this.cause);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            final ImplementedHealthModifier other = (ImplementedHealthModifier) obj;
            return Objects.equal(this.type, other.type)
                   && Objects.equal(this.cause, other.cause);
        }

        @Override
        public String toString() {
            return Objects.toStringHelper(this)
                .add("type", this.type)
                .add("cause", this.cause)
                .toString();
        }
    }

}
