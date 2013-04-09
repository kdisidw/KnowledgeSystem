package org.ks;

/**
 * 作用于KSObject 上的运算,异步执行返回
 */
public interface KSOperate {
    public void operate(KSObjectGroup aGroup, Callback<KSObjectGroup> aResultCallback);
}
