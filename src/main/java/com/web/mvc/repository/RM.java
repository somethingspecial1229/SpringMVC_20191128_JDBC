package com.web.mvc.repository;

import com.web.mvc.entity.Customer;
import com.web.mvc.entity.DiscountCode;
import com.web.mvc.entity.Manufacturer;
import com.web.mvc.entity.MicroMarket;
import com.web.mvc.entity.Product;
import com.web.mvc.entity.ProductCode;
import java.sql.ResultSet;
import org.springframework.jdbc.core.RowMapper;

public class RM {
    static RowMapper<DiscountCode> discountCode = (rs, i) -> {
        DiscountCode dc = new DiscountCode();
        dc.setDiscountCode(rs.getString("DISCOUNT_CODE"));
        dc.setRate(rs.getDouble("RATE"));
        return dc;
    };
    
    static RowMapper<MicroMarket> microMarketMapper = (ResultSet rs, int rowNum) -> {
        MicroMarket mm = new MicroMarket();
        mm.setZipCode(rs.getString("ZIP_CODE"));
        mm.setRadius(rs.getDouble("RADIUS"));
        mm.setAreaLength(rs.getDouble("AREA_LENGTH"));
        mm.setAreaWidth(rs.getDouble("AREA_WIDTH"));
        return mm;
    };
    
    static RowMapper<Customer> customerMapper = (ResultSet rs, int rowNum) -> {
        Customer customer = new Customer();
        customer.setCustomerId(rs.getInt("CUSTOMER_ID"));
        customer.setDiscountCode(rs.getString("DISCOUNT_CODE"));
        customer.setZip(rs.getString("ZIP"));
        customer.setName(rs.getString("NAME"));
        customer.setAddressline1(rs.getString("ADDRESSLINE1"));
        customer.setAddressline2(rs.getString("ADDRESSLINE2"));
        customer.setCity(rs.getString("CITY"));
        customer.setState(rs.getString("STATE"));
        customer.setPhone(rs.getString("PHONE"));
        customer.setFax(rs.getString("FAX"));
        customer.setEmail(rs.getString("EMAIL"));
        customer.setCreditLimit(rs.getInt("CREDIT_LIMIT"));
        return customer;
    };
    
    static RowMapper<ProductCode> productCodeMapper = (ResultSet rs, int rowNum) -> {
        ProductCode pc = new ProductCode();
        pc.setProdCode(rs.getString("PROD_CODE"));
        pc.setDiscountCode(rs.getString("DISCOUNT_CODE"));
        pc.setDescription(rs.getString("DESCRIPTION"));
        return pc;
    };
    
    static RowMapper<Manufacturer> manufacturerMapper = (ResultSet rs, int rowNum) -> {
        Manufacturer mf = new Manufacturer();
        mf.setManufacturerId(rs.getInt("MANUFACTURER_ID"));
        mf.setName(rs.getString("NAME"));
        mf.setAddressline1(rs.getString("ADDRESSLINE1"));
        mf.setAddressline2(rs.getString("ADDRESSLINE2"));
        mf.setCity(rs.getString("CITY"));
        mf.setState(rs.getString("STATE"));
        mf.setZip(rs.getString("ZIP"));
        mf.setPhone(rs.getString("PHONE"));
        mf.setFax(rs.getString("FAX"));
        mf.setEmail(rs.getString("EMAIL"));
        mf.setRep(rs.getString("REP"));
        return mf;
    };
    
    static RowMapper<Product> productMapper = (ResultSet rs, int rowNum) -> {
        Product p = new Product();
        p.setProductId(rs.getInt("PRODUCT_ID"));
        p.setManufacturerId(rs.getInt("MANUFACTURER_ID"));
        p.setProductCode(rs.getString("PRODUCT_CODE"));
        p.setPurchaseCost(rs.getDouble("PURCHASE_COST"));
        p.setQuantityOnHand(rs.getInt("QUANTITY_ON_HAND"));
        p.setMarkup(rs.getDouble("MARKUP"));
        p.setAvailable(new Boolean(rs.getString("AVAILABLE") + "".trim()));
        p.setDescription(rs.getString("DESCRIPTION"));
        return p;
    };
    
}
