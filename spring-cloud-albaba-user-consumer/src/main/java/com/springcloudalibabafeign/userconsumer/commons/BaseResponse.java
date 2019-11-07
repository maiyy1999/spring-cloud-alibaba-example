package com.springcloudalibabafeign.userconsumer.commons;

import lombok.Builder;
import lombok.Data;

/**
 * @author myy
 */
@Data
@Builder
public class BaseResponse<T> {
    private String msg;
    private int status;
    private T data;

}
