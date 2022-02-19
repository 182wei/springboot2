package com.wei.Entiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "people")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class People {
    private String  name;
    private String age;

}
