package com.akurakuu.compressblock;

import com.google.common.base.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
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


    // HAY_BLOCKS
    private static final BlockBehaviour.Properties COMPRESSED_HAY_BLOCK_PROPERTIES(float hardness, float resistance) {

        return BlockBehaviour.Properties.of(Material.SPONGE)
            .strength(hardness, resistance)
            .sound(SoundType.GRASS);
    }

    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK_9X = BLOCKS.register(
        "compressed_hay_block_9x",
        () -> new Block(COMPRESSED_HAY_BLOCK_PROPERTIES(
            1f,
            0.75f
        ))
    );

    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK_81X = BLOCKS.register(
        "compressed_hay_block_81x",
        () -> new Block(COMPRESSED_HAY_BLOCK_PROPERTIES(
            1.25f,
            1f
        ))
    );

    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK_729X = BLOCKS.register(
        "compressed_hay_block_729x",
        () -> new Block(COMPRESSED_HAY_BLOCK_PROPERTIES(
            1.5f,
            1.25f
        ))
    );

    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK_6561X = BLOCKS.register(
        "compressed_hay_block_6561x",
        () -> new Block(COMPRESSED_HAY_BLOCK_PROPERTIES(
            1.75f,
            1.5f
        ))
    );

    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK_59049X = BLOCKS.register(
        "compressed_hay_block_59049x",
        () -> new Block(COMPRESSED_HAY_BLOCK_PROPERTIES(
            2f,
            1.75f
        ))
    );

    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK_531441X = BLOCKS.register(
        "compressed_hay_block_531441x",
        () -> new Block(COMPRESSED_HAY_BLOCK_PROPERTIES(
            2.25f,
            2f
        ))
    );

    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK_4782969X = BLOCKS.register(
        "compressed_hay_block_4782969x",
        () -> new Block(COMPRESSED_HAY_BLOCK_PROPERTIES(
            2.5f,
            2.25f
        ))
    );

    public static final RegistryObject<Block> COMPRESSED_HAY_BLOCK_43046721X = BLOCKS.register(
        "compressed_hay_block_43046721x",
        () -> new Block(COMPRESSED_HAY_BLOCK_PROPERTIES(
            2.75f,
            2.5f
        ))
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
