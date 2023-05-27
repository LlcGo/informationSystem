package com.lc.domain;


import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 新闻信息表
 * @TableName info_tb
 */
@Data
public class InfoTb implements Serializable {
    /**
     * 新闻id 
     */

    private Integer infoId;

    /**
     * 新闻标题
     */
    private String infoTitle;

    /**
     * 新闻主题 
     */
    private String infoContent;

    /**
     * 创建时间
     */
    private Date infoCreate;

    /**
     * 修改时间
     */
    private Date infoUpdate;

    /**
     *  发布时间
     */
    private Date infoRelease;

    /**
     *  0未发布  1已发布
     */
    private Integer infoStateInt;


    private static final long serialVersionUID = 1L;
}