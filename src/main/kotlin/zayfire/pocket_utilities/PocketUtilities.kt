package zayfire.pocket_utilities

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.ItemGroups

object PocketUtilities : ModInitializer {

    const val MOD_ID = "pocket-utilities"
    private val LOGGER = LoggerFactory.getLogger(MOD_ID)

    override fun onInitialize() {
        ModItems.registerAll()

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register {
            it.add(ModItems.POCKET_CRAFTING_TABLE)
        }

        LOGGER.info("Pocket Utilities loaded!")
    }
}
