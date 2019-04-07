package com.example.designpatten.strategy.reviewcode;

import java.util.HashMap;
import java.util.Map;

public class DiscoutFactory {

    private static Map<Integer,Discout> DISCOUT_MAP = new HashMap<Integer, Discout>();
    static {
        DISCOUT_MAP.put(1,new EmptyDiscout());
        DISCOUT_MAP.put(2,new MinusDiscout());
        DISCOUT_MAP.put(3,new MultiplyDiscount());
    }

    private static final Discout NON_DISCOUNT = new EmptyDiscout();

    private DiscoutFactory(){}

    public static Discout getDiscoutWay(Integer way){
        Discout discout = DISCOUT_MAP.get(way);
        return discout == null ? NON_DISCOUNT : discout;
    }

}
