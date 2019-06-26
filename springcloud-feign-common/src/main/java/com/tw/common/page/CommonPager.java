package com.tw.common.page;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: tanwei
 * @Description:
 * @Date: Create in 15:59 2019/6/26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonPager<T> implements Serializable {

    private static final long serialVersionUID = 4697821489389140259L;

    /**
     * page.
     */
    private PageParameter page;

    /**
     * data.
     */
    private List<T> dataList;
}
