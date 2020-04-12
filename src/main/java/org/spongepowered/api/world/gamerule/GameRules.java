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
package org.spongepowered.api.world.gamerule;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.block.entity.CommandBlock;
import org.spongepowered.api.entity.living.Agent;
import org.spongepowered.api.entity.living.Bat;
import org.spongepowered.api.entity.living.animal.Rabbit;
import org.spongepowered.api.entity.living.animal.Sheep;
import org.spongepowered.api.entity.living.golem.SnowGolem;
import org.spongepowered.api.entity.living.monster.Creeper;
import org.spongepowered.api.entity.living.monster.Enderman;
import org.spongepowered.api.entity.living.monster.Ghast;
import org.spongepowered.api.entity.living.monster.Silverfish;
import org.spongepowered.api.entity.living.monster.boss.Wither;
import org.spongepowered.api.entity.living.monster.boss.dragon.EnderDragon;
import org.spongepowered.api.entity.living.monster.skeleton.Skeleton;
import org.spongepowered.api.entity.living.monster.zombie.Zombie;
import org.spongepowered.api.entity.living.monster.zombie.ZombiePigman;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.entity.living.player.gamemode.GameModes;
import org.spongepowered.api.entity.living.trader.Villager;
import org.spongepowered.api.entity.vehicle.Boat;
import org.spongepowered.api.entity.vehicle.minecart.MinecartEntity;
import org.spongepowered.api.raid.Raid;
import org.spongepowered.api.util.temporal.Duration;

import java.util.function.Supplier;

/**
 * An enumeration of all the possible game rules in vanilla minecraft.
 */
public final class GameRules {

    // SORTFIELDS:ON

