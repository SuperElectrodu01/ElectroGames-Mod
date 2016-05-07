package fr.electrogames.proxy;

import fr.electrogames.blocks.Blocks;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Louis (a.k.a Obelouix) on 07/05/2016.
 * <br>
 *  <b>Proxy commun au serveur et au client</b>
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        Blocks.createBlocks();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }

}
