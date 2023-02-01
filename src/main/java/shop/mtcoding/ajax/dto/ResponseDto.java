package shop.mtcoding.ajax.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ResponseDto<T> {
    private int code; // 1, -1
    private String msg; //
    private T data; // 제네릭. 공통적인 응답을 위해.
}
