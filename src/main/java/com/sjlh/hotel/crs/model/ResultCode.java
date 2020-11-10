package com.sjlh.hotel.crs.model;


/**
 * @author HR
 * @date 2020/11/6 16:07
 * @Description
 */
public enum ResultCode {

    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int value;
    private final String reasonPhrase;

    ResultCode(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    public int getValue() {
        return value;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }

    public static String getReasonDescByCode(int statusCode) {
        for (ResultCode enums : ResultCode.values()) {
            if (enums.value == statusCode) {
                return enums.getReasonPhrase();
            }
        }
        return null;
    }


    public static ResultCode resolve(int statusCode) {
        for (ResultCode enums : ResultCode.values()) {
            if (enums.value == statusCode) {
                return enums;
            }
        }
        return null;
    }

}
