package com.lrk.web.handler;

import com.lrk.web.common.HandlerType;
import com.lrk.web.dto.OrderDTO;
import org.springframework.stereotype.Component;

/**
 * @author lrk
 * @date 2019/5/26下午8:44
 */
@Component
@HandlerType("2")
public class GroupHandler extends AbstractHandler {

    @Override
    public String handle(OrderDTO dto) {
        return "处理团购订单";
    }
}
