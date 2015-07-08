package org.sczyhsoft.common.string;

import java.util.Objects;

/**
 * ScZyhSoft Common Library
 * String Utils Class
 * 字符串操作基本扩展功能
 *
 * @author sczyh30
 * @version 0.1-build 1 2015-7-7
 * @since 0.1
 * issue:on board
 * 下一版本：待定
 */
public class StringUtil {

    /**
     * 判断是否为空字符
     */
    public static boolean isEmpty(String s) {
        return Objects.equals(s, "");
    }

    public static String erase(String str, int from, int to) {
        return str;
    }
}
