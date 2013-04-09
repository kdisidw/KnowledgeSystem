package org.ks.p2d;

import org.ks.Bound;

/**
 * 范围2D表示
 */
public interface Bound2D<K> extends Bound{
    public K getLowPoint();
    public K getHightPoint();
}
