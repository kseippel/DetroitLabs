package com.example.springboot.service;

import com.example.springboot.model.Order;
import org.springframework.stereotype.Service;

@Service
public class CalculateOrderTotalServiceImpl implements CalculateOrderTotalService {

    private static final Double VEGGIE_PRICE = 2.5;
    private static final Double CHICKEN_PRICE = 3.0;
    private static final Double BEEF_PRICE = 3.0;
    private static final Double CHORIZO_PRICE = 3.5;

    /**
     * Returns total price of the order
     *
     * @param order object containing taco amounts
     * @return
     */
    @Override
    public Double totalPrice(Order order) {
        Double totalPayment = 0.0;
        Integer tacoAmount = order.getBeefTaco() + order.getChickenTaco() +
                order.getChorizoTaco() + order.getVeggieTaco();

        totalPayment = calculateTotal(order);

        if(tacoAmount >= 4) {
            return applyDiscount(totalPayment, .2);
        }
        else {
            return totalPayment;
        }
    }

    /**
     * Calculates the total price of the order
     *
     * @param order order object with the taco amounts in it
     * @return
     */
    private Double calculateTotal(Order order) {
        return ((order.getVeggieTaco() * VEGGIE_PRICE) + (order.getChickenTaco() * CHICKEN_PRICE) +
                (order.getChorizoTaco() * CHORIZO_PRICE) + (order.getBeefTaco() * BEEF_PRICE));
    }

    /**
     * Applies supplied discount to amount
     *
     * @param totalPayment
     * @param discountAmount
     * @return
     */
    private Double applyDiscount(Double totalPayment, Double discountAmount) {
        return totalPayment * (1-discountAmount);
    }
}
