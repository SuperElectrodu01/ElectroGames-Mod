package fr.electrogames.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/**
 * Created by Louis (a.k.a Obelouix) on 07/05/2016.
 */
public class BlockTablette extends Block{

    public BlockTablette(Material rock) {
        super(rock);
        setHardness(2.0F);
        setResistance(10.0F);

    }
    @Override
    public boolean isOpaqueCube(IBlockState state) {return false;}
}
