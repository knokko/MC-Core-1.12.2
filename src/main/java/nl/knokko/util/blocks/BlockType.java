package nl.knokko.util.blocks;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BlockType implements Comparable<BlockType> {
	
	private final String id;
	private final byte meta;
	
	public BlockType(String id, int meta){
		if(id == null)
			throw new NullPointerException("id is null");
		this.id = id;
		if(meta < 0)
			throw new IllegalArgumentException("meta is smaller than zero: " + meta);
		if(meta >= 16)
			throw new IllegalArgumentException("meta is not smaller than sixteen: " + meta);
		this.meta = (byte) meta;
	}
	
	public BlockType(DataInputStream input) throws IOException {
		this(input.readUTF(), input.readByte());
	}
	
	@Override
	public boolean equals(Object other){
		return other instanceof BlockType && sameBlock((BlockType) other);
	}
	
	@Override
	public String toString(){
		return id + "[" + meta + "]";
	}
	
	/**
	 * Checks if 2 BlockType's represent the same block.
	 * @param other The BlockType to compare with
	 * @return true if both types represent the same block
	 */
	public boolean sameBlock(BlockType other){
		return id.equals(other.id) && meta == other.meta;
	}
	
	/**
	 * @return The ID of the block (a String)
	 */
	public String getBlockID(){
		return id;
	}
	
	/**
	 * @return The meta data of this block type [0,15]
	 */
	public int getMetaData(){
		return meta;
	}

	public int compareTo(BlockType other) {
		int c = id.compareTo(other.id);
		if(c != 0)
			return c;
		return meta - other.meta;
	}
	
	/**
	 * Save this BlockType so it can be recreated by the constructor that requires a DataInputStream.
	 * @param output The output stream to save the data
	 * @throws IOException if the output parameters throws an IOException
	 */
	public void save(DataOutputStream output) throws IOException {
		output.writeUTF(id);
		output.writeByte(meta);
	}
}