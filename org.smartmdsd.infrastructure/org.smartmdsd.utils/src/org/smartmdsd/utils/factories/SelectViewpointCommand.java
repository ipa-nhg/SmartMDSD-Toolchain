//--------------------------------------------------------------------------
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
// Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
// 
// 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the 
//    documentation and/or other materials provided with the distribution.
// 
// 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this 
//    software without specific prior written permission.
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
// THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS 
// BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
// POSSIBILITY OF SUCH DAMAGE.
//
//--------------------------------------------------------------------------
package org.smartmdsd.utils.factories;

import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection.Callback;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

public class SelectViewpointCommand extends RecordingCommand {

    private Session session;

    private final Callback callback;

	final String modelFileExtension;
	final String viewpointName;
    private boolean createNewRepresentations;

    private IProgressMonitor monitor;
	
	public SelectViewpointCommand(Session session, final String modelFileExtension, final String viewpointName, IProgressMonitor monitor) {
		super(session.getTransactionalEditingDomain(), "Select a given viewpoint");
		this.session = session;
		this.callback = new ViewpointSelectionCallback();
		this.modelFileExtension = modelFileExtension;
		this.viewpointName = viewpointName;
		this.createNewRepresentations = true;
		this.monitor = monitor;
	}
	
	public SelectViewpointCommand(Session session, final String modelFileExtension, final String viewpointName, boolean createNewRepresentations, IProgressMonitor monitor) {
		super(session.getTransactionalEditingDomain(), "Select a given viewpoint");
		this.session = session;
		this.callback = new ViewpointSelectionCallback();
		this.modelFileExtension = modelFileExtension;
		this.viewpointName = viewpointName;
		this.createNewRepresentations = createNewRepresentations;
		this.monitor = monitor;
	}

	@Override
	protected void doExecute() {
        if (callback == null || session == null) {
            return;
        }
        try {
            monitor.beginTask("Apply new viewpoints selection...", 1);

            // get all viewpoints according to given file extension
            Set<Viewpoint> viewpoints = ViewpointSelection.getViewpoints(modelFileExtension);

            for (final Viewpoint viewpoint : viewpoints) {
                if(viewpoint.getName().equals(viewpointName)) {
                    try {
                        callback.selectViewpoint(viewpoint, session, createNewRepresentations, monitor);
                    } catch (SecurityException e) {
                        // If permission were not sufficient to select the
                        // viewpoint on the main or one of the referenced
                        // DAnalysis

                        // Provide a meaningful error message to the end-user
                        String errorMessage = "Unable to activate viewpoint '" + viewpoint.getName() + "' because of insufficient rights.";

                        // And re-throw the security exception with the previous
                        // as cause
                        throw new SecurityException(errorMessage, e);
                    }	
                }
            }
        } finally {
            monitor.done();
        }
	}

}