    /**
     * If advancements should be announced to the server.
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final Supplier<GameRule<Boolean>> ANNOUNCE_ADVANCEMENTS = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "ANNOUNCE_ADVANCEMENTS");

    /**
     * Whether {@link CommandBlock}s should notify admins when
     * they perform commands.
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final Supplier<GameRule<Boolean>> COMMAND_BLOCK_OUTPUT = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "COMMAND_BLOCK_OUTPUT");

    /**
     * Whether the server should skip checking player speed when
     * the player is wearing elytra.
     *
     * <p>This is a boolean game rule, with a default value of
     * {@code false}.</p>
     */
    public static final Supplier<GameRule<Boolean>> DISABLE_ELYTRA_MOVEMENT_CHECK = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "DISABLE_ELYTRA_MOVEMENT_CHECK");

    /**
     * Whether {@link Raid}s are disabled.
     *
     * <p>If the value of this game rule is {@code true}, all {@link Raid}s will stop.
     *
     * <p>This is a boolean game rule, with a default value of
     * {@code false}.</p>
     */
    public static final Supplier<GameRule<Boolean>> DISABLE_RAIDS = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "DISABLE_RAIDS");

    /**
     * Whether the day-night cycle and moon phases progress.
     *
     * <p>This is a boolean game rule, with a default value of
     * {@code true}.</p>
     */
    public static final Supplier<GameRule<Boolean>> DO_DAYLIGHT_CYCLE = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "DO_DAYLIGHT_CYCLE");

    /**
     * Whether entities that are not mobs should have drops.
     *
     * <p>This is a boolean game rule, with a default value of
     * {@code true}.</p>
     */
    public static final Supplier<GameRule<Boolean>> DO_ENTITY_DROPS = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "DO_ENTITY_DROPS");

    /**
     * Whether fire should spread and naturally extinguish.
     *
     * <p>This is a boolean game rule, with a default value of
     * {@code true}.</p>
     */
    public static final Supplier<GameRule<Boolean>> DO_FIRE_UPDATES = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "DO_FIRE_UPDATES");

    /**
     * Whether {@link Player}s can only craft recipes they have unlocked.
     *
     * <p>This is a boolean game rule, with a default value of
     * {@code false}.</p>
     */
    public static final Supplier<GameRule<Boolean>> DO_LIMITED_CRAFTING = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "DO_LIMITED_CRAFTING");

    /**
     * Whether {@link Agent}s should drop items.
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final Supplier<GameRule<Boolean>> DO_MOB_LOOT = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "DO_MOB_LOOT");

    /**
     * Whether {@link Agent}s should naturally spawn.
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final Supplier<GameRule<Boolean>> DO_MOB_SPAWNING = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "DO_MOB_SPAWNING");

    /**
     * Whether blocks should have drops.
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final Supplier<GameRule<Boolean>> DO_TILE_DROPS = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "DO_TILE_DROPS");

    /**
     * Whether the weather will change.
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final Supplier<GameRule<Boolean>> DO_WEATHER_CYCLE = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "DO_WEATHER_CYCLE");

    /**
     * Whether {@link Player}s should keep items in their inventory
     * after death.
     *
     * <p>This is a boolean game rule, with a default value of
     * {@code false}.</p>
     */
    public static final Supplier<GameRule<Boolean>> KEEP_INVENTORY = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "KEEP_INVENTORY");

    /**
     * Whether to log admin commands to server log.
     *
     * <p>This is a boolean game rule, with a default value of
     * {@code true}.</p>
     */
    public static final Supplier<GameRule<Boolean>> LOG_ADMIN_COMMANDS = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "LOG_ADMIN_COMMANDS");

    /**
     * The total number of {@link BlockTypes#CHAIN_COMMAND_BLOCK chain command
     * blocks} that can run during a single update cycle.
     *
     * <p>This is a numerical game rule, with a default value
     * of {@code 65536}.</p>
     */
    public static final Supplier<GameRule<Integer>> MAX_COMMAND_CHAIN_LENGTH = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "MAX_COMMAND_CHAIN_LENGTH");

    /**
     * The maximum number of other pushable entities a mob or player can push,
     * before taking 3 suffocation damage per half-second.
     *
     * <p>Damage affects {@link GameModes#SURVIVAL survival mode} or
     * {@link GameModes#ADVENTURE adventure mode} {@link Player}s, and all
     * mobs but bats. Pushable entities include non-spectator-mode
     * {@link Player}, any mob except {@link Bat}s, as well as
     * {@link Boat}s and {@link MinecartEntity}.</p>
     *
     * <p>Setting to {@code 0} disables the rule.</p>
     *
     * <p>This is a numerical game rule, with a default value of {@code 24}.</p>
     */
    public static final Supplier<GameRule<Integer>> MAX_ENTITY_CRAMMING = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "MAX_ENTITY_CRAMMING");

    /**
     * Whether {@link Agent}s should be able to change blocks, and whether
     * {@link Agent}s can pick up items.
     *
     * <p>In vanilla Minecraft, the following entities can change blocks when
     * this game rule is {@code true}:
     * <ul>
     *     <li>{@link Creeper}</li>
     *     <li>{@link Zombie}</li>
     *     <li>{@link Enderman}</li>
     *     <li>{@link Ghast}</li>
     *     <li>{@link Wither}</li>
     *     <li>{@link EnderDragon}</li>
     *     <li>{@link Rabbit}</li>
     *     <li>{@link Sheep}</li>
     *     <li>{@link Villager}</li>
     *     <li>{@link SnowGolem}</li>
     *     <li>{@link Silverfish}</li>
     * </ul>
     *
     * <p>In vanilla Minecraft, the following entities can pick up items when
     * this game rule is {@code true}:
     * <ul>
     *     <li>{@link Villager}</li>
     *     <li>{@link Zombie}</li>
     *     <li>{@link Skeleton}</li>
     *     <li>{@link ZombiePigman}</li>
     * </ul>
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final Supplier<GameRule<Boolean>> MOB_GRIEFING = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "MOB_GRIEFING");

    /**
     * Whether {@link Player}s can regenerate health naturally if their
     * hunger is full enough (doesn't affect external healing, such as
     * golden apples, the Regeneration effect, etc.).
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final Supplier<GameRule<Boolean>> NATURAL_REGENERATION = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "NATURAL_REGENERATION");

    /**
     * How often a random block update occurs (such as plant growth,
     * leaf decay, etc.) per chunk section per game update.
     *
     * <p>0 will disable random updates, higher numbers will increase random
     * updates.</p>
     *
     * <p>This is a numerical game rule, with a default value of {@code 3}.</p>
     */
    public static final Supplier<GameRule<Duration>> RANDOM_BLOCK_UPDATE_SPEED = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "RANDOM_BLOCK_UPDATE_SPEED");

    /**
     * Whether the debug screen shows all or reduced information.
     *
     * <p>This is a boolean game rule, with a default value of
     * {@code false}.</p>
     */
    public static final Supplier<GameRule<Boolean>> REDUCED_DEBUG_INFO = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "REDUCED_DEBUG_INFO");

    /**
     * Whether the feedback from commands executed by a {@link Player}
     * should show up in chat.
     *
     * <p>This game rule affects the default behavior of whether
     * {@link CommandBlock}s store their output text.</p>
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final Supplier<GameRule<Boolean>> SEND_COMMAND_FEEDBACK = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "SEND_COMMAND_FEEDBACK");

    /**
     * Whether a message appears in chat when a {@link Player} dies.
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final Supplier<GameRule<Boolean>> SHOW_DEATH_MESSAGES = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "SHOW_DEATH_MESSAGES");

    /**
     * The number of blocks outward from the world spawn coordinates
     * that a player will spawn in when first joining a server or when
     * dying without a spawn point.
     *
     * <p>This is a numerical game rule, with a default value of {@code 10}.</p>
     */
    public static final Supplier<GameRule<Integer>> SPAWN_RADIUS = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "SPAWN_RADIUS");

    /**
     * Whether players in {@link GameModes#SPECTATOR spectator mode} can
     * generate chunks.
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final Supplier<GameRule<Boolean>> SPECTATORS_GENERATE_CHUNKS = Sponge.getRegistry().getCatalogRegistry().provideSupplier(GameRule.class, "SPECTATORS_GENERATE_CHUNKS");

    // SORTFIELDS:OFF

    private GameRules() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }
}
