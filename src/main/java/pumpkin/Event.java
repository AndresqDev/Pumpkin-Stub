package pumpkin;

import java.util.List;

/**
 * Java-friendly mirror of Pumpkin's generated event API.
 * Generated from event.wit; do not edit by hand.
 */
public class Event {
    public enum EventPriority { HIGHEST, HIGH, NORMAL, LOW, LOWEST }
    public enum EventType { PLAYER_JOIN_EVENT, PLAYER_LEAVE_EVENT, PLAYER_LOGIN_EVENT, PLAYER_CHAT_EVENT, PLAYER_COMMAND_SEND_EVENT, PLAYER_PERMISSION_CHECK_EVENT, PLAYER_MOVE_EVENT, PLAYER_TELEPORT_EVENT, PLAYER_CHANGE_WORLD_EVENT, PLAYER_RESPAWN_EVENT, PLAYER_EXP_CHANGE_EVENT, PLAYER_ITEM_HELD_EVENT, PLAYER_CHANGED_MAIN_HAND_EVENT, PLAYER_GAMEMODE_CHANGE_EVENT, PLAYER_CUSTOM_PAYLOAD_EVENT, PLAYER_FISH_EVENT, PLAYER_EGG_THROW_EVENT, PLAYER_INTERACT_UNKNOWN_ENTITY_EVENT, PLAYER_INTERACT_ENTITY_EVENT, PLAYER_INTERACT_EVENT, PLAYER_TOGGLE_SNEAK_EVENT, PLAYER_TOGGLE_FLIGHT_EVENT, PLAYER_TOGGLE_SPRINT_EVENT, INVENTORY_CLICK_EVENT, INVENTORY_CLOSE_EVENT, BLOCK_REDSTONE_EVENT, BLOCK_BREAK_EVENT, BLOCK_BURN_EVENT, BLOCK_CAN_BUILD_EVENT, BLOCK_GROW_EVENT, BLOCK_PLACE_EVENT, BEDROCK_FORM_RESPONSE_EVENT, DIALOG_CLICK_ACTION_EVENT, DIALOG_SHOW_EVENT, DIALOG_CLEAR_EVENT, SERVER_COMMAND_EVENT, SERVER_LIST_PING_EVENT, SERVER_LOAD_EVENT, SPAWN_CHANGE_EVENT, SERVER_BROADCAST_EVENT, SERVER_TICK_START_EVENT, SERVER_TICK_END_EVENT, PACKET_RECEIVED_EVENT, PACKET_SENT_EVENT, CHUNK_LOAD_EVENT, CHUNK_SAVE_EVENT, CHUNK_SEND_EVENT, ENTITY_DAMAGE_EVENT, ENTITY_DEATH_EVENT, PLAYER_DEATH_EVENT, ENTITY_SPAWN_EVENT, ENTITY_COMBUST_EVENT, ENTITY_REGAIN_HEALTH_EVENT, ENTITY_AIR_CHANGE_EVENT, ENTITY_BREED_EVENT, ENTITY_DISMOUNT_EVENT, ENTITY_DYE_EVENT, ENTITY_ENTER_LOVE_MODE_EVENT, ENTITY_EXPLODE_EVENT, ENTITY_MOUNT_EVENT, ENTITY_PICKUP_ITEM_EVENT, ENTITY_PORTAL_EVENT, ENTITY_RESURRECT_EVENT, ENTITY_SHOOT_BOW_EVENT, ENTITY_TAME_EVENT, ENTITY_TARGET_EVENT, ENTITY_TELEPORT_EVENT, ENTITY_TOGGLE_GLIDE_EVENT, ENTITY_TRANSFORM_EVENT, PLAYER_ITEM_CONSUME_EVENT, PLAYER_ITEM_DAMAGE_EVENT, PLAYER_DROP_ITEM_EVENT, PLAYER_BED_ENTER_EVENT, PLAYER_BED_LEAVE_EVENT, PLAYER_BUCKET_EMPTY_EVENT, PLAYER_BUCKET_FILL_EVENT, BLOCK_DAMAGE_EVENT, BLOCK_IGNITE_EVENT, BLOCK_FROM_TO_EVENT, BLOCK_FORM_EVENT, BLOCK_FADE_EVENT, BLOCK_DISPENSE_EVENT, BLOCK_EXPLODE_EVENT, BLOCK_PHYSICS_EVENT, BLOCK_PISTON_EXTEND_EVENT, BLOCK_PISTON_RETRACT_EVENT, NOTE_PLAY_EVENT, SIGN_CHANGE_EVENT, SPONGE_ABSORB_EVENT, TNT_PRIME_EVENT, WEATHER_CHANGE_EVENT, THUNDER_CHANGE_EVENT, WORLD_LOAD_EVENT, WORLD_UNLOAD_EVENT, ASYNC_STRUCTURE_GENERATE_EVENT, ASYNC_STRUCTURE_SPAWN_EVENT, CHUNK_POPULATE_EVENT, CHUNK_UNLOAD_EVENT, ENTITIES_LOAD_EVENT, ENTITIES_UNLOAD_EVENT, GENERIC_GAME_EVENT, LOOT_GENERATE_EVENT, PORTAL_CREATE_EVENT, STRUCTURE_GROW_EVENT, TIME_SKIP_EVENT, WORLD_INIT_EVENT, WORLD_SAVE_EVENT, INVENTORY_OPEN_EVENT, INVENTORY_DRAG_EVENT, CRAFT_ITEM_EVENT, FURNACE_SMELT_EVENT, BREW_EVENT, BREWING_STAND_FUEL_EVENT, FURNACE_BURN_EVENT, FURNACE_EXTRACT_EVENT, FURNACE_START_SMELT_EVENT, HOPPER_INVENTORY_SEARCH_EVENT, INVENTORY_CREATIVE_EVENT, INVENTORY_INTERACT_EVENT, INVENTORY_MOVE_ITEM_EVENT, INVENTORY_PICKUP_ITEM_EVENT, PREPARE_ANVIL_EVENT, PREPARE_GRINDSTONE_EVENT, PREPARE_INVENTORY_RESULT_EVENT, PREPARE_ITEM_CRAFT_EVENT, PREPARE_SMITHING_EVENT, SMITH_ITEM_EVENT, TRADE_SELECT_EVENT, VEHICLE_BLOCK_COLLISION_EVENT, VEHICLE_COLLISION_EVENT, VEHICLE_CREATE_EVENT, VEHICLE_DAMAGE_EVENT, VEHICLE_DESTROY_EVENT, VEHICLE_ENTER_EVENT, VEHICLE_ENTITY_COLLISION_EVENT, VEHICLE_EXIT_EVENT, VEHICLE_MOVE_EVENT, VEHICLE_UPDATE_EVENT, PREPARE_ITEM_ENCHANT_EVENT, ENCHANT_ITEM_EVENT, MAP_INITIALIZE_EVENT, HANGING_BREAK_EVENT, HANGING_BREAK_BY_ENTITY_EVENT, HANGING_PLACE_EVENT, BELL_RESONATE_EVENT, BELL_RING_EVENT, BLOCK_BRUSH_EVENT, BLOCK_COOK_EVENT, BLOCK_DAMAGE_ABORT_EVENT, BLOCK_DISPENSE_ARMOR_EVENT, BLOCK_DISPENSE_LOOT_EVENT, BLOCK_DROP_ITEM_EVENT, BLOCK_EXP_EVENT, BLOCK_FERTILIZE_EVENT, BLOCK_MULTI_PLACE_EVENT, BLOCK_RECEIVE_GAME_EVENT, BLOCK_SHEAR_ENTITY_EVENT, BLOCK_SPREAD_EVENT, BREWING_START_EVENT, CAMPFIRE_START_EVENT, CAULDRON_LEVEL_CHANGE_EVENT, CRAFTER_CRAFT_EVENT, ENTITY_BLOCK_FORM_EVENT, FLUID_LEVEL_CHANGE_EVENT, INVENTORY_BLOCK_START_EVENT, LEAVES_DECAY_EVENT, MOISTURE_CHANGE_EVENT, SCULK_BLOOM_EVENT, VAULT_DISPLAY_ITEM_EVENT, CREATURE_SPAWN_EVENT, ENDER_DRAGON_CHANGE_PHASE_EVENT, ENTITY_BREAK_DOOR_EVENT, ENTITY_CHANGE_BLOCK_EVENT, ENTITY_DAMAGE_BY_BLOCK_EVENT, ENTITY_DAMAGE_BY_ENTITY_EVENT, ENTITY_DROP_ITEM_EVENT, ENTITY_ENTER_BLOCK_EVENT, ENTITY_EXHAUSTION_EVENT, ENTITY_INTERACT_EVENT, ENTITY_KNOCKBACK_EVENT, ENTITY_PLACE_EVENT, ENTITY_POSE_CHANGE_EVENT, ENTITY_POTION_EFFECT_EVENT, ENTITY_SPELL_CAST_EVENT, ENTITY_TARGET_LIVING_ENTITY_EVENT, ENTITY_TOGGLE_SWIM_EVENT, EXPLOSION_PRIME_EVENT, FIREWORK_EXPLODE_EVENT, FOOD_LEVEL_CHANGE_EVENT, ITEM_DESPAWN_EVENT, ITEM_MERGE_EVENT, ITEM_SPAWN_EVENT, PIGLIN_BARTER_EVENT, PROJECTILE_HIT_EVENT, PROJECTILE_LAUNCH_EVENT, SHEEP_DYE_WOOL_EVENT, SHEEP_REGROW_WOOL_EVENT, SLIME_SPLIT_EVENT, STRIDER_TEMPERATURE_CHANGE_EVENT, VILLAGER_ACQUIRE_TRADE_EVENT, VILLAGER_CAREER_CHANGE_EVENT, VILLAGER_REPLENISH_TRADE_EVENT, WARDEN_ANGER_CHANGE_EVENT, AREA_EFFECT_CLOUD_APPLY_EVENT, ARROW_BODY_COUNT_CHANGE_EVENT, BAT_TOGGLE_SLEEP_EVENT, CREEPER_POWER_EVENT, ENTITY_COMBUST_BY_BLOCK_EVENT, ENTITY_COMBUST_BY_ENTITY_EVENT, ENTITY_KNOCKBACK_BY_ENTITY_EVENT, ENTITY_PORTAL_ENTER_EVENT, ENTITY_PORTAL_EXIT_EVENT, ENTITY_REMOVE_EVENT, ENTITY_TARGET_BLOCK_EVENT, ENTITY_UNLEASH_EVENT, EXP_BOTTLE_EVENT, HORSE_JUMP_EVENT, LINGERING_POTION_SPLASH_EVENT, PIG_ZAP_EVENT, PIG_ZOMBIE_ANGER_EVENT, POTION_SPLASH_EVENT, SPAWNER_SPAWN_EVENT, TRIAL_SPAWNER_SPAWN_EVENT, VILLAGER_REPUTATION_CHANGE_EVENT, ASYNC_PLAYER_CHAT_EVENT, ASYNC_PLAYER_PRE_LOGIN_EVENT, PLAYER_ADVANCEMENT_DONE_EVENT, PLAYER_ANIMATION_EVENT, PLAYER_ARMOR_STAND_MANIPULATE_EVENT, PLAYER_BUCKET_ENTITY_EVENT, PLAYER_CHANGED_WORLD_EVENT, PLAYER_CHANNEL_EVENT, PLAYER_COMMAND_PREPROCESS_EVENT, PLAYER_EDIT_BOOK_EVENT, PLAYER_ELYTRA_BOOST_EVENT, PLAYER_EXP_COOLDOWN_CHANGE_EVENT, PLAYER_HARVEST_BLOCK_EVENT, PLAYER_HIDE_ENTITY_EVENT, PLAYER_ITEM_BREAK_EVENT, PLAYER_ITEM_MEND_EVENT, PLAYER_KICK_EVENT, PLAYER_LEASH_ENTITY_EVENT, PLAYER_LEVEL_CHANGE_EVENT, PLAYER_LOCALE_CHANGE_EVENT, PLAYER_NAME_ENTITY_EVENT, PLAYER_OPEN_SIGN_EVENT, PLAYER_PORTAL_EVENT, PLAYER_PRE_LOGIN_EVENT, PLAYER_RIPTIDE_EVENT, PLAYER_SHEAR_ENTITY_EVENT, PLAYER_SHOW_ENTITY_EVENT, PLAYER_SPAWN_CHANGE_EVENT, PLAYER_STATISTIC_INCREMENT_EVENT, PLAYER_SWAP_HANDS_EVENT, PLAYER_TAKE_LECTERN_BOOK_EVENT, PLAYER_UNLEASH_ENTITY_EVENT, PLAYER_VELOCITY_EVENT, PLAYER_INPUT_EVENT, PLAYER_INTERACT_AT_ENTITY_EVENT, PLAYER_LINKS_SEND_EVENT, PLAYER_PICKUP_ARROW_EVENT, PLAYER_RECIPE_BOOK_CLICK_EVENT, PLAYER_RECIPE_BOOK_SETTINGS_CHANGE_EVENT, PLAYER_RECIPE_DISCOVER_EVENT, PLAYER_REGISTER_CHANNEL_EVENT, PLAYER_RESOURCE_PACK_STATUS_EVENT, PLAYER_SPAWN_LOCATION_EVENT, PLAYER_UNREGISTER_CHANNEL_EVENT, RAID_FINISH_EVENT, RAID_SPAWN_WAVE_EVENT, RAID_STOP_EVENT, RAID_TRIGGER_EVENT, LIGHTNING_STRIKE_EVENT }

    public boolean isCancelled() { return false; }
    public void setCancelled(boolean cancelled) {}

