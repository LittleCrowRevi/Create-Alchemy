package littlecrow.createalchemy.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import littlecrow.createalchemy.AlchemyBlocks;
import littlecrow.createalchemy.CreateAlchemy;
import net.fabricmc.api.ModInitializer;

public class CreateAlchemyFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CreateAlchemy.init();
        CreateAlchemy.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), CreateAlchemy.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        AlchemyBlocks.REGISTRATE.register();
    }
}
