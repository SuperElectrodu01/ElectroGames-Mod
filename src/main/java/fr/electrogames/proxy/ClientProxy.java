package fr.electrogames.proxy;

import fr.electrogame.Items.Items;
import fr.electrogames.blocks.Blocks;

/**
 * Created by Louis (a.k.a Obelouix) on 07/05/2016.
 * <br>
 *  <b>Proxy coté serveur</b>
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {

        Items.registerRenders();
        Blocks.registerRenders();

    }
}