    public static class PlayerJoinEventData {
        private Player player;
        private TextComponent joinMessage;
        private boolean cancelled;
        public PlayerJoinEventData() {
        }
        public PlayerJoinEventData(Player player, TextComponent joinMessage, boolean cancelled) {
            this.player = player;
            this.joinMessage = joinMessage;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public TextComponent getJoinMessage() { return joinMessage; }
        public void setJoinMessage(TextComponent value) { this.joinMessage = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerLeaveEventData {
        private Player player;
        private TextComponent leaveMessage;
        private boolean cancelled;
        public PlayerLeaveEventData() {
        }
        public PlayerLeaveEventData(Player player, TextComponent leaveMessage, boolean cancelled) {
            this.player = player;
            this.leaveMessage = leaveMessage;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public TextComponent getLeaveMessage() { return leaveMessage; }
        public void setLeaveMessage(TextComponent value) { this.leaveMessage = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerLoginEventData {
        private Player player;
        private TextComponent kickMessage;
        private boolean cancelled;
        public PlayerLoginEventData() {
        }
        public PlayerLoginEventData(Player player, TextComponent kickMessage, boolean cancelled) {
            this.player = player;
            this.kickMessage = kickMessage;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public TextComponent getKickMessage() { return kickMessage; }
        public void setKickMessage(TextComponent value) { this.kickMessage = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerChatEventData {
        private Player player;
        private String message;
        private java.util.List<Player> recipients;
        private java.util.List<Integer> signature;
        private boolean cancelled;
        public PlayerChatEventData() {
        }
        public PlayerChatEventData(Player player, String message, java.util.List<Player> recipients, java.util.List<Integer> signature, boolean cancelled) {
            this.player = player;
            this.message = message;
            this.recipients = recipients;
            this.signature = signature;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getMessage() { return message; }
        public void setMessage(String value) { this.message = value; }
        public java.util.List<Player> getRecipients() { return recipients; }
        public void setRecipients(java.util.List<Player> value) { this.recipients = value; }
        public java.util.List<Integer> getSignature() { return signature; }
        public void setSignature(java.util.List<Integer> value) { this.signature = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerCommandSendEventData {
        private Player player;
        private String command;
        private boolean cancelled;
        public PlayerCommandSendEventData() {
        }
        public PlayerCommandSendEventData(Player player, String command, boolean cancelled) {
            this.player = player;
            this.command = command;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getCommand() { return command; }
        public void setCommand(String value) { this.command = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerPermissionCheckEventData {
        private Player player;
        private String permission;
        private boolean permissionResult;
        public PlayerPermissionCheckEventData() {
        }
        public PlayerPermissionCheckEventData(Player player, String permission, boolean permissionResult) {
            this.player = player;
            this.permission = permission;
            this.permissionResult = permissionResult;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getPermission() { return permission; }
        public void setPermission(String value) { this.permission = value; }
        public boolean isPermissionResult() { return permissionResult; }
        public void setPermissionResult(boolean value) { this.permissionResult = value; }
    }

    public static class PlayerMoveEventData {
        private Player player;
        private Position fromPosition;
        private Position toPosition;
        private boolean cancelled;
        public PlayerMoveEventData() {
        }
        public PlayerMoveEventData(Player player, Position fromPosition, Position toPosition, boolean cancelled) {
            this.player = player;
            this.fromPosition = fromPosition;
            this.toPosition = toPosition;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public Position getFromPosition() { return fromPosition; }
        public void setFromPosition(Position value) { this.fromPosition = value; }
        public Position getToPosition() { return toPosition; }
        public void setToPosition(Position value) { this.toPosition = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerTeleportEventData {
        private Player player;
        private Position fromPosition;
        private Position toPosition;
        private boolean cancelled;
        public PlayerTeleportEventData() {
        }
        public PlayerTeleportEventData(Player player, Position fromPosition, Position toPosition, boolean cancelled) {
            this.player = player;
            this.fromPosition = fromPosition;
            this.toPosition = toPosition;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public Position getFromPosition() { return fromPosition; }
        public void setFromPosition(Position value) { this.fromPosition = value; }
        public Position getToPosition() { return toPosition; }
        public void setToPosition(Position value) { this.toPosition = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerChangeWorldEventData {
        private Player player;
        private World previousWorld;
        private World newWorld;
        private Position position;
        private float yaw;
        private float pitch;
        private boolean cancelled;
        public PlayerChangeWorldEventData() {
        }
        public PlayerChangeWorldEventData(Player player, World previousWorld, World newWorld, Position position, float yaw, float pitch, boolean cancelled) {
            this.player = player;
            this.previousWorld = previousWorld;
            this.newWorld = newWorld;
            this.position = position;
            this.yaw = yaw;
            this.pitch = pitch;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public World getPreviousWorld() { return previousWorld; }
        public void setPreviousWorld(World value) { this.previousWorld = value; }
        public World getNewWorld() { return newWorld; }
        public void setNewWorld(World value) { this.newWorld = value; }
        public Position getPosition() { return position; }
        public void setPosition(Position value) { this.position = value; }
        public float getYaw() { return yaw; }
        public void setYaw(float value) { this.yaw = value; }
        public float getPitch() { return pitch; }
        public void setPitch(float value) { this.pitch = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerRespawnEventData {
        private Player player;
        private World previousWorld;
        private World respawnedWorld;
        private Position position;
        private float yaw;
        private float pitch;
        private boolean alive;
        public PlayerRespawnEventData() {
        }
        public PlayerRespawnEventData(Player player, World previousWorld, World respawnedWorld, Position position, float yaw, float pitch, boolean alive) {
            this.player = player;
            this.previousWorld = previousWorld;
            this.respawnedWorld = respawnedWorld;
            this.position = position;
            this.yaw = yaw;
            this.pitch = pitch;
            this.alive = alive;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public World getPreviousWorld() { return previousWorld; }
        public void setPreviousWorld(World value) { this.previousWorld = value; }
        public World getRespawnedWorld() { return respawnedWorld; }
        public void setRespawnedWorld(World value) { this.respawnedWorld = value; }
        public Position getPosition() { return position; }
        public void setPosition(Position value) { this.position = value; }
        public float getYaw() { return yaw; }
        public void setYaw(float value) { this.yaw = value; }
        public float getPitch() { return pitch; }
        public void setPitch(float value) { this.pitch = value; }
        public boolean isAlive() { return alive; }
        public void setAlive(boolean value) { this.alive = value; }
    }

    public static class PlayerExpChangeEventData {
        private Player player;
        private int amount;
        public PlayerExpChangeEventData() {
        }
        public PlayerExpChangeEventData(Player player, int amount) {
            this.player = player;
            this.amount = amount;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getAmount() { return amount; }
        public void setAmount(int value) { this.amount = value; }
    }

    public static class PlayerItemHeldEventData {
        private Player player;
        private int previousSlot;
        private int newSlot;
        private boolean cancelled;
        public PlayerItemHeldEventData() {
        }
        public PlayerItemHeldEventData(Player player, int previousSlot, int newSlot, boolean cancelled) {
            this.player = player;
            this.previousSlot = previousSlot;
            this.newSlot = newSlot;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getPreviousSlot() { return previousSlot; }
        public void setPreviousSlot(int value) { this.previousSlot = value; }
        public int getNewSlot() { return newSlot; }
        public void setNewSlot(int value) { this.newSlot = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerChangedMainHandEventData {
        private Player player;
        private Common.Hand mainHand;
        public PlayerChangedMainHandEventData() {
        }
        public PlayerChangedMainHandEventData(Player player, Common.Hand mainHand) {
            this.player = player;
            this.mainHand = mainHand;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public Common.Hand getMainHand() { return mainHand; }
        public void setMainHand(Common.Hand value) { this.mainHand = value; }
    }

    public static class PlayerGamemodeChangeEventData {
        private Player player;
        private Common.GameMode previousGamemode;
        private Common.GameMode newGamemode;
        private boolean cancelled;
        public PlayerGamemodeChangeEventData() {
        }
        public PlayerGamemodeChangeEventData(Player player, Common.GameMode previousGamemode, Common.GameMode newGamemode, boolean cancelled) {
            this.player = player;
            this.previousGamemode = previousGamemode;
            this.newGamemode = newGamemode;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public Common.GameMode getPreviousGamemode() { return previousGamemode; }
        public void setPreviousGamemode(Common.GameMode value) { this.previousGamemode = value; }
        public Common.GameMode getNewGamemode() { return newGamemode; }
        public void setNewGamemode(Common.GameMode value) { this.newGamemode = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerCustomPayloadEventData {
        private Player player;
        private String channel;
        private java.util.List<Integer> data;
        public PlayerCustomPayloadEventData() {
        }
        public PlayerCustomPayloadEventData(Player player, String channel, java.util.List<Integer> data) {
            this.player = player;
            this.channel = channel;
            this.data = data;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getChannel() { return channel; }
        public void setChannel(String value) { this.channel = value; }
        public java.util.List<Integer> getData() { return data; }
        public void setData(java.util.List<Integer> value) { this.data = value; }
    }

    public static class PlayerFishEventData {
        private Player player;
        private Uuid caughtUuid;
        private String caughtType;
        private Uuid hookUuid;
        private Object state;
        private Common.Hand hand;
        private int expToDrop;
        private boolean cancelled;
        public PlayerFishEventData() {
        }
        public PlayerFishEventData(Player player, Uuid caughtUuid, String caughtType, Uuid hookUuid, Object state, Common.Hand hand, int expToDrop, boolean cancelled) {
            this.player = player;
            this.caughtUuid = caughtUuid;
            this.caughtType = caughtType;
            this.hookUuid = hookUuid;
            this.state = state;
            this.hand = hand;
            this.expToDrop = expToDrop;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public Uuid getCaughtUuid() { return caughtUuid; }
        public void setCaughtUuid(Uuid value) { this.caughtUuid = value; }
        public String getCaughtType() { return caughtType; }
        public void setCaughtType(String value) { this.caughtType = value; }
        public Uuid getHookUuid() { return hookUuid; }
        public void setHookUuid(Uuid value) { this.hookUuid = value; }
        public Object getState() { return state; }
        public void setState(Object value) { this.state = value; }
        public Common.Hand getHand() { return hand; }
        public void setHand(Common.Hand value) { this.hand = value; }
        public int getExpToDrop() { return expToDrop; }
        public void setExpToDrop(int value) { this.expToDrop = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerEggThrowEventData {
        private Player player;
        private Uuid eggUuid;
        private boolean hatching;
        private int numHatches;
        private String hatchingType;
        private boolean cancelled;
        public PlayerEggThrowEventData() {
        }
        public PlayerEggThrowEventData(Player player, Uuid eggUuid, boolean hatching, int numHatches, String hatchingType, boolean cancelled) {
            this.player = player;
            this.eggUuid = eggUuid;
            this.hatching = hatching;
            this.numHatches = numHatches;
            this.hatchingType = hatchingType;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public Uuid getEggUuid() { return eggUuid; }
        public void setEggUuid(Uuid value) { this.eggUuid = value; }
        public boolean isHatching() { return hatching; }
        public void setHatching(boolean value) { this.hatching = value; }
        public int getNumHatches() { return numHatches; }
        public void setNumHatches(int value) { this.numHatches = value; }
        public String getHatchingType() { return hatchingType; }
        public void setHatchingType(String value) { this.hatchingType = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerInteractEventData {
        private Player player;
        private Object action;
        private BlockPos clickedPos;
        private String block;
        private boolean cancelled;
        public PlayerInteractEventData() {
        }
        public PlayerInteractEventData(Player player, Object action, BlockPos clickedPos, String block, boolean cancelled) {
            this.player = player;
            this.action = action;
            this.clickedPos = clickedPos;
            this.block = block;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public Object getAction() { return action; }
        public void setAction(Object value) { this.action = value; }
        public BlockPos getClickedPos() { return clickedPos; }
        public void setClickedPos(BlockPos value) { this.clickedPos = value; }
        public String getBlock() { return block; }
        public void setBlock(String value) { this.block = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerToggleSneakEventData {
        private Player player;
        private boolean isSneaking;
        private boolean cancelled;
        public PlayerToggleSneakEventData() {
        }
        public PlayerToggleSneakEventData(Player player, boolean isSneaking, boolean cancelled) {
            this.player = player;
            this.isSneaking = isSneaking;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public boolean isIsSneaking() { return isSneaking; }
        public void setIsSneaking(boolean value) { this.isSneaking = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerToggleFlightEventData {
        private Player player;
        private boolean isFlying;
        private boolean cancelled;
        public PlayerToggleFlightEventData() {
        }
        public PlayerToggleFlightEventData(Player player, boolean isFlying, boolean cancelled) {
            this.player = player;
            this.isFlying = isFlying;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public boolean isIsFlying() { return isFlying; }
        public void setIsFlying(boolean value) { this.isFlying = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerToggleSprintEventData {
        private Player player;
        private boolean isSprinting;
        private boolean cancelled;
        public PlayerToggleSprintEventData() {
        }
        public PlayerToggleSprintEventData(Player player, boolean isSprinting, boolean cancelled) {
            this.player = player;
            this.isSprinting = isSprinting;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public boolean isIsSprinting() { return isSprinting; }
        public void setIsSprinting(boolean value) { this.isSprinting = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerInteractUnknownEntityEventData {
        private Player player;
        private int entityId;
        private Object action;
        private boolean cancelled;
        public PlayerInteractUnknownEntityEventData() {
        }
        public PlayerInteractUnknownEntityEventData(Player player, int entityId, Object action, boolean cancelled) {
            this.player = player;
            this.entityId = entityId;
            this.action = action;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public Object getAction() { return action; }
        public void setAction(Object value) { this.action = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class InventoryClickEventData {
        private Player player;
        private Object windowType;
        private Object clickType;
        private int slot;
        private int rawSlot;
        private ItemStack clickedItem;
        private ItemStack cursor;
        private int hotbarButton;
        private boolean cancelled;
        public InventoryClickEventData() {
        }
        public InventoryClickEventData(Player player, Object windowType, Object clickType, int slot, int rawSlot, ItemStack clickedItem, ItemStack cursor, int hotbarButton, boolean cancelled) {
            this.player = player;
            this.windowType = windowType;
            this.clickType = clickType;
            this.slot = slot;
            this.rawSlot = rawSlot;
            this.clickedItem = clickedItem;
            this.cursor = cursor;
            this.hotbarButton = hotbarButton;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public Object getWindowType() { return windowType; }
        public void setWindowType(Object value) { this.windowType = value; }
        public Object getClickType() { return clickType; }
        public void setClickType(Object value) { this.clickType = value; }
        public int getSlot() { return slot; }
        public void setSlot(int value) { this.slot = value; }
        public int getRawSlot() { return rawSlot; }
        public void setRawSlot(int value) { this.rawSlot = value; }
        public ItemStack getClickedItem() { return clickedItem; }
        public void setClickedItem(ItemStack value) { this.clickedItem = value; }
        public ItemStack getCursor() { return cursor; }
        public void setCursor(ItemStack value) { this.cursor = value; }
        public int getHotbarButton() { return hotbarButton; }
        public void setHotbarButton(int value) { this.hotbarButton = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class InventoryCloseEventData {
        private Player player;
        private Object windowType;
        public InventoryCloseEventData() {
        }
        public InventoryCloseEventData(Player player, Object windowType) {
            this.player = player;
            this.windowType = windowType;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public Object getWindowType() { return windowType; }
        public void setWindowType(Object value) { this.windowType = value; }
    }

    public static class BlockRedstoneEventData {
        private World targetWorld;
        private int stateId;
        private BlockPos blockPos;
        private int oldCurrent;
        private int newCurrent;
        private boolean cancelled;
        public BlockRedstoneEventData() {
        }
        public BlockRedstoneEventData(World targetWorld, int stateId, BlockPos blockPos, int oldCurrent, int newCurrent, boolean cancelled) {
            this.targetWorld = targetWorld;
            this.stateId = stateId;
            this.blockPos = blockPos;
            this.oldCurrent = oldCurrent;
            this.newCurrent = newCurrent;
            this.cancelled = cancelled;
        }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public int getStateId() { return stateId; }
        public void setStateId(int value) { this.stateId = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public int getOldCurrent() { return oldCurrent; }
        public void setOldCurrent(int value) { this.oldCurrent = value; }
        public int getNewCurrent() { return newCurrent; }
        public void setNewCurrent(int value) { this.newCurrent = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockBreakEventData {
        private Player player;
        private String block;
        private BlockPos blockPos;
        private int exp;
        private boolean shouldDrop;
        private boolean cancelled;
        public BlockBreakEventData() {
        }
        public BlockBreakEventData(Player player, String block, BlockPos blockPos, int exp, boolean shouldDrop, boolean cancelled) {
            this.player = player;
            this.block = block;
            this.blockPos = blockPos;
            this.exp = exp;
            this.shouldDrop = shouldDrop;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getBlock() { return block; }
        public void setBlock(String value) { this.block = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public int getExp() { return exp; }
        public void setExp(int value) { this.exp = value; }
        public boolean isShouldDrop() { return shouldDrop; }
        public void setShouldDrop(boolean value) { this.shouldDrop = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockBurnEventData {
        private String ignitingBlock;
        private String block;
        private BlockPos blockPos;
        private World targetWorld;
        private boolean cancelled;
        public BlockBurnEventData() {
        }
        public BlockBurnEventData(String ignitingBlock, String block, BlockPos blockPos, World targetWorld, boolean cancelled) {
            this.ignitingBlock = ignitingBlock;
            this.block = block;
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.cancelled = cancelled;
        }
        public String getIgnitingBlock() { return ignitingBlock; }
        public void setIgnitingBlock(String value) { this.ignitingBlock = value; }
        public String getBlock() { return block; }
        public void setBlock(String value) { this.block = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockCanBuildEventData {
        private String blockToBuild;
        private boolean buildable;
        private Player player;
        private String block;
        private boolean cancelled;
        public BlockCanBuildEventData() {
        }
        public BlockCanBuildEventData(String blockToBuild, boolean buildable, Player player, String block, boolean cancelled) {
            this.blockToBuild = blockToBuild;
            this.buildable = buildable;
            this.player = player;
            this.block = block;
            this.cancelled = cancelled;
        }
        public String getBlockToBuild() { return blockToBuild; }
        public void setBlockToBuild(String value) { this.blockToBuild = value; }
        public boolean isBuildable() { return buildable; }
        public void setBuildable(boolean value) { this.buildable = value; }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getBlock() { return block; }
        public void setBlock(String value) { this.block = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockGrowEventData {
        private World targetWorld;
        private String oldBlock;
        private int oldStateId;
        private String newBlock;
        private int newStateId;
        private BlockPos blockPos;
        private boolean cancelled;
        public BlockGrowEventData() {
        }
        public BlockGrowEventData(World targetWorld, String oldBlock, int oldStateId, String newBlock, int newStateId, BlockPos blockPos, boolean cancelled) {
            this.targetWorld = targetWorld;
            this.oldBlock = oldBlock;
            this.oldStateId = oldStateId;
            this.newBlock = newBlock;
            this.newStateId = newStateId;
            this.blockPos = blockPos;
            this.cancelled = cancelled;
        }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public String getOldBlock() { return oldBlock; }
        public void setOldBlock(String value) { this.oldBlock = value; }
        public int getOldStateId() { return oldStateId; }
        public void setOldStateId(int value) { this.oldStateId = value; }
        public String getNewBlock() { return newBlock; }
        public void setNewBlock(String value) { this.newBlock = value; }
        public int getNewStateId() { return newStateId; }
        public void setNewStateId(int value) { this.newStateId = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockPlaceEventData {
        private Player player;
        private String blockPlaced;
        private String blockPlacedAgainst;
        private BlockPos blockPos;
        private boolean canBuild;
        private boolean cancelled;
        public BlockPlaceEventData() {
        }
        public BlockPlaceEventData(Player player, String blockPlaced, String blockPlacedAgainst, BlockPos blockPos, boolean canBuild, boolean cancelled) {
            this.player = player;
            this.blockPlaced = blockPlaced;
            this.blockPlacedAgainst = blockPlacedAgainst;
            this.blockPos = blockPos;
            this.canBuild = canBuild;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getBlockPlaced() { return blockPlaced; }
        public void setBlockPlaced(String value) { this.blockPlaced = value; }
        public String getBlockPlacedAgainst() { return blockPlacedAgainst; }
        public void setBlockPlacedAgainst(String value) { this.blockPlacedAgainst = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public boolean isCanBuild() { return canBuild; }
        public void setCanBuild(boolean value) { this.canBuild = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BedrockFormResponseEventData {
        private Player player;
        private int formId;
        private String responseData;
        public BedrockFormResponseEventData() {
        }
        public BedrockFormResponseEventData(Player player, int formId, String responseData) {
            this.player = player;
            this.formId = formId;
            this.responseData = responseData;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getFormId() { return formId; }
        public void setFormId(int value) { this.formId = value; }
        public String getResponseData() { return responseData; }
        public void setResponseData(String value) { this.responseData = value; }
    }

    public static class DialogClickActionEventData {
        private Player player;
        private String id;
        private java.util.List<Integer> payload;
        private boolean cancelled;
        public DialogClickActionEventData() {
        }
        public DialogClickActionEventData(Player player, String id, java.util.List<Integer> payload, boolean cancelled) {
            this.player = player;
            this.id = id;
            this.payload = payload;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getId() { return id; }
        public void setId(String value) { this.id = value; }
        public java.util.List<Integer> getPayload() { return payload; }
        public void setPayload(java.util.List<Integer> value) { this.payload = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class DialogShowEventData {
        private Player player;
        private Object dialog;
        private boolean cancelled;
        public DialogShowEventData() {
        }
        public DialogShowEventData(Player player, Object dialog, boolean cancelled) {
            this.player = player;
            this.dialog = dialog;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public Object getDialog() { return dialog; }
        public void setDialog(Object value) { this.dialog = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class DialogClearEventData {
        private Player player;
        private boolean cancelled;
        public DialogClearEventData() {
        }
        public DialogClearEventData(Player player, boolean cancelled) {
            this.player = player;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class ServerCommandEventData {
        private String command;
        private boolean cancelled;
        public ServerCommandEventData() {
        }
        public ServerCommandEventData(String command, boolean cancelled) {
            this.command = command;
            this.cancelled = cancelled;
        }
        public String getCommand() { return command; }
        public void setCommand(String value) { this.command = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class ServerListPingAddress {
        private String host;
        private int port;
        public ServerListPingAddress() {
        }
        public ServerListPingAddress(String host, int port) {
            this.host = host;
            this.port = port;
        }
        public String getHost() { return host; }
        public void setHost(String value) { this.host = value; }
        public int getPort() { return port; }
        public void setPort(int value) { this.port = value; }
    }

    public static class ServerListPingEventData {
        private String hostname;
        private Object address;
        private TextComponent motd;
        private int maxPlayers;
        private int numPlayers;
        private String favicon;
        public ServerListPingEventData() {
        }
        public ServerListPingEventData(String hostname, Object address, TextComponent motd, int maxPlayers, int numPlayers, String favicon) {
            this.hostname = hostname;
            this.address = address;
            this.motd = motd;
            this.maxPlayers = maxPlayers;
            this.numPlayers = numPlayers;
            this.favicon = favicon;
        }
        public String getHostname() { return hostname; }
        public void setHostname(String value) { this.hostname = value; }
        public Object getAddress() { return address; }
        public void setAddress(Object value) { this.address = value; }
        public TextComponent getMotd() { return motd; }
        public void setMotd(TextComponent value) { this.motd = value; }
        public int getMaxPlayers() { return maxPlayers; }
        public void setMaxPlayers(int value) { this.maxPlayers = value; }
        public int getNumPlayers() { return numPlayers; }
        public void setNumPlayers(int value) { this.numPlayers = value; }
        public String getFavicon() { return favicon; }
        public void setFavicon(String value) { this.favicon = value; }
    }

    public static class ServerLoadEventData {
        private Object loadType;
        public ServerLoadEventData() {
        }
        public ServerLoadEventData(Object loadType) {
            this.loadType = loadType;
        }
        public Object getLoadType() { return loadType; }
        public void setLoadType(Object value) { this.loadType = value; }
    }

    public static class SpawnChangeEventData {
        private World targetWorld;
        private BlockPos previousPosition;
        private float previousYaw;
        private float previousPitch;
        private BlockPos newPosition;
        private float newYaw;
        private float newPitch;
        public SpawnChangeEventData() {
        }
        public SpawnChangeEventData(World targetWorld, BlockPos previousPosition, float previousYaw, float previousPitch, BlockPos newPosition, float newYaw, float newPitch) {
            this.targetWorld = targetWorld;
            this.previousPosition = previousPosition;
            this.previousYaw = previousYaw;
            this.previousPitch = previousPitch;
            this.newPosition = newPosition;
            this.newYaw = newYaw;
            this.newPitch = newPitch;
        }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public BlockPos getPreviousPosition() { return previousPosition; }
        public void setPreviousPosition(BlockPos value) { this.previousPosition = value; }
        public float getPreviousYaw() { return previousYaw; }
        public void setPreviousYaw(float value) { this.previousYaw = value; }
        public float getPreviousPitch() { return previousPitch; }
        public void setPreviousPitch(float value) { this.previousPitch = value; }
        public BlockPos getNewPosition() { return newPosition; }
        public void setNewPosition(BlockPos value) { this.newPosition = value; }
        public float getNewYaw() { return newYaw; }
        public void setNewYaw(float value) { this.newYaw = value; }
        public float getNewPitch() { return newPitch; }
        public void setNewPitch(float value) { this.newPitch = value; }
    }

    public static class ServerBroadcastEventData {
        private TextComponent message;
        private TextComponent sender;
        private boolean cancelled;
        public ServerBroadcastEventData() {
        }
        public ServerBroadcastEventData(TextComponent message, TextComponent sender, boolean cancelled) {
            this.message = message;
            this.sender = sender;
            this.cancelled = cancelled;
        }
        public TextComponent getMessage() { return message; }
        public void setMessage(TextComponent value) { this.message = value; }
        public TextComponent getSender() { return sender; }
        public void setSender(TextComponent value) { this.sender = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class ServerTickStartEventData {
        private int tick;
        public ServerTickStartEventData() {
        }
        public ServerTickStartEventData(int tick) {
            this.tick = tick;
        }
        public int getTick() { return tick; }
        public void setTick(int value) { this.tick = value; }
    }

    public static class ServerTickEndEventData {
        private int tick;
        private long durationNanos;
        public ServerTickEndEventData() {
        }
        public ServerTickEndEventData(int tick, long durationNanos) {
            this.tick = tick;
            this.durationNanos = durationNanos;
        }
        public int getTick() { return tick; }
        public void setTick(int value) { this.tick = value; }
        public long getDurationNanos() { return durationNanos; }
        public void setDurationNanos(long value) { this.durationNanos = value; }
    }

    public static class PacketReceivedEventData {
        private Player player;
        private Object packet;
        private int packetId;
        private java.util.List<Integer> rawPayload;
        private boolean cancelled;
        public PacketReceivedEventData() {
        }
        public PacketReceivedEventData(Player player, Object packet, int packetId, java.util.List<Integer> rawPayload, boolean cancelled) {
            this.player = player;
            this.packet = packet;
            this.packetId = packetId;
            this.rawPayload = rawPayload;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public Object getPacket() { return packet; }
        public void setPacket(Object value) { this.packet = value; }
        public int getPacketId() { return packetId; }
        public void setPacketId(int value) { this.packetId = value; }
        public java.util.List<Integer> getRawPayload() { return rawPayload; }
        public void setRawPayload(java.util.List<Integer> value) { this.rawPayload = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PacketSentEventData {
        private Player player;
        private Object packet;
        private int packetId;
        private java.util.List<Integer> rawPayload;
        private boolean cancelled;
        public PacketSentEventData() {
        }
        public PacketSentEventData(Player player, Object packet, int packetId, java.util.List<Integer> rawPayload, boolean cancelled) {
            this.player = player;
            this.packet = packet;
            this.packetId = packetId;
            this.rawPayload = rawPayload;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public Object getPacket() { return packet; }
        public void setPacket(Object value) { this.packet = value; }
        public int getPacketId() { return packetId; }
        public void setPacketId(int value) { this.packetId = value; }
        public java.util.List<Integer> getRawPayload() { return rawPayload; }
        public void setRawPayload(java.util.List<Integer> value) { this.rawPayload = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerInteractEntityEventData {
        private Player player;
        private int entityId;
        private Object action;
        private boolean sneaking;
        private boolean cancelled;
        public PlayerInteractEntityEventData() {
        }
        public PlayerInteractEntityEventData(Player player, int entityId, Object action, boolean sneaking, boolean cancelled) {
            this.player = player;
            this.entityId = entityId;
            this.action = action;
            this.sneaking = sneaking;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public Object getAction() { return action; }
        public void setAction(Object value) { this.action = value; }
        public boolean isSneaking() { return sneaking; }
        public void setSneaking(boolean value) { this.sneaking = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class ChunkLoadEventData {
        private World targetWorld;
        private int chunkX;
        private int chunkZ;
        private boolean cancelled;
        public ChunkLoadEventData() {
        }
        public ChunkLoadEventData(World targetWorld, int chunkX, int chunkZ, boolean cancelled) {
            this.targetWorld = targetWorld;
            this.chunkX = chunkX;
            this.chunkZ = chunkZ;
            this.cancelled = cancelled;
        }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public int getChunkX() { return chunkX; }
        public void setChunkX(int value) { this.chunkX = value; }
        public int getChunkZ() { return chunkZ; }
        public void setChunkZ(int value) { this.chunkZ = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class ChunkSaveEventData {
        private World targetWorld;
        private int chunkX;
        private int chunkZ;
        private boolean cancelled;
        public ChunkSaveEventData() {
        }
        public ChunkSaveEventData(World targetWorld, int chunkX, int chunkZ, boolean cancelled) {
            this.targetWorld = targetWorld;
            this.chunkX = chunkX;
            this.chunkZ = chunkZ;
            this.cancelled = cancelled;
        }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public int getChunkX() { return chunkX; }
        public void setChunkX(int value) { this.chunkX = value; }
        public int getChunkZ() { return chunkZ; }
        public void setChunkZ(int value) { this.chunkZ = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class ChunkSendEventData {
        private World targetWorld;
        private int chunkX;
        private int chunkZ;
        private boolean cancelled;
        public ChunkSendEventData() {
        }
        public ChunkSendEventData(World targetWorld, int chunkX, int chunkZ, boolean cancelled) {
            this.targetWorld = targetWorld;
            this.chunkX = chunkX;
            this.chunkZ = chunkZ;
            this.cancelled = cancelled;
        }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public int getChunkX() { return chunkX; }
        public void setChunkX(int value) { this.chunkX = value; }
        public int getChunkZ() { return chunkZ; }
        public void setChunkZ(int value) { this.chunkZ = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityDamageEventData {
        private int entityId;
        private float damage;
        private Object damageType;
        private boolean cancelled;
        public EntityDamageEventData() {
        }
        public EntityDamageEventData(int entityId, float damage, Object damageType, boolean cancelled) {
            this.entityId = entityId;
            this.damage = damage;
            this.damageType = damageType;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public float getDamage() { return damage; }
        public void setDamage(float value) { this.damage = value; }
        public Object getDamageType() { return damageType; }
        public void setDamageType(Object value) { this.damageType = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityDeathEventData {
        private int entityId;
        private int droppedExp;
        public EntityDeathEventData() {
        }
        public EntityDeathEventData(int entityId, int droppedExp) {
            this.entityId = entityId;
            this.droppedExp = droppedExp;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getDroppedExp() { return droppedExp; }
        public void setDroppedExp(int value) { this.droppedExp = value; }
    }

    public static class PlayerDeathEventData {
        private Player player;
        private TextComponent deathMessage;
        private int droppedExp;
        private boolean keepInventory;
        private boolean cancelled;
        public PlayerDeathEventData() {
        }
        public PlayerDeathEventData(Player player, TextComponent deathMessage, int droppedExp, boolean keepInventory, boolean cancelled) {
            this.player = player;
            this.deathMessage = deathMessage;
            this.droppedExp = droppedExp;
            this.keepInventory = keepInventory;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public TextComponent getDeathMessage() { return deathMessage; }
        public void setDeathMessage(TextComponent value) { this.deathMessage = value; }
        public int getDroppedExp() { return droppedExp; }
        public void setDroppedExp(int value) { this.droppedExp = value; }
        public boolean isKeepInventory() { return keepInventory; }
        public void setKeepInventory(boolean value) { this.keepInventory = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntitySpawnEventData {
        private int entityId;
        private String entityType;
        private Position position;
        private World targetWorld;
        private boolean cancelled;
        public EntitySpawnEventData() {
        }
        public EntitySpawnEventData(int entityId, String entityType, Position position, World targetWorld, boolean cancelled) {
            this.entityId = entityId;
            this.entityType = entityType;
            this.position = position;
            this.targetWorld = targetWorld;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public String getEntityType() { return entityType; }
        public void setEntityType(String value) { this.entityType = value; }
        public Position getPosition() { return position; }
        public void setPosition(Position value) { this.position = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityCombustEventData {
        private int entityId;
        private float durationSecs;
        private boolean cancelled;
        public EntityCombustEventData() {
        }
        public EntityCombustEventData(int entityId, float durationSecs, boolean cancelled) {
            this.entityId = entityId;
            this.durationSecs = durationSecs;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public float getDurationSecs() { return durationSecs; }
        public void setDurationSecs(float value) { this.durationSecs = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityRegainHealthEventData {
        private int entityId;
        private float amount;
        private boolean cancelled;
        public EntityRegainHealthEventData() {
        }
        public EntityRegainHealthEventData(int entityId, float amount, boolean cancelled) {
            this.entityId = entityId;
            this.amount = amount;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public float getAmount() { return amount; }
        public void setAmount(float value) { this.amount = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityAirChangeEventData {
        private int entityId;
        private int amount;
        private boolean cancelled;
        public EntityAirChangeEventData() {
        }
        public EntityAirChangeEventData(int entityId, int amount, boolean cancelled) {
            this.entityId = entityId;
            this.amount = amount;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getAmount() { return amount; }
        public void setAmount(int value) { this.amount = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityBreedEventData {
        private int fatherId;
        private int motherId;
        private int childId;
        private boolean cancelled;
        public EntityBreedEventData() {
        }
        public EntityBreedEventData(int fatherId, int motherId, int childId, boolean cancelled) {
            this.fatherId = fatherId;
            this.motherId = motherId;
            this.childId = childId;
            this.cancelled = cancelled;
        }
        public int getFatherId() { return fatherId; }
        public void setFatherId(int value) { this.fatherId = value; }
        public int getMotherId() { return motherId; }
        public void setMotherId(int value) { this.motherId = value; }
        public int getChildId() { return childId; }
        public void setChildId(int value) { this.childId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityDismountEventData {
        private int entityId;
        private int dismountedId;
        private boolean cancelled;
        public EntityDismountEventData() {
        }
        public EntityDismountEventData(int entityId, int dismountedId, boolean cancelled) {
            this.entityId = entityId;
            this.dismountedId = dismountedId;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getDismountedId() { return dismountedId; }
        public void setDismountedId(int value) { this.dismountedId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityDyeEventData {
        private int entityId;
        private String color;
        private Player player;
        private boolean cancelled;
        public EntityDyeEventData() {
        }
        public EntityDyeEventData(int entityId, String color, Player player, boolean cancelled) {
            this.entityId = entityId;
            this.color = color;
            this.player = player;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public String getColor() { return color; }
        public void setColor(String value) { this.color = value; }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityEnterLoveModeEventData {
        private int entityId;
        private Integer humanEntityId;
        private int ticksInLove;
        private boolean cancelled;
        public EntityEnterLoveModeEventData() {
        }
        public EntityEnterLoveModeEventData(int entityId, Integer humanEntityId, int ticksInLove, boolean cancelled) {
            this.entityId = entityId;
            this.humanEntityId = humanEntityId;
            this.ticksInLove = ticksInLove;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public Integer getHumanEntityId() { return humanEntityId; }
        public void setHumanEntityId(Integer value) { this.humanEntityId = value; }
        public int getTicksInLove() { return ticksInLove; }
        public void setTicksInLove(int value) { this.ticksInLove = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityExplodeEventData {
        private int entityId;
        private Position position;
        private float yieldRate;
        private boolean cancelled;
        public EntityExplodeEventData() {
        }
        public EntityExplodeEventData(int entityId, Position position, float yieldRate, boolean cancelled) {
            this.entityId = entityId;
            this.position = position;
            this.yieldRate = yieldRate;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public Position getPosition() { return position; }
        public void setPosition(Position value) { this.position = value; }
        public float getYieldRate() { return yieldRate; }
        public void setYieldRate(float value) { this.yieldRate = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityMountEventData {
        private int entityId;
        private int mountedId;
        private boolean cancelled;
        public EntityMountEventData() {
        }
        public EntityMountEventData(int entityId, int mountedId, boolean cancelled) {
            this.entityId = entityId;
            this.mountedId = mountedId;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getMountedId() { return mountedId; }
        public void setMountedId(int value) { this.mountedId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityPickupItemEventData {
        private int entityId;
        private String itemName;
        private int count;
        private boolean cancelled;
        public EntityPickupItemEventData() {
        }
        public EntityPickupItemEventData(int entityId, String itemName, int count, boolean cancelled) {
            this.entityId = entityId;
            this.itemName = itemName;
            this.count = count;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public String getItemName() { return itemName; }
        public void setItemName(String value) { this.itemName = value; }
        public int getCount() { return count; }
        public void setCount(int value) { this.count = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityPortalEventData {
        private int entityId;
        private BlockPos portalPos;
        private boolean cancelled;
        public EntityPortalEventData() {
        }
        public EntityPortalEventData(int entityId, BlockPos portalPos, boolean cancelled) {
            this.entityId = entityId;
            this.portalPos = portalPos;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public BlockPos getPortalPos() { return portalPos; }
        public void setPortalPos(BlockPos value) { this.portalPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityResurrectEventData {
        private int entityId;
        private boolean cancelled;
        public EntityResurrectEventData() {
        }
        public EntityResurrectEventData(int entityId, boolean cancelled) {
            this.entityId = entityId;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityShootBowEventData {
        private int entityId;
        private String weaponName;
        private float force;
        private boolean cancelled;
        public EntityShootBowEventData() {
        }
        public EntityShootBowEventData(int entityId, String weaponName, float force, boolean cancelled) {
            this.entityId = entityId;
            this.weaponName = weaponName;
            this.force = force;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public String getWeaponName() { return weaponName; }
        public void setWeaponName(String value) { this.weaponName = value; }
        public float getForce() { return force; }
        public void setForce(float value) { this.force = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityTameEventData {
        private int entityId;
        private Player owner;
        private boolean cancelled;
        public EntityTameEventData() {
        }
        public EntityTameEventData(int entityId, Player owner, boolean cancelled) {
            this.entityId = entityId;
            this.owner = owner;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public Player getOwner() { return owner; }
        public void setOwner(Player value) { this.owner = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityTargetEventData {
        private int entityId;
        private Integer targetId;
        private boolean cancelled;
        public EntityTargetEventData() {
        }
        public EntityTargetEventData(int entityId, Integer targetId, boolean cancelled) {
            this.entityId = entityId;
            this.targetId = targetId;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public Integer getTargetId() { return targetId; }
        public void setTargetId(Integer value) { this.targetId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityTeleportEventData {
        private int entityId;
        private Position fromPosition;
        private Position toPosition;
        private boolean cancelled;
        public EntityTeleportEventData() {
        }
        public EntityTeleportEventData(int entityId, Position fromPosition, Position toPosition, boolean cancelled) {
            this.entityId = entityId;
            this.fromPosition = fromPosition;
            this.toPosition = toPosition;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public Position getFromPosition() { return fromPosition; }
        public void setFromPosition(Position value) { this.fromPosition = value; }
        public Position getToPosition() { return toPosition; }
        public void setToPosition(Position value) { this.toPosition = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityToggleGlideEventData {
        private int entityId;
        private boolean isGliding;
        private boolean cancelled;
        public EntityToggleGlideEventData() {
        }
        public EntityToggleGlideEventData(int entityId, boolean isGliding, boolean cancelled) {
            this.entityId = entityId;
            this.isGliding = isGliding;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public boolean isIsGliding() { return isGliding; }
        public void setIsGliding(boolean value) { this.isGliding = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityTransformEventData {
        private int entityId;
        private int newEntityId;
        private String transformReason;
        private boolean cancelled;
        public EntityTransformEventData() {
        }
        public EntityTransformEventData(int entityId, int newEntityId, String transformReason, boolean cancelled) {
            this.entityId = entityId;
            this.newEntityId = newEntityId;
            this.transformReason = transformReason;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getNewEntityId() { return newEntityId; }
        public void setNewEntityId(int value) { this.newEntityId = value; }
        public String getTransformReason() { return transformReason; }
        public void setTransformReason(String value) { this.transformReason = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class CreatureSpawnEventData {
        private int entityId;
        private String entityType;
        private Position position;
        private World targetWorld;
        private String spawnReason;
        private Player player;
        private boolean cancelled;
        public CreatureSpawnEventData() {
        }
        public CreatureSpawnEventData(int entityId, String entityType, Position position, World targetWorld, String spawnReason, Player player, boolean cancelled) {
            this.entityId = entityId;
            this.entityType = entityType;
            this.position = position;
            this.targetWorld = targetWorld;
            this.spawnReason = spawnReason;
            this.player = player;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public String getEntityType() { return entityType; }
        public void setEntityType(String value) { this.entityType = value; }
        public Position getPosition() { return position; }
        public void setPosition(Position value) { this.position = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public String getSpawnReason() { return spawnReason; }
        public void setSpawnReason(String value) { this.spawnReason = value; }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EnderDragonChangePhaseEventData {
        private int entityId;
        private String currentPhase;
        private String newPhase;
        private boolean cancelled;
        public EnderDragonChangePhaseEventData() {
        }
        public EnderDragonChangePhaseEventData(int entityId, String currentPhase, String newPhase, boolean cancelled) {
            this.entityId = entityId;
            this.currentPhase = currentPhase;
            this.newPhase = newPhase;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public String getCurrentPhase() { return currentPhase; }
        public void setCurrentPhase(String value) { this.currentPhase = value; }
        public String getNewPhase() { return newPhase; }
        public void setNewPhase(String value) { this.newPhase = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityBreakDoorEventData {
        private int entityId;
        private BlockPos blockPos;
        private boolean cancelled;
        public EntityBreakDoorEventData() {
        }
        public EntityBreakDoorEventData(int entityId, BlockPos blockPos, boolean cancelled) {
            this.entityId = entityId;
            this.blockPos = blockPos;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityChangeBlockEventData {
        private int entityId;
        private BlockPos blockPos;
        private String newBlock;
        private boolean cancelled;
        public EntityChangeBlockEventData() {
        }
        public EntityChangeBlockEventData(int entityId, BlockPos blockPos, String newBlock, boolean cancelled) {
            this.entityId = entityId;
            this.blockPos = blockPos;
            this.newBlock = newBlock;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public String getNewBlock() { return newBlock; }
        public void setNewBlock(String value) { this.newBlock = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityDamageByBlockEventData {
        private int entityId;
        private BlockPos damagerPos;
        private float damage;
        private String cause;
        private boolean cancelled;
        public EntityDamageByBlockEventData() {
        }
        public EntityDamageByBlockEventData(int entityId, BlockPos damagerPos, float damage, String cause, boolean cancelled) {
            this.entityId = entityId;
            this.damagerPos = damagerPos;
            this.damage = damage;
            this.cause = cause;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public BlockPos getDamagerPos() { return damagerPos; }
        public void setDamagerPos(BlockPos value) { this.damagerPos = value; }
        public float getDamage() { return damage; }
        public void setDamage(float value) { this.damage = value; }
        public String getCause() { return cause; }
        public void setCause(String value) { this.cause = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityDamageByEntityEventData {
        private int entityId;
        private int damagerId;
        private float damage;
        private String cause;
        private boolean cancelled;
        public EntityDamageByEntityEventData() {
        }
        public EntityDamageByEntityEventData(int entityId, int damagerId, float damage, String cause, boolean cancelled) {
            this.entityId = entityId;
            this.damagerId = damagerId;
            this.damage = damage;
            this.cause = cause;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getDamagerId() { return damagerId; }
        public void setDamagerId(int value) { this.damagerId = value; }
        public float getDamage() { return damage; }
        public void setDamage(float value) { this.damage = value; }
        public String getCause() { return cause; }
        public void setCause(String value) { this.cause = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityDropItemEventData {
        private int entityId;
        private String itemName;
        private int count;
        private boolean cancelled;
        public EntityDropItemEventData() {
        }
        public EntityDropItemEventData(int entityId, String itemName, int count, boolean cancelled) {
            this.entityId = entityId;
            this.itemName = itemName;
            this.count = count;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public String getItemName() { return itemName; }
        public void setItemName(String value) { this.itemName = value; }
        public int getCount() { return count; }
        public void setCount(int value) { this.count = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityEnterBlockEventData {
        private int entityId;
        private BlockPos blockPos;
        private boolean cancelled;
        public EntityEnterBlockEventData() {
        }
        public EntityEnterBlockEventData(int entityId, BlockPos blockPos, boolean cancelled) {
            this.entityId = entityId;
            this.blockPos = blockPos;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityExhaustionEventData {
        private int entityId;
        private float exhaustion;
        private boolean cancelled;
        public EntityExhaustionEventData() {
        }
        public EntityExhaustionEventData(int entityId, float exhaustion, boolean cancelled) {
            this.entityId = entityId;
            this.exhaustion = exhaustion;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public float getExhaustion() { return exhaustion; }
        public void setExhaustion(float value) { this.exhaustion = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityInteractEventData {
        private int entityId;
        private BlockPos blockPos;
        private boolean cancelled;
        public EntityInteractEventData() {
        }
        public EntityInteractEventData(int entityId, BlockPos blockPos, boolean cancelled) {
            this.entityId = entityId;
            this.blockPos = blockPos;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityKnockbackEventData {
        private int entityId;
        private Integer hitById;
        private Position knockback;
        private boolean cancelled;
        public EntityKnockbackEventData() {
        }
        public EntityKnockbackEventData(int entityId, Integer hitById, Position knockback, boolean cancelled) {
            this.entityId = entityId;
            this.hitById = hitById;
            this.knockback = knockback;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public Integer getHitById() { return hitById; }
        public void setHitById(Integer value) { this.hitById = value; }
        public Position getKnockback() { return knockback; }
        public void setKnockback(Position value) { this.knockback = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityPlaceEventData {
        private int entityId;
        private BlockPos blockPos;
        private String blockName;
        private boolean cancelled;
        public EntityPlaceEventData() {
        }
        public EntityPlaceEventData(int entityId, BlockPos blockPos, String blockName, boolean cancelled) {
            this.entityId = entityId;
            this.blockPos = blockPos;
            this.blockName = blockName;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public String getBlockName() { return blockName; }
        public void setBlockName(String value) { this.blockName = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityPoseChangeEventData {
        private int entityId;
        private String pose;
        private boolean cancelled;
        public EntityPoseChangeEventData() {
        }
        public EntityPoseChangeEventData(int entityId, String pose, boolean cancelled) {
            this.entityId = entityId;
            this.pose = pose;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public String getPose() { return pose; }
        public void setPose(String value) { this.pose = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityPotionEffectEventData {
        private int entityId;
        private String effectName;
        private int duration;
        private int amplifier;
        private boolean cancelled;
        public EntityPotionEffectEventData() {
        }
        public EntityPotionEffectEventData(int entityId, String effectName, int duration, int amplifier, boolean cancelled) {
            this.entityId = entityId;
            this.effectName = effectName;
            this.duration = duration;
            this.amplifier = amplifier;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public String getEffectName() { return effectName; }
        public void setEffectName(String value) { this.effectName = value; }
        public int getDuration() { return duration; }
        public void setDuration(int value) { this.duration = value; }
        public int getAmplifier() { return amplifier; }
        public void setAmplifier(int value) { this.amplifier = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntitySpellCastEventData {
        private int entityId;
        private String spell;
        private boolean cancelled;
        public EntitySpellCastEventData() {
        }
        public EntitySpellCastEventData(int entityId, String spell, boolean cancelled) {
            this.entityId = entityId;
            this.spell = spell;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public String getSpell() { return spell; }
        public void setSpell(String value) { this.spell = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityTargetLivingEntityEventData {
        private int entityId;
        private Integer targetId;
        private String reason;
        private boolean cancelled;
        public EntityTargetLivingEntityEventData() {
        }
        public EntityTargetLivingEntityEventData(int entityId, Integer targetId, String reason, boolean cancelled) {
            this.entityId = entityId;
            this.targetId = targetId;
            this.reason = reason;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public Integer getTargetId() { return targetId; }
        public void setTargetId(Integer value) { this.targetId = value; }
        public String getReason() { return reason; }
        public void setReason(String value) { this.reason = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityToggleSwimEventData {
        private int entityId;
        private boolean isSwimming;
        private boolean cancelled;
        public EntityToggleSwimEventData() {
        }
        public EntityToggleSwimEventData(int entityId, boolean isSwimming, boolean cancelled) {
            this.entityId = entityId;
            this.isSwimming = isSwimming;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public boolean isIsSwimming() { return isSwimming; }
        public void setIsSwimming(boolean value) { this.isSwimming = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class ExplosionPrimeEventData {
        private int entityId;
        private float radius;
        private boolean fire;
        private boolean cancelled;
        public ExplosionPrimeEventData() {
        }
        public ExplosionPrimeEventData(int entityId, float radius, boolean fire, boolean cancelled) {
            this.entityId = entityId;
            this.radius = radius;
            this.fire = fire;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public float getRadius() { return radius; }
        public void setRadius(float value) { this.radius = value; }
        public boolean isFire() { return fire; }
        public void setFire(boolean value) { this.fire = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class FireworkExplodeEventData {
        private int entityId;
        private boolean cancelled;
        public FireworkExplodeEventData() {
        }
        public FireworkExplodeEventData(int entityId, boolean cancelled) {
            this.entityId = entityId;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class FoodLevelChangeEventData {
        private int entityId;
        private int foodLevel;
        private boolean cancelled;
        public FoodLevelChangeEventData() {
        }
        public FoodLevelChangeEventData(int entityId, int foodLevel, boolean cancelled) {
            this.entityId = entityId;
            this.foodLevel = foodLevel;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getFoodLevel() { return foodLevel; }
        public void setFoodLevel(int value) { this.foodLevel = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class ItemDespawnEventData {
        private int entityId;
        private boolean cancelled;
        public ItemDespawnEventData() {
        }
        public ItemDespawnEventData(int entityId, boolean cancelled) {
            this.entityId = entityId;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class ItemMergeEventData {
        private int entityId;
        private int targetId;
        private boolean cancelled;
        public ItemMergeEventData() {
        }
        public ItemMergeEventData(int entityId, int targetId, boolean cancelled) {
            this.entityId = entityId;
            this.targetId = targetId;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getTargetId() { return targetId; }
        public void setTargetId(int value) { this.targetId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class ItemSpawnEventData {
        private int entityId;
        private Position position;
        private String itemName;
        private boolean cancelled;
        public ItemSpawnEventData() {
        }
        public ItemSpawnEventData(int entityId, Position position, String itemName, boolean cancelled) {
            this.entityId = entityId;
            this.position = position;
            this.itemName = itemName;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public Position getPosition() { return position; }
        public void setPosition(Position value) { this.position = value; }
        public String getItemName() { return itemName; }
        public void setItemName(String value) { this.itemName = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PiglinBarterEventData {
        private int entityId;
        private ItemStack inputItem;
        private java.util.List<ItemStack> outcome;
        private boolean cancelled;
        public PiglinBarterEventData() {
        }
        public PiglinBarterEventData(int entityId, ItemStack inputItem, java.util.List<ItemStack> outcome, boolean cancelled) {
            this.entityId = entityId;
            this.inputItem = inputItem;
            this.outcome = outcome;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public ItemStack getInputItem() { return inputItem; }
        public void setInputItem(ItemStack value) { this.inputItem = value; }
        public java.util.List<ItemStack> getOutcome() { return outcome; }
        public void setOutcome(java.util.List<ItemStack> value) { this.outcome = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class ProjectileHitEventData {
        private int entityId;
        private Position hitPosition;
        private Integer hitEntityId;
        private boolean cancelled;
        public ProjectileHitEventData() {
        }
        public ProjectileHitEventData(int entityId, Position hitPosition, Integer hitEntityId, boolean cancelled) {
            this.entityId = entityId;
            this.hitPosition = hitPosition;
            this.hitEntityId = hitEntityId;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public Position getHitPosition() { return hitPosition; }
        public void setHitPosition(Position value) { this.hitPosition = value; }
        public Integer getHitEntityId() { return hitEntityId; }
        public void setHitEntityId(Integer value) { this.hitEntityId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class ProjectileLaunchEventData {
        private int entityId;
        private Integer shooterId;
        private boolean cancelled;
        public ProjectileLaunchEventData() {
        }
        public ProjectileLaunchEventData(int entityId, Integer shooterId, boolean cancelled) {
            this.entityId = entityId;
            this.shooterId = shooterId;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public Integer getShooterId() { return shooterId; }
        public void setShooterId(Integer value) { this.shooterId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class SheepDyeWoolEventData {
        private int entityId;
        private int dyeColor;
        private Integer playerId;
        private boolean cancelled;
        public SheepDyeWoolEventData() {
        }
        public SheepDyeWoolEventData(int entityId, int dyeColor, Integer playerId, boolean cancelled) {
            this.entityId = entityId;
            this.dyeColor = dyeColor;
            this.playerId = playerId;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getDyeColor() { return dyeColor; }
        public void setDyeColor(int value) { this.dyeColor = value; }
        public Integer getPlayerId() { return playerId; }
        public void setPlayerId(Integer value) { this.playerId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class SheepRegrowWoolEventData {
        private int entityId;
        private boolean cancelled;
        public SheepRegrowWoolEventData() {
        }
        public SheepRegrowWoolEventData(int entityId, boolean cancelled) {
            this.entityId = entityId;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class SlimeSplitEventData {
        private int entityId;
        private int count;
        private boolean cancelled;
        public SlimeSplitEventData() {
        }
        public SlimeSplitEventData(int entityId, int count, boolean cancelled) {
            this.entityId = entityId;
            this.count = count;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getCount() { return count; }
        public void setCount(int value) { this.count = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class StriderTemperatureChangeEventData {
        private int entityId;
        private boolean isShivering;
        private boolean cancelled;
        public StriderTemperatureChangeEventData() {
        }
        public StriderTemperatureChangeEventData(int entityId, boolean isShivering, boolean cancelled) {
            this.entityId = entityId;
            this.isShivering = isShivering;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public boolean isIsShivering() { return isShivering; }
        public void setIsShivering(boolean value) { this.isShivering = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class VillagerAcquireTradeEventData {
        private int entityId;
        private int recipeIndex;
        private boolean cancelled;
        public VillagerAcquireTradeEventData() {
        }
        public VillagerAcquireTradeEventData(int entityId, int recipeIndex, boolean cancelled) {
            this.entityId = entityId;
            this.recipeIndex = recipeIndex;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getRecipeIndex() { return recipeIndex; }
        public void setRecipeIndex(int value) { this.recipeIndex = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class VillagerCareerChangeEventData {
        private int entityId;
        private String profession;
        private String reason;
        private boolean cancelled;
        public VillagerCareerChangeEventData() {
        }
        public VillagerCareerChangeEventData(int entityId, String profession, String reason, boolean cancelled) {
            this.entityId = entityId;
            this.profession = profession;
            this.reason = reason;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public String getProfession() { return profession; }
        public void setProfession(String value) { this.profession = value; }
        public String getReason() { return reason; }
        public void setReason(String value) { this.reason = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class VillagerReplenishTradeEventData {
        private int entityId;
        private int restockQuantity;
        private boolean cancelled;
        public VillagerReplenishTradeEventData() {
        }
        public VillagerReplenishTradeEventData(int entityId, int restockQuantity, boolean cancelled) {
            this.entityId = entityId;
            this.restockQuantity = restockQuantity;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getRestockQuantity() { return restockQuantity; }
        public void setRestockQuantity(int value) { this.restockQuantity = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class WardenAngerChangeEventData {
        private int entityId;
        private int targetId;
        private int oldAnger;
        private int newAnger;
        private boolean cancelled;
        public WardenAngerChangeEventData() {
        }
        public WardenAngerChangeEventData(int entityId, int targetId, int oldAnger, int newAnger, boolean cancelled) {
            this.entityId = entityId;
            this.targetId = targetId;
            this.oldAnger = oldAnger;
            this.newAnger = newAnger;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getTargetId() { return targetId; }
        public void setTargetId(int value) { this.targetId = value; }
        public int getOldAnger() { return oldAnger; }
        public void setOldAnger(int value) { this.oldAnger = value; }
        public int getNewAnger() { return newAnger; }
        public void setNewAnger(int value) { this.newAnger = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class AreaEffectCloudApplyEventData {
        private int entityId;
        private java.util.List<Integer> affectedEntities;
        private boolean cancelled;
        public AreaEffectCloudApplyEventData() {
        }
        public AreaEffectCloudApplyEventData(int entityId, java.util.List<Integer> affectedEntities, boolean cancelled) {
            this.entityId = entityId;
            this.affectedEntities = affectedEntities;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public java.util.List<Integer> getAffectedEntities() { return affectedEntities; }
        public void setAffectedEntities(java.util.List<Integer> value) { this.affectedEntities = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class ArrowBodyCountChangeEventData {
        private int entityId;
        private int oldAmount;
        private int newAmount;
        private boolean cancelled;
        public ArrowBodyCountChangeEventData() {
        }
        public ArrowBodyCountChangeEventData(int entityId, int oldAmount, int newAmount, boolean cancelled) {
            this.entityId = entityId;
            this.oldAmount = oldAmount;
            this.newAmount = newAmount;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getOldAmount() { return oldAmount; }
        public void setOldAmount(int value) { this.oldAmount = value; }
        public int getNewAmount() { return newAmount; }
        public void setNewAmount(int value) { this.newAmount = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BatToggleSleepEventData {
        private int entityId;
        private boolean isAwake;
        private boolean cancelled;
        public BatToggleSleepEventData() {
        }
        public BatToggleSleepEventData(int entityId, boolean isAwake, boolean cancelled) {
            this.entityId = entityId;
            this.isAwake = isAwake;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public boolean isIsAwake() { return isAwake; }
        public void setIsAwake(boolean value) { this.isAwake = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class CreeperPowerEventData {
        private int entityId;
        private Integer lightningId;
        private String cause;
        private boolean cancelled;
        public CreeperPowerEventData() {
        }
        public CreeperPowerEventData(int entityId, Integer lightningId, String cause, boolean cancelled) {
            this.entityId = entityId;
            this.lightningId = lightningId;
            this.cause = cause;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public Integer getLightningId() { return lightningId; }
        public void setLightningId(Integer value) { this.lightningId = value; }
        public String getCause() { return cause; }
        public void setCause(String value) { this.cause = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityCombustByBlockEventData {
        private int entityId;
        private BlockPos combuster;
        private float duration;
        private boolean cancelled;
        public EntityCombustByBlockEventData() {
        }
        public EntityCombustByBlockEventData(int entityId, BlockPos combuster, float duration, boolean cancelled) {
            this.entityId = entityId;
            this.combuster = combuster;
            this.duration = duration;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public BlockPos getCombuster() { return combuster; }
        public void setCombuster(BlockPos value) { this.combuster = value; }
        public float getDuration() { return duration; }
        public void setDuration(float value) { this.duration = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityCombustByEntityEventData {
        private int entityId;
        private int combusterId;
        private float duration;
        private boolean cancelled;
        public EntityCombustByEntityEventData() {
        }
        public EntityCombustByEntityEventData(int entityId, int combusterId, float duration, boolean cancelled) {
            this.entityId = entityId;
            this.combusterId = combusterId;
            this.duration = duration;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getCombusterId() { return combusterId; }
        public void setCombusterId(int value) { this.combusterId = value; }
        public float getDuration() { return duration; }
        public void setDuration(float value) { this.duration = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityKnockbackByEntityEventData {
        private int entityId;
        private int hitById;
        private double force;
        private double x;
        private double z;
        private boolean cancelled;
        public EntityKnockbackByEntityEventData() {
        }
        public EntityKnockbackByEntityEventData(int entityId, int hitById, double force, double x, double z, boolean cancelled) {
            this.entityId = entityId;
            this.hitById = hitById;
            this.force = force;
            this.x = x;
            this.z = z;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getHitById() { return hitById; }
        public void setHitById(int value) { this.hitById = value; }
        public double getForce() { return force; }
        public void setForce(double value) { this.force = value; }
        public double getX() { return x; }
        public void setX(double value) { this.x = value; }
        public double getZ() { return z; }
        public void setZ(double value) { this.z = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityPortalEnterEventData {
        private int entityId;
        private BlockPos location;
        private boolean cancelled;
        public EntityPortalEnterEventData() {
        }
        public EntityPortalEnterEventData(int entityId, BlockPos location, boolean cancelled) {
            this.entityId = entityId;
            this.location = location;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public BlockPos getLocation() { return location; }
        public void setLocation(BlockPos value) { this.location = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityPortalExitEventData {
        private int entityId;
        private BlockPos fromPos;
        private BlockPos toPos;
        private boolean cancelled;
        public EntityPortalExitEventData() {
        }
        public EntityPortalExitEventData(int entityId, BlockPos fromPos, BlockPos toPos, boolean cancelled) {
            this.entityId = entityId;
            this.fromPos = fromPos;
            this.toPos = toPos;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public BlockPos getFromPos() { return fromPos; }
        public void setFromPos(BlockPos value) { this.fromPos = value; }
        public BlockPos getToPos() { return toPos; }
        public void setToPos(BlockPos value) { this.toPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityRemoveEventData {
        private int entityId;
        private String cause;
        private boolean cancelled;
        public EntityRemoveEventData() {
        }
        public EntityRemoveEventData(int entityId, String cause, boolean cancelled) {
            this.entityId = entityId;
            this.cause = cause;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public String getCause() { return cause; }
        public void setCause(String value) { this.cause = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityTargetBlockEventData {
        private int entityId;
        private BlockPos blockPos;
        private boolean cancelled;
        public EntityTargetBlockEventData() {
        }
        public EntityTargetBlockEventData(int entityId, BlockPos blockPos, boolean cancelled) {
            this.entityId = entityId;
            this.blockPos = blockPos;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityUnleashEventData {
        private int entityId;
        private String reason;
        private boolean cancelled;
        public EntityUnleashEventData() {
        }
        public EntityUnleashEventData(int entityId, String reason, boolean cancelled) {
            this.entityId = entityId;
            this.reason = reason;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public String getReason() { return reason; }
        public void setReason(String value) { this.reason = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class ExpBottleEventData {
        private int entityId;
        private int experience;
        private BlockPos location;
        private boolean showEffect;
        private boolean cancelled;
        public ExpBottleEventData() {
        }
        public ExpBottleEventData(int entityId, int experience, BlockPos location, boolean showEffect, boolean cancelled) {
            this.entityId = entityId;
            this.experience = experience;
            this.location = location;
            this.showEffect = showEffect;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getExperience() { return experience; }
        public void setExperience(int value) { this.experience = value; }
        public BlockPos getLocation() { return location; }
        public void setLocation(BlockPos value) { this.location = value; }
        public boolean isShowEffect() { return showEffect; }
        public void setShowEffect(boolean value) { this.showEffect = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class HorseJumpEventData {
        private int entityId;
        private float power;
        private boolean cancelled;
        public HorseJumpEventData() {
        }
        public HorseJumpEventData(int entityId, float power, boolean cancelled) {
            this.entityId = entityId;
            this.power = power;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public float getPower() { return power; }
        public void setPower(float value) { this.power = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class LingeringPotionSplashEventData {
        private int entityId;
        private BlockPos location;
        private String potionItem;
        private boolean cancelled;
        public LingeringPotionSplashEventData() {
        }
        public LingeringPotionSplashEventData(int entityId, BlockPos location, String potionItem, boolean cancelled) {
            this.entityId = entityId;
            this.location = location;
            this.potionItem = potionItem;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public BlockPos getLocation() { return location; }
        public void setLocation(BlockPos value) { this.location = value; }
        public String getPotionItem() { return potionItem; }
        public void setPotionItem(String value) { this.potionItem = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PigZapEventData {
        private int entityId;
        private int lightningId;
        private int pigZombieId;
        private boolean cancelled;
        public PigZapEventData() {
        }
        public PigZapEventData(int entityId, int lightningId, int pigZombieId, boolean cancelled) {
            this.entityId = entityId;
            this.lightningId = lightningId;
            this.pigZombieId = pigZombieId;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getLightningId() { return lightningId; }
        public void setLightningId(int value) { this.lightningId = value; }
        public int getPigZombieId() { return pigZombieId; }
        public void setPigZombieId(int value) { this.pigZombieId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PigZombieAngerEventData {
        private int entityId;
        private Integer targetId;
        private int newAnger;
        private boolean cancelled;
        public PigZombieAngerEventData() {
        }
        public PigZombieAngerEventData(int entityId, Integer targetId, int newAnger, boolean cancelled) {
            this.entityId = entityId;
            this.targetId = targetId;
            this.newAnger = newAnger;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public Integer getTargetId() { return targetId; }
        public void setTargetId(Integer value) { this.targetId = value; }
        public int getNewAnger() { return newAnger; }
        public void setNewAnger(int value) { this.newAnger = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PotionSplashEventData {
        private int entityId;
        private BlockPos location;
        private String potionItem;
        private java.util.List<Integer> affectedEntities;
        private boolean cancelled;
        public PotionSplashEventData() {
        }
        public PotionSplashEventData(int entityId, BlockPos location, String potionItem, java.util.List<Integer> affectedEntities, boolean cancelled) {
            this.entityId = entityId;
            this.location = location;
            this.potionItem = potionItem;
            this.affectedEntities = affectedEntities;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public BlockPos getLocation() { return location; }
        public void setLocation(BlockPos value) { this.location = value; }
        public String getPotionItem() { return potionItem; }
        public void setPotionItem(String value) { this.potionItem = value; }
        public java.util.List<Integer> getAffectedEntities() { return affectedEntities; }
        public void setAffectedEntities(java.util.List<Integer> value) { this.affectedEntities = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class SpawnerSpawnEventData {
        private int entityId;
        private BlockPos spawnerPos;
        private boolean cancelled;
        public SpawnerSpawnEventData() {
        }
        public SpawnerSpawnEventData(int entityId, BlockPos spawnerPos, boolean cancelled) {
            this.entityId = entityId;
            this.spawnerPos = spawnerPos;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public BlockPos getSpawnerPos() { return spawnerPos; }
        public void setSpawnerPos(BlockPos value) { this.spawnerPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class TrialSpawnerSpawnEventData {
        private int entityId;
        private BlockPos spawnerPos;
        private boolean cancelled;
        public TrialSpawnerSpawnEventData() {
        }
        public TrialSpawnerSpawnEventData(int entityId, BlockPos spawnerPos, boolean cancelled) {
            this.entityId = entityId;
            this.spawnerPos = spawnerPos;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public BlockPos getSpawnerPos() { return spawnerPos; }
        public void setSpawnerPos(BlockPos value) { this.spawnerPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class VillagerReputationChangeEventData {
        private int entityId;
        private int targetId;
        private int reputationChange;
        private boolean cancelled;
        public VillagerReputationChangeEventData() {
        }
        public VillagerReputationChangeEventData(int entityId, int targetId, int reputationChange, boolean cancelled) {
            this.entityId = entityId;
            this.targetId = targetId;
            this.reputationChange = reputationChange;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getTargetId() { return targetId; }
        public void setTargetId(int value) { this.targetId = value; }
        public int getReputationChange() { return reputationChange; }
        public void setReputationChange(int value) { this.reputationChange = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerItemConsumeEventData {
        private Player player;
        private String itemName;
        private boolean cancelled;
        public PlayerItemConsumeEventData() {
        }
        public PlayerItemConsumeEventData(Player player, String itemName, boolean cancelled) {
            this.player = player;
            this.itemName = itemName;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getItemName() { return itemName; }
        public void setItemName(String value) { this.itemName = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerItemDamageEventData {
        private Player player;
        private String itemName;
        private int damage;
        private boolean cancelled;
        public PlayerItemDamageEventData() {
        }
        public PlayerItemDamageEventData(Player player, String itemName, int damage, boolean cancelled) {
            this.player = player;
            this.itemName = itemName;
            this.damage = damage;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getItemName() { return itemName; }
        public void setItemName(String value) { this.itemName = value; }
        public int getDamage() { return damage; }
        public void setDamage(int value) { this.damage = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerDropItemEventData {
        private Player player;
        private String itemName;
        private int count;
        private boolean cancelled;
        public PlayerDropItemEventData() {
        }
        public PlayerDropItemEventData(Player player, String itemName, int count, boolean cancelled) {
            this.player = player;
            this.itemName = itemName;
            this.count = count;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getItemName() { return itemName; }
        public void setItemName(String value) { this.itemName = value; }
        public int getCount() { return count; }
        public void setCount(int value) { this.count = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerBedEnterEventData {
        private Player player;
        private BlockPos bedPos;
        private boolean cancelled;
        public PlayerBedEnterEventData() {
        }
        public PlayerBedEnterEventData(Player player, BlockPos bedPos, boolean cancelled) {
            this.player = player;
            this.bedPos = bedPos;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public BlockPos getBedPos() { return bedPos; }
        public void setBedPos(BlockPos value) { this.bedPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerBedLeaveEventData {
        private Player player;
        private BlockPos bedPos;
        public PlayerBedLeaveEventData() {
        }
        public PlayerBedLeaveEventData(Player player, BlockPos bedPos) {
            this.player = player;
            this.bedPos = bedPos;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public BlockPos getBedPos() { return bedPos; }
        public void setBedPos(BlockPos value) { this.bedPos = value; }
    }

    public static class PlayerBucketEmptyEventData {
        private Player player;
        private BlockPos blockPos;
        private String bucket;
        private boolean cancelled;
        public PlayerBucketEmptyEventData() {
        }
        public PlayerBucketEmptyEventData(Player player, BlockPos blockPos, String bucket, boolean cancelled) {
            this.player = player;
            this.blockPos = blockPos;
            this.bucket = bucket;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public String getBucket() { return bucket; }
        public void setBucket(String value) { this.bucket = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerBucketFillEventData {
        private Player player;
        private BlockPos blockPos;
        private String bucket;
        private boolean cancelled;
        public PlayerBucketFillEventData() {
        }
        public PlayerBucketFillEventData(Player player, BlockPos blockPos, String bucket, boolean cancelled) {
            this.player = player;
            this.blockPos = blockPos;
            this.bucket = bucket;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public String getBucket() { return bucket; }
        public void setBucket(String value) { this.bucket = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class AsyncPlayerChatEventData {
        private Player player;
        private String message;
        private TextComponent format;
        private boolean cancelled;
        public AsyncPlayerChatEventData() {
        }
        public AsyncPlayerChatEventData(Player player, String message, TextComponent format, boolean cancelled) {
            this.player = player;
            this.message = message;
            this.format = format;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getMessage() { return message; }
        public void setMessage(String value) { this.message = value; }
        public TextComponent getFormat() { return format; }
        public void setFormat(TextComponent value) { this.format = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class AsyncPlayerPreLoginEventData {
        private String playerName;
        private String playerUuid;
        private String ipAddress;
        private TextComponent kickMessage;
        private boolean cancelled;
        public AsyncPlayerPreLoginEventData() {
        }
        public AsyncPlayerPreLoginEventData(String playerName, String playerUuid, String ipAddress, TextComponent kickMessage, boolean cancelled) {
            this.playerName = playerName;
            this.playerUuid = playerUuid;
            this.ipAddress = ipAddress;
            this.kickMessage = kickMessage;
            this.cancelled = cancelled;
        }
        public String getPlayerName() { return playerName; }
        public void setPlayerName(String value) { this.playerName = value; }
        public String getPlayerUuid() { return playerUuid; }
        public void setPlayerUuid(String value) { this.playerUuid = value; }
        public String getIpAddress() { return ipAddress; }
        public void setIpAddress(String value) { this.ipAddress = value; }
        public TextComponent getKickMessage() { return kickMessage; }
        public void setKickMessage(TextComponent value) { this.kickMessage = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerAdvancementDoneEventData {
        private Player player;
        private String advancementId;
        private boolean cancelled;
        public PlayerAdvancementDoneEventData() {
        }
        public PlayerAdvancementDoneEventData(Player player, String advancementId, boolean cancelled) {
            this.player = player;
            this.advancementId = advancementId;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getAdvancementId() { return advancementId; }
        public void setAdvancementId(String value) { this.advancementId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerAnimationEventData {
        private Player player;
        private String animationType;
        private boolean cancelled;
        public PlayerAnimationEventData() {
        }
        public PlayerAnimationEventData(Player player, String animationType, boolean cancelled) {
            this.player = player;
            this.animationType = animationType;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getAnimationType() { return animationType; }
        public void setAnimationType(String value) { this.animationType = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerArmorStandManipulateEventData {
        private Player player;
        private int armorStandId;
        private int slot;
        private boolean cancelled;
        public PlayerArmorStandManipulateEventData() {
        }
        public PlayerArmorStandManipulateEventData(Player player, int armorStandId, int slot, boolean cancelled) {
            this.player = player;
            this.armorStandId = armorStandId;
            this.slot = slot;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getArmorStandId() { return armorStandId; }
        public void setArmorStandId(int value) { this.armorStandId = value; }
        public int getSlot() { return slot; }
        public void setSlot(int value) { this.slot = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerBucketEntityEventData {
        private Player player;
        private int entityId;
        private String bucketItem;
        private boolean cancelled;
        public PlayerBucketEntityEventData() {
        }
        public PlayerBucketEntityEventData(Player player, int entityId, String bucketItem, boolean cancelled) {
            this.player = player;
            this.entityId = entityId;
            this.bucketItem = bucketItem;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public String getBucketItem() { return bucketItem; }
        public void setBucketItem(String value) { this.bucketItem = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerChangedWorldEventData {
        private Player player;
        private World fromWorld;
        private World toWorld;
        private boolean cancelled;
        public PlayerChangedWorldEventData() {
        }
        public PlayerChangedWorldEventData(Player player, World fromWorld, World toWorld, boolean cancelled) {
            this.player = player;
            this.fromWorld = fromWorld;
            this.toWorld = toWorld;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public World getFromWorld() { return fromWorld; }
        public void setFromWorld(World value) { this.fromWorld = value; }
        public World getToWorld() { return toWorld; }
        public void setToWorld(World value) { this.toWorld = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerChannelEventData {
        private Player player;
        private String channel;
        private boolean cancelled;
        public PlayerChannelEventData() {
        }
        public PlayerChannelEventData(Player player, String channel, boolean cancelled) {
            this.player = player;
            this.channel = channel;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getChannel() { return channel; }
        public void setChannel(String value) { this.channel = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerCommandPreprocessEventData {
        private Player player;
        private String command;
        private boolean cancelled;
        public PlayerCommandPreprocessEventData() {
        }
        public PlayerCommandPreprocessEventData(Player player, String command, boolean cancelled) {
            this.player = player;
            this.command = command;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getCommand() { return command; }
        public void setCommand(String value) { this.command = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerEditBookEventData {
        private Player player;
        private int slot;
        private java.util.List<String> pages;
        private String title;
        private boolean signing;
        private boolean cancelled;
        public PlayerEditBookEventData() {
        }
        public PlayerEditBookEventData(Player player, int slot, java.util.List<String> pages, String title, boolean signing, boolean cancelled) {
            this.player = player;
            this.slot = slot;
            this.pages = pages;
            this.title = title;
            this.signing = signing;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getSlot() { return slot; }
        public void setSlot(int value) { this.slot = value; }
        public java.util.List<String> getPages() { return pages; }
        public void setPages(java.util.List<String> value) { this.pages = value; }
        public String getTitle() { return title; }
        public void setTitle(String value) { this.title = value; }
        public boolean isSigning() { return signing; }
        public void setSigning(boolean value) { this.signing = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerElytraBoostEventData {
        private Player player;
        private int fireworkId;
        private boolean cancelled;
        public PlayerElytraBoostEventData() {
        }
        public PlayerElytraBoostEventData(Player player, int fireworkId, boolean cancelled) {
            this.player = player;
            this.fireworkId = fireworkId;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getFireworkId() { return fireworkId; }
        public void setFireworkId(int value) { this.fireworkId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerExpCooldownChangeEventData {
        private Player player;
        private int newCooldown;
        private boolean cancelled;
        public PlayerExpCooldownChangeEventData() {
        }
        public PlayerExpCooldownChangeEventData(Player player, int newCooldown, boolean cancelled) {
            this.player = player;
            this.newCooldown = newCooldown;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getNewCooldown() { return newCooldown; }
        public void setNewCooldown(int value) { this.newCooldown = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerHarvestBlockEventData {
        private Player player;
        private BlockPos blockPos;
        private java.util.List<ItemStack> harvestedItems;
        private boolean cancelled;
        public PlayerHarvestBlockEventData() {
        }
        public PlayerHarvestBlockEventData(Player player, BlockPos blockPos, java.util.List<ItemStack> harvestedItems, boolean cancelled) {
            this.player = player;
            this.blockPos = blockPos;
            this.harvestedItems = harvestedItems;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public java.util.List<ItemStack> getHarvestedItems() { return harvestedItems; }
        public void setHarvestedItems(java.util.List<ItemStack> value) { this.harvestedItems = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerHideEntityEventData {
        private Player player;
        private int entityId;
        private boolean cancelled;
        public PlayerHideEntityEventData() {
        }
        public PlayerHideEntityEventData(Player player, int entityId, boolean cancelled) {
            this.player = player;
            this.entityId = entityId;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerItemBreakEventData {
        private Player player;
        private String itemName;
        public PlayerItemBreakEventData() {
        }
        public PlayerItemBreakEventData(Player player, String itemName) {
            this.player = player;
            this.itemName = itemName;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getItemName() { return itemName; }
        public void setItemName(String value) { this.itemName = value; }
    }

    public static class PlayerItemMendEventData {
        private Player player;
        private String itemName;
        private int repairAmount;
        private int expConsumed;
        private boolean cancelled;
        public PlayerItemMendEventData() {
        }
        public PlayerItemMendEventData(Player player, String itemName, int repairAmount, int expConsumed, boolean cancelled) {
            this.player = player;
            this.itemName = itemName;
            this.repairAmount = repairAmount;
            this.expConsumed = expConsumed;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getItemName() { return itemName; }
        public void setItemName(String value) { this.itemName = value; }
        public int getRepairAmount() { return repairAmount; }
        public void setRepairAmount(int value) { this.repairAmount = value; }
        public int getExpConsumed() { return expConsumed; }
        public void setExpConsumed(int value) { this.expConsumed = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerKickEventData {
        private Player player;
        private String reason;
        private boolean cancelled;
        public PlayerKickEventData() {
        }
        public PlayerKickEventData(Player player, String reason, boolean cancelled) {
            this.player = player;
            this.reason = reason;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getReason() { return reason; }
        public void setReason(String value) { this.reason = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerLeashEntityEventData {
        private Player player;
        private int entityId;
        private int holderId;
        private boolean cancelled;
        public PlayerLeashEntityEventData() {
        }
        public PlayerLeashEntityEventData(Player player, int entityId, int holderId, boolean cancelled) {
            this.player = player;
            this.entityId = entityId;
            this.holderId = holderId;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getHolderId() { return holderId; }
        public void setHolderId(int value) { this.holderId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerLevelChangeEventData {
        private Player player;
        private int oldLevel;
        private int newLevel;
        public PlayerLevelChangeEventData() {
        }
        public PlayerLevelChangeEventData(Player player, int oldLevel, int newLevel) {
            this.player = player;
            this.oldLevel = oldLevel;
            this.newLevel = newLevel;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getOldLevel() { return oldLevel; }
        public void setOldLevel(int value) { this.oldLevel = value; }
        public int getNewLevel() { return newLevel; }
        public void setNewLevel(int value) { this.newLevel = value; }
    }

    public static class PlayerLocaleChangeEventData {
        private Player player;
        private String newLocale;
        private boolean cancelled;
        public PlayerLocaleChangeEventData() {
        }
        public PlayerLocaleChangeEventData(Player player, String newLocale, boolean cancelled) {
            this.player = player;
            this.newLocale = newLocale;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getNewLocale() { return newLocale; }
        public void setNewLocale(String value) { this.newLocale = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerNameEntityEventData {
        private Player player;
        private int entityId;
        private TextComponent name;
        private boolean cancelled;
        public PlayerNameEntityEventData() {
        }
        public PlayerNameEntityEventData(Player player, int entityId, TextComponent name, boolean cancelled) {
            this.player = player;
            this.entityId = entityId;
            this.name = name;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public TextComponent getName() { return name; }
        public void setName(TextComponent value) { this.name = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerOpenSignEventData {
        private Player player;
        private BlockPos blockPos;
        private boolean isFront;
        private boolean cancelled;
        public PlayerOpenSignEventData() {
        }
        public PlayerOpenSignEventData(Player player, BlockPos blockPos, boolean isFront, boolean cancelled) {
            this.player = player;
            this.blockPos = blockPos;
            this.isFront = isFront;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public boolean isIsFront() { return isFront; }
        public void setIsFront(boolean value) { this.isFront = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerPortalEventData {
        private Player player;
        private BlockPos fromPos;
        private BlockPos toPos;
        private boolean cancelled;
        public PlayerPortalEventData() {
        }
        public PlayerPortalEventData(Player player, BlockPos fromPos, BlockPos toPos, boolean cancelled) {
            this.player = player;
            this.fromPos = fromPos;
            this.toPos = toPos;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public BlockPos getFromPos() { return fromPos; }
        public void setFromPos(BlockPos value) { this.fromPos = value; }
        public BlockPos getToPos() { return toPos; }
        public void setToPos(BlockPos value) { this.toPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerPreLoginEventData {
        private String playerName;
        private String playerUuid;
        private String ipAddress;
        private TextComponent kickMessage;
        private boolean cancelled;
        public PlayerPreLoginEventData() {
        }
        public PlayerPreLoginEventData(String playerName, String playerUuid, String ipAddress, TextComponent kickMessage, boolean cancelled) {
            this.playerName = playerName;
            this.playerUuid = playerUuid;
            this.ipAddress = ipAddress;
            this.kickMessage = kickMessage;
            this.cancelled = cancelled;
        }
        public String getPlayerName() { return playerName; }
        public void setPlayerName(String value) { this.playerName = value; }
        public String getPlayerUuid() { return playerUuid; }
        public void setPlayerUuid(String value) { this.playerUuid = value; }
        public String getIpAddress() { return ipAddress; }
        public void setIpAddress(String value) { this.ipAddress = value; }
        public TextComponent getKickMessage() { return kickMessage; }
        public void setKickMessage(TextComponent value) { this.kickMessage = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerRiptideEventData {
        private Player player;
        private String itemName;
        private boolean cancelled;
        public PlayerRiptideEventData() {
        }
        public PlayerRiptideEventData(Player player, String itemName, boolean cancelled) {
            this.player = player;
            this.itemName = itemName;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getItemName() { return itemName; }
        public void setItemName(String value) { this.itemName = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerShearEntityEventData {
        private Player player;
        private int entityId;
        private int hand;
        private boolean cancelled;
        public PlayerShearEntityEventData() {
        }
        public PlayerShearEntityEventData(Player player, int entityId, int hand, boolean cancelled) {
            this.player = player;
            this.entityId = entityId;
            this.hand = hand;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getHand() { return hand; }
        public void setHand(int value) { this.hand = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerShowEntityEventData {
        private Player player;
        private int entityId;
        private boolean cancelled;
        public PlayerShowEntityEventData() {
        }
        public PlayerShowEntityEventData(Player player, int entityId, boolean cancelled) {
            this.player = player;
            this.entityId = entityId;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerSpawnChangeEventData {
        private Player player;
        private BlockPos newSpawn;
        private boolean forced;
        private boolean cancelled;
        public PlayerSpawnChangeEventData() {
        }
        public PlayerSpawnChangeEventData(Player player, BlockPos newSpawn, boolean forced, boolean cancelled) {
            this.player = player;
            this.newSpawn = newSpawn;
            this.forced = forced;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public BlockPos getNewSpawn() { return newSpawn; }
        public void setNewSpawn(BlockPos value) { this.newSpawn = value; }
        public boolean isForced() { return forced; }
        public void setForced(boolean value) { this.forced = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerStatisticIncrementEventData {
        private Player player;
        private String statisticId;
        private int amount;
        private boolean cancelled;
        public PlayerStatisticIncrementEventData() {
        }
        public PlayerStatisticIncrementEventData(Player player, String statisticId, int amount, boolean cancelled) {
            this.player = player;
            this.statisticId = statisticId;
            this.amount = amount;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getStatisticId() { return statisticId; }
        public void setStatisticId(String value) { this.statisticId = value; }
        public int getAmount() { return amount; }
        public void setAmount(int value) { this.amount = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerSwapHandsEventData {
        private Player player;
        private boolean cancelled;
        public PlayerSwapHandsEventData() {
        }
        public PlayerSwapHandsEventData(Player player, boolean cancelled) {
            this.player = player;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerTakeLecternBookEventData {
        private Player player;
        private BlockPos blockPos;
        private ItemStack book;
        private boolean cancelled;
        public PlayerTakeLecternBookEventData() {
        }
        public PlayerTakeLecternBookEventData(Player player, BlockPos blockPos, ItemStack book, boolean cancelled) {
            this.player = player;
            this.blockPos = blockPos;
            this.book = book;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public ItemStack getBook() { return book; }
        public void setBook(ItemStack value) { this.book = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerUnleashEntityEventData {
        private Player player;
        private int entityId;
        private boolean cancelled;
        public PlayerUnleashEntityEventData() {
        }
        public PlayerUnleashEntityEventData(Player player, int entityId, boolean cancelled) {
            this.player = player;
            this.entityId = entityId;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerVelocityEventData {
        private Player player;
        private Position velocity;
        private boolean cancelled;
        public PlayerVelocityEventData() {
        }
        public PlayerVelocityEventData(Player player, Position velocity, boolean cancelled) {
            this.player = player;
            this.velocity = velocity;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public Position getVelocity() { return velocity; }
        public void setVelocity(Position value) { this.velocity = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerInputEventData {
        private Player player;
        private String input;
        private boolean cancelled;
        public PlayerInputEventData() {
        }
        public PlayerInputEventData(Player player, String input, boolean cancelled) {
            this.player = player;
            this.input = input;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getInput() { return input; }
        public void setInput(String value) { this.input = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerInteractAtEntityEventData {
        private Player player;
        private int entityId;
        private double clickedX;
        private double clickedY;
        private double clickedZ;
        private int hand;
        private boolean cancelled;
        public PlayerInteractAtEntityEventData() {
        }
        public PlayerInteractAtEntityEventData(Player player, int entityId, double clickedX, double clickedY, double clickedZ, int hand, boolean cancelled) {
            this.player = player;
            this.entityId = entityId;
            this.clickedX = clickedX;
            this.clickedY = clickedY;
            this.clickedZ = clickedZ;
            this.hand = hand;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public double getClickedX() { return clickedX; }
        public void setClickedX(double value) { this.clickedX = value; }
        public double getClickedY() { return clickedY; }
        public void setClickedY(double value) { this.clickedY = value; }
        public double getClickedZ() { return clickedZ; }
        public void setClickedZ(double value) { this.clickedZ = value; }
        public int getHand() { return hand; }
        public void setHand(int value) { this.hand = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerLinksSendEventData {
        private Player player;
        private java.util.List<String> links;
        private boolean cancelled;
        public PlayerLinksSendEventData() {
        }
        public PlayerLinksSendEventData(Player player, java.util.List<String> links, boolean cancelled) {
            this.player = player;
            this.links = links;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public java.util.List<String> getLinks() { return links; }
        public void setLinks(java.util.List<String> value) { this.links = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerPickupArrowEventData {
        private Player player;
        private int arrowId;
        private boolean cancelled;
        public PlayerPickupArrowEventData() {
        }
        public PlayerPickupArrowEventData(Player player, int arrowId, boolean cancelled) {
            this.player = player;
            this.arrowId = arrowId;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getArrowId() { return arrowId; }
        public void setArrowId(int value) { this.arrowId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerRecipeBookClickEventData {
        private Player player;
        private String recipeId;
        private boolean makeAll;
        private boolean cancelled;
        public PlayerRecipeBookClickEventData() {
        }
        public PlayerRecipeBookClickEventData(Player player, String recipeId, boolean makeAll, boolean cancelled) {
            this.player = player;
            this.recipeId = recipeId;
            this.makeAll = makeAll;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getRecipeId() { return recipeId; }
        public void setRecipeId(String value) { this.recipeId = value; }
        public boolean isMakeAll() { return makeAll; }
        public void setMakeAll(boolean value) { this.makeAll = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerRecipeBookSettingsChangeEventData {
        private Player player;
        private String bookType;
        private boolean isOpen;
        private boolean isFiltering;
        private boolean cancelled;
        public PlayerRecipeBookSettingsChangeEventData() {
        }
        public PlayerRecipeBookSettingsChangeEventData(Player player, String bookType, boolean isOpen, boolean isFiltering, boolean cancelled) {
            this.player = player;
            this.bookType = bookType;
            this.isOpen = isOpen;
            this.isFiltering = isFiltering;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getBookType() { return bookType; }
        public void setBookType(String value) { this.bookType = value; }
        public boolean isIsOpen() { return isOpen; }
        public void setIsOpen(boolean value) { this.isOpen = value; }
        public boolean isIsFiltering() { return isFiltering; }
        public void setIsFiltering(boolean value) { this.isFiltering = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerRecipeDiscoverEventData {
        private Player player;
        private String recipeId;
        private boolean cancelled;
        public PlayerRecipeDiscoverEventData() {
        }
        public PlayerRecipeDiscoverEventData(Player player, String recipeId, boolean cancelled) {
            this.player = player;
            this.recipeId = recipeId;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getRecipeId() { return recipeId; }
        public void setRecipeId(String value) { this.recipeId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerRegisterChannelEventData {
        private Player player;
        private String channel;
        private boolean cancelled;
        public PlayerRegisterChannelEventData() {
        }
        public PlayerRegisterChannelEventData(Player player, String channel, boolean cancelled) {
            this.player = player;
            this.channel = channel;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getChannel() { return channel; }
        public void setChannel(String value) { this.channel = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerResourcePackStatusEventData {
        private Player player;
        private String packId;
        private String status;
        private boolean cancelled;
        public PlayerResourcePackStatusEventData() {
        }
        public PlayerResourcePackStatusEventData(Player player, String packId, String status, boolean cancelled) {
            this.player = player;
            this.packId = packId;
            this.status = status;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getPackId() { return packId; }
        public void setPackId(String value) { this.packId = value; }
        public String getStatus() { return status; }
        public void setStatus(String value) { this.status = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerSpawnLocationEventData {
        private Player player;
        private Position spawnPos;
        private boolean cancelled;
        public PlayerSpawnLocationEventData() {
        }
        public PlayerSpawnLocationEventData(Player player, Position spawnPos, boolean cancelled) {
            this.player = player;
            this.spawnPos = spawnPos;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public Position getSpawnPos() { return spawnPos; }
        public void setSpawnPos(Position value) { this.spawnPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PlayerUnregisterChannelEventData {
        private Player player;
        private String channel;
        private boolean cancelled;
        public PlayerUnregisterChannelEventData() {
        }
        public PlayerUnregisterChannelEventData(Player player, String channel, boolean cancelled) {
            this.player = player;
            this.channel = channel;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getChannel() { return channel; }
        public void setChannel(String value) { this.channel = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class RaidFinishEventData {
        private boolean victory;
        private boolean cancelled;
        public RaidFinishEventData() {
        }
        public RaidFinishEventData(boolean victory, boolean cancelled) {
            this.victory = victory;
            this.cancelled = cancelled;
        }
        public boolean isVictory() { return victory; }
        public void setVictory(boolean value) { this.victory = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class RaidSpawnWaveEventData {
        private int wave;
        private BlockPos pos;
        private boolean cancelled;
        public RaidSpawnWaveEventData() {
        }
        public RaidSpawnWaveEventData(int wave, BlockPos pos, boolean cancelled) {
            this.wave = wave;
            this.pos = pos;
            this.cancelled = cancelled;
        }
        public int getWave() { return wave; }
        public void setWave(int value) { this.wave = value; }
        public BlockPos getPos() { return pos; }
        public void setPos(BlockPos value) { this.pos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class RaidStopEventData {
        private String reason;
        private boolean cancelled;
        public RaidStopEventData() {
        }
        public RaidStopEventData(String reason, boolean cancelled) {
            this.reason = reason;
            this.cancelled = cancelled;
        }
        public String getReason() { return reason; }
        public void setReason(String value) { this.reason = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class RaidTriggerEventData {
        private BlockPos pos;
        private boolean cancelled;
        public RaidTriggerEventData() {
        }
        public RaidTriggerEventData(BlockPos pos, boolean cancelled) {
            this.pos = pos;
            this.cancelled = cancelled;
        }
        public BlockPos getPos() { return pos; }
        public void setPos(BlockPos value) { this.pos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockDamageEventData {
        private Player player;
        private BlockPos blockPos;
        private boolean instaBreak;
        private boolean cancelled;
        public BlockDamageEventData() {
        }
        public BlockDamageEventData(Player player, BlockPos blockPos, boolean instaBreak, boolean cancelled) {
            this.player = player;
            this.blockPos = blockPos;
            this.instaBreak = instaBreak;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public boolean isInstaBreak() { return instaBreak; }
        public void setInstaBreak(boolean value) { this.instaBreak = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockIgniteEventData {
        private BlockPos blockPos;
        private boolean cancelled;
        public BlockIgniteEventData() {
        }
        public BlockIgniteEventData(BlockPos blockPos, boolean cancelled) {
            this.blockPos = blockPos;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockFromToEventData {
        private BlockPos fromPos;
        private BlockPos toPos;
        private boolean cancelled;
        public BlockFromToEventData() {
        }
        public BlockFromToEventData(BlockPos fromPos, BlockPos toPos, boolean cancelled) {
            this.fromPos = fromPos;
            this.toPos = toPos;
            this.cancelled = cancelled;
        }
        public BlockPos getFromPos() { return fromPos; }
        public void setFromPos(BlockPos value) { this.fromPos = value; }
        public BlockPos getToPos() { return toPos; }
        public void setToPos(BlockPos value) { this.toPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockFormEventData {
        private BlockPos blockPos;
        private boolean cancelled;
        public BlockFormEventData() {
        }
        public BlockFormEventData(BlockPos blockPos, boolean cancelled) {
            this.blockPos = blockPos;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockFadeEventData {
        private BlockPos blockPos;
        private boolean cancelled;
        public BlockFadeEventData() {
        }
        public BlockFadeEventData(BlockPos blockPos, boolean cancelled) {
            this.blockPos = blockPos;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockDispenseEventData {
        private BlockPos blockPos;
        private String itemName;
        private boolean cancelled;
        public BlockDispenseEventData() {
        }
        public BlockDispenseEventData(BlockPos blockPos, String itemName, boolean cancelled) {
            this.blockPos = blockPos;
            this.itemName = itemName;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public String getItemName() { return itemName; }
        public void setItemName(String value) { this.itemName = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockExplodeEventData {
        private BlockPos blockPos;
        private float yieldRate;
        private boolean cancelled;
        public BlockExplodeEventData() {
        }
        public BlockExplodeEventData(BlockPos blockPos, float yieldRate, boolean cancelled) {
            this.blockPos = blockPos;
            this.yieldRate = yieldRate;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public float getYieldRate() { return yieldRate; }
        public void setYieldRate(float value) { this.yieldRate = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockPhysicsEventData {
        private BlockPos blockPos;
        private BlockPos changedPos;
        private boolean cancelled;
        public BlockPhysicsEventData() {
        }
        public BlockPhysicsEventData(BlockPos blockPos, BlockPos changedPos, boolean cancelled) {
            this.blockPos = blockPos;
            this.changedPos = changedPos;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public BlockPos getChangedPos() { return changedPos; }
        public void setChangedPos(BlockPos value) { this.changedPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockPistonExtendEventData {
        private BlockPos blockPos;
        private String direction;
        private boolean cancelled;
        public BlockPistonExtendEventData() {
        }
        public BlockPistonExtendEventData(BlockPos blockPos, String direction, boolean cancelled) {
            this.blockPos = blockPos;
            this.direction = direction;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public String getDirection() { return direction; }
        public void setDirection(String value) { this.direction = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockPistonRetractEventData {
        private BlockPos blockPos;
        private String direction;
        private boolean cancelled;
        public BlockPistonRetractEventData() {
        }
        public BlockPistonRetractEventData(BlockPos blockPos, String direction, boolean cancelled) {
            this.blockPos = blockPos;
            this.direction = direction;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public String getDirection() { return direction; }
        public void setDirection(String value) { this.direction = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class NotePlayEventData {
        private BlockPos blockPos;
        private String instrument;
        private int note;
        private boolean cancelled;
        public NotePlayEventData() {
        }
        public NotePlayEventData(BlockPos blockPos, String instrument, int note, boolean cancelled) {
            this.blockPos = blockPos;
            this.instrument = instrument;
            this.note = note;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public String getInstrument() { return instrument; }
        public void setInstrument(String value) { this.instrument = value; }
        public int getNote() { return note; }
        public void setNote(int value) { this.note = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class SignChangeEventData {
        private Player player;
        private BlockPos blockPos;
        private java.util.List<String> lines;
        private boolean cancelled;
        public SignChangeEventData() {
        }
        public SignChangeEventData(Player player, BlockPos blockPos, java.util.List<String> lines, boolean cancelled) {
            this.player = player;
            this.blockPos = blockPos;
            this.lines = lines;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public java.util.List<String> getLines() { return lines; }
        public void setLines(java.util.List<String> value) { this.lines = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class SpongeAbsorbEventData {
        private BlockPos blockPos;
        private boolean cancelled;
        public SpongeAbsorbEventData() {
        }
        public SpongeAbsorbEventData(BlockPos blockPos, boolean cancelled) {
            this.blockPos = blockPos;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class TntPrimeEventData {
        private BlockPos blockPos;
        private String primeReason;
        private boolean cancelled;
        public TntPrimeEventData() {
        }
        public TntPrimeEventData(BlockPos blockPos, String primeReason, boolean cancelled) {
            this.blockPos = blockPos;
            this.primeReason = primeReason;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public String getPrimeReason() { return primeReason; }
        public void setPrimeReason(String value) { this.primeReason = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class MapInitializeEventData {
        private int mapId;
        public MapInitializeEventData() {
        }
        public MapInitializeEventData(int mapId) {
            this.mapId = mapId;
        }
        public int getMapId() { return mapId; }
        public void setMapId(int value) { this.mapId = value; }
    }

    public static class HangingBreakEventData {
        private int entityId;
        private Integer removerEntityId;
        private boolean cancelled;
        public HangingBreakEventData() {
        }
        public HangingBreakEventData(int entityId, Integer removerEntityId, boolean cancelled) {
            this.entityId = entityId;
            this.removerEntityId = removerEntityId;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public Integer getRemoverEntityId() { return removerEntityId; }
        public void setRemoverEntityId(Integer value) { this.removerEntityId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class HangingBreakByEntityEventData {
        private int entityId;
        private int removerEntityId;
        private boolean cancelled;
        public HangingBreakByEntityEventData() {
        }
        public HangingBreakByEntityEventData(int entityId, int removerEntityId, boolean cancelled) {
            this.entityId = entityId;
            this.removerEntityId = removerEntityId;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public int getRemoverEntityId() { return removerEntityId; }
        public void setRemoverEntityId(int value) { this.removerEntityId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class HangingPlaceEventData {
        private int entityId;
        private Player player;
        private BlockPos blockPos;
        private String blockFace;
        private boolean cancelled;
        public HangingPlaceEventData() {
        }
        public HangingPlaceEventData(int entityId, Player player, BlockPos blockPos, String blockFace, boolean cancelled) {
            this.entityId = entityId;
            this.player = player;
            this.blockPos = blockPos;
            this.blockFace = blockFace;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public String getBlockFace() { return blockFace; }
        public void setBlockFace(String value) { this.blockFace = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BellResonateEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private boolean cancelled;
        public BellResonateEventData() {
        }
        public BellResonateEventData(BlockPos blockPos, World targetWorld, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BellRingEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private Integer entityId;
        private String direction;
        private boolean cancelled;
        public BellRingEventData() {
        }
        public BellRingEventData(BlockPos blockPos, World targetWorld, Integer entityId, String direction, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.entityId = entityId;
            this.direction = direction;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public Integer getEntityId() { return entityId; }
        public void setEntityId(Integer value) { this.entityId = value; }
        public String getDirection() { return direction; }
        public void setDirection(String value) { this.direction = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockBrushEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private Player player;
        private ItemStack item;
        private boolean cancelled;
        public BlockBrushEventData() {
        }
        public BlockBrushEventData(BlockPos blockPos, World targetWorld, Player player, ItemStack item, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.player = player;
            this.item = item;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public ItemStack getItem() { return item; }
        public void setItem(ItemStack value) { this.item = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockCookEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private ItemStack source;
        private ItemStack result;
        private boolean cancelled;
        public BlockCookEventData() {
        }
        public BlockCookEventData(BlockPos blockPos, World targetWorld, ItemStack source, ItemStack result, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.source = source;
            this.result = result;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public ItemStack getSource() { return source; }
        public void setSource(ItemStack value) { this.source = value; }
        public ItemStack getResult() { return result; }
        public void setResult(ItemStack value) { this.result = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockDamageAbortEventData {
        private Player player;
        private BlockPos blockPos;
        private World targetWorld;
        private ItemStack itemInHand;
        public BlockDamageAbortEventData() {
        }
        public BlockDamageAbortEventData(Player player, BlockPos blockPos, World targetWorld, ItemStack itemInHand) {
            this.player = player;
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.itemInHand = itemInHand;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public ItemStack getItemInHand() { return itemInHand; }
        public void setItemInHand(ItemStack value) { this.itemInHand = value; }
    }

    public static class BlockDispenseArmorEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private int targetEntityId;
        private ItemStack item;
        private boolean cancelled;
        public BlockDispenseArmorEventData() {
        }
        public BlockDispenseArmorEventData(BlockPos blockPos, World targetWorld, int targetEntityId, ItemStack item, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.targetEntityId = targetEntityId;
            this.item = item;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public int getTargetEntityId() { return targetEntityId; }
        public void setTargetEntityId(int value) { this.targetEntityId = value; }
        public ItemStack getItem() { return item; }
        public void setItem(ItemStack value) { this.item = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockDispenseLootEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private java.util.List<ItemStack> items;
        private boolean cancelled;
        public BlockDispenseLootEventData() {
        }
        public BlockDispenseLootEventData(BlockPos blockPos, World targetWorld, java.util.List<ItemStack> items, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.items = items;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public java.util.List<ItemStack> getItems() { return items; }
        public void setItems(java.util.List<ItemStack> value) { this.items = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockDropItemEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private Player player;
        private java.util.List<ItemStack> items;
        private boolean cancelled;
        public BlockDropItemEventData() {
        }
        public BlockDropItemEventData(BlockPos blockPos, World targetWorld, Player player, java.util.List<ItemStack> items, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.player = player;
            this.items = items;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public java.util.List<ItemStack> getItems() { return items; }
        public void setItems(java.util.List<ItemStack> value) { this.items = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockExpEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private int exp;
        public BlockExpEventData() {
        }
        public BlockExpEventData(BlockPos blockPos, World targetWorld, int exp) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.exp = exp;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public int getExp() { return exp; }
        public void setExp(int value) { this.exp = value; }
    }

    public static class BlockFertilizeEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private Player player;
        private java.util.List<Object> changedBlocks;
        private boolean cancelled;
        public BlockFertilizeEventData() {
        }
        public BlockFertilizeEventData(BlockPos blockPos, World targetWorld, Player player, java.util.List<Object> changedBlocks, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.player = player;
            this.changedBlocks = changedBlocks;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public java.util.List<Object> getChangedBlocks() { return changedBlocks; }
        public void setChangedBlocks(java.util.List<Object> value) { this.changedBlocks = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockMultiPlaceEventData {
        private Player player;
        private World targetWorld;
        private java.util.List<Object> placedBlocks;
        private boolean cancelled;
        public BlockMultiPlaceEventData() {
        }
        public BlockMultiPlaceEventData(Player player, World targetWorld, java.util.List<Object> placedBlocks, boolean cancelled) {
            this.player = player;
            this.targetWorld = targetWorld;
            this.placedBlocks = placedBlocks;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public java.util.List<Object> getPlacedBlocks() { return placedBlocks; }
        public void setPlacedBlocks(java.util.List<Object> value) { this.placedBlocks = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockReceiveGameEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private String gameEvent;
        private Integer sourceEntityId;
        private boolean cancelled;
        public BlockReceiveGameEventData() {
        }
        public BlockReceiveGameEventData(BlockPos blockPos, World targetWorld, String gameEvent, Integer sourceEntityId, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.gameEvent = gameEvent;
            this.sourceEntityId = sourceEntityId;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public String getGameEvent() { return gameEvent; }
        public void setGameEvent(String value) { this.gameEvent = value; }
        public Integer getSourceEntityId() { return sourceEntityId; }
        public void setSourceEntityId(Integer value) { this.sourceEntityId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockShearEntityEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private int targetEntityId;
        private ItemStack item;
        private boolean cancelled;
        public BlockShearEntityEventData() {
        }
        public BlockShearEntityEventData(BlockPos blockPos, World targetWorld, int targetEntityId, ItemStack item, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.targetEntityId = targetEntityId;
            this.item = item;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public int getTargetEntityId() { return targetEntityId; }
        public void setTargetEntityId(int value) { this.targetEntityId = value; }
        public ItemStack getItem() { return item; }
        public void setItem(ItemStack value) { this.item = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BlockSpreadEventData {
        private BlockPos sourcePos;
        private BlockPos targetPos;
        private World targetWorld;
        private int newStateId;
        private boolean cancelled;
        public BlockSpreadEventData() {
        }
        public BlockSpreadEventData(BlockPos sourcePos, BlockPos targetPos, World targetWorld, int newStateId, boolean cancelled) {
            this.sourcePos = sourcePos;
            this.targetPos = targetPos;
            this.targetWorld = targetWorld;
            this.newStateId = newStateId;
            this.cancelled = cancelled;
        }
        public BlockPos getSourcePos() { return sourcePos; }
        public void setSourcePos(BlockPos value) { this.sourcePos = value; }
        public BlockPos getTargetPos() { return targetPos; }
        public void setTargetPos(BlockPos value) { this.targetPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public int getNewStateId() { return newStateId; }
        public void setNewStateId(int value) { this.newStateId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BrewingStartEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private int brewingTime;
        private boolean cancelled;
        public BrewingStartEventData() {
        }
        public BrewingStartEventData(BlockPos blockPos, World targetWorld, int brewingTime, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.brewingTime = brewingTime;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public int getBrewingTime() { return brewingTime; }
        public void setBrewingTime(int value) { this.brewingTime = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class CampfireStartEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private ItemStack item;
        private int slot;
        private int cookingTime;
        private boolean cancelled;
        public CampfireStartEventData() {
        }
        public CampfireStartEventData(BlockPos blockPos, World targetWorld, ItemStack item, int slot, int cookingTime, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.item = item;
            this.slot = slot;
            this.cookingTime = cookingTime;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public ItemStack getItem() { return item; }
        public void setItem(ItemStack value) { this.item = value; }
        public int getSlot() { return slot; }
        public void setSlot(int value) { this.slot = value; }
        public int getCookingTime() { return cookingTime; }
        public void setCookingTime(int value) { this.cookingTime = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class CauldronLevelChangeEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private int oldLevel;
        private int newLevel;
        private String reason;
        private Integer entityId;
        private boolean cancelled;
        public CauldronLevelChangeEventData() {
        }
        public CauldronLevelChangeEventData(BlockPos blockPos, World targetWorld, int oldLevel, int newLevel, String reason, Integer entityId, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.oldLevel = oldLevel;
            this.newLevel = newLevel;
            this.reason = reason;
            this.entityId = entityId;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public int getOldLevel() { return oldLevel; }
        public void setOldLevel(int value) { this.oldLevel = value; }
        public int getNewLevel() { return newLevel; }
        public void setNewLevel(int value) { this.newLevel = value; }
        public String getReason() { return reason; }
        public void setReason(String value) { this.reason = value; }
        public Integer getEntityId() { return entityId; }
        public void setEntityId(Integer value) { this.entityId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class CrafterCraftEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private ItemStack result;
        private boolean cancelled;
        public CrafterCraftEventData() {
        }
        public CrafterCraftEventData(BlockPos blockPos, World targetWorld, ItemStack result, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.result = result;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public ItemStack getResult() { return result; }
        public void setResult(ItemStack value) { this.result = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntityBlockFormEventData {
        private int entityId;
        private BlockPos blockPos;
        private World targetWorld;
        private int newStateId;
        private boolean cancelled;
        public EntityBlockFormEventData() {
        }
        public EntityBlockFormEventData(int entityId, BlockPos blockPos, World targetWorld, int newStateId, boolean cancelled) {
            this.entityId = entityId;
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.newStateId = newStateId;
            this.cancelled = cancelled;
        }
        public int getEntityId() { return entityId; }
        public void setEntityId(int value) { this.entityId = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public int getNewStateId() { return newStateId; }
        public void setNewStateId(int value) { this.newStateId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class FluidLevelChangeEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private int newStateId;
        private boolean cancelled;
        public FluidLevelChangeEventData() {
        }
        public FluidLevelChangeEventData(BlockPos blockPos, World targetWorld, int newStateId, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.newStateId = newStateId;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public int getNewStateId() { return newStateId; }
        public void setNewStateId(int value) { this.newStateId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class InventoryBlockStartEventData {
        private BlockPos blockPos;
        private World targetWorld;
        public InventoryBlockStartEventData() {
        }
        public InventoryBlockStartEventData(BlockPos blockPos, World targetWorld) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
    }

    public static class LeavesDecayEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private boolean cancelled;
        public LeavesDecayEventData() {
        }
        public LeavesDecayEventData(BlockPos blockPos, World targetWorld, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class MoistureChangeEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private int newMoisture;
        private boolean cancelled;
        public MoistureChangeEventData() {
        }
        public MoistureChangeEventData(BlockPos blockPos, World targetWorld, int newMoisture, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.newMoisture = newMoisture;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public int getNewMoisture() { return newMoisture; }
        public void setNewMoisture(int value) { this.newMoisture = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class SculkBloomEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private int charge;
        private boolean cancelled;
        public SculkBloomEventData() {
        }
        public SculkBloomEventData(BlockPos blockPos, World targetWorld, int charge, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.charge = charge;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public int getCharge() { return charge; }
        public void setCharge(int value) { this.charge = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class VaultDisplayItemEventData {
        private BlockPos blockPos;
        private World targetWorld;
        private ItemStack item;
        private boolean cancelled;
        public VaultDisplayItemEventData() {
        }
        public VaultDisplayItemEventData(BlockPos blockPos, World targetWorld, ItemStack item, boolean cancelled) {
            this.blockPos = blockPos;
            this.targetWorld = targetWorld;
            this.item = item;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public ItemStack getItem() { return item; }
        public void setItem(ItemStack value) { this.item = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class WeatherChangeEventData {
        private World targetWorld;
        private boolean toWeatherState;
        private boolean cancelled;
        public WeatherChangeEventData() {
        }
        public WeatherChangeEventData(World targetWorld, boolean toWeatherState, boolean cancelled) {
            this.targetWorld = targetWorld;
            this.toWeatherState = toWeatherState;
            this.cancelled = cancelled;
        }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public boolean isToWeatherState() { return toWeatherState; }
        public void setToWeatherState(boolean value) { this.toWeatherState = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class ThunderChangeEventData {
        private World targetWorld;
        private boolean toThunderState;
        private boolean cancelled;
        public ThunderChangeEventData() {
        }
        public ThunderChangeEventData(World targetWorld, boolean toThunderState, boolean cancelled) {
            this.targetWorld = targetWorld;
            this.toThunderState = toThunderState;
            this.cancelled = cancelled;
        }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public boolean isToThunderState() { return toThunderState; }
        public void setToThunderState(boolean value) { this.toThunderState = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class WorldLoadEventData {
        private World targetWorld;
        public WorldLoadEventData() {
        }
        public WorldLoadEventData(World targetWorld) {
            this.targetWorld = targetWorld;
        }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
    }

    public static class WorldUnloadEventData {
        private World targetWorld;
        private boolean cancelled;
        public WorldUnloadEventData() {
        }
        public WorldUnloadEventData(World targetWorld, boolean cancelled) {
            this.targetWorld = targetWorld;
            this.cancelled = cancelled;
        }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class AsyncStructureGenerateEventData {
        private String worldName;
        private String structureName;
        private BlockPos pos;
        private boolean cancelled;
        public AsyncStructureGenerateEventData() {
        }
        public AsyncStructureGenerateEventData(String worldName, String structureName, BlockPos pos, boolean cancelled) {
            this.worldName = worldName;
            this.structureName = structureName;
            this.pos = pos;
            this.cancelled = cancelled;
        }
        public String getWorldName() { return worldName; }
        public void setWorldName(String value) { this.worldName = value; }
        public String getStructureName() { return structureName; }
        public void setStructureName(String value) { this.structureName = value; }
        public BlockPos getPos() { return pos; }
        public void setPos(BlockPos value) { this.pos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class AsyncStructureSpawnEventData {
        private String worldName;
        private String structureName;
        private BlockPos pos;
        private boolean cancelled;
        public AsyncStructureSpawnEventData() {
        }
        public AsyncStructureSpawnEventData(String worldName, String structureName, BlockPos pos, boolean cancelled) {
            this.worldName = worldName;
            this.structureName = structureName;
            this.pos = pos;
            this.cancelled = cancelled;
        }
        public String getWorldName() { return worldName; }
        public void setWorldName(String value) { this.worldName = value; }
        public String getStructureName() { return structureName; }
        public void setStructureName(String value) { this.structureName = value; }
        public BlockPos getPos() { return pos; }
        public void setPos(BlockPos value) { this.pos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class ChunkPopulateEventData {
        private int chunkX;
        private int chunkZ;
        private boolean cancelled;
        public ChunkPopulateEventData() {
        }
        public ChunkPopulateEventData(int chunkX, int chunkZ, boolean cancelled) {
            this.chunkX = chunkX;
            this.chunkZ = chunkZ;
            this.cancelled = cancelled;
        }
        public int getChunkX() { return chunkX; }
        public void setChunkX(int value) { this.chunkX = value; }
        public int getChunkZ() { return chunkZ; }
        public void setChunkZ(int value) { this.chunkZ = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class ChunkUnloadEventData {
        private int chunkX;
        private int chunkZ;
        private boolean cancelled;
        public ChunkUnloadEventData() {
        }
        public ChunkUnloadEventData(int chunkX, int chunkZ, boolean cancelled) {
            this.chunkX = chunkX;
            this.chunkZ = chunkZ;
            this.cancelled = cancelled;
        }
        public int getChunkX() { return chunkX; }
        public void setChunkX(int value) { this.chunkX = value; }
        public int getChunkZ() { return chunkZ; }
        public void setChunkZ(int value) { this.chunkZ = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntitiesLoadEventData {
        private int chunkX;
        private int chunkZ;
        private int entityCount;
        private boolean cancelled;
        public EntitiesLoadEventData() {
        }
        public EntitiesLoadEventData(int chunkX, int chunkZ, int entityCount, boolean cancelled) {
            this.chunkX = chunkX;
            this.chunkZ = chunkZ;
            this.entityCount = entityCount;
            this.cancelled = cancelled;
        }
        public int getChunkX() { return chunkX; }
        public void setChunkX(int value) { this.chunkX = value; }
        public int getChunkZ() { return chunkZ; }
        public void setChunkZ(int value) { this.chunkZ = value; }
        public int getEntityCount() { return entityCount; }
        public void setEntityCount(int value) { this.entityCount = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EntitiesUnloadEventData {
        private int chunkX;
        private int chunkZ;
        private int entityCount;
        private boolean cancelled;
        public EntitiesUnloadEventData() {
        }
        public EntitiesUnloadEventData(int chunkX, int chunkZ, int entityCount, boolean cancelled) {
            this.chunkX = chunkX;
            this.chunkZ = chunkZ;
            this.entityCount = entityCount;
            this.cancelled = cancelled;
        }
        public int getChunkX() { return chunkX; }
        public void setChunkX(int value) { this.chunkX = value; }
        public int getChunkZ() { return chunkZ; }
        public void setChunkZ(int value) { this.chunkZ = value; }
        public int getEntityCount() { return entityCount; }
        public void setEntityCount(int value) { this.entityCount = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class GenericGameEventData {
        private String eventId;
        private Position pos;
        private boolean cancelled;
        public GenericGameEventData() {
        }
        public GenericGameEventData(String eventId, Position pos, boolean cancelled) {
            this.eventId = eventId;
            this.pos = pos;
            this.cancelled = cancelled;
        }
        public String getEventId() { return eventId; }
        public void setEventId(String value) { this.eventId = value; }
        public Position getPos() { return pos; }
        public void setPos(Position value) { this.pos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class LootGenerateEventData {
        private String lootTable;
        private boolean cancelled;
        public LootGenerateEventData() {
        }
        public LootGenerateEventData(String lootTable, boolean cancelled) {
            this.lootTable = lootTable;
            this.cancelled = cancelled;
        }
        public String getLootTable() { return lootTable; }
        public void setLootTable(String value) { this.lootTable = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PortalCreateEventData {
        private BlockPos pos;
        private String portalType;
        private boolean cancelled;
        public PortalCreateEventData() {
        }
        public PortalCreateEventData(BlockPos pos, String portalType, boolean cancelled) {
            this.pos = pos;
            this.portalType = portalType;
            this.cancelled = cancelled;
        }
        public BlockPos getPos() { return pos; }
        public void setPos(BlockPos value) { this.pos = value; }
        public String getPortalType() { return portalType; }
        public void setPortalType(String value) { this.portalType = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class StructureGrowEventData {
        private BlockPos pos;
        private String species;
        private boolean boneMeal;
        private boolean cancelled;
        public StructureGrowEventData() {
        }
        public StructureGrowEventData(BlockPos pos, String species, boolean boneMeal, boolean cancelled) {
            this.pos = pos;
            this.species = species;
            this.boneMeal = boneMeal;
            this.cancelled = cancelled;
        }
        public BlockPos getPos() { return pos; }
        public void setPos(BlockPos value) { this.pos = value; }
        public String getSpecies() { return species; }
        public void setSpecies(String value) { this.species = value; }
        public boolean isBoneMeal() { return boneMeal; }
        public void setBoneMeal(boolean value) { this.boneMeal = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class TimeSkipEventData {
        private long skipAmount;
        private boolean cancelled;
        public TimeSkipEventData() {
        }
        public TimeSkipEventData(long skipAmount, boolean cancelled) {
            this.skipAmount = skipAmount;
            this.cancelled = cancelled;
        }
        public long getSkipAmount() { return skipAmount; }
        public void setSkipAmount(long value) { this.skipAmount = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class WorldInitEventData {
        private World targetWorld;
        public WorldInitEventData() {
        }
        public WorldInitEventData(World targetWorld) {
            this.targetWorld = targetWorld;
        }
        public World getTargetWorld() { return targetWorld; }
        public void setTargetWorld(World value) { this.targetWorld = value; }
    }

    public static class WorldSaveEventData {
        private String worldName;
        private boolean cancelled;
        public WorldSaveEventData() {
        }
        public WorldSaveEventData(String worldName, boolean cancelled) {
            this.worldName = worldName;
            this.cancelled = cancelled;
        }
        public String getWorldName() { return worldName; }
        public void setWorldName(String value) { this.worldName = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class InventoryOpenEventData {
        private Player player;
        private boolean cancelled;
        public InventoryOpenEventData() {
        }
        public InventoryOpenEventData(Player player, boolean cancelled) {
            this.player = player;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class InventoryDragEventData {
        private Player player;
        private boolean cancelled;
        public InventoryDragEventData() {
        }
        public InventoryDragEventData(Player player, boolean cancelled) {
            this.player = player;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class CraftItemEventData {
        private Player player;
        private String recipeId;
        private boolean cancelled;
        public CraftItemEventData() {
        }
        public CraftItemEventData(Player player, String recipeId, boolean cancelled) {
            this.player = player;
            this.recipeId = recipeId;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getRecipeId() { return recipeId; }
        public void setRecipeId(String value) { this.recipeId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class FurnaceSmeltEventData {
        private BlockPos blockPos;
        private String sourceItem;
        private String resultItem;
        private boolean cancelled;
        public FurnaceSmeltEventData() {
        }
        public FurnaceSmeltEventData(BlockPos blockPos, String sourceItem, String resultItem, boolean cancelled) {
            this.blockPos = blockPos;
            this.sourceItem = sourceItem;
            this.resultItem = resultItem;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public String getSourceItem() { return sourceItem; }
        public void setSourceItem(String value) { this.sourceItem = value; }
        public String getResultItem() { return resultItem; }
        public void setResultItem(String value) { this.resultItem = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BrewEventData {
        private BlockPos blockPos;
        private int fuelLevel;
        private boolean cancelled;
        public BrewEventData() {
        }
        public BrewEventData(BlockPos blockPos, int fuelLevel, boolean cancelled) {
            this.blockPos = blockPos;
            this.fuelLevel = fuelLevel;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public int getFuelLevel() { return fuelLevel; }
        public void setFuelLevel(int value) { this.fuelLevel = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class BrewingStandFuelEventData {
        private BlockPos blockPos;
        private int fuelPower;
        private boolean cancelled;
        public BrewingStandFuelEventData() {
        }
        public BrewingStandFuelEventData(BlockPos blockPos, int fuelPower, boolean cancelled) {
            this.blockPos = blockPos;
            this.fuelPower = fuelPower;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public int getFuelPower() { return fuelPower; }
        public void setFuelPower(int value) { this.fuelPower = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class FurnaceBurnEventData {
        private BlockPos blockPos;
        private String fuelItem;
        private int burnTime;
        private boolean cancelled;
        public FurnaceBurnEventData() {
        }
        public FurnaceBurnEventData(BlockPos blockPos, String fuelItem, int burnTime, boolean cancelled) {
            this.blockPos = blockPos;
            this.fuelItem = fuelItem;
            this.burnTime = burnTime;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public String getFuelItem() { return fuelItem; }
        public void setFuelItem(String value) { this.fuelItem = value; }
        public int getBurnTime() { return burnTime; }
        public void setBurnTime(int value) { this.burnTime = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class FurnaceExtractEventData {
        private Player player;
        private BlockPos blockPos;
        private String itemId;
        private int itemAmount;
        private float expGained;
        public FurnaceExtractEventData() {
        }
        public FurnaceExtractEventData(Player player, BlockPos blockPos, String itemId, int itemAmount, float expGained) {
            this.player = player;
            this.blockPos = blockPos;
            this.itemId = itemId;
            this.itemAmount = itemAmount;
            this.expGained = expGained;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public String getItemId() { return itemId; }
        public void setItemId(String value) { this.itemId = value; }
        public int getItemAmount() { return itemAmount; }
        public void setItemAmount(int value) { this.itemAmount = value; }
        public float getExpGained() { return expGained; }
        public void setExpGained(float value) { this.expGained = value; }
    }

    public static class FurnaceStartSmeltEventData {
        private BlockPos blockPos;
        private String sourceItem;
        private int cookingTime;
        private boolean cancelled;
        public FurnaceStartSmeltEventData() {
        }
        public FurnaceStartSmeltEventData(BlockPos blockPos, String sourceItem, int cookingTime, boolean cancelled) {
            this.blockPos = blockPos;
            this.sourceItem = sourceItem;
            this.cookingTime = cookingTime;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public String getSourceItem() { return sourceItem; }
        public void setSourceItem(String value) { this.sourceItem = value; }
        public int getCookingTime() { return cookingTime; }
        public void setCookingTime(int value) { this.cookingTime = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class HopperInventorySearchEventData {
        private BlockPos blockPos;
        private BlockPos searchPos;
        private boolean cancelled;
        public HopperInventorySearchEventData() {
        }
        public HopperInventorySearchEventData(BlockPos blockPos, BlockPos searchPos, boolean cancelled) {
            this.blockPos = blockPos;
            this.searchPos = searchPos;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public BlockPos getSearchPos() { return searchPos; }
        public void setSearchPos(BlockPos value) { this.searchPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class InventoryCreativeEventData {
        private Player player;
        private int slot;
        private String itemId;
        private int itemCount;
        private boolean cancelled;
        public InventoryCreativeEventData() {
        }
        public InventoryCreativeEventData(Player player, int slot, String itemId, int itemCount, boolean cancelled) {
            this.player = player;
            this.slot = slot;
            this.itemId = itemId;
            this.itemCount = itemCount;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getSlot() { return slot; }
        public void setSlot(int value) { this.slot = value; }
        public String getItemId() { return itemId; }
        public void setItemId(String value) { this.itemId = value; }
        public int getItemCount() { return itemCount; }
        public void setItemCount(int value) { this.itemCount = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class InventoryInteractEventData {
        private Player player;
        private boolean cancelled;
        public InventoryInteractEventData() {
        }
        public InventoryInteractEventData(Player player, boolean cancelled) {
            this.player = player;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class InventoryMoveItemEventData {
        private BlockPos sourcePos;
        private BlockPos targetPos;
        private String itemId;
        private int itemAmount;
        private boolean cancelled;
        public InventoryMoveItemEventData() {
        }
        public InventoryMoveItemEventData(BlockPos sourcePos, BlockPos targetPos, String itemId, int itemAmount, boolean cancelled) {
            this.sourcePos = sourcePos;
            this.targetPos = targetPos;
            this.itemId = itemId;
            this.itemAmount = itemAmount;
            this.cancelled = cancelled;
        }
        public BlockPos getSourcePos() { return sourcePos; }
        public void setSourcePos(BlockPos value) { this.sourcePos = value; }
        public BlockPos getTargetPos() { return targetPos; }
        public void setTargetPos(BlockPos value) { this.targetPos = value; }
        public String getItemId() { return itemId; }
        public void setItemId(String value) { this.itemId = value; }
        public int getItemAmount() { return itemAmount; }
        public void setItemAmount(int value) { this.itemAmount = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class InventoryPickupItemEventData {
        private BlockPos blockPos;
        private int itemEntityId;
        private String itemId;
        private boolean cancelled;
        public InventoryPickupItemEventData() {
        }
        public InventoryPickupItemEventData(BlockPos blockPos, int itemEntityId, String itemId, boolean cancelled) {
            this.blockPos = blockPos;
            this.itemEntityId = itemEntityId;
            this.itemId = itemId;
            this.cancelled = cancelled;
        }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public int getItemEntityId() { return itemEntityId; }
        public void setItemEntityId(int value) { this.itemEntityId = value; }
        public String getItemId() { return itemId; }
        public void setItemId(String value) { this.itemId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PrepareAnvilEventData {
        private Player player;
        private String renameText;
        private int repairCost;
        public PrepareAnvilEventData() {
        }
        public PrepareAnvilEventData(Player player, String renameText, int repairCost) {
            this.player = player;
            this.renameText = renameText;
            this.repairCost = repairCost;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getRenameText() { return renameText; }
        public void setRenameText(String value) { this.renameText = value; }
        public int getRepairCost() { return repairCost; }
        public void setRepairCost(int value) { this.repairCost = value; }
    }

    public static class PrepareGrindstoneEventData {
        private Player player;
        private String resultItem;
        public PrepareGrindstoneEventData() {
        }
        public PrepareGrindstoneEventData(Player player, String resultItem) {
            this.player = player;
            this.resultItem = resultItem;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getResultItem() { return resultItem; }
        public void setResultItem(String value) { this.resultItem = value; }
    }

    public static class PrepareInventoryResultEventData {
        private Player player;
        private String resultItem;
        public PrepareInventoryResultEventData() {
        }
        public PrepareInventoryResultEventData(Player player, String resultItem) {
            this.player = player;
            this.resultItem = resultItem;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getResultItem() { return resultItem; }
        public void setResultItem(String value) { this.resultItem = value; }
    }

    public static class PrepareItemCraftEventData {
        private Player player;
        private String recipeId;
        private boolean cancelled;
        public PrepareItemCraftEventData() {
        }
        public PrepareItemCraftEventData(Player player, String recipeId, boolean cancelled) {
            this.player = player;
            this.recipeId = recipeId;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getRecipeId() { return recipeId; }
        public void setRecipeId(String value) { this.recipeId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class PrepareSmithingEventData {
        private Player player;
        private String resultItem;
        public PrepareSmithingEventData() {
        }
        public PrepareSmithingEventData(Player player, String resultItem) {
            this.player = player;
            this.resultItem = resultItem;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getResultItem() { return resultItem; }
        public void setResultItem(String value) { this.resultItem = value; }
    }

    public static class SmithItemEventData {
        private Player player;
        private String recipeId;
        private boolean cancelled;
        public SmithItemEventData() {
        }
        public SmithItemEventData(Player player, String recipeId, boolean cancelled) {
            this.player = player;
            this.recipeId = recipeId;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public String getRecipeId() { return recipeId; }
        public void setRecipeId(String value) { this.recipeId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class TradeSelectEventData {
        private Player player;
        private int slotIndex;
        private boolean cancelled;
        public TradeSelectEventData() {
        }
        public TradeSelectEventData(Player player, int slotIndex, boolean cancelled) {
            this.player = player;
            this.slotIndex = slotIndex;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public int getSlotIndex() { return slotIndex; }
        public void setSlotIndex(int value) { this.slotIndex = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class VehicleBlockCollisionEventData {
        private int vehicleId;
        private BlockPos blockPos;
        private boolean cancelled;
        public VehicleBlockCollisionEventData() {
        }
        public VehicleBlockCollisionEventData(int vehicleId, BlockPos blockPos, boolean cancelled) {
            this.vehicleId = vehicleId;
            this.blockPos = blockPos;
            this.cancelled = cancelled;
        }
        public int getVehicleId() { return vehicleId; }
        public void setVehicleId(int value) { this.vehicleId = value; }
        public BlockPos getBlockPos() { return blockPos; }
        public void setBlockPos(BlockPos value) { this.blockPos = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class VehicleCollisionEventData {
        private int vehicleId;
        private boolean cancelled;
        public VehicleCollisionEventData() {
        }
        public VehicleCollisionEventData(int vehicleId, boolean cancelled) {
            this.vehicleId = vehicleId;
            this.cancelled = cancelled;
        }
        public int getVehicleId() { return vehicleId; }
        public void setVehicleId(int value) { this.vehicleId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class VehicleCreateEventData {
        private int vehicleId;
        private boolean cancelled;
        public VehicleCreateEventData() {
        }
        public VehicleCreateEventData(int vehicleId, boolean cancelled) {
            this.vehicleId = vehicleId;
            this.cancelled = cancelled;
        }
        public int getVehicleId() { return vehicleId; }
        public void setVehicleId(int value) { this.vehicleId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class VehicleDamageEventData {
        private int vehicleId;
        private float damage;
        private Integer attackerId;
        private boolean cancelled;
        public VehicleDamageEventData() {
        }
        public VehicleDamageEventData(int vehicleId, float damage, Integer attackerId, boolean cancelled) {
            this.vehicleId = vehicleId;
            this.damage = damage;
            this.attackerId = attackerId;
            this.cancelled = cancelled;
        }
        public int getVehicleId() { return vehicleId; }
        public void setVehicleId(int value) { this.vehicleId = value; }
        public float getDamage() { return damage; }
        public void setDamage(float value) { this.damage = value; }
        public Integer getAttackerId() { return attackerId; }
        public void setAttackerId(Integer value) { this.attackerId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class VehicleDestroyEventData {
        private int vehicleId;
        private Integer attackerId;
        private boolean cancelled;
        public VehicleDestroyEventData() {
        }
        public VehicleDestroyEventData(int vehicleId, Integer attackerId, boolean cancelled) {
            this.vehicleId = vehicleId;
            this.attackerId = attackerId;
            this.cancelled = cancelled;
        }
        public int getVehicleId() { return vehicleId; }
        public void setVehicleId(int value) { this.vehicleId = value; }
        public Integer getAttackerId() { return attackerId; }
        public void setAttackerId(Integer value) { this.attackerId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class VehicleEnterEventData {
        private int vehicleId;
        private int enteredId;
        private boolean cancelled;
        public VehicleEnterEventData() {
        }
        public VehicleEnterEventData(int vehicleId, int enteredId, boolean cancelled) {
            this.vehicleId = vehicleId;
            this.enteredId = enteredId;
            this.cancelled = cancelled;
        }
        public int getVehicleId() { return vehicleId; }
        public void setVehicleId(int value) { this.vehicleId = value; }
        public int getEnteredId() { return enteredId; }
        public void setEnteredId(int value) { this.enteredId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class VehicleEntityCollisionEventData {
        private int vehicleId;
        private int collidedEntityId;
        private boolean cancelled;
        public VehicleEntityCollisionEventData() {
        }
        public VehicleEntityCollisionEventData(int vehicleId, int collidedEntityId, boolean cancelled) {
            this.vehicleId = vehicleId;
            this.collidedEntityId = collidedEntityId;
            this.cancelled = cancelled;
        }
        public int getVehicleId() { return vehicleId; }
        public void setVehicleId(int value) { this.vehicleId = value; }
        public int getCollidedEntityId() { return collidedEntityId; }
        public void setCollidedEntityId(int value) { this.collidedEntityId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class VehicleExitEventData {
        private int vehicleId;
        private int exitedId;
        private boolean cancelled;
        public VehicleExitEventData() {
        }
        public VehicleExitEventData(int vehicleId, int exitedId, boolean cancelled) {
            this.vehicleId = vehicleId;
            this.exitedId = exitedId;
            this.cancelled = cancelled;
        }
        public int getVehicleId() { return vehicleId; }
        public void setVehicleId(int value) { this.vehicleId = value; }
        public int getExitedId() { return exitedId; }
        public void setExitedId(int value) { this.exitedId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class VehicleMoveEventData {
        private int vehicleId;
        private Position fromPosition;
        private Position toPosition;
        private boolean cancelled;
        public VehicleMoveEventData() {
        }
        public VehicleMoveEventData(int vehicleId, Position fromPosition, Position toPosition, boolean cancelled) {
            this.vehicleId = vehicleId;
            this.fromPosition = fromPosition;
            this.toPosition = toPosition;
            this.cancelled = cancelled;
        }
        public int getVehicleId() { return vehicleId; }
        public void setVehicleId(int value) { this.vehicleId = value; }
        public Position getFromPosition() { return fromPosition; }
        public void setFromPosition(Position value) { this.fromPosition = value; }
        public Position getToPosition() { return toPosition; }
        public void setToPosition(Position value) { this.toPosition = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class VehicleUpdateEventData {
        private int vehicleId;
        private boolean cancelled;
        public VehicleUpdateEventData() {
        }
        public VehicleUpdateEventData(int vehicleId, boolean cancelled) {
            this.vehicleId = vehicleId;
            this.cancelled = cancelled;
        }
        public int getVehicleId() { return vehicleId; }
        public void setVehicleId(int value) { this.vehicleId = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EnchantmentOffer {
        private int cost;
        private int enchantmentId;
        private int enchantmentLevel;
        public EnchantmentOffer() {
        }
        public EnchantmentOffer(int cost, int enchantmentId, int enchantmentLevel) {
            this.cost = cost;
            this.enchantmentId = enchantmentId;
            this.enchantmentLevel = enchantmentLevel;
        }
        public int getCost() { return cost; }
        public void setCost(int value) { this.cost = value; }
        public int getEnchantmentId() { return enchantmentId; }
        public void setEnchantmentId(int value) { this.enchantmentId = value; }
        public int getEnchantmentLevel() { return enchantmentLevel; }
        public void setEnchantmentLevel(int value) { this.enchantmentLevel = value; }
    }

    public static class PrepareItemEnchantEventData {
        private Player player;
        private ItemStack item;
        private java.util.List<Object> offers;
        private int bookshelfCount;
        private boolean cancelled;
        public PrepareItemEnchantEventData() {
        }
        public PrepareItemEnchantEventData(Player player, ItemStack item, java.util.List<Object> offers, int bookshelfCount, boolean cancelled) {
            this.player = player;
            this.item = item;
            this.offers = offers;
            this.bookshelfCount = bookshelfCount;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public ItemStack getItem() { return item; }
        public void setItem(ItemStack value) { this.item = value; }
        public java.util.List<Object> getOffers() { return offers; }
        public void setOffers(java.util.List<Object> value) { this.offers = value; }
        public int getBookshelfCount() { return bookshelfCount; }
        public void setBookshelfCount(int value) { this.bookshelfCount = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class EnchantmentValue {
        private Object enchantment;
        private int level;
        public EnchantmentValue() {
        }
        public EnchantmentValue(Object enchantment, int level) {
            this.enchantment = enchantment;
            this.level = level;
        }
        public Object getEnchantment() { return enchantment; }
        public void setEnchantment(Object value) { this.enchantment = value; }
        public int getLevel() { return level; }
        public void setLevel(int value) { this.level = value; }
    }

    public static class EnchantItemEventData {
        private Player player;
        private ItemStack item;
        private int option;
        private int cost;
        private java.util.List<Object> enchantmentsToAdd;
        private boolean cancelled;
        public EnchantItemEventData() {
        }
        public EnchantItemEventData(Player player, ItemStack item, int option, int cost, java.util.List<Object> enchantmentsToAdd, boolean cancelled) {
            this.player = player;
            this.item = item;
            this.option = option;
            this.cost = cost;
            this.enchantmentsToAdd = enchantmentsToAdd;
            this.cancelled = cancelled;
        }
        public Player getPlayer() { return player; }
        public void setPlayer(Player value) { this.player = value; }
        public ItemStack getItem() { return item; }
        public void setItem(ItemStack value) { this.item = value; }
        public int getOption() { return option; }
        public void setOption(int value) { this.option = value; }
        public int getCost() { return cost; }
        public void setCost(int value) { this.cost = value; }
        public java.util.List<Object> getEnchantmentsToAdd() { return enchantmentsToAdd; }
        public void setEnchantmentsToAdd(java.util.List<Object> value) { this.enchantmentsToAdd = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static class LightningStrikeEventData {
        private Position position;
        private boolean isEffect;
        private boolean cancelled;
        public LightningStrikeEventData() {
        }
        public LightningStrikeEventData(Position position, boolean isEffect, boolean cancelled) {
            this.position = position;
            this.isEffect = isEffect;
            this.cancelled = cancelled;
        }
        public Position getPosition() { return position; }
        public void setPosition(Position value) { this.position = value; }
        public boolean isIsEffect() { return isEffect; }
        public void setIsEffect(boolean value) { this.isEffect = value; }
        public boolean isCancelled() { return cancelled; }
        public void setCancelled(boolean value) { this.cancelled = value; }
    }

    public static final class PlayerJoinEvent extends Event {
        private final PlayerJoinEventData value;
        public PlayerJoinEvent(PlayerJoinEventData value) { this.value = value; }
        public PlayerJoinEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public TextComponent getJoinMessage() { return value.getJoinMessage(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerLeaveEvent extends Event {
        private final PlayerLeaveEventData value;
        public PlayerLeaveEvent(PlayerLeaveEventData value) { this.value = value; }
        public PlayerLeaveEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public TextComponent getLeaveMessage() { return value.getLeaveMessage(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerLoginEvent extends Event {
        private final PlayerLoginEventData value;
        public PlayerLoginEvent(PlayerLoginEventData value) { this.value = value; }
        public PlayerLoginEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public TextComponent getKickMessage() { return value.getKickMessage(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerChatEvent extends Event {
        private final PlayerChatEventData value;
        public PlayerChatEvent(PlayerChatEventData value) { this.value = value; }
        public PlayerChatEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getMessage() { return value.getMessage(); }
        public java.util.List<Player> getRecipients() { return value.getRecipients(); }
        public java.util.List<Integer> getSignature() { return value.getSignature(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerCommandSendEvent extends Event {
        private final PlayerCommandSendEventData value;
        public PlayerCommandSendEvent(PlayerCommandSendEventData value) { this.value = value; }
        public PlayerCommandSendEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getCommand() { return value.getCommand(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerPermissionCheckEvent extends Event {
        private final PlayerPermissionCheckEventData value;
        public PlayerPermissionCheckEvent(PlayerPermissionCheckEventData value) { this.value = value; }
        public PlayerPermissionCheckEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getPermission() { return value.getPermission(); }
        public boolean isPermissionResult() { return value.isPermissionResult(); }
    }

    public static final class PlayerMoveEvent extends Event {
        private final PlayerMoveEventData value;
        public PlayerMoveEvent(PlayerMoveEventData value) { this.value = value; }
        public PlayerMoveEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public Position getFromPosition() { return value.getFromPosition(); }
        public Position getToPosition() { return value.getToPosition(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerTeleportEvent extends Event {
        private final PlayerTeleportEventData value;
        public PlayerTeleportEvent(PlayerTeleportEventData value) { this.value = value; }
        public PlayerTeleportEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public Position getFromPosition() { return value.getFromPosition(); }
        public Position getToPosition() { return value.getToPosition(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerChangeWorldEvent extends Event {
        private final PlayerChangeWorldEventData value;
        public PlayerChangeWorldEvent(PlayerChangeWorldEventData value) { this.value = value; }
        public PlayerChangeWorldEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public World getPreviousWorld() { return value.getPreviousWorld(); }
        public World getNewWorld() { return value.getNewWorld(); }
        public Position getPosition() { return value.getPosition(); }
        public float getYaw() { return value.getYaw(); }
        public float getPitch() { return value.getPitch(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerRespawnEvent extends Event {
        private final PlayerRespawnEventData value;
        public PlayerRespawnEvent(PlayerRespawnEventData value) { this.value = value; }
        public PlayerRespawnEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public World getPreviousWorld() { return value.getPreviousWorld(); }
        public World getRespawnedWorld() { return value.getRespawnedWorld(); }
        public Position getPosition() { return value.getPosition(); }
        public float getYaw() { return value.getYaw(); }
        public float getPitch() { return value.getPitch(); }
        public boolean isAlive() { return value.isAlive(); }
    }

    public static final class PlayerExpChangeEvent extends Event {
        private final PlayerExpChangeEventData value;
        public PlayerExpChangeEvent(PlayerExpChangeEventData value) { this.value = value; }
        public PlayerExpChangeEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getAmount() { return value.getAmount(); }
    }

    public static final class PlayerItemHeldEvent extends Event {
        private final PlayerItemHeldEventData value;
        public PlayerItemHeldEvent(PlayerItemHeldEventData value) { this.value = value; }
        public PlayerItemHeldEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getPreviousSlot() { return value.getPreviousSlot(); }
        public int getNewSlot() { return value.getNewSlot(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerChangedMainHandEvent extends Event {
        private final PlayerChangedMainHandEventData value;
        public PlayerChangedMainHandEvent(PlayerChangedMainHandEventData value) { this.value = value; }
        public PlayerChangedMainHandEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public Common.Hand getMainHand() { return value.getMainHand(); }
    }

    public static final class PlayerGamemodeChangeEvent extends Event {
        private final PlayerGamemodeChangeEventData value;
        public PlayerGamemodeChangeEvent(PlayerGamemodeChangeEventData value) { this.value = value; }
        public PlayerGamemodeChangeEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public Common.GameMode getPreviousGamemode() { return value.getPreviousGamemode(); }
        public Common.GameMode getNewGamemode() { return value.getNewGamemode(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerCustomPayloadEvent extends Event {
        private final PlayerCustomPayloadEventData value;
        public PlayerCustomPayloadEvent(PlayerCustomPayloadEventData value) { this.value = value; }
        public PlayerCustomPayloadEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getChannel() { return value.getChannel(); }
        public java.util.List<Integer> getData() { return value.getData(); }
    }

    public static final class PlayerFishEvent extends Event {
        private final PlayerFishEventData value;
        public PlayerFishEvent(PlayerFishEventData value) { this.value = value; }
        public PlayerFishEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public Uuid getCaughtUuid() { return value.getCaughtUuid(); }
        public String getCaughtType() { return value.getCaughtType(); }
        public Uuid getHookUuid() { return value.getHookUuid(); }
        public Object getState() { return value.getState(); }
        public Common.Hand getHand() { return value.getHand(); }
        public int getExpToDrop() { return value.getExpToDrop(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerEggThrowEvent extends Event {
        private final PlayerEggThrowEventData value;
        public PlayerEggThrowEvent(PlayerEggThrowEventData value) { this.value = value; }
        public PlayerEggThrowEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public Uuid getEggUuid() { return value.getEggUuid(); }
        public boolean isHatching() { return value.isHatching(); }
        public int getNumHatches() { return value.getNumHatches(); }
        public String getHatchingType() { return value.getHatchingType(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerInteractUnknownEntityEvent extends Event {
        private final PlayerInteractUnknownEntityEventData value;
        public PlayerInteractUnknownEntityEvent(PlayerInteractUnknownEntityEventData value) { this.value = value; }
        public PlayerInteractUnknownEntityEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getEntityId() { return value.getEntityId(); }
        public Object getAction() { return value.getAction(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerInteractEntityEvent extends Event {
        private final PlayerInteractEntityEventData value;
        public PlayerInteractEntityEvent(PlayerInteractEntityEventData value) { this.value = value; }
        public PlayerInteractEntityEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getEntityId() { return value.getEntityId(); }
        public Object getAction() { return value.getAction(); }
        public boolean isSneaking() { return value.isSneaking(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerInteractEvent extends Event {
        private final PlayerInteractEventData value;
        public PlayerInteractEvent(PlayerInteractEventData value) { this.value = value; }
        public PlayerInteractEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public Object getAction() { return value.getAction(); }
        public BlockPos getClickedPos() { return value.getClickedPos(); }
        public String getBlock() { return value.getBlock(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerToggleSneakEvent extends Event {
        private final PlayerToggleSneakEventData value;
        public PlayerToggleSneakEvent(PlayerToggleSneakEventData value) { this.value = value; }
        public PlayerToggleSneakEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public boolean isIsSneaking() { return value.isIsSneaking(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerToggleFlightEvent extends Event {
        private final PlayerToggleFlightEventData value;
        public PlayerToggleFlightEvent(PlayerToggleFlightEventData value) { this.value = value; }
        public PlayerToggleFlightEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public boolean isIsFlying() { return value.isIsFlying(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerToggleSprintEvent extends Event {
        private final PlayerToggleSprintEventData value;
        public PlayerToggleSprintEvent(PlayerToggleSprintEventData value) { this.value = value; }
        public PlayerToggleSprintEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public boolean isIsSprinting() { return value.isIsSprinting(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class InventoryClickEvent extends Event {
        private final InventoryClickEventData value;
        public InventoryClickEvent(InventoryClickEventData value) { this.value = value; }
        public InventoryClickEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public Object getWindowType() { return value.getWindowType(); }
        public Object getClickType() { return value.getClickType(); }
        public int getSlot() { return value.getSlot(); }
        public int getRawSlot() { return value.getRawSlot(); }
        public ItemStack getClickedItem() { return value.getClickedItem(); }
        public ItemStack getCursor() { return value.getCursor(); }
        public int getHotbarButton() { return value.getHotbarButton(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class InventoryCloseEvent extends Event {
        private final InventoryCloseEventData value;
        public InventoryCloseEvent(InventoryCloseEventData value) { this.value = value; }
        public InventoryCloseEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public Object getWindowType() { return value.getWindowType(); }
    }

    public static final class BlockRedstoneEvent extends Event {
        private final BlockRedstoneEventData value;
        public BlockRedstoneEvent(BlockRedstoneEventData value) { this.value = value; }
        public BlockRedstoneEventData getValue() { return value; }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public int getStateId() { return value.getStateId(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public int getOldCurrent() { return value.getOldCurrent(); }
        public int getNewCurrent() { return value.getNewCurrent(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockBreakEvent extends Event {
        private final BlockBreakEventData value;
        public BlockBreakEvent(BlockBreakEventData value) { this.value = value; }
        public BlockBreakEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getBlock() { return value.getBlock(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public int getExp() { return value.getExp(); }
        public boolean isShouldDrop() { return value.isShouldDrop(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockBurnEvent extends Event {
        private final BlockBurnEventData value;
        public BlockBurnEvent(BlockBurnEventData value) { this.value = value; }
        public BlockBurnEventData getValue() { return value; }
        public String getIgnitingBlock() { return value.getIgnitingBlock(); }
        public String getBlock() { return value.getBlock(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockCanBuildEvent extends Event {
        private final BlockCanBuildEventData value;
        public BlockCanBuildEvent(BlockCanBuildEventData value) { this.value = value; }
        public BlockCanBuildEventData getValue() { return value; }
        public String getBlockToBuild() { return value.getBlockToBuild(); }
        public boolean isBuildable() { return value.isBuildable(); }
        public Player getPlayer() { return value.getPlayer(); }
        public String getBlock() { return value.getBlock(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockGrowEvent extends Event {
        private final BlockGrowEventData value;
        public BlockGrowEvent(BlockGrowEventData value) { this.value = value; }
        public BlockGrowEventData getValue() { return value; }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public String getOldBlock() { return value.getOldBlock(); }
        public int getOldStateId() { return value.getOldStateId(); }
        public String getNewBlock() { return value.getNewBlock(); }
        public int getNewStateId() { return value.getNewStateId(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockPlaceEvent extends Event {
        private final BlockPlaceEventData value;
        public BlockPlaceEvent(BlockPlaceEventData value) { this.value = value; }
        public BlockPlaceEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getBlockPlaced() { return value.getBlockPlaced(); }
        public String getBlockPlacedAgainst() { return value.getBlockPlacedAgainst(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public boolean isCanBuild() { return value.isCanBuild(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class DialogClickActionEvent extends Event {
        private final DialogClickActionEventData value;
        public DialogClickActionEvent(DialogClickActionEventData value) { this.value = value; }
        public DialogClickActionEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getId() { return value.getId(); }
        public java.util.List<Integer> getPayload() { return value.getPayload(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class DialogShowEvent extends Event {
        private final DialogShowEventData value;
        public DialogShowEvent(DialogShowEventData value) { this.value = value; }
        public DialogShowEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public Object getDialog() { return value.getDialog(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class DialogClearEvent extends Event {
        private final DialogClearEventData value;
        public DialogClearEvent(DialogClearEventData value) { this.value = value; }
        public DialogClearEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BedrockFormResponseEvent extends Event {
        private final BedrockFormResponseEventData value;
        public BedrockFormResponseEvent(BedrockFormResponseEventData value) { this.value = value; }
        public BedrockFormResponseEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getFormId() { return value.getFormId(); }
        public String getResponseData() { return value.getResponseData(); }
    }

    public static final class ServerCommandEvent extends Event {
        private final ServerCommandEventData value;
        public ServerCommandEvent(ServerCommandEventData value) { this.value = value; }
        public ServerCommandEventData getValue() { return value; }
        public String getCommand() { return value.getCommand(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class ServerListPingEvent extends Event {
        private final ServerListPingEventData value;
        public ServerListPingEvent(ServerListPingEventData value) { this.value = value; }
        public ServerListPingEventData getValue() { return value; }
        public String getHostname() { return value.getHostname(); }
        public Object getAddress() { return value.getAddress(); }
        public TextComponent getMotd() { return value.getMotd(); }
        public int getMaxPlayers() { return value.getMaxPlayers(); }
        public int getNumPlayers() { return value.getNumPlayers(); }
        public String getFavicon() { return value.getFavicon(); }
    }

    public static final class ServerLoadEvent extends Event {
        private final ServerLoadEventData value;
        public ServerLoadEvent(ServerLoadEventData value) { this.value = value; }
        public ServerLoadEventData getValue() { return value; }
        public Object getLoadType() { return value.getLoadType(); }
    }

    public static final class SpawnChangeEvent extends Event {
        private final SpawnChangeEventData value;
        public SpawnChangeEvent(SpawnChangeEventData value) { this.value = value; }
        public SpawnChangeEventData getValue() { return value; }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public BlockPos getPreviousPosition() { return value.getPreviousPosition(); }
        public float getPreviousYaw() { return value.getPreviousYaw(); }
        public float getPreviousPitch() { return value.getPreviousPitch(); }
        public BlockPos getNewPosition() { return value.getNewPosition(); }
        public float getNewYaw() { return value.getNewYaw(); }
        public float getNewPitch() { return value.getNewPitch(); }
    }

    public static final class ServerBroadcastEvent extends Event {
        private final ServerBroadcastEventData value;
        public ServerBroadcastEvent(ServerBroadcastEventData value) { this.value = value; }
        public ServerBroadcastEventData getValue() { return value; }
        public TextComponent getMessage() { return value.getMessage(); }
        public TextComponent getSender() { return value.getSender(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class ServerTickStartEvent extends Event {
        private final ServerTickStartEventData value;
        public ServerTickStartEvent(ServerTickStartEventData value) { this.value = value; }
        public ServerTickStartEventData getValue() { return value; }
        public int getTick() { return value.getTick(); }
    }

    public static final class ServerTickEndEvent extends Event {
        private final ServerTickEndEventData value;
        public ServerTickEndEvent(ServerTickEndEventData value) { this.value = value; }
        public ServerTickEndEventData getValue() { return value; }
        public int getTick() { return value.getTick(); }
        public long getDurationNanos() { return value.getDurationNanos(); }
    }

    public static final class PacketReceivedEvent extends Event {
        private final PacketReceivedEventData value;
        public PacketReceivedEvent(PacketReceivedEventData value) { this.value = value; }
        public PacketReceivedEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public Object getPacket() { return value.getPacket(); }
        public int getPacketId() { return value.getPacketId(); }
        public java.util.List<Integer> getRawPayload() { return value.getRawPayload(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PacketSentEvent extends Event {
        private final PacketSentEventData value;
        public PacketSentEvent(PacketSentEventData value) { this.value = value; }
        public PacketSentEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public Object getPacket() { return value.getPacket(); }
        public int getPacketId() { return value.getPacketId(); }
        public java.util.List<Integer> getRawPayload() { return value.getRawPayload(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class ChunkLoadEvent extends Event {
        private final ChunkLoadEventData value;
        public ChunkLoadEvent(ChunkLoadEventData value) { this.value = value; }
        public ChunkLoadEventData getValue() { return value; }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public int getChunkX() { return value.getChunkX(); }
        public int getChunkZ() { return value.getChunkZ(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class ChunkSaveEvent extends Event {
        private final ChunkSaveEventData value;
        public ChunkSaveEvent(ChunkSaveEventData value) { this.value = value; }
        public ChunkSaveEventData getValue() { return value; }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public int getChunkX() { return value.getChunkX(); }
        public int getChunkZ() { return value.getChunkZ(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class ChunkSendEvent extends Event {
        private final ChunkSendEventData value;
        public ChunkSendEvent(ChunkSendEventData value) { this.value = value; }
        public ChunkSendEventData getValue() { return value; }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public int getChunkX() { return value.getChunkX(); }
        public int getChunkZ() { return value.getChunkZ(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityDamageEvent extends Event {
        private final EntityDamageEventData value;
        public EntityDamageEvent(EntityDamageEventData value) { this.value = value; }
        public EntityDamageEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public float getDamage() { return value.getDamage(); }
        public Object getDamageType() { return value.getDamageType(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityDeathEvent extends Event {
        private final EntityDeathEventData value;
        public EntityDeathEvent(EntityDeathEventData value) { this.value = value; }
        public EntityDeathEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getDroppedExp() { return value.getDroppedExp(); }
    }

    public static final class PlayerDeathEvent extends Event {
        private final PlayerDeathEventData value;
        public PlayerDeathEvent(PlayerDeathEventData value) { this.value = value; }
        public PlayerDeathEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public TextComponent getDeathMessage() { return value.getDeathMessage(); }
        public int getDroppedExp() { return value.getDroppedExp(); }
        public boolean isKeepInventory() { return value.isKeepInventory(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntitySpawnEvent extends Event {
        private final EntitySpawnEventData value;
        public EntitySpawnEvent(EntitySpawnEventData value) { this.value = value; }
        public EntitySpawnEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public String getEntityType() { return value.getEntityType(); }
        public Position getPosition() { return value.getPosition(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityCombustEvent extends Event {
        private final EntityCombustEventData value;
        public EntityCombustEvent(EntityCombustEventData value) { this.value = value; }
        public EntityCombustEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public float getDurationSecs() { return value.getDurationSecs(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityRegainHealthEvent extends Event {
        private final EntityRegainHealthEventData value;
        public EntityRegainHealthEvent(EntityRegainHealthEventData value) { this.value = value; }
        public EntityRegainHealthEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public float getAmount() { return value.getAmount(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityAirChangeEvent extends Event {
        private final EntityAirChangeEventData value;
        public EntityAirChangeEvent(EntityAirChangeEventData value) { this.value = value; }
        public EntityAirChangeEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getAmount() { return value.getAmount(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityBreedEvent extends Event {
        private final EntityBreedEventData value;
        public EntityBreedEvent(EntityBreedEventData value) { this.value = value; }
        public EntityBreedEventData getValue() { return value; }
        public int getFatherId() { return value.getFatherId(); }
        public int getMotherId() { return value.getMotherId(); }
        public int getChildId() { return value.getChildId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityDismountEvent extends Event {
        private final EntityDismountEventData value;
        public EntityDismountEvent(EntityDismountEventData value) { this.value = value; }
        public EntityDismountEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getDismountedId() { return value.getDismountedId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityDyeEvent extends Event {
        private final EntityDyeEventData value;
        public EntityDyeEvent(EntityDyeEventData value) { this.value = value; }
        public EntityDyeEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public String getColor() { return value.getColor(); }
        public Player getPlayer() { return value.getPlayer(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityEnterLoveModeEvent extends Event {
        private final EntityEnterLoveModeEventData value;
        public EntityEnterLoveModeEvent(EntityEnterLoveModeEventData value) { this.value = value; }
        public EntityEnterLoveModeEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public Integer getHumanEntityId() { return value.getHumanEntityId(); }
        public int getTicksInLove() { return value.getTicksInLove(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityExplodeEvent extends Event {
        private final EntityExplodeEventData value;
        public EntityExplodeEvent(EntityExplodeEventData value) { this.value = value; }
        public EntityExplodeEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public Position getPosition() { return value.getPosition(); }
        public float getYieldRate() { return value.getYieldRate(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityMountEvent extends Event {
        private final EntityMountEventData value;
        public EntityMountEvent(EntityMountEventData value) { this.value = value; }
        public EntityMountEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getMountedId() { return value.getMountedId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityPickupItemEvent extends Event {
        private final EntityPickupItemEventData value;
        public EntityPickupItemEvent(EntityPickupItemEventData value) { this.value = value; }
        public EntityPickupItemEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public String getItemName() { return value.getItemName(); }
        public int getCount() { return value.getCount(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityPortalEvent extends Event {
        private final EntityPortalEventData value;
        public EntityPortalEvent(EntityPortalEventData value) { this.value = value; }
        public EntityPortalEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public BlockPos getPortalPos() { return value.getPortalPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityResurrectEvent extends Event {
        private final EntityResurrectEventData value;
        public EntityResurrectEvent(EntityResurrectEventData value) { this.value = value; }
        public EntityResurrectEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityShootBowEvent extends Event {
        private final EntityShootBowEventData value;
        public EntityShootBowEvent(EntityShootBowEventData value) { this.value = value; }
        public EntityShootBowEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public String getWeaponName() { return value.getWeaponName(); }
        public float getForce() { return value.getForce(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityTameEvent extends Event {
        private final EntityTameEventData value;
        public EntityTameEvent(EntityTameEventData value) { this.value = value; }
        public EntityTameEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public Player getOwner() { return value.getOwner(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityTargetEvent extends Event {
        private final EntityTargetEventData value;
        public EntityTargetEvent(EntityTargetEventData value) { this.value = value; }
        public EntityTargetEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public Integer getTargetId() { return value.getTargetId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityTeleportEvent extends Event {
        private final EntityTeleportEventData value;
        public EntityTeleportEvent(EntityTeleportEventData value) { this.value = value; }
        public EntityTeleportEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public Position getFromPosition() { return value.getFromPosition(); }
        public Position getToPosition() { return value.getToPosition(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityToggleGlideEvent extends Event {
        private final EntityToggleGlideEventData value;
        public EntityToggleGlideEvent(EntityToggleGlideEventData value) { this.value = value; }
        public EntityToggleGlideEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public boolean isIsGliding() { return value.isIsGliding(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityTransformEvent extends Event {
        private final EntityTransformEventData value;
        public EntityTransformEvent(EntityTransformEventData value) { this.value = value; }
        public EntityTransformEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getNewEntityId() { return value.getNewEntityId(); }
        public String getTransformReason() { return value.getTransformReason(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerItemConsumeEvent extends Event {
        private final PlayerItemConsumeEventData value;
        public PlayerItemConsumeEvent(PlayerItemConsumeEventData value) { this.value = value; }
        public PlayerItemConsumeEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getItemName() { return value.getItemName(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerItemDamageEvent extends Event {
        private final PlayerItemDamageEventData value;
        public PlayerItemDamageEvent(PlayerItemDamageEventData value) { this.value = value; }
        public PlayerItemDamageEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getItemName() { return value.getItemName(); }
        public int getDamage() { return value.getDamage(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerDropItemEvent extends Event {
        private final PlayerDropItemEventData value;
        public PlayerDropItemEvent(PlayerDropItemEventData value) { this.value = value; }
        public PlayerDropItemEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getItemName() { return value.getItemName(); }
        public int getCount() { return value.getCount(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerBedEnterEvent extends Event {
        private final PlayerBedEnterEventData value;
        public PlayerBedEnterEvent(PlayerBedEnterEventData value) { this.value = value; }
        public PlayerBedEnterEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public BlockPos getBedPos() { return value.getBedPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerBedLeaveEvent extends Event {
        private final PlayerBedLeaveEventData value;
        public PlayerBedLeaveEvent(PlayerBedLeaveEventData value) { this.value = value; }
        public PlayerBedLeaveEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public BlockPos getBedPos() { return value.getBedPos(); }
    }

    public static final class PlayerBucketEmptyEvent extends Event {
        private final PlayerBucketEmptyEventData value;
        public PlayerBucketEmptyEvent(PlayerBucketEmptyEventData value) { this.value = value; }
        public PlayerBucketEmptyEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public String getBucket() { return value.getBucket(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerBucketFillEvent extends Event {
        private final PlayerBucketFillEventData value;
        public PlayerBucketFillEvent(PlayerBucketFillEventData value) { this.value = value; }
        public PlayerBucketFillEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public String getBucket() { return value.getBucket(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockDamageEvent extends Event {
        private final BlockDamageEventData value;
        public BlockDamageEvent(BlockDamageEventData value) { this.value = value; }
        public BlockDamageEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public boolean isInstaBreak() { return value.isInstaBreak(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockIgniteEvent extends Event {
        private final BlockIgniteEventData value;
        public BlockIgniteEvent(BlockIgniteEventData value) { this.value = value; }
        public BlockIgniteEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockFromToEvent extends Event {
        private final BlockFromToEventData value;
        public BlockFromToEvent(BlockFromToEventData value) { this.value = value; }
        public BlockFromToEventData getValue() { return value; }
        public BlockPos getFromPos() { return value.getFromPos(); }
        public BlockPos getToPos() { return value.getToPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockFormEvent extends Event {
        private final BlockFormEventData value;
        public BlockFormEvent(BlockFormEventData value) { this.value = value; }
        public BlockFormEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockFadeEvent extends Event {
        private final BlockFadeEventData value;
        public BlockFadeEvent(BlockFadeEventData value) { this.value = value; }
        public BlockFadeEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockDispenseEvent extends Event {
        private final BlockDispenseEventData value;
        public BlockDispenseEvent(BlockDispenseEventData value) { this.value = value; }
        public BlockDispenseEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public String getItemName() { return value.getItemName(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockExplodeEvent extends Event {
        private final BlockExplodeEventData value;
        public BlockExplodeEvent(BlockExplodeEventData value) { this.value = value; }
        public BlockExplodeEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public float getYieldRate() { return value.getYieldRate(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockPhysicsEvent extends Event {
        private final BlockPhysicsEventData value;
        public BlockPhysicsEvent(BlockPhysicsEventData value) { this.value = value; }
        public BlockPhysicsEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public BlockPos getChangedPos() { return value.getChangedPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockPistonExtendEvent extends Event {
        private final BlockPistonExtendEventData value;
        public BlockPistonExtendEvent(BlockPistonExtendEventData value) { this.value = value; }
        public BlockPistonExtendEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public String getDirection() { return value.getDirection(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockPistonRetractEvent extends Event {
        private final BlockPistonRetractEventData value;
        public BlockPistonRetractEvent(BlockPistonRetractEventData value) { this.value = value; }
        public BlockPistonRetractEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public String getDirection() { return value.getDirection(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class NotePlayEvent extends Event {
        private final NotePlayEventData value;
        public NotePlayEvent(NotePlayEventData value) { this.value = value; }
        public NotePlayEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public String getInstrument() { return value.getInstrument(); }
        public int getNote() { return value.getNote(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class SignChangeEvent extends Event {
        private final SignChangeEventData value;
        public SignChangeEvent(SignChangeEventData value) { this.value = value; }
        public SignChangeEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public java.util.List<String> getLines() { return value.getLines(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class SpongeAbsorbEvent extends Event {
        private final SpongeAbsorbEventData value;
        public SpongeAbsorbEvent(SpongeAbsorbEventData value) { this.value = value; }
        public SpongeAbsorbEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class TntPrimeEvent extends Event {
        private final TntPrimeEventData value;
        public TntPrimeEvent(TntPrimeEventData value) { this.value = value; }
        public TntPrimeEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public String getPrimeReason() { return value.getPrimeReason(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class WeatherChangeEvent extends Event {
        private final WeatherChangeEventData value;
        public WeatherChangeEvent(WeatherChangeEventData value) { this.value = value; }
        public WeatherChangeEventData getValue() { return value; }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public boolean isToWeatherState() { return value.isToWeatherState(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class ThunderChangeEvent extends Event {
        private final ThunderChangeEventData value;
        public ThunderChangeEvent(ThunderChangeEventData value) { this.value = value; }
        public ThunderChangeEventData getValue() { return value; }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public boolean isToThunderState() { return value.isToThunderState(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class WorldLoadEvent extends Event {
        private final WorldLoadEventData value;
        public WorldLoadEvent(WorldLoadEventData value) { this.value = value; }
        public WorldLoadEventData getValue() { return value; }
        public World getTargetWorld() { return value.getTargetWorld(); }
    }

    public static final class WorldUnloadEvent extends Event {
        private final WorldUnloadEventData value;
        public WorldUnloadEvent(WorldUnloadEventData value) { this.value = value; }
        public WorldUnloadEventData getValue() { return value; }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class AsyncStructureGenerateEvent extends Event {
        private final AsyncStructureGenerateEventData value;
        public AsyncStructureGenerateEvent(AsyncStructureGenerateEventData value) { this.value = value; }
        public AsyncStructureGenerateEventData getValue() { return value; }
        public String getWorldName() { return value.getWorldName(); }
        public String getStructureName() { return value.getStructureName(); }
        public BlockPos getPos() { return value.getPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class AsyncStructureSpawnEvent extends Event {
        private final AsyncStructureSpawnEventData value;
        public AsyncStructureSpawnEvent(AsyncStructureSpawnEventData value) { this.value = value; }
        public AsyncStructureSpawnEventData getValue() { return value; }
        public String getWorldName() { return value.getWorldName(); }
        public String getStructureName() { return value.getStructureName(); }
        public BlockPos getPos() { return value.getPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class ChunkPopulateEvent extends Event {
        private final ChunkPopulateEventData value;
        public ChunkPopulateEvent(ChunkPopulateEventData value) { this.value = value; }
        public ChunkPopulateEventData getValue() { return value; }
        public int getChunkX() { return value.getChunkX(); }
        public int getChunkZ() { return value.getChunkZ(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class ChunkUnloadEvent extends Event {
        private final ChunkUnloadEventData value;
        public ChunkUnloadEvent(ChunkUnloadEventData value) { this.value = value; }
        public ChunkUnloadEventData getValue() { return value; }
        public int getChunkX() { return value.getChunkX(); }
        public int getChunkZ() { return value.getChunkZ(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntitiesLoadEvent extends Event {
        private final EntitiesLoadEventData value;
        public EntitiesLoadEvent(EntitiesLoadEventData value) { this.value = value; }
        public EntitiesLoadEventData getValue() { return value; }
        public int getChunkX() { return value.getChunkX(); }
        public int getChunkZ() { return value.getChunkZ(); }
        public int getEntityCount() { return value.getEntityCount(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntitiesUnloadEvent extends Event {
        private final EntitiesUnloadEventData value;
        public EntitiesUnloadEvent(EntitiesUnloadEventData value) { this.value = value; }
        public EntitiesUnloadEventData getValue() { return value; }
        public int getChunkX() { return value.getChunkX(); }
        public int getChunkZ() { return value.getChunkZ(); }
        public int getEntityCount() { return value.getEntityCount(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class GenericGameEvent extends Event {
        private final GenericGameEventData value;
        public GenericGameEvent(GenericGameEventData value) { this.value = value; }
        public GenericGameEventData getValue() { return value; }
        public String getEventId() { return value.getEventId(); }
        public Position getPos() { return value.getPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class LootGenerateEvent extends Event {
        private final LootGenerateEventData value;
        public LootGenerateEvent(LootGenerateEventData value) { this.value = value; }
        public LootGenerateEventData getValue() { return value; }
        public String getLootTable() { return value.getLootTable(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PortalCreateEvent extends Event {
        private final PortalCreateEventData value;
        public PortalCreateEvent(PortalCreateEventData value) { this.value = value; }
        public PortalCreateEventData getValue() { return value; }
        public BlockPos getPos() { return value.getPos(); }
        public String getPortalType() { return value.getPortalType(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class StructureGrowEvent extends Event {
        private final StructureGrowEventData value;
        public StructureGrowEvent(StructureGrowEventData value) { this.value = value; }
        public StructureGrowEventData getValue() { return value; }
        public BlockPos getPos() { return value.getPos(); }
        public String getSpecies() { return value.getSpecies(); }
        public boolean isBoneMeal() { return value.isBoneMeal(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class TimeSkipEvent extends Event {
        private final TimeSkipEventData value;
        public TimeSkipEvent(TimeSkipEventData value) { this.value = value; }
        public TimeSkipEventData getValue() { return value; }
        public long getSkipAmount() { return value.getSkipAmount(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class WorldInitEvent extends Event {
        private final WorldInitEventData value;
        public WorldInitEvent(WorldInitEventData value) { this.value = value; }
        public WorldInitEventData getValue() { return value; }
        public World getTargetWorld() { return value.getTargetWorld(); }
    }

    public static final class WorldSaveEvent extends Event {
        private final WorldSaveEventData value;
        public WorldSaveEvent(WorldSaveEventData value) { this.value = value; }
        public WorldSaveEventData getValue() { return value; }
        public String getWorldName() { return value.getWorldName(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class InventoryOpenEvent extends Event {
        private final InventoryOpenEventData value;
        public InventoryOpenEvent(InventoryOpenEventData value) { this.value = value; }
        public InventoryOpenEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class InventoryDragEvent extends Event {
        private final InventoryDragEventData value;
        public InventoryDragEvent(InventoryDragEventData value) { this.value = value; }
        public InventoryDragEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class CraftItemEvent extends Event {
        private final CraftItemEventData value;
        public CraftItemEvent(CraftItemEventData value) { this.value = value; }
        public CraftItemEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getRecipeId() { return value.getRecipeId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class FurnaceSmeltEvent extends Event {
        private final FurnaceSmeltEventData value;
        public FurnaceSmeltEvent(FurnaceSmeltEventData value) { this.value = value; }
        public FurnaceSmeltEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public String getSourceItem() { return value.getSourceItem(); }
        public String getResultItem() { return value.getResultItem(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BrewEvent extends Event {
        private final BrewEventData value;
        public BrewEvent(BrewEventData value) { this.value = value; }
        public BrewEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public int getFuelLevel() { return value.getFuelLevel(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BrewingStandFuelEvent extends Event {
        private final BrewingStandFuelEventData value;
        public BrewingStandFuelEvent(BrewingStandFuelEventData value) { this.value = value; }
        public BrewingStandFuelEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public int getFuelPower() { return value.getFuelPower(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class FurnaceBurnEvent extends Event {
        private final FurnaceBurnEventData value;
        public FurnaceBurnEvent(FurnaceBurnEventData value) { this.value = value; }
        public FurnaceBurnEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public String getFuelItem() { return value.getFuelItem(); }
        public int getBurnTime() { return value.getBurnTime(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class FurnaceExtractEvent extends Event {
        private final FurnaceExtractEventData value;
        public FurnaceExtractEvent(FurnaceExtractEventData value) { this.value = value; }
        public FurnaceExtractEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public String getItemId() { return value.getItemId(); }
        public int getItemAmount() { return value.getItemAmount(); }
        public float getExpGained() { return value.getExpGained(); }
    }

    public static final class FurnaceStartSmeltEvent extends Event {
        private final FurnaceStartSmeltEventData value;
        public FurnaceStartSmeltEvent(FurnaceStartSmeltEventData value) { this.value = value; }
        public FurnaceStartSmeltEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public String getSourceItem() { return value.getSourceItem(); }
        public int getCookingTime() { return value.getCookingTime(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class HopperInventorySearchEvent extends Event {
        private final HopperInventorySearchEventData value;
        public HopperInventorySearchEvent(HopperInventorySearchEventData value) { this.value = value; }
        public HopperInventorySearchEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public BlockPos getSearchPos() { return value.getSearchPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class InventoryCreativeEvent extends Event {
        private final InventoryCreativeEventData value;
        public InventoryCreativeEvent(InventoryCreativeEventData value) { this.value = value; }
        public InventoryCreativeEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getSlot() { return value.getSlot(); }
        public String getItemId() { return value.getItemId(); }
        public int getItemCount() { return value.getItemCount(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class InventoryInteractEvent extends Event {
        private final InventoryInteractEventData value;
        public InventoryInteractEvent(InventoryInteractEventData value) { this.value = value; }
        public InventoryInteractEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class InventoryMoveItemEvent extends Event {
        private final InventoryMoveItemEventData value;
        public InventoryMoveItemEvent(InventoryMoveItemEventData value) { this.value = value; }
        public InventoryMoveItemEventData getValue() { return value; }
        public BlockPos getSourcePos() { return value.getSourcePos(); }
        public BlockPos getTargetPos() { return value.getTargetPos(); }
        public String getItemId() { return value.getItemId(); }
        public int getItemAmount() { return value.getItemAmount(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class InventoryPickupItemEvent extends Event {
        private final InventoryPickupItemEventData value;
        public InventoryPickupItemEvent(InventoryPickupItemEventData value) { this.value = value; }
        public InventoryPickupItemEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public int getItemEntityId() { return value.getItemEntityId(); }
        public String getItemId() { return value.getItemId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PrepareAnvilEvent extends Event {
        private final PrepareAnvilEventData value;
        public PrepareAnvilEvent(PrepareAnvilEventData value) { this.value = value; }
        public PrepareAnvilEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getRenameText() { return value.getRenameText(); }
        public int getRepairCost() { return value.getRepairCost(); }
    }

    public static final class PrepareGrindstoneEvent extends Event {
        private final PrepareGrindstoneEventData value;
        public PrepareGrindstoneEvent(PrepareGrindstoneEventData value) { this.value = value; }
        public PrepareGrindstoneEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getResultItem() { return value.getResultItem(); }
    }

    public static final class PrepareInventoryResultEvent extends Event {
        private final PrepareInventoryResultEventData value;
        public PrepareInventoryResultEvent(PrepareInventoryResultEventData value) { this.value = value; }
        public PrepareInventoryResultEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getResultItem() { return value.getResultItem(); }
    }

    public static final class PrepareItemCraftEvent extends Event {
        private final PrepareItemCraftEventData value;
        public PrepareItemCraftEvent(PrepareItemCraftEventData value) { this.value = value; }
        public PrepareItemCraftEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getRecipeId() { return value.getRecipeId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PrepareSmithingEvent extends Event {
        private final PrepareSmithingEventData value;
        public PrepareSmithingEvent(PrepareSmithingEventData value) { this.value = value; }
        public PrepareSmithingEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getResultItem() { return value.getResultItem(); }
    }

    public static final class SmithItemEvent extends Event {
        private final SmithItemEventData value;
        public SmithItemEvent(SmithItemEventData value) { this.value = value; }
        public SmithItemEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getRecipeId() { return value.getRecipeId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class TradeSelectEvent extends Event {
        private final TradeSelectEventData value;
        public TradeSelectEvent(TradeSelectEventData value) { this.value = value; }
        public TradeSelectEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getSlotIndex() { return value.getSlotIndex(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class VehicleBlockCollisionEvent extends Event {
        private final VehicleBlockCollisionEventData value;
        public VehicleBlockCollisionEvent(VehicleBlockCollisionEventData value) { this.value = value; }
        public VehicleBlockCollisionEventData getValue() { return value; }
        public int getVehicleId() { return value.getVehicleId(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class VehicleCollisionEvent extends Event {
        private final VehicleCollisionEventData value;
        public VehicleCollisionEvent(VehicleCollisionEventData value) { this.value = value; }
        public VehicleCollisionEventData getValue() { return value; }
        public int getVehicleId() { return value.getVehicleId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class VehicleCreateEvent extends Event {
        private final VehicleCreateEventData value;
        public VehicleCreateEvent(VehicleCreateEventData value) { this.value = value; }
        public VehicleCreateEventData getValue() { return value; }
        public int getVehicleId() { return value.getVehicleId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class VehicleDamageEvent extends Event {
        private final VehicleDamageEventData value;
        public VehicleDamageEvent(VehicleDamageEventData value) { this.value = value; }
        public VehicleDamageEventData getValue() { return value; }
        public int getVehicleId() { return value.getVehicleId(); }
        public float getDamage() { return value.getDamage(); }
        public Integer getAttackerId() { return value.getAttackerId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class VehicleDestroyEvent extends Event {
        private final VehicleDestroyEventData value;
        public VehicleDestroyEvent(VehicleDestroyEventData value) { this.value = value; }
        public VehicleDestroyEventData getValue() { return value; }
        public int getVehicleId() { return value.getVehicleId(); }
        public Integer getAttackerId() { return value.getAttackerId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class VehicleEnterEvent extends Event {
        private final VehicleEnterEventData value;
        public VehicleEnterEvent(VehicleEnterEventData value) { this.value = value; }
        public VehicleEnterEventData getValue() { return value; }
        public int getVehicleId() { return value.getVehicleId(); }
        public int getEnteredId() { return value.getEnteredId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class VehicleEntityCollisionEvent extends Event {
        private final VehicleEntityCollisionEventData value;
        public VehicleEntityCollisionEvent(VehicleEntityCollisionEventData value) { this.value = value; }
        public VehicleEntityCollisionEventData getValue() { return value; }
        public int getVehicleId() { return value.getVehicleId(); }
        public int getCollidedEntityId() { return value.getCollidedEntityId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class VehicleExitEvent extends Event {
        private final VehicleExitEventData value;
        public VehicleExitEvent(VehicleExitEventData value) { this.value = value; }
        public VehicleExitEventData getValue() { return value; }
        public int getVehicleId() { return value.getVehicleId(); }
        public int getExitedId() { return value.getExitedId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class VehicleMoveEvent extends Event {
        private final VehicleMoveEventData value;
        public VehicleMoveEvent(VehicleMoveEventData value) { this.value = value; }
        public VehicleMoveEventData getValue() { return value; }
        public int getVehicleId() { return value.getVehicleId(); }
        public Position getFromPosition() { return value.getFromPosition(); }
        public Position getToPosition() { return value.getToPosition(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class VehicleUpdateEvent extends Event {
        private final VehicleUpdateEventData value;
        public VehicleUpdateEvent(VehicleUpdateEventData value) { this.value = value; }
        public VehicleUpdateEventData getValue() { return value; }
        public int getVehicleId() { return value.getVehicleId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PrepareItemEnchantEvent extends Event {
        private final PrepareItemEnchantEventData value;
        public PrepareItemEnchantEvent(PrepareItemEnchantEventData value) { this.value = value; }
        public PrepareItemEnchantEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public ItemStack getItem() { return value.getItem(); }
        public java.util.List<Object> getOffers() { return value.getOffers(); }
        public int getBookshelfCount() { return value.getBookshelfCount(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EnchantItemEvent extends Event {
        private final EnchantItemEventData value;
        public EnchantItemEvent(EnchantItemEventData value) { this.value = value; }
        public EnchantItemEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public ItemStack getItem() { return value.getItem(); }
        public int getOption() { return value.getOption(); }
        public int getCost() { return value.getCost(); }
        public java.util.List<Object> getEnchantmentsToAdd() { return value.getEnchantmentsToAdd(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class MapInitializeEvent extends Event {
        private final MapInitializeEventData value;
        public MapInitializeEvent(MapInitializeEventData value) { this.value = value; }
        public MapInitializeEventData getValue() { return value; }
        public int getMapId() { return value.getMapId(); }
    }

    public static final class HangingBreakEvent extends Event {
        private final HangingBreakEventData value;
        public HangingBreakEvent(HangingBreakEventData value) { this.value = value; }
        public HangingBreakEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public Integer getRemoverEntityId() { return value.getRemoverEntityId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class HangingBreakByEntityEvent extends Event {
        private final HangingBreakByEntityEventData value;
        public HangingBreakByEntityEvent(HangingBreakByEntityEventData value) { this.value = value; }
        public HangingBreakByEntityEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getRemoverEntityId() { return value.getRemoverEntityId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class HangingPlaceEvent extends Event {
        private final HangingPlaceEventData value;
        public HangingPlaceEvent(HangingPlaceEventData value) { this.value = value; }
        public HangingPlaceEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public Player getPlayer() { return value.getPlayer(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public String getBlockFace() { return value.getBlockFace(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BellResonateEvent extends Event {
        private final BellResonateEventData value;
        public BellResonateEvent(BellResonateEventData value) { this.value = value; }
        public BellResonateEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BellRingEvent extends Event {
        private final BellRingEventData value;
        public BellRingEvent(BellRingEventData value) { this.value = value; }
        public BellRingEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public Integer getEntityId() { return value.getEntityId(); }
        public String getDirection() { return value.getDirection(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockBrushEvent extends Event {
        private final BlockBrushEventData value;
        public BlockBrushEvent(BlockBrushEventData value) { this.value = value; }
        public BlockBrushEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public Player getPlayer() { return value.getPlayer(); }
        public ItemStack getItem() { return value.getItem(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockCookEvent extends Event {
        private final BlockCookEventData value;
        public BlockCookEvent(BlockCookEventData value) { this.value = value; }
        public BlockCookEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public ItemStack getSource() { return value.getSource(); }
        public ItemStack getResult() { return value.getResult(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockDamageAbortEvent extends Event {
        private final BlockDamageAbortEventData value;
        public BlockDamageAbortEvent(BlockDamageAbortEventData value) { this.value = value; }
        public BlockDamageAbortEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public ItemStack getItemInHand() { return value.getItemInHand(); }
    }

    public static final class BlockDispenseArmorEvent extends Event {
        private final BlockDispenseArmorEventData value;
        public BlockDispenseArmorEvent(BlockDispenseArmorEventData value) { this.value = value; }
        public BlockDispenseArmorEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public int getTargetEntityId() { return value.getTargetEntityId(); }
        public ItemStack getItem() { return value.getItem(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockDispenseLootEvent extends Event {
        private final BlockDispenseLootEventData value;
        public BlockDispenseLootEvent(BlockDispenseLootEventData value) { this.value = value; }
        public BlockDispenseLootEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public java.util.List<ItemStack> getItems() { return value.getItems(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockDropItemEvent extends Event {
        private final BlockDropItemEventData value;
        public BlockDropItemEvent(BlockDropItemEventData value) { this.value = value; }
        public BlockDropItemEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public Player getPlayer() { return value.getPlayer(); }
        public java.util.List<ItemStack> getItems() { return value.getItems(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockExpEvent extends Event {
        private final BlockExpEventData value;
        public BlockExpEvent(BlockExpEventData value) { this.value = value; }
        public BlockExpEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public int getExp() { return value.getExp(); }
    }

    public static final class BlockFertilizeEvent extends Event {
        private final BlockFertilizeEventData value;
        public BlockFertilizeEvent(BlockFertilizeEventData value) { this.value = value; }
        public BlockFertilizeEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public Player getPlayer() { return value.getPlayer(); }
        public java.util.List<Object> getChangedBlocks() { return value.getChangedBlocks(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockMultiPlaceEvent extends Event {
        private final BlockMultiPlaceEventData value;
        public BlockMultiPlaceEvent(BlockMultiPlaceEventData value) { this.value = value; }
        public BlockMultiPlaceEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public java.util.List<Object> getPlacedBlocks() { return value.getPlacedBlocks(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockReceiveGameEvent extends Event {
        private final BlockReceiveGameEventData value;
        public BlockReceiveGameEvent(BlockReceiveGameEventData value) { this.value = value; }
        public BlockReceiveGameEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public String getGameEvent() { return value.getGameEvent(); }
        public Integer getSourceEntityId() { return value.getSourceEntityId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockShearEntityEvent extends Event {
        private final BlockShearEntityEventData value;
        public BlockShearEntityEvent(BlockShearEntityEventData value) { this.value = value; }
        public BlockShearEntityEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public int getTargetEntityId() { return value.getTargetEntityId(); }
        public ItemStack getItem() { return value.getItem(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BlockSpreadEvent extends Event {
        private final BlockSpreadEventData value;
        public BlockSpreadEvent(BlockSpreadEventData value) { this.value = value; }
        public BlockSpreadEventData getValue() { return value; }
        public BlockPos getSourcePos() { return value.getSourcePos(); }
        public BlockPos getTargetPos() { return value.getTargetPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public int getNewStateId() { return value.getNewStateId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BrewingStartEvent extends Event {
        private final BrewingStartEventData value;
        public BrewingStartEvent(BrewingStartEventData value) { this.value = value; }
        public BrewingStartEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public int getBrewingTime() { return value.getBrewingTime(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class CampfireStartEvent extends Event {
        private final CampfireStartEventData value;
        public CampfireStartEvent(CampfireStartEventData value) { this.value = value; }
        public CampfireStartEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public ItemStack getItem() { return value.getItem(); }
        public int getSlot() { return value.getSlot(); }
        public int getCookingTime() { return value.getCookingTime(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class CauldronLevelChangeEvent extends Event {
        private final CauldronLevelChangeEventData value;
        public CauldronLevelChangeEvent(CauldronLevelChangeEventData value) { this.value = value; }
        public CauldronLevelChangeEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public int getOldLevel() { return value.getOldLevel(); }
        public int getNewLevel() { return value.getNewLevel(); }
        public String getReason() { return value.getReason(); }
        public Integer getEntityId() { return value.getEntityId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class CrafterCraftEvent extends Event {
        private final CrafterCraftEventData value;
        public CrafterCraftEvent(CrafterCraftEventData value) { this.value = value; }
        public CrafterCraftEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public ItemStack getResult() { return value.getResult(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityBlockFormEvent extends Event {
        private final EntityBlockFormEventData value;
        public EntityBlockFormEvent(EntityBlockFormEventData value) { this.value = value; }
        public EntityBlockFormEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public int getNewStateId() { return value.getNewStateId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class FluidLevelChangeEvent extends Event {
        private final FluidLevelChangeEventData value;
        public FluidLevelChangeEvent(FluidLevelChangeEventData value) { this.value = value; }
        public FluidLevelChangeEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public int getNewStateId() { return value.getNewStateId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class InventoryBlockStartEvent extends Event {
        private final InventoryBlockStartEventData value;
        public InventoryBlockStartEvent(InventoryBlockStartEventData value) { this.value = value; }
        public InventoryBlockStartEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
    }

    public static final class LeavesDecayEvent extends Event {
        private final LeavesDecayEventData value;
        public LeavesDecayEvent(LeavesDecayEventData value) { this.value = value; }
        public LeavesDecayEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class MoistureChangeEvent extends Event {
        private final MoistureChangeEventData value;
        public MoistureChangeEvent(MoistureChangeEventData value) { this.value = value; }
        public MoistureChangeEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public int getNewMoisture() { return value.getNewMoisture(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class SculkBloomEvent extends Event {
        private final SculkBloomEventData value;
        public SculkBloomEvent(SculkBloomEventData value) { this.value = value; }
        public SculkBloomEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public int getCharge() { return value.getCharge(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class VaultDisplayItemEvent extends Event {
        private final VaultDisplayItemEventData value;
        public VaultDisplayItemEvent(VaultDisplayItemEventData value) { this.value = value; }
        public VaultDisplayItemEventData getValue() { return value; }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public ItemStack getItem() { return value.getItem(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class CreatureSpawnEvent extends Event {
        private final CreatureSpawnEventData value;
        public CreatureSpawnEvent(CreatureSpawnEventData value) { this.value = value; }
        public CreatureSpawnEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public String getEntityType() { return value.getEntityType(); }
        public Position getPosition() { return value.getPosition(); }
        public World getTargetWorld() { return value.getTargetWorld(); }
        public String getSpawnReason() { return value.getSpawnReason(); }
        public Player getPlayer() { return value.getPlayer(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EnderDragonChangePhaseEvent extends Event {
        private final EnderDragonChangePhaseEventData value;
        public EnderDragonChangePhaseEvent(EnderDragonChangePhaseEventData value) { this.value = value; }
        public EnderDragonChangePhaseEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public String getCurrentPhase() { return value.getCurrentPhase(); }
        public String getNewPhase() { return value.getNewPhase(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityBreakDoorEvent extends Event {
        private final EntityBreakDoorEventData value;
        public EntityBreakDoorEvent(EntityBreakDoorEventData value) { this.value = value; }
        public EntityBreakDoorEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityChangeBlockEvent extends Event {
        private final EntityChangeBlockEventData value;
        public EntityChangeBlockEvent(EntityChangeBlockEventData value) { this.value = value; }
        public EntityChangeBlockEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public String getNewBlock() { return value.getNewBlock(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityDamageByBlockEvent extends Event {
        private final EntityDamageByBlockEventData value;
        public EntityDamageByBlockEvent(EntityDamageByBlockEventData value) { this.value = value; }
        public EntityDamageByBlockEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public BlockPos getDamagerPos() { return value.getDamagerPos(); }
        public float getDamage() { return value.getDamage(); }
        public String getCause() { return value.getCause(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityDamageByEntityEvent extends Event {
        private final EntityDamageByEntityEventData value;
        public EntityDamageByEntityEvent(EntityDamageByEntityEventData value) { this.value = value; }
        public EntityDamageByEntityEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getDamagerId() { return value.getDamagerId(); }
        public float getDamage() { return value.getDamage(); }
        public String getCause() { return value.getCause(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityDropItemEvent extends Event {
        private final EntityDropItemEventData value;
        public EntityDropItemEvent(EntityDropItemEventData value) { this.value = value; }
        public EntityDropItemEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public String getItemName() { return value.getItemName(); }
        public int getCount() { return value.getCount(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityEnterBlockEvent extends Event {
        private final EntityEnterBlockEventData value;
        public EntityEnterBlockEvent(EntityEnterBlockEventData value) { this.value = value; }
        public EntityEnterBlockEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityExhaustionEvent extends Event {
        private final EntityExhaustionEventData value;
        public EntityExhaustionEvent(EntityExhaustionEventData value) { this.value = value; }
        public EntityExhaustionEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public float getExhaustion() { return value.getExhaustion(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityInteractEvent extends Event {
        private final EntityInteractEventData value;
        public EntityInteractEvent(EntityInteractEventData value) { this.value = value; }
        public EntityInteractEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityKnockbackEvent extends Event {
        private final EntityKnockbackEventData value;
        public EntityKnockbackEvent(EntityKnockbackEventData value) { this.value = value; }
        public EntityKnockbackEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public Integer getHitById() { return value.getHitById(); }
        public Position getKnockback() { return value.getKnockback(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityPlaceEvent extends Event {
        private final EntityPlaceEventData value;
        public EntityPlaceEvent(EntityPlaceEventData value) { this.value = value; }
        public EntityPlaceEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public String getBlockName() { return value.getBlockName(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityPoseChangeEvent extends Event {
        private final EntityPoseChangeEventData value;
        public EntityPoseChangeEvent(EntityPoseChangeEventData value) { this.value = value; }
        public EntityPoseChangeEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public String getPose() { return value.getPose(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityPotionEffectEvent extends Event {
        private final EntityPotionEffectEventData value;
        public EntityPotionEffectEvent(EntityPotionEffectEventData value) { this.value = value; }
        public EntityPotionEffectEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public String getEffectName() { return value.getEffectName(); }
        public int getDuration() { return value.getDuration(); }
        public int getAmplifier() { return value.getAmplifier(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntitySpellCastEvent extends Event {
        private final EntitySpellCastEventData value;
        public EntitySpellCastEvent(EntitySpellCastEventData value) { this.value = value; }
        public EntitySpellCastEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public String getSpell() { return value.getSpell(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityTargetLivingEntityEvent extends Event {
        private final EntityTargetLivingEntityEventData value;
        public EntityTargetLivingEntityEvent(EntityTargetLivingEntityEventData value) { this.value = value; }
        public EntityTargetLivingEntityEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public Integer getTargetId() { return value.getTargetId(); }
        public String getReason() { return value.getReason(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityToggleSwimEvent extends Event {
        private final EntityToggleSwimEventData value;
        public EntityToggleSwimEvent(EntityToggleSwimEventData value) { this.value = value; }
        public EntityToggleSwimEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public boolean isIsSwimming() { return value.isIsSwimming(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class ExplosionPrimeEvent extends Event {
        private final ExplosionPrimeEventData value;
        public ExplosionPrimeEvent(ExplosionPrimeEventData value) { this.value = value; }
        public ExplosionPrimeEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public float getRadius() { return value.getRadius(); }
        public boolean isFire() { return value.isFire(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class FireworkExplodeEvent extends Event {
        private final FireworkExplodeEventData value;
        public FireworkExplodeEvent(FireworkExplodeEventData value) { this.value = value; }
        public FireworkExplodeEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class FoodLevelChangeEvent extends Event {
        private final FoodLevelChangeEventData value;
        public FoodLevelChangeEvent(FoodLevelChangeEventData value) { this.value = value; }
        public FoodLevelChangeEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getFoodLevel() { return value.getFoodLevel(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class ItemDespawnEvent extends Event {
        private final ItemDespawnEventData value;
        public ItemDespawnEvent(ItemDespawnEventData value) { this.value = value; }
        public ItemDespawnEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class ItemMergeEvent extends Event {
        private final ItemMergeEventData value;
        public ItemMergeEvent(ItemMergeEventData value) { this.value = value; }
        public ItemMergeEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getTargetId() { return value.getTargetId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class ItemSpawnEvent extends Event {
        private final ItemSpawnEventData value;
        public ItemSpawnEvent(ItemSpawnEventData value) { this.value = value; }
        public ItemSpawnEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public Position getPosition() { return value.getPosition(); }
        public String getItemName() { return value.getItemName(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PiglinBarterEvent extends Event {
        private final PiglinBarterEventData value;
        public PiglinBarterEvent(PiglinBarterEventData value) { this.value = value; }
        public PiglinBarterEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public ItemStack getInputItem() { return value.getInputItem(); }
        public java.util.List<ItemStack> getOutcome() { return value.getOutcome(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class ProjectileHitEvent extends Event {
        private final ProjectileHitEventData value;
        public ProjectileHitEvent(ProjectileHitEventData value) { this.value = value; }
        public ProjectileHitEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public Position getHitPosition() { return value.getHitPosition(); }
        public Integer getHitEntityId() { return value.getHitEntityId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class ProjectileLaunchEvent extends Event {
        private final ProjectileLaunchEventData value;
        public ProjectileLaunchEvent(ProjectileLaunchEventData value) { this.value = value; }
        public ProjectileLaunchEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public Integer getShooterId() { return value.getShooterId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class SheepDyeWoolEvent extends Event {
        private final SheepDyeWoolEventData value;
        public SheepDyeWoolEvent(SheepDyeWoolEventData value) { this.value = value; }
        public SheepDyeWoolEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getDyeColor() { return value.getDyeColor(); }
        public Integer getPlayerId() { return value.getPlayerId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class SheepRegrowWoolEvent extends Event {
        private final SheepRegrowWoolEventData value;
        public SheepRegrowWoolEvent(SheepRegrowWoolEventData value) { this.value = value; }
        public SheepRegrowWoolEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class SlimeSplitEvent extends Event {
        private final SlimeSplitEventData value;
        public SlimeSplitEvent(SlimeSplitEventData value) { this.value = value; }
        public SlimeSplitEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getCount() { return value.getCount(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class StriderTemperatureChangeEvent extends Event {
        private final StriderTemperatureChangeEventData value;
        public StriderTemperatureChangeEvent(StriderTemperatureChangeEventData value) { this.value = value; }
        public StriderTemperatureChangeEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public boolean isIsShivering() { return value.isIsShivering(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class VillagerAcquireTradeEvent extends Event {
        private final VillagerAcquireTradeEventData value;
        public VillagerAcquireTradeEvent(VillagerAcquireTradeEventData value) { this.value = value; }
        public VillagerAcquireTradeEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getRecipeIndex() { return value.getRecipeIndex(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class VillagerCareerChangeEvent extends Event {
        private final VillagerCareerChangeEventData value;
        public VillagerCareerChangeEvent(VillagerCareerChangeEventData value) { this.value = value; }
        public VillagerCareerChangeEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public String getProfession() { return value.getProfession(); }
        public String getReason() { return value.getReason(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class VillagerReplenishTradeEvent extends Event {
        private final VillagerReplenishTradeEventData value;
        public VillagerReplenishTradeEvent(VillagerReplenishTradeEventData value) { this.value = value; }
        public VillagerReplenishTradeEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getRestockQuantity() { return value.getRestockQuantity(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class WardenAngerChangeEvent extends Event {
        private final WardenAngerChangeEventData value;
        public WardenAngerChangeEvent(WardenAngerChangeEventData value) { this.value = value; }
        public WardenAngerChangeEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getTargetId() { return value.getTargetId(); }
        public int getOldAnger() { return value.getOldAnger(); }
        public int getNewAnger() { return value.getNewAnger(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class AreaEffectCloudApplyEvent extends Event {
        private final AreaEffectCloudApplyEventData value;
        public AreaEffectCloudApplyEvent(AreaEffectCloudApplyEventData value) { this.value = value; }
        public AreaEffectCloudApplyEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public java.util.List<Integer> getAffectedEntities() { return value.getAffectedEntities(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class ArrowBodyCountChangeEvent extends Event {
        private final ArrowBodyCountChangeEventData value;
        public ArrowBodyCountChangeEvent(ArrowBodyCountChangeEventData value) { this.value = value; }
        public ArrowBodyCountChangeEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getOldAmount() { return value.getOldAmount(); }
        public int getNewAmount() { return value.getNewAmount(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class BatToggleSleepEvent extends Event {
        private final BatToggleSleepEventData value;
        public BatToggleSleepEvent(BatToggleSleepEventData value) { this.value = value; }
        public BatToggleSleepEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public boolean isIsAwake() { return value.isIsAwake(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class CreeperPowerEvent extends Event {
        private final CreeperPowerEventData value;
        public CreeperPowerEvent(CreeperPowerEventData value) { this.value = value; }
        public CreeperPowerEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public Integer getLightningId() { return value.getLightningId(); }
        public String getCause() { return value.getCause(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityCombustByBlockEvent extends Event {
        private final EntityCombustByBlockEventData value;
        public EntityCombustByBlockEvent(EntityCombustByBlockEventData value) { this.value = value; }
        public EntityCombustByBlockEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public BlockPos getCombuster() { return value.getCombuster(); }
        public float getDuration() { return value.getDuration(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityCombustByEntityEvent extends Event {
        private final EntityCombustByEntityEventData value;
        public EntityCombustByEntityEvent(EntityCombustByEntityEventData value) { this.value = value; }
        public EntityCombustByEntityEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getCombusterId() { return value.getCombusterId(); }
        public float getDuration() { return value.getDuration(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityKnockbackByEntityEvent extends Event {
        private final EntityKnockbackByEntityEventData value;
        public EntityKnockbackByEntityEvent(EntityKnockbackByEntityEventData value) { this.value = value; }
        public EntityKnockbackByEntityEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getHitById() { return value.getHitById(); }
        public double getForce() { return value.getForce(); }
        public double getX() { return value.getX(); }
        public double getZ() { return value.getZ(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityPortalEnterEvent extends Event {
        private final EntityPortalEnterEventData value;
        public EntityPortalEnterEvent(EntityPortalEnterEventData value) { this.value = value; }
        public EntityPortalEnterEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public BlockPos getLocation() { return value.getLocation(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityPortalExitEvent extends Event {
        private final EntityPortalExitEventData value;
        public EntityPortalExitEvent(EntityPortalExitEventData value) { this.value = value; }
        public EntityPortalExitEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public BlockPos getFromPos() { return value.getFromPos(); }
        public BlockPos getToPos() { return value.getToPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityRemoveEvent extends Event {
        private final EntityRemoveEventData value;
        public EntityRemoveEvent(EntityRemoveEventData value) { this.value = value; }
        public EntityRemoveEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public String getCause() { return value.getCause(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityTargetBlockEvent extends Event {
        private final EntityTargetBlockEventData value;
        public EntityTargetBlockEvent(EntityTargetBlockEventData value) { this.value = value; }
        public EntityTargetBlockEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class EntityUnleashEvent extends Event {
        private final EntityUnleashEventData value;
        public EntityUnleashEvent(EntityUnleashEventData value) { this.value = value; }
        public EntityUnleashEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public String getReason() { return value.getReason(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class ExpBottleEvent extends Event {
        private final ExpBottleEventData value;
        public ExpBottleEvent(ExpBottleEventData value) { this.value = value; }
        public ExpBottleEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getExperience() { return value.getExperience(); }
        public BlockPos getLocation() { return value.getLocation(); }
        public boolean isShowEffect() { return value.isShowEffect(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class HorseJumpEvent extends Event {
        private final HorseJumpEventData value;
        public HorseJumpEvent(HorseJumpEventData value) { this.value = value; }
        public HorseJumpEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public float getPower() { return value.getPower(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class LingeringPotionSplashEvent extends Event {
        private final LingeringPotionSplashEventData value;
        public LingeringPotionSplashEvent(LingeringPotionSplashEventData value) { this.value = value; }
        public LingeringPotionSplashEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public BlockPos getLocation() { return value.getLocation(); }
        public String getPotionItem() { return value.getPotionItem(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PigZapEvent extends Event {
        private final PigZapEventData value;
        public PigZapEvent(PigZapEventData value) { this.value = value; }
        public PigZapEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getLightningId() { return value.getLightningId(); }
        public int getPigZombieId() { return value.getPigZombieId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PigZombieAngerEvent extends Event {
        private final PigZombieAngerEventData value;
        public PigZombieAngerEvent(PigZombieAngerEventData value) { this.value = value; }
        public PigZombieAngerEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public Integer getTargetId() { return value.getTargetId(); }
        public int getNewAnger() { return value.getNewAnger(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PotionSplashEvent extends Event {
        private final PotionSplashEventData value;
        public PotionSplashEvent(PotionSplashEventData value) { this.value = value; }
        public PotionSplashEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public BlockPos getLocation() { return value.getLocation(); }
        public String getPotionItem() { return value.getPotionItem(); }
        public java.util.List<Integer> getAffectedEntities() { return value.getAffectedEntities(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class SpawnerSpawnEvent extends Event {
        private final SpawnerSpawnEventData value;
        public SpawnerSpawnEvent(SpawnerSpawnEventData value) { this.value = value; }
        public SpawnerSpawnEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public BlockPos getSpawnerPos() { return value.getSpawnerPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class TrialSpawnerSpawnEvent extends Event {
        private final TrialSpawnerSpawnEventData value;
        public TrialSpawnerSpawnEvent(TrialSpawnerSpawnEventData value) { this.value = value; }
        public TrialSpawnerSpawnEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public BlockPos getSpawnerPos() { return value.getSpawnerPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class VillagerReputationChangeEvent extends Event {
        private final VillagerReputationChangeEventData value;
        public VillagerReputationChangeEvent(VillagerReputationChangeEventData value) { this.value = value; }
        public VillagerReputationChangeEventData getValue() { return value; }
        public int getEntityId() { return value.getEntityId(); }
        public int getTargetId() { return value.getTargetId(); }
        public int getReputationChange() { return value.getReputationChange(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class AsyncPlayerChatEvent extends Event {
        private final AsyncPlayerChatEventData value;
        public AsyncPlayerChatEvent(AsyncPlayerChatEventData value) { this.value = value; }
        public AsyncPlayerChatEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getMessage() { return value.getMessage(); }
        public TextComponent getFormat() { return value.getFormat(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class AsyncPlayerPreLoginEvent extends Event {
        private final AsyncPlayerPreLoginEventData value;
        public AsyncPlayerPreLoginEvent(AsyncPlayerPreLoginEventData value) { this.value = value; }
        public AsyncPlayerPreLoginEventData getValue() { return value; }
        public String getPlayerName() { return value.getPlayerName(); }
        public String getPlayerUuid() { return value.getPlayerUuid(); }
        public String getIpAddress() { return value.getIpAddress(); }
        public TextComponent getKickMessage() { return value.getKickMessage(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerAdvancementDoneEvent extends Event {
        private final PlayerAdvancementDoneEventData value;
        public PlayerAdvancementDoneEvent(PlayerAdvancementDoneEventData value) { this.value = value; }
        public PlayerAdvancementDoneEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getAdvancementId() { return value.getAdvancementId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerAnimationEvent extends Event {
        private final PlayerAnimationEventData value;
        public PlayerAnimationEvent(PlayerAnimationEventData value) { this.value = value; }
        public PlayerAnimationEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getAnimationType() { return value.getAnimationType(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerArmorStandManipulateEvent extends Event {
        private final PlayerArmorStandManipulateEventData value;
        public PlayerArmorStandManipulateEvent(PlayerArmorStandManipulateEventData value) { this.value = value; }
        public PlayerArmorStandManipulateEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getArmorStandId() { return value.getArmorStandId(); }
        public int getSlot() { return value.getSlot(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerBucketEntityEvent extends Event {
        private final PlayerBucketEntityEventData value;
        public PlayerBucketEntityEvent(PlayerBucketEntityEventData value) { this.value = value; }
        public PlayerBucketEntityEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getEntityId() { return value.getEntityId(); }
        public String getBucketItem() { return value.getBucketItem(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerChangedWorldEvent extends Event {
        private final PlayerChangedWorldEventData value;
        public PlayerChangedWorldEvent(PlayerChangedWorldEventData value) { this.value = value; }
        public PlayerChangedWorldEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public World getFromWorld() { return value.getFromWorld(); }
        public World getToWorld() { return value.getToWorld(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerChannelEvent extends Event {
        private final PlayerChannelEventData value;
        public PlayerChannelEvent(PlayerChannelEventData value) { this.value = value; }
        public PlayerChannelEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getChannel() { return value.getChannel(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerCommandPreprocessEvent extends Event {
        private final PlayerCommandPreprocessEventData value;
        public PlayerCommandPreprocessEvent(PlayerCommandPreprocessEventData value) { this.value = value; }
        public PlayerCommandPreprocessEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getCommand() { return value.getCommand(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerEditBookEvent extends Event {
        private final PlayerEditBookEventData value;
        public PlayerEditBookEvent(PlayerEditBookEventData value) { this.value = value; }
        public PlayerEditBookEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getSlot() { return value.getSlot(); }
        public java.util.List<String> getPages() { return value.getPages(); }
        public String getTitle() { return value.getTitle(); }
        public boolean isSigning() { return value.isSigning(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerElytraBoostEvent extends Event {
        private final PlayerElytraBoostEventData value;
        public PlayerElytraBoostEvent(PlayerElytraBoostEventData value) { this.value = value; }
        public PlayerElytraBoostEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getFireworkId() { return value.getFireworkId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerExpCooldownChangeEvent extends Event {
        private final PlayerExpCooldownChangeEventData value;
        public PlayerExpCooldownChangeEvent(PlayerExpCooldownChangeEventData value) { this.value = value; }
        public PlayerExpCooldownChangeEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getNewCooldown() { return value.getNewCooldown(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerHarvestBlockEvent extends Event {
        private final PlayerHarvestBlockEventData value;
        public PlayerHarvestBlockEvent(PlayerHarvestBlockEventData value) { this.value = value; }
        public PlayerHarvestBlockEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public java.util.List<ItemStack> getHarvestedItems() { return value.getHarvestedItems(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerHideEntityEvent extends Event {
        private final PlayerHideEntityEventData value;
        public PlayerHideEntityEvent(PlayerHideEntityEventData value) { this.value = value; }
        public PlayerHideEntityEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getEntityId() { return value.getEntityId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerItemBreakEvent extends Event {
        private final PlayerItemBreakEventData value;
        public PlayerItemBreakEvent(PlayerItemBreakEventData value) { this.value = value; }
        public PlayerItemBreakEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getItemName() { return value.getItemName(); }
    }

    public static final class PlayerItemMendEvent extends Event {
        private final PlayerItemMendEventData value;
        public PlayerItemMendEvent(PlayerItemMendEventData value) { this.value = value; }
        public PlayerItemMendEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getItemName() { return value.getItemName(); }
        public int getRepairAmount() { return value.getRepairAmount(); }
        public int getExpConsumed() { return value.getExpConsumed(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerKickEvent extends Event {
        private final PlayerKickEventData value;
        public PlayerKickEvent(PlayerKickEventData value) { this.value = value; }
        public PlayerKickEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getReason() { return value.getReason(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerLeashEntityEvent extends Event {
        private final PlayerLeashEntityEventData value;
        public PlayerLeashEntityEvent(PlayerLeashEntityEventData value) { this.value = value; }
        public PlayerLeashEntityEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getEntityId() { return value.getEntityId(); }
        public int getHolderId() { return value.getHolderId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerLevelChangeEvent extends Event {
        private final PlayerLevelChangeEventData value;
        public PlayerLevelChangeEvent(PlayerLevelChangeEventData value) { this.value = value; }
        public PlayerLevelChangeEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getOldLevel() { return value.getOldLevel(); }
        public int getNewLevel() { return value.getNewLevel(); }
    }

    public static final class PlayerLocaleChangeEvent extends Event {
        private final PlayerLocaleChangeEventData value;
        public PlayerLocaleChangeEvent(PlayerLocaleChangeEventData value) { this.value = value; }
        public PlayerLocaleChangeEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getNewLocale() { return value.getNewLocale(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerNameEntityEvent extends Event {
        private final PlayerNameEntityEventData value;
        public PlayerNameEntityEvent(PlayerNameEntityEventData value) { this.value = value; }
        public PlayerNameEntityEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getEntityId() { return value.getEntityId(); }
        public TextComponent getName() { return value.getName(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerOpenSignEvent extends Event {
        private final PlayerOpenSignEventData value;
        public PlayerOpenSignEvent(PlayerOpenSignEventData value) { this.value = value; }
        public PlayerOpenSignEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public boolean isIsFront() { return value.isIsFront(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerPortalEvent extends Event {
        private final PlayerPortalEventData value;
        public PlayerPortalEvent(PlayerPortalEventData value) { this.value = value; }
        public PlayerPortalEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public BlockPos getFromPos() { return value.getFromPos(); }
        public BlockPos getToPos() { return value.getToPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerPreLoginEvent extends Event {
        private final PlayerPreLoginEventData value;
        public PlayerPreLoginEvent(PlayerPreLoginEventData value) { this.value = value; }
        public PlayerPreLoginEventData getValue() { return value; }
        public String getPlayerName() { return value.getPlayerName(); }
        public String getPlayerUuid() { return value.getPlayerUuid(); }
        public String getIpAddress() { return value.getIpAddress(); }
        public TextComponent getKickMessage() { return value.getKickMessage(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerRiptideEvent extends Event {
        private final PlayerRiptideEventData value;
        public PlayerRiptideEvent(PlayerRiptideEventData value) { this.value = value; }
        public PlayerRiptideEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getItemName() { return value.getItemName(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerShearEntityEvent extends Event {
        private final PlayerShearEntityEventData value;
        public PlayerShearEntityEvent(PlayerShearEntityEventData value) { this.value = value; }
        public PlayerShearEntityEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getEntityId() { return value.getEntityId(); }
        public int getHand() { return value.getHand(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerShowEntityEvent extends Event {
        private final PlayerShowEntityEventData value;
        public PlayerShowEntityEvent(PlayerShowEntityEventData value) { this.value = value; }
        public PlayerShowEntityEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getEntityId() { return value.getEntityId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerSpawnChangeEvent extends Event {
        private final PlayerSpawnChangeEventData value;
        public PlayerSpawnChangeEvent(PlayerSpawnChangeEventData value) { this.value = value; }
        public PlayerSpawnChangeEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public BlockPos getNewSpawn() { return value.getNewSpawn(); }
        public boolean isForced() { return value.isForced(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerStatisticIncrementEvent extends Event {
        private final PlayerStatisticIncrementEventData value;
        public PlayerStatisticIncrementEvent(PlayerStatisticIncrementEventData value) { this.value = value; }
        public PlayerStatisticIncrementEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getStatisticId() { return value.getStatisticId(); }
        public int getAmount() { return value.getAmount(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerSwapHandsEvent extends Event {
        private final PlayerSwapHandsEventData value;
        public PlayerSwapHandsEvent(PlayerSwapHandsEventData value) { this.value = value; }
        public PlayerSwapHandsEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerTakeLecternBookEvent extends Event {
        private final PlayerTakeLecternBookEventData value;
        public PlayerTakeLecternBookEvent(PlayerTakeLecternBookEventData value) { this.value = value; }
        public PlayerTakeLecternBookEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public BlockPos getBlockPos() { return value.getBlockPos(); }
        public ItemStack getBook() { return value.getBook(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerUnleashEntityEvent extends Event {
        private final PlayerUnleashEntityEventData value;
        public PlayerUnleashEntityEvent(PlayerUnleashEntityEventData value) { this.value = value; }
        public PlayerUnleashEntityEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getEntityId() { return value.getEntityId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerVelocityEvent extends Event {
        private final PlayerVelocityEventData value;
        public PlayerVelocityEvent(PlayerVelocityEventData value) { this.value = value; }
        public PlayerVelocityEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public Position getVelocity() { return value.getVelocity(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerInputEvent extends Event {
        private final PlayerInputEventData value;
        public PlayerInputEvent(PlayerInputEventData value) { this.value = value; }
        public PlayerInputEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getInput() { return value.getInput(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerInteractAtEntityEvent extends Event {
        private final PlayerInteractAtEntityEventData value;
        public PlayerInteractAtEntityEvent(PlayerInteractAtEntityEventData value) { this.value = value; }
        public PlayerInteractAtEntityEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getEntityId() { return value.getEntityId(); }
        public double getClickedX() { return value.getClickedX(); }
        public double getClickedY() { return value.getClickedY(); }
        public double getClickedZ() { return value.getClickedZ(); }
        public int getHand() { return value.getHand(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerLinksSendEvent extends Event {
        private final PlayerLinksSendEventData value;
        public PlayerLinksSendEvent(PlayerLinksSendEventData value) { this.value = value; }
        public PlayerLinksSendEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public java.util.List<String> getLinks() { return value.getLinks(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerPickupArrowEvent extends Event {
        private final PlayerPickupArrowEventData value;
        public PlayerPickupArrowEvent(PlayerPickupArrowEventData value) { this.value = value; }
        public PlayerPickupArrowEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public int getArrowId() { return value.getArrowId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerRecipeBookClickEvent extends Event {
        private final PlayerRecipeBookClickEventData value;
        public PlayerRecipeBookClickEvent(PlayerRecipeBookClickEventData value) { this.value = value; }
        public PlayerRecipeBookClickEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getRecipeId() { return value.getRecipeId(); }
        public boolean isMakeAll() { return value.isMakeAll(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerRecipeBookSettingsChangeEvent extends Event {
        private final PlayerRecipeBookSettingsChangeEventData value;
        public PlayerRecipeBookSettingsChangeEvent(PlayerRecipeBookSettingsChangeEventData value) { this.value = value; }
        public PlayerRecipeBookSettingsChangeEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getBookType() { return value.getBookType(); }
        public boolean isIsOpen() { return value.isIsOpen(); }
        public boolean isIsFiltering() { return value.isIsFiltering(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerRecipeDiscoverEvent extends Event {
        private final PlayerRecipeDiscoverEventData value;
        public PlayerRecipeDiscoverEvent(PlayerRecipeDiscoverEventData value) { this.value = value; }
        public PlayerRecipeDiscoverEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getRecipeId() { return value.getRecipeId(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerRegisterChannelEvent extends Event {
        private final PlayerRegisterChannelEventData value;
        public PlayerRegisterChannelEvent(PlayerRegisterChannelEventData value) { this.value = value; }
        public PlayerRegisterChannelEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getChannel() { return value.getChannel(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerResourcePackStatusEvent extends Event {
        private final PlayerResourcePackStatusEventData value;
        public PlayerResourcePackStatusEvent(PlayerResourcePackStatusEventData value) { this.value = value; }
        public PlayerResourcePackStatusEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getPackId() { return value.getPackId(); }
        public String getStatus() { return value.getStatus(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerSpawnLocationEvent extends Event {
        private final PlayerSpawnLocationEventData value;
        public PlayerSpawnLocationEvent(PlayerSpawnLocationEventData value) { this.value = value; }
        public PlayerSpawnLocationEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public Position getSpawnPos() { return value.getSpawnPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class PlayerUnregisterChannelEvent extends Event {
        private final PlayerUnregisterChannelEventData value;
        public PlayerUnregisterChannelEvent(PlayerUnregisterChannelEventData value) { this.value = value; }
        public PlayerUnregisterChannelEventData getValue() { return value; }
        public Player getPlayer() { return value.getPlayer(); }
        public String getChannel() { return value.getChannel(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class RaidFinishEvent extends Event {
        private final RaidFinishEventData value;
        public RaidFinishEvent(RaidFinishEventData value) { this.value = value; }
        public RaidFinishEventData getValue() { return value; }
        public boolean isVictory() { return value.isVictory(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class RaidSpawnWaveEvent extends Event {
        private final RaidSpawnWaveEventData value;
        public RaidSpawnWaveEvent(RaidSpawnWaveEventData value) { this.value = value; }
        public RaidSpawnWaveEventData getValue() { return value; }
        public int getWave() { return value.getWave(); }
        public BlockPos getPos() { return value.getPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class RaidStopEvent extends Event {
        private final RaidStopEventData value;
        public RaidStopEvent(RaidStopEventData value) { this.value = value; }
        public RaidStopEventData getValue() { return value; }
        public String getReason() { return value.getReason(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class RaidTriggerEvent extends Event {
        private final RaidTriggerEventData value;
        public RaidTriggerEvent(RaidTriggerEventData value) { this.value = value; }
        public RaidTriggerEventData getValue() { return value; }
        public BlockPos getPos() { return value.getPos(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

    public static final class LightningStrikeEvent extends Event {
        private final LightningStrikeEventData value;
        public LightningStrikeEvent(LightningStrikeEventData value) { this.value = value; }
        public LightningStrikeEventData getValue() { return value; }
        public Position getPosition() { return value.getPosition(); }
        public boolean isIsEffect() { return value.isIsEffect(); }
        public boolean isCancelled() { return value.isCancelled(); }
        public void setCancelled(boolean value) { this.value.setCancelled(value); }
    }

}
