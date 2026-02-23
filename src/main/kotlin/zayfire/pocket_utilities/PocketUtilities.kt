package zayfire.pocket_utilities

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object PocketUtilities : ModInitializer {

    const val MOD_ID = "pocket-utilities"
    private val LOGGER = LoggerFactory.getLogger(MOD_ID)

    override fun onInitialize() {
        ModItems.registerAll()
        LOGGER.info("Pocket Utilities loaded!")
    }
}
