package com.aaa.mycat.statusEnum;

/**
 * @ClassName StatusEnum
 * @Author wang
 * @Date 2019/9/20 20:39
 * @Version 1.0
 */
public enum StatusEnum {
    SUCCESS(200, "操作成功","code"),
    FAILED(404, "操作失败","code"),
    ERROR(500, "系统异常","code");
    private Integer code;
    private String msg;
    private String codeName;

    StatusEnum(Integer code, String msg, String codeName) {
        this.code = code;
        this.msg = msg;
        this.codeName = codeName;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

}
