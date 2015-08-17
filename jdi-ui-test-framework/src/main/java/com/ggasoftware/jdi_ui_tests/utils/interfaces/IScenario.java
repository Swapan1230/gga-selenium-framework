package com.ggasoftware.jdi_ui_tests.utils.interfaces;

import com.ggasoftware.jdi_ui_tests.core.elements.base.ABase;
import com.ggasoftware.jdi_ui_tests.implementations.logger.base.LogSettings;
import com.ggasoftware.jdi_ui_tests.utils.linqInterfaces.JAction;
/**
 * Created by 12345 on 20.11.2014.
 */
public interface IScenario {
     void invoke(ABase element, String actionName, JAction viAction, LogSettings logSettings) ;
}
