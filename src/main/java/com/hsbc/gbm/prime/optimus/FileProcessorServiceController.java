package com.hsbc.gbm.prime.optimus;

import io.micronaut.http.annotation.*;

@Controller("/fileProcessorService")
public class FileProcessorServiceController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}