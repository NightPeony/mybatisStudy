package site.niwo.www.data.mybatis;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by web on 2020/5/12.
 */
@Data
public class MybatiesPo implements Serializable {

    private int id;

    private String name;

    private int number;

    private Date date;


}
