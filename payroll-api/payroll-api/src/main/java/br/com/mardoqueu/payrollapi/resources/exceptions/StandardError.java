package br.com.mardoqueu.payrollapi.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class StandardError {
    private LocalDateTime timestamp;
    private String error;
    private Integer status;
    private String path;
}
