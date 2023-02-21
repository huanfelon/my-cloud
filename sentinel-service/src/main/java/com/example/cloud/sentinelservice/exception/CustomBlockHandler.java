package com.example.cloud.sentinelservice.exception;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.example.cloud.sentinelservice.domain.CommonResult;
/**
*  自定义异常信息
* @Author: hfl
* @Date: 2023/2/21
*/
public class CustomBlockHandler {
    public CommonResult handleException(BlockException exception){
        return new CommonResult("自定义限流信息",200);
    }
}
