package giovannilongo.U5S1L4110124.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MenuService {

    private final PizzaDAO pizza;
    private final ToppingDAO topping;
    private final DrinkDAO drink;
    private final OrderDAO order;
    private final TableDAO table;

    @Autowired
    public MenuService(PizzaDAO pizza, ToppingDAO topping,
                       DrinkDAO drink, OrderDAO order, TableDAO table) {
        this.pizza = pizza;
        this.topping = topping;
        this.drink = drink;
        this.order = order;
        this.table = table;
    }

}
