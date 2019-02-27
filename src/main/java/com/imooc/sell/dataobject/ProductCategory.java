package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**把数据库映射成对象的注解 */
@Entity
@DynamicUpdate //自动更新时间
@Data //lombok依赖应用，可以不用写get set方法

public class ProductCategory {


    /**类目ID
     * ID 代表主键
     * GeneratedValue 代表自增
     * */
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    /**类目名字 */
    private String categoryName;

    /**类目编号 */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
