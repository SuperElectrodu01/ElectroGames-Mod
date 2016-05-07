package fr.electrogames;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.logging.Logger;

/**
 * Created by Louis (a.k.a Obelouix) on 06/05/2016.
 * (c) 2016 ElectroGames
 * ElectroGames n'est pas affilié à Mojang AB
*/
 @Mod(modid = ElectroGamesMod.ModId, name = ElectroGamesMod.ModName, version = ElectroGamesMod.version)
public class ElectroGamesMod {

    public static final String ModId = "ElectroGames";
    public static final String ModName = "Electro Games";
    public static final String version = "0.1 ALPHA - 1.9";


    public Logger logger;

    public ElectroGamesMod() {
        logger = Logger.getLogger("ElectroGames");
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        logger.info("Démarrage de l'initialisation");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        logger.info("Initialisation en cours...");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        logger.info("Initialisation terminée \n chargements des éléments");
    }
}
