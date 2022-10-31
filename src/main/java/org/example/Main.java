package org.example;

public class Main {
    public static void main(String[] args) {
        final int shirtPriceWithoutDiscount = 1000;
        final int selectedShirtsCount = 2;
        final int shirtsCountForDiscount = 3;
        final int shirtsRestCountForDiscount = shirtsCountForDiscount - selectedShirtsCount;
        final int selectedShirtsPriceWithoutDiscount = shirtPriceWithoutDiscount * selectedShirtsCount;
        final int shirtsPriceNeedForDiscount = shirtPriceWithoutDiscount * shirtsRestCountForDiscount;
        final float shirtsDiscountPercent = 50;
        final float allShirtsDiscountPrice = (shirtPriceWithoutDiscount * shirtsDiscountPercent / 100 ) * shirtsCountForDiscount;
        final float oneShirtDiscountPrice = shirtPriceWithoutDiscount * shirtsDiscountPercent / 100;
        final float savedMoney = shirtPriceWithoutDiscount * shirtsCountForDiscount - allShirtsDiscountPrice;
        final float freeShirts = (shirtPriceWithoutDiscount * shirtsCountForDiscount - oneShirtDiscountPrice * shirtsCountForDiscount) / shirtPriceWithoutDiscount;
        System.out.println("переменная shirtPriceWithoutDiscount " + shirtPriceWithoutDiscount);
        System.out.println("переменная selectedShirtsCount " + selectedShirtsCount);
        System.out.println("переменная shirtsCountForDiscount " + shirtsCountForDiscount);
        System.out.println("переменная shirtsRestCountForDiscount " + shirtsRestCountForDiscount);
        System.out.println("переменная selectedShirtsPriceWithoutDiscount " + selectedShirtsPriceWithoutDiscount);
        System.out.println("переменная shirtsPriceNeedForDiscount " + shirtsPriceNeedForDiscount);
        System.out.println("переменная shirtsDiscountPercent " + shirtsDiscountPercent);
        System.out.println("переменная allShirtsDiscountPrice " + allShirtsDiscountPrice);
        System.out.println("переменная oneShirtDiscountPrice " + oneShirtDiscountPrice);
        System.out.println("переменная savedMoney " + savedMoney);
        System.out.println("переменная freeShirts " + freeShirts);
    }
}