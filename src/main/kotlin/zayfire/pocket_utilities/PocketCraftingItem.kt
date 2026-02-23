package zayfire.pocket_utilities

import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.screen.CraftingScreenHandler
import net.minecraft.screen.SimpleNamedScreenHandlerFactory
import net.minecraft.text.Text
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World

class PocketCraftingItem(settings: Settings) : Item(settings) {

    override fun use(
        world: World,
        player: PlayerEntity,
        hand: Hand
    ): TypedActionResult<ItemStack> {

        if (!world.isClient) {
            player.openHandledScreen(
                SimpleNamedScreenHandlerFactory(
                    { syncId, inv, _ ->
                        CraftingScreenHandler(syncId, inv)
                    },
                    Text.translatable("container.crafting")
                )
            )
        }

        return TypedActionResult.success(player.getStackInHand(hand))
    }
}
