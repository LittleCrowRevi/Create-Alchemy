package littlecrow.createalchemy;

import com.simibubi.create.content.decoration.encasing.CasingBlock;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Block;

public class AlchemyBlocks {
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreateAlchemy.MOD_ID);

	public static final BlockEntry<CasingBlock> EXAMPLE_BLOCK = REGISTRATE.block("alchemy_block", CasingBlock::new).register();

	public static void init() {
		// load the class and register everything
		
		CreateAlchemy.LOGGER.info("Registering blocks for " + CreateAlchemy.NAME);
	}
}
