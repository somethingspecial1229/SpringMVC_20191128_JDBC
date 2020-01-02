package com.web.mvc.repository;

import com.web.mvc.entity.DiscountCode;
import com.web.mvc.entity.MicroMarket;
import org.springframework.jdbc.core.RowMapper;

public class RM {
    static RowMapper<DiscountCode> discountCode = (rs, i) -> {
        DiscountCode dc = new DiscountCode();
        dc.setDiscountCode(rs.getString("DISCOUNT_CODE"));
        dc.setRate(rs.getDouble("RATE"));
        return dc;
    };
    
    static RowMapper<MicroMarket> MicroMarket = (rs, i) -> {
        MicroMarket mm = new MicroMarket();
        mm.setZipCode(rs.getString("ZIP_CODE"));
        mm.setRadio(rs.getDouble("RADIUS"));
        mm.setAreaLength(rs.getDouble("AREA_LENGTH"));
        mm.setAreaWidth(rs.getDouble("AREA_WIDTH"));
        return mm;
    };
    
}