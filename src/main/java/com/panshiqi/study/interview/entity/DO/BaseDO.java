
package com.panshiqi.study.interview.entity.DO;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseDO {

    /**
     * id
     */
    private Long   id;

    /**
     * 备注
     */
    private String remark;

    /**
     * 版本
     */
    private Long   version;

    /**
     * 是否删除{Y/N}
     */
    private String isDeleted;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 创建时间
     */
    private Date   gmtCreated;

    /**
     * 修改时间
     */
    private Date   gmtModified;

    /**
     * 数据来源
     */
    private String dataSource;

}
