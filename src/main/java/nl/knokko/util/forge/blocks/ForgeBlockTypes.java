package nl.knokko.util.forge.blocks;

import static net.minecraft.init.Blocks.*;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class ForgeBlockTypes {
	
	private static final List<Class> blockClasses = new ArrayList<Class>();
	
	static {
		blockClasses.add(Blocks.class);
	}
	
	public static final ForgeBlockType PLANKS_OAK = new ForgeBlockType(PLANKS, 0);
	public static final ForgeBlockType PLANKS_SPRUCE = new ForgeBlockType(PLANKS, 1);
	public static final ForgeBlockType PLANKS_BIRCH = new ForgeBlockType(PLANKS, 2);
	public static final ForgeBlockType PLANKS_JUNGLE = new ForgeBlockType(PLANKS, 3);
	public static final ForgeBlockType PLANKS_ACACIA = new ForgeBlockType(PLANKS, 4);
	public static final ForgeBlockType PLANKS_DARK = new ForgeBlockType(PLANKS, 5);
	
	public static final ForgeBlockType LOG_OAK_Y = new ForgeBlockType(LOG, 0);
	public static final ForgeBlockType LOG_SPRUCE_Y = new ForgeBlockType(LOG, 1);
	public static final ForgeBlockType LOG_BIRCH_Y = new ForgeBlockType(LOG, 2);
	public static final ForgeBlockType LOG_JUNGLE_Y = new ForgeBlockType(LOG, 3);
	public static final ForgeBlockType LOG_OAK_X = new ForgeBlockType(LOG, 4);
	public static final ForgeBlockType LOG_SPRUCE_X = new ForgeBlockType(LOG, 5);
	public static final ForgeBlockType LOG_BIRCH_X = new ForgeBlockType(LOG, 6);
	public static final ForgeBlockType LOG_JUNGLE_X = new ForgeBlockType(LOG, 7);
	public static final ForgeBlockType LOG_OAK_Z = new ForgeBlockType(LOG, 8);
	public static final ForgeBlockType LOG_SPRUCE_Z = new ForgeBlockType(LOG, 9);
	public static final ForgeBlockType LOG_BIRCH_Z = new ForgeBlockType(LOG, 10);
	public static final ForgeBlockType LOG_JUNGLE_Z = new ForgeBlockType(LOG, 11);
	public static final ForgeBlockType LOG_OAK_N = new ForgeBlockType(LOG, 12);
	public static final ForgeBlockType LOG_SPRUCE_N = new ForgeBlockType(LOG, 13);
	public static final ForgeBlockType LOG_BIRCH_N = new ForgeBlockType(LOG, 14);
	public static final ForgeBlockType LOG_JUNGLE_N = new ForgeBlockType(LOG, 15);
	
	public static final ForgeBlockType SLAB_STONE_LOW = new ForgeBlockType(STONE_SLAB, 0);
	public static final ForgeBlockType SLAB_SANDSTONE_LOW = new ForgeBlockType(STONE_SLAB, 1);
	public static final ForgeBlockType SLAB_OAK_LOW = new ForgeBlockType(STONE_SLAB, 2);
	public static final ForgeBlockType SLAB_COBBLE_LOW = new ForgeBlockType(STONE_SLAB, 3);
	public static final ForgeBlockType SLAB_BRICKS_LOW = new ForgeBlockType(STONE_SLAB, 4);
	public static final ForgeBlockType SLAB_STONEBRICKS_LOW = new ForgeBlockType(STONE_SLAB, 5);
	public static final ForgeBlockType SLAB_NETHERBRICKS_LOW = new ForgeBlockType(STONE_SLAB, 6);
	public static final ForgeBlockType SLAB_QUARTZ_LOW = new ForgeBlockType(STONE_SLAB, 7);
	public static final ForgeBlockType SLAB_REDSANDSTONE_LOW = new ForgeBlockType(STONE_SLAB2, 0);
	public static final ForgeBlockType SLAB_STONE_UP = new ForgeBlockType(STONE_SLAB, 8);
	public static final ForgeBlockType SLAB_SANDSTONE_UP = new ForgeBlockType(STONE_SLAB, 9);
	public static final ForgeBlockType SLAB_OAK_UP = new ForgeBlockType(STONE_SLAB, 10);
	public static final ForgeBlockType SLAB_COBBLE_UP = new ForgeBlockType(STONE_SLAB, 11);
	public static final ForgeBlockType SLAB_BRICKS_UP = new ForgeBlockType(STONE_SLAB, 12);
	public static final ForgeBlockType SLAB_STONEBRICKS_UP = new ForgeBlockType(STONE_SLAB, 13);
	public static final ForgeBlockType SLAB_NETHERBRICKS_UP = new ForgeBlockType(STONE_SLAB, 14);
	public static final ForgeBlockType SLAB_QUARTZ_UP = new ForgeBlockType(STONE_SLAB, 15);
	public static final ForgeBlockType SLAB_REDSANDSTONE_UP = new ForgeBlockType(STONE_SLAB2, 8);
	
	public static final ForgeBlockType SANDSTONE_BRICKS = new ForgeBlockType(SANDSTONE, 0);
	public static final ForgeBlockType SANDSTONE_CHISELED = new ForgeBlockType(SANDSTONE, 1);
	public static final ForgeBlockType SANDSTONE_SMOOTH = new ForgeBlockType(SANDSTONE, 2);
	
	public static final ForgeBlockType WOOL_WHITE = new ForgeBlockType(WOOL, 0);
	public static final ForgeBlockType WOOL_ORANGE = new ForgeBlockType(WOOL, 1);
	public static final ForgeBlockType WOOL_MAGENTA = new ForgeBlockType(WOOL, 2);
	public static final ForgeBlockType WOOL_LIGHT_BLUE = new ForgeBlockType(WOOL, 3);
	public static final ForgeBlockType WOOL_YELLOW = new ForgeBlockType(WOOL, 4);
	public static final ForgeBlockType WOOL_LIME = new ForgeBlockType(WOOL, 5);
	public static final ForgeBlockType WOOL_PINK = new ForgeBlockType(WOOL, 6);
	public static final ForgeBlockType WOOL_GRAY = new ForgeBlockType(WOOL, 7);
	public static final ForgeBlockType WOOL_LIGHT_GRAY = new ForgeBlockType(WOOL, 8);
	public static final ForgeBlockType WOOL_CYAN = new ForgeBlockType(WOOL, 9);
	public static final ForgeBlockType WOOL_PURPLE = new ForgeBlockType(WOOL, 10);
	public static final ForgeBlockType WOOL_BLUE = new ForgeBlockType(WOOL, 11);
	public static final ForgeBlockType WOOL_BROWN = new ForgeBlockType(WOOL, 12);
	public static final ForgeBlockType WOOL_GREEN = new ForgeBlockType(WOOL, 13);
	public static final ForgeBlockType WOOL_RED = new ForgeBlockType(WOOL, 14);
	public static final ForgeBlockType WOOL_BLACK = new ForgeBlockType(WOOL, 15);
	
	public static final ForgeBlockType GLASS_WHITE = new ForgeBlockType(GLASS, 0);
	public static final ForgeBlockType GLASS_ORANGE = new ForgeBlockType(GLASS, 1);
	public static final ForgeBlockType GLASS_MAGENTA = new ForgeBlockType(GLASS, 2);
	public static final ForgeBlockType GLASS_LIGHT_BLUE = new ForgeBlockType(GLASS, 3);
	public static final ForgeBlockType GLASS_YELLOW = new ForgeBlockType(GLASS, 4);
	public static final ForgeBlockType GLASS_LIME = new ForgeBlockType(GLASS, 5);
	public static final ForgeBlockType GLASS_PINK = new ForgeBlockType(GLASS, 6);
	public static final ForgeBlockType GLASS_GRAY = new ForgeBlockType(GLASS, 7);
	public static final ForgeBlockType GLASS_LIGHT_GRAY = new ForgeBlockType(GLASS, 8);
	public static final ForgeBlockType GLASS_CYAN = new ForgeBlockType(GLASS, 9);
	public static final ForgeBlockType GLASS_PURPLE = new ForgeBlockType(GLASS, 10);
	public static final ForgeBlockType GLASS_BLUE = new ForgeBlockType(GLASS, 11);
	public static final ForgeBlockType GLASS_BROWN = new ForgeBlockType(GLASS, 12);
	public static final ForgeBlockType GLASS_GREEN = new ForgeBlockType(GLASS, 13);
	public static final ForgeBlockType GLASS_RED = new ForgeBlockType(GLASS, 14);
	public static final ForgeBlockType GLASS_BLACK = new ForgeBlockType(GLASS, 15);
	
	public static final ForgeBlockType CONCRETE_WHITE = new ForgeBlockType(CONCRETE, 0);
	public static final ForgeBlockType CONCRETE_ORANGE = new ForgeBlockType(CONCRETE, 1);
	public static final ForgeBlockType CONCRETE_MAGENTA = new ForgeBlockType(CONCRETE, 2);
	public static final ForgeBlockType CONCRETE_LIGHT_BLUE = new ForgeBlockType(CONCRETE, 3);
	public static final ForgeBlockType CONCRETE_YELLOW = new ForgeBlockType(CONCRETE, 4);
	public static final ForgeBlockType CONCRETE_LIME = new ForgeBlockType(CONCRETE, 5);
	public static final ForgeBlockType CONCRETE_PINK = new ForgeBlockType(CONCRETE, 6);
	public static final ForgeBlockType CONCRETE_GRAY = new ForgeBlockType(CONCRETE, 7);
	public static final ForgeBlockType CONCRETE_LIGHT_GRAY = new ForgeBlockType(CONCRETE, 8);
	public static final ForgeBlockType CONCRETE_CYAN = new ForgeBlockType(CONCRETE, 9);
	public static final ForgeBlockType CONCRETE_PURPLE = new ForgeBlockType(CONCRETE, 10);
	public static final ForgeBlockType CONCRETE_BLUE = new ForgeBlockType(CONCRETE, 11);
	public static final ForgeBlockType CONCRETE_BROWN = new ForgeBlockType(CONCRETE, 12);
	public static final ForgeBlockType CONCRETE_GREEN = new ForgeBlockType(CONCRETE, 13);
	public static final ForgeBlockType CONCRETE_RED = new ForgeBlockType(CONCRETE, 14);
	public static final ForgeBlockType CONCRETE_BLACK = new ForgeBlockType(CONCRETE, 15);
	
	public static final ForgeBlockType CONCRETE_POWDER_WHITE = new ForgeBlockType(CONCRETE_POWDER, 0);
	public static final ForgeBlockType CONCRETE_POWDER_ORANGE = new ForgeBlockType(CONCRETE_POWDER, 1);
	public static final ForgeBlockType CONCRETE_POWDER_MAGENTA = new ForgeBlockType(CONCRETE_POWDER, 2);
	public static final ForgeBlockType CONCRETE_POWDER_LIGHT_BLUE = new ForgeBlockType(CONCRETE_POWDER, 3);
	public static final ForgeBlockType CONCRETE_POWDER_YELLOW = new ForgeBlockType(CONCRETE_POWDER, 4);
	public static final ForgeBlockType CONCRETE_POWDER_LIME = new ForgeBlockType(CONCRETE_POWDER, 5);
	public static final ForgeBlockType CONCRETE_POWDER_PINK = new ForgeBlockType(CONCRETE_POWDER, 6);
	public static final ForgeBlockType CONCRETE_POWDER_GRAY = new ForgeBlockType(CONCRETE_POWDER, 7);
	public static final ForgeBlockType CONCRETE_POWDER_LIGHT_GRAY = new ForgeBlockType(CONCRETE_POWDER, 8);
	public static final ForgeBlockType CONCRETE_POWDER_CYAN = new ForgeBlockType(CONCRETE_POWDER, 9);
	public static final ForgeBlockType CONCRETE_POWDER_PURPLE = new ForgeBlockType(CONCRETE_POWDER, 10);
	public static final ForgeBlockType CONCRETE_POWDER_BLUE = new ForgeBlockType(CONCRETE_POWDER, 11);
	public static final ForgeBlockType CONCRETE_POWDER_BROWN = new ForgeBlockType(CONCRETE_POWDER, 12);
	public static final ForgeBlockType CONCRETE_POWDER_GREEN = new ForgeBlockType(CONCRETE_POWDER, 13);
	public static final ForgeBlockType CONCRETE_POWDER_RED = new ForgeBlockType(CONCRETE_POWDER, 14);
	public static final ForgeBlockType CONCRETE_POWDER_BLACK = new ForgeBlockType(CONCRETE_POWDER, 15);
	
	public static final ForgeBlockType GRANITE_RAW = new ForgeBlockType(STONE, 1);
	public static final ForgeBlockType GRANITE_POLISHED = new ForgeBlockType(STONE, 2);
	
	public static final ForgeBlockType DIORITE_RAW = new ForgeBlockType(STONE, 3);
	public static final ForgeBlockType DIORITE_POLISHED = new ForgeBlockType(STONE, 4);
	
	public static final ForgeBlockType ANDESITE_RAW = new ForgeBlockType(STONE, 5);
	public static final ForgeBlockType ANDESITE_POLISHED = new ForgeBlockType(STONE, 6);
	
	public static final ForgeBlockType DIRT_NORMAL = new ForgeBlockType(DIRT, 0);
	public static final ForgeBlockType DIRT_COARSE = new ForgeBlockType(DIRT, 1);
	public static final ForgeBlockType DIRT_PODZOL = new ForgeBlockType(DIRT, 2);
	
	public static final ForgeBlockType QUARTZ_NORMAL = new ForgeBlockType(QUARTZ_BLOCK, 0);
	public static final ForgeBlockType QUARTZ_CHISELED = new ForgeBlockType(QUARTZ_BLOCK, 1);
	public static final ForgeBlockType QUARTZ_PILLAR = new ForgeBlockType(QUARTZ_BLOCK, 2);
	
	public static final ForgeBlockType[] WOODEN_PLANKS = {PLANKS_OAK, PLANKS_SPRUCE, PLANKS_BIRCH, PLANKS_JUNGLE, PLANKS_ACACIA, PLANKS_DARK};
	public static final ForgeBlockType[] SANDSTONES = {SANDSTONE_BRICKS, SANDSTONE_CHISELED, SANDSTONE_SMOOTH};
	public static final ForgeBlockType[] WOOLS = {WOOL_WHITE, WOOL_ORANGE, WOOL_MAGENTA, WOOL_LIGHT_BLUE, WOOL_YELLOW, WOOL_LIME, WOOL_PINK, WOOL_GRAY, WOOL_LIGHT_GRAY, WOOL_CYAN, WOOL_PURPLE, WOOL_BLUE, WOOL_BROWN, WOOL_GREEN, WOOL_RED, WOOL_BLACK};
	public static final ForgeBlockType[] GLASSES = {GLASS_WHITE, GLASS_ORANGE, GLASS_MAGENTA, GLASS_LIGHT_BLUE, GLASS_YELLOW, GLASS_LIME, GLASS_PINK, GLASS_GRAY, GLASS_LIGHT_GRAY, GLASS_CYAN, GLASS_PURPLE, GLASS_BLUE, GLASS_BROWN, GLASS_GREEN, GLASS_RED, GLASS_BLACK};
	public static final ForgeBlockType[] CONCRETES = {CONCRETE_WHITE, CONCRETE_ORANGE, CONCRETE_MAGENTA, CONCRETE_LIGHT_BLUE, CONCRETE_YELLOW, CONCRETE_LIME, CONCRETE_PINK, CONCRETE_GRAY, CONCRETE_LIGHT_GRAY, CONCRETE_CYAN, CONCRETE_PURPLE, CONCRETE_BLUE, CONCRETE_BROWN, CONCRETE_GREEN, CONCRETE_RED, CONCRETE_BLACK};
	public static final ForgeBlockType[] CONCRETE_POWDERS = {CONCRETE_POWDER_WHITE, CONCRETE_POWDER_ORANGE, CONCRETE_POWDER_MAGENTA, CONCRETE_POWDER_LIGHT_BLUE, CONCRETE_POWDER_YELLOW, CONCRETE_POWDER_LIME, CONCRETE_POWDER_PINK, CONCRETE_POWDER_GRAY, CONCRETE_POWDER_LIGHT_GRAY, CONCRETE_POWDER_CYAN, CONCRETE_POWDER_PURPLE, CONCRETE_POWDER_BLUE, CONCRETE_POWDER_BROWN, CONCRETE_POWDER_GREEN, CONCRETE_POWDER_RED, CONCRETE_POWDER_BLACK};
	
	@Nullable
	public static ForgeBlockType fromString(String string) throws IllegalArgumentException {
		byte meta = 0;
		int index = string.indexOf("[");
		if(index != -1){
			if(!string.endsWith("]"))
					throw new IllegalArgumentException("Invalid block name");
			try {
				meta = Byte.parseByte(string.substring(index + 1, string.length() - 1));
				string = string.substring(index);
			} catch(NumberFormatException nfe){
				throw new IllegalArgumentException("Enter a number between 0 and 15 between the '[' and ']'");
			}
		}
		Block block = Block.getBlockFromName(string);
		if(block != null)
			return new ForgeBlockType(block, meta);
		try {
			int id = Integer.parseInt(string);
			block = Block.getBlockById(id);
			if(block != null)
				return new ForgeBlockType(block, meta);
		} catch(NumberFormatException nfe){}
		string = string.toUpperCase();
		try {
			return (ForgeBlockType) ForgeBlockTypes.class.getField(string).get(null);
		} catch(Exception ex){}
		try {
			return new ForgeBlockType((Block) Blocks.class.getField(string).get(null), meta);
		} catch(Exception ex){}
		for(Class clas : blockClasses){
			try {
				return new ForgeBlockType((Block) clas.getField(string).get(null), meta);
			} catch(Exception ex){}
		}
		return null;
	}
	
	public static void registerBlockClass(Class clas){
		blockClasses.add(clas);
	}
}