package killkreditbunny.letsmodmod.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "lmm-kkb", name = "LetsMOd-Mod (KillKreditBunny)", version = "0.0.0.0 Pre-BETA whatever")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class letsmodmodMain {
	
	@Instance("tutorial")
	public static letsmodmodMain instance;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
	}

	@Init
	public void init(FMLInitializationEvent event) {
		
	}

	@PostInit
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}