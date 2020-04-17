package HilmanMln.jfood.controller;

import HilmanMln.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/promo")
@RestController
public class PromoController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Promo> getAllPromo() {
        return DatabasePromo.getPromoDatabase();
    }

    @RequestMapping(value = "/{code}", method = RequestMethod.GET)
    public Promo getPromoByCode(@PathVariable String code) throws PromoNotFoundException {
        Promo promo = DatabasePromo.getPromoByCode(code);
        return promo;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Promo addPromo(@RequestParam(value="code") String code,
                          @RequestParam(value="discount") int discount,
                          @RequestParam(value="minPrice") int minPrice,
                          @RequestParam(value="active") boolean active) throws PromoCodeAlreadyExistsException {
        try {
            if (DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, code, discount, minPrice, active))) {
                Promo promo;
                try {
                    promo = DatabasePromo.getPromoById(DatabasePromo.getLastId());
                    return promo;
                } catch (PromoNotFoundException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (PromoCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}