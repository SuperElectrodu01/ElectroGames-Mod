package fr.electrogames.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/**
 * Created by Louis (a.k.a Obelouix) on 07/05/2016.
 */
public class BlockWindow extends Block {
    public BlockWindow(Material glass) {
        super(glass);
        setResistance(1.5F);
        setHardness(0.3F);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {return false;}
}
