package mde.iot.ucm4iot.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class GenerateExceptionTablePackageExplorerHandler extends AbstractHandler implements IHandler {
    
    @Inject
    private IGenerator2 generator;
 
    @Inject
    private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;
     
    @Inject
    IResourceDescriptions resourceDescriptions;
     
    @Inject
    IResourceSetProvider resourceSetProvider;
     
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
         
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            Object firstElement = structuredSelection.getFirstElement();
            if (firstElement instanceof IFile) {
                IFile file = (IFile) firstElement;
                IProject project = file.getProject();
                IFolder srcGenFolder = project.getFolder("src-gen");
                if (!srcGenFolder.exists()) {
                    try {
                        srcGenFolder.create(true, true,
                                new NullProgressMonitor());
                    } catch (CoreException e) {
                        return null;
                    }
                }
 
                final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
                fsa.setOutputPath(srcGenFolder.getFullPath().toString());
                 
                URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
                ResourceSet rs = resourceSetProvider.get(project);
                Resource r = rs.getResource(uri, true);
                generator.doGenerate(r, fsa, new GeneratorContext());
            }
        }
        return null;
    }
 
    @Override
    public boolean isEnabled() {
        return true;
    }
 
    public void display(ExecutionEvent event, String windowName, String message) throws ExecutionException {
    	IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
        MessageDialog.openInformation(
                window.getShell(),
                windowName,
                message);
    }
}