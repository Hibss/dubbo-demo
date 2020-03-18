package com.czkj.dubbo.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    public Integer id;

    public String mobile;

    public static final long serialVersionUID = 1L;
}