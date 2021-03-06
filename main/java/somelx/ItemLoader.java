package somelx;

import block.Bloque;
import block.ModBlocks;
import item.Navaja;
import item.Prueba;
import item.food.Dough;
import item.food.Flour;
import item.food.SweetDough;

public class ItemLoader {

	
    public static void preInit() {

    	ModBlocks.preInit();
		Prueba.preInit();
		Flour.preInit();
		Dough.preInit();
		Bloque.preInit();
		SweetDough.preInit();
		Navaja.preInit();
    }


    public static void init() {

        ModBlocks.init();
        Prueba.init();
        Flour.init();
        Dough.init();
        Bloque.init();
        SweetDough.init();
        Navaja.init();
    }


    public static void postInit() {

    }
}
