package com.vylegzv.prototype;

import com.vylegzv.prototype.door.Door;
import com.vylegzv.prototype.wall.Wall;
import com.vylegzv.prototype.window.Window;

/**
 * Interface for creating houses.
 * 
 * @author vella
 *
 */
public interface HouseFactory {

  Wall createWall();

  Door createDoor();

  Window createWindow();
}
