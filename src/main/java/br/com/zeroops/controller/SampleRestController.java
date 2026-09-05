package br.com.zeroops.controller;

import br.com.zeroops.model.Status;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

    @GetMapping("/api")
    public ResponseEntity<Status> index() {

        return ResponseEntity.ok(new Status("API is running"));

    }

    @GetMapping("/v2/api")
    public ResponseEntity<Status> indexV2() {

        return ResponseEntity.ok(new Status("API is running with V2"));

    }

}
