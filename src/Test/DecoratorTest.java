package Test;

import Model.Product.*;
import org.junit.Test;

public class DecoratorTest {
    @Test
    public void DecoratorProduct(){
        Product beef = new Beef();
        Product gabbageVeg = new CabbageVeg();
        Product grassVeg = new GrassVeg();
        Product egg = new Egg();
        Product rabbitHair = new RabbitHair();
        Product rabbitMeat = new RabbitMeat();
        Product potatoVeg = new PotatoVeg();
        Product chickenMeat = new ChickenMeat();
        Product cornVeg = new CornVeg();

        System.out.println(beef.toString());
        System.out.println(egg.toString());
        System.out.println(rabbitHair.toString());
        System.out.println(rabbitMeat.toString());
        System.out.println(chickenMeat.toString());
        System.out.println(potatoVeg.toString());
        System.out.println(grassVeg.toString());
        System.out.println(gabbageVeg.toString());
        System.out.println(cornVeg.toString());

        double boxDiscount = 5;
        double wholesaleDiscount = 0.02;

        ProcessDecorator beefBoxing = new BoxingDecorator(beef,boxDiscount);
        ProcessDecorator grassBoxing = new BoxingDecorator(grassVeg,boxDiscount);
        ProcessDecorator gabbageBoxing = new BoxingDecorator(gabbageVeg,boxDiscount);
        ProcessDecorator eggBoxing = new BoxingDecorator(egg,boxDiscount);
        ProcessDecorator rabbitHairBoxing = new BoxingDecorator(rabbitHair,boxDiscount);
        ProcessDecorator rabbitMeatBoxing = new BoxingDecorator(rabbitMeat,boxDiscount);
        ProcessDecorator potatoBoxing = new BoxingDecorator(potatoVeg,boxDiscount);
        ProcessDecorator chickenBoxing = new BoxingDecorator(chickenMeat,boxDiscount);
        ProcessDecorator cornBoxing = new BoxingDecorator(cornVeg,boxDiscount);

        System.out.println(beefBoxing.toString());
        System.out.println(grassBoxing.toString());
        System.out.println(gabbageBoxing.toString());
        System.out.println(eggBoxing.toString());
        System.out.println(rabbitHairBoxing.toString());
        System.out.println(rabbitMeatBoxing.toString());
        System.out.println(potatoBoxing.toString());
        System.out.println(chickenBoxing.toString());
        System.out.println(cornBoxing.toString());

        ProcessDecorator beefBoxingWholesale = new WholesaleDecorator(beefBoxing,wholesaleDiscount);
        ProcessDecorator grassBoxingWholesale = new WholesaleDecorator(grassBoxing,wholesaleDiscount);
        ProcessDecorator gabbageBoxingWholesale = new WholesaleDecorator(gabbageBoxing,wholesaleDiscount);
        ProcessDecorator eggBoxingWholesale = new WholesaleDecorator(eggBoxing,wholesaleDiscount);
        ProcessDecorator rabbitHairBoxingWholesale = new WholesaleDecorator(rabbitHairBoxing,wholesaleDiscount);
        ProcessDecorator rabbitMeatBoxingWholesale = new WholesaleDecorator(rabbitMeatBoxing,wholesaleDiscount);
        ProcessDecorator potatoBoxingWholesale = new WholesaleDecorator(potatoBoxing,wholesaleDiscount);
        ProcessDecorator chickenBoxingWholesale = new WholesaleDecorator(chickenBoxing,wholesaleDiscount);
        ProcessDecorator cornBoxingWholesale = new WholesaleDecorator(cornBoxing,wholesaleDiscount);

        System.out.println(beefBoxingWholesale.toString());
        System.out.println(grassBoxingWholesale.toString());
        System.out.println(gabbageBoxingWholesale.toString());
        System.out.println(eggBoxingWholesale.toString());
        System.out.println(rabbitHairBoxingWholesale.toString());
        System.out.println(rabbitMeatBoxingWholesale.toString());
        System.out.println(potatoBoxingWholesale.toString());
        System.out.println(chickenBoxingWholesale.toString());
        System.out.println(cornBoxingWholesale.toString());

    }


}
