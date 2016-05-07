package fr.electrogames.blocks;

import fr.electrogames.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Louis (a.k.a Obelouix) on 07/05/2016.
 */
public class Blocks {

    public static Block Tablette;
    public static Block Window;

    public static void init() {

        Tablette = new  BlockTablette(Material.wood).setUnlocalizedName(
                "table").setCreativeTab(CreativeTabs.tabDecorations);
        Window = new BlockWindow(Material.glass).setUnlocalizedName("window").setCreativeTab(CreativeTabs.tabBlock);
    }

    public static void register() {
        GameRegistry.registerBlock(Tablette, Tablette
                .getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(Window, Window.getUnlocalizedName().substring(5));

    }
    public static void registerRenders() {
        registerRender(Tablette);
        registerRender(Window);
    }

    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft
                .getMinecraft()
                .getRenderItem()
                .getItemModelMesher()
                .register(
                        item,
                        0,
                        new ModelResourceLocation(Reference.ModID + ":"
                                + item.getUnlocalizedName().substring(5),
                                "inventory"));
    }

}
