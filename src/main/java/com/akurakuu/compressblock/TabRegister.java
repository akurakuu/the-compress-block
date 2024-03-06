package com.akurakuu.compressblock;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class TabRegister {
    public TabRegister() { }

    public static void register() { }

    public static final CreativeTab MAIN_TAB = new CreativeTab(
        Main.MODID,
        Items.DIAMOND
    );

    public static class CreativeTab  extends CreativeModeTab {
        private ItemStack icon;

        public CreativeTab(String label, Item icon) {
            super(label);
            this.icon = new ItemStack(Items.DIAMOND);
        }

        public CreativeTab(String label, ItemStack icon) {
            super(label);
            this.icon = icon;
        }

        public CreativeTab(String label, Block icon) {
            super(label);
            this.icon = new ItemStack(icon);
        }

        @Override
        public ItemStack makeIcon() {
            return icon;
        }
    }
}
