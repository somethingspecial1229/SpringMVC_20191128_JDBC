
package com.web.mvc.repository.spec;

import com.web.mvc.entity.MicroMarket;
import java.util.List;


public interface MicroMarketDao {
    // 相關 Micro Market CRUD 方法簽章
    List<MicroMarket> queryMicroMarket();
}
