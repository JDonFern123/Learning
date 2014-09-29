package com.strange.learn.init;

import com.strange.learn.item.ItemL;
import com.strange.learn.item.ItemTesla;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems 
{
    public static final ItemL tesla = new ItemTesla();
    
    public static void init()
    {
    	GameRegistry.registerItem(tesla, "tesla");
    }
}
