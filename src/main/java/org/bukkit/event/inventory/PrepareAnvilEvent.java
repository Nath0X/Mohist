package org.bukkit.event.inventory;

import org.bukkit.event.HandlerList;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when an item is put in a slot for repair by an anvil.
 */
public class PrepareAnvilEvent extends com.destroystokyo.paper.event.inventory.PrepareResultEvent {

//    private static final HandlerList handlers = new HandlerList();

    public PrepareAnvilEvent(@NotNull InventoryView inventory, @Nullable ItemStack result) {
        super(inventory, result);
    }

    @NotNull
    @Override
    public AnvilInventory getInventory() {
        return (AnvilInventory) super.getInventory();
    }

    // Paper - move HandlerList to PrepareInventoryResultEvent
}
