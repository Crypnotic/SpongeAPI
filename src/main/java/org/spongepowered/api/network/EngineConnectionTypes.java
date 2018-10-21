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
package org.spongepowered.api.network;

/**
 * An enumeration of all the possible engine connection types.
 */
public final class EngineConnectionTypes {

    /**
     * The supertype of all the known connection types.
     */
    public static final Class<EngineConnection> ALL = EngineConnection.class;

    /**
     * The client side connection type.
     */
    public static final Class<ClientSideConnection> CLIENT_SIDE = ClientSideConnection.class;

    /**
     * The client side connection type where the player
     * has successfully joined a server.
     */
    public static final Class<ClientPlayerConnection> CLIENT_PLAYER = ClientPlayerConnection.class;

    /**
     * The server or client connection type where the player
     * has successfully joined a server.
     */
    public static final Class<PlayerConnection> PLAYER = PlayerConnection.class;

    /**
     * The server side connection type.
     */
    public static final Class<ServerSideConnection> SERVER_SIDE = ServerSideConnection.class;

    /**
     * The server side connection type where the player
     * has successfully joined a server.
     */
    public static final Class<ServerPlayerConnection> SERVER_PLAYER = ServerPlayerConnection.class;

    private EngineConnectionTypes() {
    }
}
