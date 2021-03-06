package com.topdown.shooter.graphics;

public class Sprite {
	
	public final int	SIZE;
	private int			x, y;
	public int[]		pixels;
	private SpriteSheet	sheet;
	
	public static Sprite voidSprite	 = new Sprite(16, 0, 0, SpriteSheet.tiles);
	public static Sprite grass		 = new Sprite(16, 0, 1, SpriteSheet.tiles);
	public static Sprite grassFlower = new Sprite(16, 1, 1, SpriteSheet.tiles);
	public static Sprite grassStone	 = new Sprite(16, 2, 1, SpriteSheet.tiles);
	
	public static Sprite player_forward	= new Sprite(32, 0, 5, SpriteSheet.tiles); // 5 instead of 10 because sprite is now 32*32 so it's the 5th sprite on the image (10*16 == 5*32)
	public static Sprite player_back	= new Sprite(32, 2, 5, SpriteSheet.tiles); // 5 instead of 10 because sprite is now 32*32 so it's the 5th sprite on the image (10*16 == 5*32)
	public static Sprite player_left	= new Sprite(32, 3, 5, SpriteSheet.tiles); // 5 instead of 10 because sprite is now 32*32 so it's the 5th sprite on the image (10*16 == 5*32)
	public static Sprite player_right	= new Sprite(32, 1, 5, SpriteSheet.tiles); // 5 instead of 10 because sprite is now 32*32 so it's the 5th sprite on the image (10*16 == 5*32)

	public static Sprite player_forward_1 = new Sprite(32, 0, 6, SpriteSheet.tiles);
	public static Sprite player_forward_2 = new Sprite(32, 0, 7, SpriteSheet.tiles);
	
	public static Sprite player_back_1 = new Sprite(32, 2, 6, SpriteSheet.tiles);
	public static Sprite player_back_2 = new Sprite(32, 2, 7, SpriteSheet.tiles);

	public static Sprite player_left_1 = new Sprite(32, 3, 6, SpriteSheet.tiles);
	public static Sprite player_left_2 = new Sprite(32, 3, 7, SpriteSheet.tiles);

	public static Sprite player_right_1	= new Sprite(32, 1, 6, SpriteSheet.tiles);
	public static Sprite player_right_2	= new Sprite(32, 1, 7, SpriteSheet.tiles);
	
	public static Sprite path_middle	= new Sprite(16, 0, 2, SpriteSheet.tiles);
	public static Sprite path_top	= new Sprite(16, 1, 2, SpriteSheet.tiles);
	public static Sprite path_right	= new Sprite(16, 2, 2, SpriteSheet.tiles);
	public static Sprite path_bottom	= new Sprite(16, 3, 2, SpriteSheet.tiles);
	public static Sprite path_left	= new Sprite(16, 4, 2, SpriteSheet.tiles);
	public static Sprite path_innercorner	= new Sprite(16, 5, 2, SpriteSheet.tiles);
	public static Sprite path_outtercorner	= new Sprite(16, 6, 2, SpriteSheet.tiles);
	


	public Sprite(int size, int x, int y, SpriteSheet sheet) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		this.x = x * size; // *size wegen der sprite size
		this.y = y * size;
		this.sheet = sheet;
		load();
	}

	public Sprite(int size, int color) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		setColor(color);
	}

	private void setColor(int color) {
		for (int i = 0; i < SIZE * SIZE; i++) {
			pixels[i] = color;
		}
	}
	
	private void load() {
		for (int y = 0; y < SIZE; y++) {
			for (int x = 0; x < SIZE; x++) {
				pixels[x + y * SIZE] = sheet.pixels[(this.x + x) + (this.y + y) * sheet.SIZE];
			}
		}
	}
	
}
