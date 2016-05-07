package fr.electrogames.blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Louis (a.k.a Obelouix) on 07/05/2016.
 */
public class Blocks {

    public static BlockTablette blockTablette;


    public static void createBlocks() {
        GameRegistry.registerBlock(blockTablette = new BlockTablette("block_tablette"), "block_tablette");
    }
}
