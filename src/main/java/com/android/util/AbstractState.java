package com.android.util;

import android.os.Message;
/**
 * {@hide}
 *
 * The class for implementing states in a StateMachine
 */
public class AbstractState implements State {
    /**
     * Constructor
     */
    protected AbstractState() {
    }
    /* (non-Javadoc)
     * @see com.android.util.State#enter()
     */
    @Override
    public void enter() {
    }
    /* (non-Javadoc)
     * @see com.android.util.State#exit()
     */
    @Override
    public void exit() {
    }
    /* (non-Javadoc)
     * @see com.android.util.State#processMessage(android.os.Message)
     */
    @Override
    public boolean processMessage(final Message msg) {
        return false;
    }
    /**
     * Name of State for debugging purposes.
     *
     * This default implementation returns the class name, returning
     * the mapper name would better in cases where a State class
     * is used for multiple states. But normally there is one class per
     * state and the class name is sufficient and easy to get. You may
     * want to provide a setName or some other mechanism for setting
     * another name if the class name is not appropriate.
     *
     * @see com.android.util.State#processMessage(android.os.Message)
     */
    @Override
    public String getName() {
        final String name = getClass().getName();
        final int lastDollar = name.lastIndexOf('$');
        return name.substring(lastDollar + 1);
    }
}
