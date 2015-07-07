package org.sczyhsoft.common.string;

import java.util.Objects;

/**
 * ScZyhSoft Common Library
 * String Utils Class
 * 字符串操作基本扩展功能
 *
 * @author sczyh30
 * @version 0.1-build 1 2015-7-7
 * issue:on board
 * 下一版本：待定
 */
public class StringUtil {

    public static boolean isEmpty(String s) {
        return Objects.equals(s, "");
    }
}
