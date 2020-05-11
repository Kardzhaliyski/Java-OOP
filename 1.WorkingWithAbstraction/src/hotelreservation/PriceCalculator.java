package hotelreservation;

public  class PriceCalculator {
    static double getTotalPrice(Double pricePerDay,
                                int days,
                                String seasonName,
                                String discountType) {
        return pricePerDay *
                days *
                Season.valueOf(seasonName).getPriceMultiplier() *
                Discount.valueOf(discountType).getDiscount();
    }
}
