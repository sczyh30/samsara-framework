package org.samsara.framework.functional;

/**
 * Samsara Framework Core
 * Functional Library
 * Tuple2 Type
 */
public final class Tuple2<T1, T2> {

    public final T1 _1;
    public final T2 _2;

    public Tuple2(T1 _1, T2 _2) {
        this._1 = _1;
        this._2 = _2;
    }

    public Tuple2<T2, T1> swap() {
        return new Tuple2<>(_2, _1);
    }
}
