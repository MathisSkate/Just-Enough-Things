package fr.mathisskate.justenoughthings.item;


import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;


public class BaseBlockItem extends BlockItem {
    public BaseBlockItem(Block block) {
        super(block, new Properties());
    }
}