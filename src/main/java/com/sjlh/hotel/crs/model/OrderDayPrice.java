package com.sjlh.hotel.crs.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class OrderDayPrice {
  @JsonFormat(pattern="yyyy-MM-dd", timezone = "GMT+8")
  private Date date;

  private Double price;
}
