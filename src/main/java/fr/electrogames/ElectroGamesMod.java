package fr.electrogames;

import fr.electrogames.blocks.Blocks;
import fr.electrogames.proxy.CommonProxy;
import fr.electrogames.recipe.RecipeRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Louis (a.k.a Obelouix) on 06/05/2016.
 * (c) 2016 ElectroGames
 * ElectroGames n'est pas affilié à Mojang AB
*/
 @Mod(modid = Reference.ModID, name = Reference.ModName, version = Reference.version)
public class ElectroGamesMod {


    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        //RoleplayItems.init();
        //RoleplayItems.register();
          Blocks.init();
          Blocks.register();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.registerRenders();
        RecipeRegister.init();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Mod.EventHandler
    public static void preInitClientOnly() {
        //RoleplayBlockMetadata.preInitClientOnly();
    }

    @Mod.EventHandler
    public static void initClientOnly() {
       //BlockMetadata.initClientOnly();
    }

    @Mod.EventHandler
    public static void preInitCommon()
    {
       //BlockMetadata.preInitCommon();
    }


}
