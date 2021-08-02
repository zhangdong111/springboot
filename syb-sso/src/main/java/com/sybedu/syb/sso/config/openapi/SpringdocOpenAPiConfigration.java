package com.sybedu.syb.sso.config.openapi;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "微信公众号接口文档",
                version = "1.0",
                description = "微信公众号的接口文档"
        ),
        externalDocs = @ExternalDocumentation(description = "参考文档",
                url = "http://192.168.1.132:8080/apis-doc"
        )
)
public class SpringdocOpenAPiConfigration {
}
