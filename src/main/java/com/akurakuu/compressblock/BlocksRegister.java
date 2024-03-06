package com.akurakuu.compressblock;

import com.google.common.base.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlocksRegister {
    public BlocksRegister() { }

    // public static final DeferredRegister<Block> BLOCKS = DferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);
    public static final DeferredRegister<Block> BLOCKS = Main.BLOCKS;

    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK_9X = BLOCKS.register(
        "compressed_hay_block_9x",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL))
    );

    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK_81X = BLOCKS.register(
        "compressed_hay_block_81x",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL))
    );

    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK_729X = BLOCKS.register(
        "compressed_hay_block_729x",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL))
    );

    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK_6561X = BLOCKS.register(
        "compressed_hay_block_6561x",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL))
    );

    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK_59049X = BLOCKS.register(
        "compressed_hay_block_59049x",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL))
    );

    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK_531441X = BLOCKS.register(
        "compressed_hay_block_531441x",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL))
    );

    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK_4782969X = BLOCKS.register(
        "compressed_hay_block_4782969x",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL))
    );

    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK_43046721X = BLOCKS.register(
        "compressed_hay_block_43046721x",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL))
    );

    @SubscribeEvent
    public static void onRegisterItems(final RegisterEvent event) {
        if (event.getRegistryKey().equals(ForgeRegistries.Keys.ITEMS)){
            BLOCKS.getEntries().forEach( (blockRegistryObject) -> {
                Block block = blockRegistryObject.get();
                Item.Properties properties = new Item.Properties().tab(TabRegister.MAIN_TAB);
                Supplier<Item> blockItemFactory = () -> new BlockItem(block, properties);
                event.register(ForgeRegistries.Keys.ITEMS, blockRegistryObject.getId(), blockItemFactory);
            });
        }
    }
}
