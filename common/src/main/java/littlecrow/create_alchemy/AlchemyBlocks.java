package littlecrow.create_alchemy;

import com.simibubi.create.AllSpriteShifts;
import com.simibubi.create.content.decoration.encasing.CasingBlock;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.material.MapColor;

public class AlchemyBlocks {
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreateAlchemy.MOD_ID);

	public static final BlockEntry<CasingBlock> EXAMPLE_BLOCK = REGISTRATE.block("alchemy_block", CasingBlock::new)
			
			.lang("Alchemy Block")
			.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN))
			.transform(BuilderTransformers.casing(() -> AllSpriteShifts.BRASS_CASING))
			.register();

	public static void init() {
		// load the class and register everything
		
		CreateAlchemy.LOGGER.info("Registering blocks for " + CreateAlchemy.NAME);
	}
}
