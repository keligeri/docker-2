package com.kelemen.project.consumer.domain;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@RedisHash("ClientMessage")
public class ClientMessage implements Serializable {

    private Integer id;

    private long timeStamp;

    private String message;
}
