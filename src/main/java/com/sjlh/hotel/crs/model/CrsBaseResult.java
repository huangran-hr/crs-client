package com.sjlh.hotel.crs.model;

import lombok.Data;

@Data
public class CrsBaseResult {

    private Integer code = ResultCode.OK.getValue();

    private String message;

}
