package com.umr.common.mybatis;

import java.io.Serializable;

import lombok.Data;

/**
 * 分页参数
 *
 * @author tengjing@yunrong.cn
 * @version V2.1
 * @since 2.1.0 2019/4/23 10:55
 */
@Data
public class PageParam implements Serializable {

    private static final long serialVersionUID = -6945035942312529458L;

    /**
     * pageNum
     */
    private int pageNum = 1;

    /**
     * pageSize 每页行数
     */
    private int pageSize = 20;

    public static final class Builder {

        private PageParam instance = new PageParam();

        private Builder() {}

        public static Builder getInstance() {
            return new Builder();
        }

        public Builder addPageNum(int pageNum) {
            this.instance.setPageNum(pageNum);
            return this;
        }

        public Builder addPageSize(int pageSize) {
            this.instance.setPageSize(pageSize);
            return this;
        }

        public PageParam build() {
            return this.instance;
        }
    }

    /**
     * 获取分页开始位置
     *
     * @return int 分页开始位置
     */
    public int getOffsetStart() {
        int start = (pageNum - 1) * pageSize;
        return start >= 0 ? start : 0;
    }
}
