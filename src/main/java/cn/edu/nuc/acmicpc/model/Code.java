package cn.edu.nuc.acmicpc.model;

import cn.edu.nuc.acmicpc.dto.CodeDto;

import java.io.Serializable;

/**
 * Source code information
 */
public class Code implements Serializable {

    private Long codeId;
    private String content;
    private boolean share;

    public Code() {
    }

    public Code(CodeDto codeDto) {
        this.codeId = codeDto.getCodeId();
        this.content = codeDto.getContent();
        this.share = codeDto.isShare();
    }

    @Override
    public String toString() {
        return "Code{" +
                "codeId='" + codeId + '\'' +
                ", content='" + content + '\'' +
                ", share=" + share +
                '}';
    }

    public void setCodeId(Long codeId) {
        this.codeId = codeId;
    }

    public Long getCodeId() {
        return codeId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isShare() {
        return share;
    }

    public void setShare(boolean share) {
        this.share = share;
    }
}
