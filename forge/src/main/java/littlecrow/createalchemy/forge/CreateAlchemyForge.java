package littlecrow.createalchemy.forge;

import littlecrow.createalchemy.ExampleBlocks;
import littlecrow.createalchemy.CreateAlchemy;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateAlchemy.MOD_ID)
public class CreateAlchemyForge {
    public CreateAlchemyForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ExampleBlocks.REGISTRATE.registerEventListeners(eventBus);
        CreateAlchemy.init();
    }
}
