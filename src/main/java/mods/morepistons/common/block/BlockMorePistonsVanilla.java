package mods.morepistons.common.block;

import static mods.morepistons.ModMorePistons.log;
import cpw.mods.fml.common.registry.GameData;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;

public class BlockMorePistonsVanilla extends BlockMorePistonsBase {
	
	
	public BlockMorePistonsVanilla(String registerName, boolean isSticky) {
		super(registerName, isSticky);
	}
	
	//////////////////////////
	// Gestion des textures //
	//////////////////////////
	
	@Override protected void registerBlockIconsTop   (IIconRegister iconRegister) { this.iconTop    = iconRegister.registerIcon(isSticky ? "minecraft:piston_top_sticky" : "minecraft:piston_top_normal"); }
	@Override protected void registerBlockIconsOpen  (IIconRegister iconRegister) { this.iconOpen   = iconRegister.registerIcon("minecraft:piston_inner");   }
	@Override protected void registerBlockIconsBottom(IIconRegister iconRegister) { this.iconBottom = iconRegister.registerIcon("minecraft:piston_bottom"); }
	@Override protected void registerBlockIconsSide  (IIconRegister iconRegister) { this.iconSide   = iconRegister.registerIcon("minecraft:piston_side"); }
	
	
}
