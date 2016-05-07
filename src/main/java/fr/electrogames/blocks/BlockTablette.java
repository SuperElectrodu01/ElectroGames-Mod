package fr.electrogames.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Louis (a.k.a Obelouix) on 07/05/2016.
 */
public class BlockTablette extends Block {

    public BlockTablette(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setHardness(2);
        this.setResistance(10);
    }
    public BlockTablette(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, hardness, resistance);
    }

    public BlockTablette(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

}
