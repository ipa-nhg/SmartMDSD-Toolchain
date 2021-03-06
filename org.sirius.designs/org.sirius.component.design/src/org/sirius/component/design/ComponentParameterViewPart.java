//--------------------------------------------------------------------------
//
//  Copyright (C) 2016 Alex Lotz
//
//        lotz@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
//  This library is free software; you can redistribute it and/or
//  modify it under the terms of the GNU Lesser General Public
//  License as published by the Free Software Foundation; either
//  version 2.1 of the License, or (at your option) any later version.
//
//  This library is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//  Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public
//  License along with this library; if not, write to the Free Software
//  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//
//--------------------------------------------------------------------------

package org.sirius.component.design;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.ecore.component.componentDefinition.AbstractComponentElement;
import org.ecore.component.componentDefinition.ComponentDefinition;
import org.ecore.component.componentParameter.ComponentParametersRef;
import org.sirius.tools.AbstractXtextEditorViewPart;
import org.xtext.component.componentParameter.ui.internal.ComponentParameterActivator;

import com.google.inject.Injector;

public class ComponentParameterViewPart extends AbstractXtextEditorViewPart {
	@Override
	public Injector getInjector() {
		return ComponentParameterActivator.getInstance().getInjector(ComponentParameterActivator.ORG_XTEXT_COMPONENT_COMPONENTPARAMETER_COMPONENTPARAMETER);
	}
	
	@Override
	protected ISelectionListener createNewSelectionListener() {
		return new ISelectionListener() {
			@Override
			public void selectionChanged(IWorkbenchPart part, ISelection selection) {
				if(part instanceof DDiagramEditor) {
					DDiagramEditor dEditor = (DDiagramEditor)part;					
					Session session = dEditor.getSession();
					
					// check if the Component flag hasParameters is set to true
					// only then show the embedded editor
					for(DView view: session.getOwnedViews()) {
						if(view.getViewpoint().getName().equals("ComponentDefinitionViewpoint")) {
							for(DRepresentationDescriptor repDescr: view.getOwnedRepresentationDescriptors()) {
								DRepresentation rep = repDescr.getRepresentation();
								if(rep instanceof DSemanticDiagram) {
									for(DRepresentationElement elem: rep.getOwnedRepresentationElements()) {
										if(elem.getTarget() instanceof ComponentDefinition) {
											ComponentDefinition comp = (ComponentDefinition)elem.getTarget();
											for(AbstractComponentElement compElem: comp.getElements()) {
												if(compElem instanceof ComponentParametersRef) {
													if(getResourceProvider().isCurrentSession(session)) {
														// show embedded editor only if component has parameters defined
														showEmbeddedEditor();													
													} else {
														URI componentModelUri = comp.eResource().getURI();
														String modelFileExtension = getModelFileExtension();
														URI xtextResourceUri = componentModelUri.trimFileExtension().appendFileExtension(modelFileExtension);
														setExternalEmfBase(elem, xtextResourceUri);
													}
													// do not continue any longer
													return;
												}
											}
										} // end if (target instanceof Component)
									} // end for(OwnedRepresentationElements)
								} // end if (rep instanceof DSemanticDiagram)
							} // end for (OwnedRepresentations)
						} // end if(viewpoint == "component.viewpoint")
					} // end for (OwnedViews)
				}
				// in all other cases the editor should remain hidden
				hideEmbeddedEditor();
			}	
		};
	}
}
