package net.gp.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.gp.tutorialmod.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	//test 2 4
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
