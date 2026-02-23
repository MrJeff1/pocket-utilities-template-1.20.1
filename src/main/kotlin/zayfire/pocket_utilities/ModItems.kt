package zayfire.pocket_utilities

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModItems {

    val POCKET_CRAFTING_TABLE: Item = register(
        "pocket_crafting_table",
        PocketCraftingItem(FabricItemSettings().maxCount(1))
    )

    private fun register(name: String, item: Item): Item {
        return Registry.register(
            Registries.ITEM,
            Identifier(PocketUtilities.MOD_ID, name),
            item
        )
    }

    fun registerAll() {
        // object init forces registration
    }
}
