package com.chs.androiddailytext.widget.pop.interfaces;

/**
 * Description: XPopup显示和隐藏的回调接口，如果你不想重写3个方法，则可以使用SimpleCallback，
 * 它是一个默认实现类
 * Create by dance, at 2018/12/21
 */
public interface XPopupCallback {
    /**
     * 弹窗的onCreate方法执行完调用
     */
    void onCreated();
    /**
     * 完全显示的时候执行
     */
    void onShow();

    /**
     * 完全消失的时候执行
     */
    void onDismiss();

    /**
     * 暴漏返回按键的处理，如果返回true，XPopup不会处理；如果返回false，XPopup会处理，
     * @return
     */
    boolean onBackPressed();

    /**
     * 列表选择的时候 返回位置和id
     * @param position
     * @param id
     */
    void id(int position, String id);
}
