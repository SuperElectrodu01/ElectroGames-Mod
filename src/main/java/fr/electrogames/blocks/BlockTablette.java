package fr.electrogames.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

/**
 * Created by Louis (a.k.a Obelouix) on 07/05/2016.
 */
public class BlockTablette extends Block {

    public BlockTablette(Material rock) {
        super(rock);
        setHardness(2.0F);
        setResistance(10.0F);

    }
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return true;
    }
}
