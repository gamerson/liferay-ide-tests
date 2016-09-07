/*******************************************************************************
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 *******************************************************************************/

package com.liferay.ide.project.ui.tests.page;

import org.eclipse.swtbot.swt.finder.SWTBot;

import com.liferay.ide.project.ui.tests.LiferayModuleFragementWizard;
import com.liferay.ide.ui.tests.swtbot.page.DialogPO;
import com.liferay.ide.ui.tests.swtbot.page.TreePO;

/**
 * @author Ying Xu
 */
public class AddOverriddenFilePO extends DialogPO implements LiferayModuleFragementWizard
{

    private TreePO _addFilesToOverride;

    public AddOverriddenFilePO( SWTBot bot )
    {
        super( bot, BUTTON_CANCEL, BUTTON_OK );
        _addFilesToOverride = new TreePO( bot );
    }

    public void select( String... items )
    {
        _addFilesToOverride.hasTreeItem( items );
    }

}
